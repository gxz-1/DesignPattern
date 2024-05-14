//组合模式

public class Manager {
	public static void main(String[] args) {
		//从大到小创建对象
		OrganizationComponent universitiy = new Universitiy("清华大学", "985");
		
		//创建学院
		OrganizationComponent colleage1 = new Colleage("计算机学院", "学计算机的");
		OrganizationComponent colleage2 = new Colleage("数学学院", "学数学的");
		
		//创建系
		OrganizationComponent department1=new Department("计算机科学与技术", "软硬兼修");
		OrganizationComponent department2=new Department("软件工程", "软件为主");
		OrganizationComponent department3=new Department("统计数学", "学统计数学挺好的");
		
		universitiy.add(colleage1);
		universitiy.add(colleage2);
		
		colleage1.add(department1);
		colleage1.add(department2);
		colleage2.add(department2);
		
		universitiy.print();
		
		//源码分析 Hashmap   Map---Component
	}
}
