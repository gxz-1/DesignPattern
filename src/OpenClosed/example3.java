package OpenClosed;

/*
 * 利用开闭原则对example2进行改进
 * 
 */
public class example3 {
	public static void main(String[] args) {

		GraphicEditor3 graphicEditor = new GraphicEditor3();
		graphicEditor.drawShape(new Rectangle3());
		graphicEditor.drawShape(new Circle3());
		graphicEditor.drawShape(new Triangle3());
	}
}

//设计方
abstract class m_Shape3 {
	public abstract void draw();
}

//长方形
class Rectangle3 extends m_Shape3 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("画矩形");
	}
}

//圆形
class Circle3 extends m_Shape3 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("画圆形");
	}
}

//新增三角形类
class Triangle3 extends m_Shape3 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("画三角形");
	}
}

//使用方
class GraphicEditor3 {
	public void drawShape(m_Shape3 s) {
		// TODO Auto-generated method stub
		s.draw();
	}
}
