package OpenClosed;

/*
 * 开闭原则：对扩展开放（对提供方）     对修改关闭（对使用方）
 * 当程序需要变化时，尽量通过扩展软件实体来实现，而不是通过修改已有代码
 * 
 */


public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
	}

}

//形状类
class m_Shape {
	int m_type;
}

class Rectangle extends m_Shape {
	public Rectangle() {
		// TODO Auto-generated constructor stub
		super.m_type = 1;
	}
}

class Circle extends m_Shape {
	public Circle() {
		// TODO Auto-generated constructor stub
		super.m_type = 2;
	}
}

//用于绘图的类 根据m_type绘制不同的图形 
class GraphicEditor {

	public void drawShape(m_Shape s) {
		if (s.m_type == 1) {
			drawRectangle(s);
		} else if (s.m_type == 2) {
			drawCircle(s);
		}
	}

	public void drawCircle(m_Shape s) {
		// TODO Auto-generated method stub
		System.out.println("画圆形");
	}

	public void drawRectangle(m_Shape s) {
		// TODO Auto-generated method stub
		System.out.println("画矩形");
	}

}
