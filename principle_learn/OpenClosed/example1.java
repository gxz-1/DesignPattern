package OpenClosed;

/*
 * ����ԭ�򣺶���չ���ţ����ṩ����     ���޸Ĺرգ���ʹ�÷���
 * ��������Ҫ�仯ʱ������ͨ����չ���ʵ����ʵ�֣�������ͨ���޸����д���
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

//��״��
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

//���ڻ�ͼ���� ����m_type���Ʋ�ͬ��ͼ�� 
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
		System.out.println("��Բ��");
	}

	public void drawRectangle(m_Shape s) {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

}
