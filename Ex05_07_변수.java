class Var{
			static int a;		//static����		�� Ŭ������ ����������ε� �ϳ��� static���� �ϳ��� instance�����̴�
			int b;				//instance����	�� ���� �� 0���� �ڵ� �ʱ�ȭ
			void increment()
				{
				int c = 0;		// �޼��� ���� ������ ��������, �� ���� �ȿ����� ��� �����ϴ�
				a++;			// ���������� 0���� �ʱ�ȭ�� �ؾ��Ѵ�.
				b++;
				c++;
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
				}	// increment, �޼��� ����
	
			}	//var

public class Ex05_07_���� {
	public static void main(String[] args) 
	{
		Var v1 = new Var();
		v1.increment();		// Var��� ���׿��� increment��� �޼��带 ȣ���� ��, ������ ���� Ŭ������ ȣ���ϰ� ����.�޼ҵ�();
		v1.increment();
		System.out.println();
		
		Var v2 = new Var();
		v2.increment();		
		v2.increment();
		System.out.println();
		
		Var v3 = new Var();
		v3.increment();		
		v3.increment();
		System.out.println();
	}

}
