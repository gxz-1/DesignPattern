package OpenClosed;

/*
 * 在example1的基础上增加绘制圆形的功能
 * 
 */


public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicEditor2 graphicEditor = new GraphicEditor2();
		graphicEditor.drawShape(new Rectangle2());
		graphicEditor.drawShape(new Circle2());
		graphicEditor.drawShape(new Triangle2());
	}

}

//形状类---相当于 设计方
class m_Shape2 {
	int m_type;
}

class Rectangle2 extends m_Shape2 {
	public Rectangle2() {
		// TODO Auto-generated constructor stub
		super.m_type = 1;
	}
}

class Circle2 extends m_Shape2 {
	public Circle2() {
		// TODO Auto-generated constructor stub
		super.m_type = 2;
	}
}

//新增三角形类
class Triangle2 extends m_Shape2{
	public Triangle2() {
		// TODO Auto-generated constructor stub
	super.m_type=3;
	}
}


//用于绘图的类 根据m_type绘制不同的图形 ---相当于使用方
//在添加三角形类后，对以下代码进行了大量修改，不符合开闭原则
class GraphicEditor2 {

	public void drawShape(m_Shape2 s) {
		if (s.m_type == 1) {
			drawRectangle(s);
		} else if (s.m_type == 2) {
			drawCircle(s);
		}
		else if(s.m_type==3){
			drawTriangle(s);
		}
	}

	public void drawCircle(m_Shape2 s) {
		System.out.println("画圆形");
	}

	public void drawRectangle(m_Shape2 s) {
		System.out.println("画矩形");
	}
	
	public void drawTriangle(m_Shape2 s) {
		System.out.println("画三角形");
	}

}