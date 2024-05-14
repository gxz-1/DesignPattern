#include <iostream>
using namespace std;

//求next数组
void def_next(char* ch, int next[],int length)
{
	int j = 0;//遍历计数器
	int k = -1;//记录前缀尾部位置（同时也是j位置next的值）
	next[0] = -1;//用-1初始化

	while (j<length-1)//当访问倒数第二个元素时 即可确定最后一个元素的next 故-1!!!!!!!!
	{

		if (k==-1||ch[j] == ch[k])
			//两种情况 
			//一 k=-1 （1）第一次遍历 （2）k=next[k]最终回归到next[0]即-1，作为终点，next取k+1=0
			//二 ch[j]==ch[k] 当j对应前缀的下一个位置与j的位置相等，j+1的next值为next[j]+1
		{		
			next[j+1] = k+1 ;
			j++; k++;

		}
		else
		{
			k = next[k];//循环找前缀 直至满足ch[j]==ch[k] 或者k=-1到达终点next置0
		}
	}
}

//KMP的实现
int KMP(char* ch, char* pattern, int next[])//ch为待查找字符串 pattern为模式串
{
	int i=0,j = 0;//i遍历ch j对应模式串
	int ch_size = strlen(ch);//待查找字符串长度
	int pattern_size = strlen(pattern);//模式串长度

	while (i<ch_size)
	{
		if (j==-1||ch[i] == pattern[j])
			//两种情况
			//一 j==-1 next[j]一直回溯到第一个位置时则不存在匹配的可能 跳到下一个i的位置j置0
			//二 模式串匹配则比较下一个
		{
			i++;
			j++;
		}
		else//不相等j则跳到next[j] 不断循环j=-1为终点
		{
			j = next[j];
		}

		if (j == pattern_size)//最后j++了 故j最后为等于pattern_size！！！！！
		{
			return i-j;
		}
	}
	return -1;
}

int main()
{
	char ch[] = "acababcbdsfdb";
	char pattern[] = "ababcbd";
	const int length = sizeof(pattern) / sizeof(char) - 1;
	int next[length];

	def_next(pattern, next,length);
	cout<<KMP(ch, pattern, next);

	return 0;
}

//利用next求周期字符串（如abcabcabc）的最小周期
void func()
{
	char ch[] = "abcabcabc";
	const int length = sizeof(ch) / sizeof(char) - 1;
	int next[length];
	def_next(ch, next, length);

	cout << "最小周期为" << length-next[length - 1]- 1 << endl;
	
}