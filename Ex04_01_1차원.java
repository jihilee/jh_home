
public class Ex04_01_1���� 
{
	public static void main(String[] args) 
	{
		
// array : ���� Ÿ���� �����͸� �� �������� ��� �����ϴ� ��
// 
		
		System.out.println("<�迭 a ���>");
		System.out.println();
		
//		int[] a = {10, 20, 30, 40, 50};	// ���� Ÿ�Ը� �迭�� ���� �� �ִ�. 
										// �迭�� �̸� a�� ��������, ������������ ������(�ּҰ�=I@73a28541)�� ����.
//		int[] a = new int[] {10,20,30,40,50}; // �߰�ȣ �տ� new int[]�� �ٿ����� ����Ѵ�
		int[] a = new int[5];	// ���� ���� ���� ���޾� 5�� ������, �⺻���� 0
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		// a[5] = 11;  // �迭�ȿ� �� ������ �� ������ ������ ������ �̷� ������ ������ �� ����
		
//		a[5]  = 1;		//ArrayIndexOutOfBoundsException error
		
		System.out.println(a);			// a���� ù���� �ּҰ� ����.
		System.out.println(a.length);	// �迭 a�� �� ������ ���϶�
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//	System.out.println(a[5]);	 �ε��� ������ �Ѿ� ������ ���
		System.out.println();
		
		
		System.out.println("<�ݺ��� ����Ͽ� �迭 a ���>");
		System.out.println();
		
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("<�ݺ��� ����Ͽ� �迭 a ��� - a.length>");
		System.out.println();
		
		
		for(i=0;i<a.length;i++)			// i�� a�� ���̸�ŭ �ݺ��ض�
		{
			System.out.println(a[i]);
		}
		
		
		System.out.println();
		System.out.println("<Ȯ�� for���� Ȱ���� �迭 a ��� : ����>");
		System.out.println();
		
				
		for(int x : a)	// for(�ϳ��� ���� �� �ִ� ���� : �ݺ����) -> �迭������ ��밡���� Ȯ��for��
		{
			System.out.println(x);
		}
		
		
		
		
		System.out.println();
		System.out.println("<�ݺ��� ����Ͽ� �迭 b ��� - �Ǽ���>");
		System.out.println();
		
//		double[] b  = {1.1, 2.2, 3.3};
//		double[] b = new double{1.1, 2.2, 3.3};
		double[] b = new double[3];
		
		b[0] = 1.1;
		b[1] = 2;		// 2.0 �Ǽ������� ���
		b[2] = 3.3;
		
		System.out.println(b);			// b�� ù �� �ּҰ� ����

		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

		
		System.out.println();
		System.out.println("<Ȯ�� for���� Ȱ���� �迭 b ��� : �Ǽ�>");
		System.out.println();
		
		for(double y : b)
		{
			System.out.println(y);
		}
		
		
		System.out.println();
		System.out.println("<Ȯ�� for���� Ȱ���� �迭 t ��� : ����>");
		System.out.println();
		
		char[] t = {'a','p','p','l','e'};
		
		for(char h : t)
		{
			System.out.print(h);
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("<Ȯ�� for���� Ȱ���� �迭 q ��� : boolean>");
		System.out.println();
		
		boolean[] q = {true, false};
		
		for(boolean w : q)
		{
			System.out.print( w + " ");
		}
		

	}

}
/* ��ü���� ��� ���� �ʿ�, ������� */
// �迭�� �����ΰ�, �迭Ȱ����, ��ã�¹�� ����