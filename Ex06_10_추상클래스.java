abstract class Shape
{
	int a = 10;
	
	void make(){
		System.out.println("�����׸���");	
	}
	Shape(){
		System.out.println("Shape ������");
	}
	abstract void draw();	//abstract void �̿ϼ��޼���(); = �߻�޼���
	abstract void delete();
}//shape

class Circle extends Shape
{
	// int a = 10;
	
	Circle()
	{
		super();
		System.out.println("Circle ������");
	}
	void draw()
	{
		System.out.println("���� �׸���");
	}
	void delete()
	{
		System.out.println("���� �����");
	}
}//circle

class Rectangle extends Shape
{
	// int a = 10; 
	
	Rectangle()
	{
		super();
		System.out.println("Rectangle ������");
	}
	void draw()
	{
		System.out.println("�簢���� �׸���");
	}
	void delete()
	{
		System.out.println("�簢���� �����");
	}
}//Rectangle

public class Ex06_10_�߻�Ŭ���� {
	public static void main(String[] args) {
		
//		Shape s = new Shape(); -> �̿ϼ� ��ü�� ���� �߻�Ŭ������ ��ü�� ���� �� ����
		Shape c = (Shape) new Circle();	// shape���� upcasting 
		c.make();
		c.draw();
		c.delete();
		System.out.println(c.a);
		c.a = 20;
		System.out.println(c.a);
		System.out.println();
		
		Shape r = new Rectangle();		
		r.make();
		r.draw();
		r.delete();
		
		
		System.out.println();
		System.out.println("++++++++++++++++");
		System.out.println();
		
		
		//Shape[] arr = {new Circle(), new Rectangle()};
		Shape[] s = new Shape[2];
		s[0] = new Circle();
		System.out.println("===");
		s[1] = new Rectangle();
		
		
		System.out.println();
		System.out.println("````````````````");
		System.out.println();
		
		for(int i=0;i<s.length;i++)
		{
			s[i].make();
			s[i].draw();
			s[i].delete();
		}
		System.out.println();
		
	}
}

//�߻�Ŭ���� : �̿ϼ��� Ŭ������ �ϼ��ϱ� ���ؼ� ���
// ��ӹ��� Ŭ�������� �ݵ�� �ʤ��� �޼��尡 �ִٸ� �θ�Ŭ������ �߻�޼��带 �������� ���..?
// �������̽��� �߻�Ŭ������ ������ ���� �� �� �˾ƿ��Ѵ�
// interface : ���߻��, �̿ϼ��޼ҵ常 ���� �� �ִ�. �տ� abstract public void show()�� �ڵ����� �ٴ´�
//final������ �ִ�
// ��ӹ޴� Ŭ�������� implements�� �޴´�
//������ü���� �Ұ����ϴ�
