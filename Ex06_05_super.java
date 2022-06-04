class Parent
{
	int x=10;
	//private int x=10;
	void method()
	{
		System.out.println("P_x:" + x);
	}
}// class Parent end

class Child extends Parent
{
	int x = 20;			// child������ x�� ������ �θ���x�� ������� ����Ѵ�. -> super.x=10, this.x=10
	void method()		//method overriding
	{
		int x = 30;									// ��������x�� ������ ���� x������ �����Ѵ�.
		System.out.println("x:" + x);				// �ڱ� ���� ���� �� �θ� �� ���, ��������, �� ������ ����� �������
		System.out.println("this.x:" + this.x);		// this:child���� �������(instance����)�� ������ �� ���
		System.out.println("super.x:" + super.x);	// super : �θ𺯼������Ҷ�, q�θ��� x������ private�϶��� ���ٺҰ���
	
		super.method();
	}
}// class Child end

public class Ex06_05_super 
{
	public static void main(String[] args) 
	{
		Parent c = new Child();		// �θ𺯼��� ��ĳ����
		c.method();
	}
}
