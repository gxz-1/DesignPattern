package OpenClosed;

/*
 * ��example1�Ļ��������ӻ���Բ�εĹ���
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

//��״��---�൱�� ��Ʒ�
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

//������������
class Triangle2 extends m_Shape2{
	public Triangle2() {
		// TODO Auto-generated constructor stub
	super.m_type=3;
	}
}


//���ڻ�ͼ���� ����m_type���Ʋ�ͬ��ͼ�� ---�൱��ʹ�÷�
//�������������󣬶����´�������˴����޸ģ������Ͽ���ԭ��
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
		System.out.println("��Բ��");
	}

	public void drawRectangle(m_Shape2 s) {
		System.out.println("������");
	}
	
	public void drawTriangle(m_Shape2 s) {
		System.out.println("��������");
	}

}