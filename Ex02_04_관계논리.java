
public class Ex02_04_����� {

	public static void main(String[] args) 
	{
		
		int a = 20, b = 10;
		boolean c;
		
		c = a>=b;
		System.out.println("a>b : " + c);	// false or true
		
		System.out.println(a>b);	// false or true
		System.out.println(a==b);	// ����
		System.out.println(a!=b);	// �ٸ���
		
		boolean result = a>10 && b>10;	// AND ������
		System.out.println("result : " + result);
		
		result = a>10 || b>10;	// OR ������, result ����
		System.out.println("result : " + result);
		
		result = !(a>3);	// 10>3 !(true) = flase, ������ �������� �ٲ��ִ� ������
		System.out.println("result : " + result);

	}

}
/*	T && T : T
*	F // F : F
*/