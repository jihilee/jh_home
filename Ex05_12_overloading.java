
public class Ex05_12_overloading 
{
	public static void main(String[] args) 
	{
		int result = plus(3,5,10);		// method ȣ��, ȣ���ϸ� ���ǵ� ������ ����
		System.out.println("int�� �� : " + result);
		
		float result2 = plus(0.1f, 0.2f);
		System.out.println("folat�� �� : " + result2);
		
		double result3 = plus(1.1, 2.2);
		System.out.println("doouble�� �� : " + result3);
		
		
		System.out.println();
		System.out.println(1);
		System.out.println(1.3);
		System.out.println('A');		// �̹� ��������ִ� System.out.print_overloading
	}
	
	
	// �ϳ��� Ŭ���� �ȿ� ���� �޼��尡 �����ؼ� �ȵȴ�
	// �׷����� ������ �ȳ��� ������ ������ ������ �ڷ����� �ٸ��� ����, �ߺ����� ���� �ʴ´�
	static int plus(int x, int y, int z)	// x,y,z �Ű�����
	{
		return  x + y + z;
	}
	
	static float plus(float x, float y)
	{
		return  x + y;
	}
	
	static double plus(double x, double y)
	{
		return  x + y;
	}
	 // Overloading Method
	 // �ϳ��� �̸����� ���� ���� �޼ҵ带 ���� �� �ִ� ��� = "�޼ҵ带 �����ε��ϴ�" ��� �Ѵ�
	 // ���� : �޼ҵ��� �̸��� ���ƾ� �ϸ� �Ű������� �ڷ����̳� ������ �޶�� �Ѵ�. (������ �߿����� �ʴ�)
	 // 	  ����Ÿ���� �����ε��� ���ǿ� ���ѵ��� �ʴ´�. �����ε��� �Ű������θ� �����ȴ�.
}
	 // Overriding Method
