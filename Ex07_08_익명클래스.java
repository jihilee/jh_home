class Inner1{
	int i=2;
	void display()
	{
		System.out.println("i=" + i);
	}
}//inner1

class Inner2 extends Inner1{	//display�� ���� �����ϱ� ���� ���� inner2 class
	void display()
	{
		System.out.println("i="+i*i);
	}
	
}//inner2

public class Ex07_08_�͸�Ŭ���� {
	public static void main(String[] args) {
		
		Inner1 i1 = new Inner1();
		i1.display();
		
		Inner1 i2 = new Inner2();
		i2.display();
		
		
		
		new Inner1() {	//display�� ���� �����ϱ� ���� Ŭ������ ������ �ʰ� ���� Inner1�� �����Ͽ� display method ���� �ϼ� = �͸�Ŭ����
			void display()
			{
				System.out.println("i=" + i*i*i);
			}//display
		}.display();	//�޼ҵ� ���� �ϼ�, ��±���
		
		new Inner2()	//display method ���� �ϼ��ϱ� ���� Inner2�� �͸�Ŭ����
		{
			void display() {
				System.out.println("i=" + i*i*i*i);
			}
		}.display();
		
	}

}
//�͸�Ŭ���� : display�� ���� �����ϱ� ���� Ŭ������ ������ �ʰ� ���� Inner1�� �����Ͽ� display method ���� �ϼ�