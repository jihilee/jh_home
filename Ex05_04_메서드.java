class calculator
{	
	int x, y; 
	
	static int add(int a, int b)	// �� ������ ������ �����ϴ� add �޼����� ����
	{
		return a+b;
	}	
	static int multiply(int a, int b)		// �� ������ ������ �����ϴ� multiply �޼����� ����
	{
		int c = a*b;
		System.out.println(c + "�Դϴ�");
		return c;
	}	
}

public class Ex05_04_�޼��� 
{
	public static void main(String[] args) 			//����޼���, ����
	{
		//main(); �ڹٰ���ӽſ� ���� main�޼��尡 �ڵ����� ȣ��ȴ�
		
		
		// Ex05_04_�޼��� ab = new Ex05_04_�޼���();
		// ab.main()			
		
		
		calculator p1 = new calculator();
		p1.x = 100;
		p1.y = 200;
		System.out.println(p1.x);
		System.out.println(p1.y);
		
		int result = p1.add(10,20);
		// add(10,20);		// class ���� add method�� main �޼��忡�� 
		System.out.println("add result = " + result);
		
		
		
		int result2 = p1.multiply(5, 6);
		System.out.println("multiply result = " + result2);
		
		
		
		System.out.println();
		System.out.println("================");
		System.out.println();
		
		
	
		int result3 = sub(100,11,22);
		System.out.println("result3 = " + result3);
		
		
		
		Ex05_04_�޼��� e = new Ex05_04_�޼���();		//Ex05_04_�޼����� method�� ����� �������� e�� ����*********
		int result4 = e.sub2(100,11,22);
		System.out.println("result4 = " + result4);
	
	}																	// ����
	
	static int sub(int x, int y, int z) {
	 									System.out.println();
	 									int result = x - y - z;	
	 									return result;			
										}								//sub �޼���
	int sub2(int x, int y, int z) {
									System.out.println();
									int result = x - y - z;	
									return result;			
									}									//sub2 �޼���
}	

// static method������ static method�� ȣ���� �� �ִ�
// static method�� ���Ե� class�� ��ü�� ����� method�� �����ϸ� static ���� ���� method�� ��� ����