
public class Ex02_������ 
{
	public static void main(String[] args)
	{
		System.out.println(1+2);
		
		int a;	// a, b�� ����(variable)���ڴ� ���� ��� �뵵�� �����ϴ� ��
		int b;	// ����
		
		a=1; 
		b=2;	//�ʱ�ȭ
		
		int c=3;	// ���� �ʱ�ȭ ���ÿ� ����
		
		System.out.println(a+b);
		System.out.println("a+b");
		System.out.println("a"+"b");
		System.out.println("c");

		byte b1=10; // ����� �ʱ�ȭ
		byte b2=20; 
		
		int b3; //������ ����ȯ, byte b3�� ������ ����ȯ���� ���� ���� �߻�
		
		b3=b1+b2; //30
		
		System.out.println("b3="+b3);
		
		
		int x = 1000000;
		int y = 2000000;
		
		long z = (long)x*y; // 2��, �� �ٿ����� ���� x�� ��� long���� ����, "8byte*4byte" y�� 8byte�� ����Ǹ� 8byte�� ���������
		
		System.out.println("z="+z);
	}
}

/*���ϸ� ���� ��� - �����̸� ��Ŭ�� - refactor - rename - �̸�����
  				- �����̸� Ŭ�� - f2Ű - �̸�����*/
//���� ���ÿ� : ctrl + art + ����Ű
//���� ���� : ctrl + d
//�ǵ����� : ctrl + z

/* ������ �ڷ���(type) : byte(1) -128~127, short(2)��-3��~3��, int(4byte) ��-21��~21��, long(8)-900��~900��
   �Ǽ��� �ڷ���(type) : float, double */

// �����̸� : �ٸ� ������ �ߺ��� �� ����, ���ڷ� ������ �� ����, Ư������ _�� ��� �����ϴ�, �ѱ����ڵ� ����

//������ ����ȯ : int���� ���� �����͸� �����ϸ� ����� int�� �ȴ�.