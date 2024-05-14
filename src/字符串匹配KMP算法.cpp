#include <iostream>
using namespace std;

//��next����
void def_next(char* ch, int next[],int length)
{
	int j = 0;//����������
	int k = -1;//��¼ǰ׺β��λ�ã�ͬʱҲ��jλ��next��ֵ��
	next[0] = -1;//��-1��ʼ��

	while (j<length-1)//�����ʵ����ڶ���Ԫ��ʱ ����ȷ�����һ��Ԫ�ص�next ��-1!!!!!!!!
	{

		if (k==-1||ch[j] == ch[k])
			//������� 
			//һ k=-1 ��1����һ�α��� ��2��k=next[k]���ջع鵽next[0]��-1����Ϊ�յ㣬nextȡk+1=0
			//�� ch[j]==ch[k] ��j��Ӧǰ׺����һ��λ����j��λ����ȣ�j+1��nextֵΪnext[j]+1
		{		
			next[j+1] = k+1 ;
			j++; k++;

		}
		else
		{
			k = next[k];//ѭ����ǰ׺ ֱ������ch[j]==ch[k] ����k=-1�����յ�next��0
		}
	}
}

//KMP��ʵ��
int KMP(char* ch, char* pattern, int next[])//chΪ�������ַ��� patternΪģʽ��
{
	int i=0,j = 0;//i����ch j��Ӧģʽ��
	int ch_size = strlen(ch);//�������ַ�������
	int pattern_size = strlen(pattern);//ģʽ������

	while (i<ch_size)
	{
		if (j==-1||ch[i] == pattern[j])
			//�������
			//һ j==-1 next[j]һֱ���ݵ���һ��λ��ʱ�򲻴���ƥ��Ŀ��� ������һ��i��λ��j��0
			//�� ģʽ��ƥ����Ƚ���һ��
		{
			i++;
			j++;
		}
		else//�����j������next[j] ����ѭ��j=-1Ϊ�յ�
		{
			j = next[j];
		}

		if (j == pattern_size)//���j++�� ��j���Ϊ����pattern_size����������
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

//����next�������ַ�������abcabcabc������С����
void func()
{
	char ch[] = "abcabcabc";
	const int length = sizeof(ch) / sizeof(char) - 1;
	int next[length];
	def_next(ch, next, length);

	cout << "��С����Ϊ" << length-next[length - 1]- 1 << endl;
	
}