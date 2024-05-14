import java.util.Iterator;

public interface College {
	
	public static final String name = "";

	public String getName();

	// 增加 专业 的方法
	public void addMajorty(String name, String desc);

	// 返回一个迭代器，遍历
	public Iterator createIterator();
}
