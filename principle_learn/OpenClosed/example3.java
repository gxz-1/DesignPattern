package OpenClosed;

/*
 * ���ÿ���ԭ���example2���иĽ�
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

//��Ʒ�
abstract class m_Shape3 {
	public abstract void draw();
}

//������
class Rectangle3 extends m_Shape3 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
}

//Բ��
class Circle3 extends m_Shape3 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("��Բ��");
	}
}

//������������
class Triangle3 extends m_Shape3 {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}
}

//ʹ�÷�
class GraphicEditor3 {
	public void drawShape(m_Shape3 s) {
		// TODO Auto-generated method stub
		s.draw();
	}
}
