
public class Ex03_�Ǽ��� 
{
	public static void main(String[] args)
	{
		double d1 = 1.2;
		double d2;
		d2 = 3.4;
		
		double d3;
		d3 = d1 + d2;
		
		System.out.println("d3="+d3);
		
		double d4 = .123E3; 
		System.out.println("d4="+d4);	// .123 = 0.123, .123E3 = 0.123*10^3 = 123.0
		
		double d5 = .123E-3; 
		System.out.println("d5="+d5);	// .123E-3 = 0.123*10^-4 == 0.000123

		float f1;
		f1 = 0.0123f; // �Ǽ��� �ڵ����� 8byte ����(double)���� ������. �׷��Ƿ� float f1�� ������ ��
						// 0.0123f <-�÷�Ʈ ������ ����
		System.out.println("f1="+f1);	// f1=0.0123
		
		float f2 = 3;					// �ڵ� ����ȯ
		System.out.println("f2="+f2);	// f2=3.0
		
		int i = (int)7.8;	// ���� ����ȯ
							// ������ 4byte���� int < float, (int)7.8->�� �ٿ����� ��� ������ ��� 7�� ������
		System.out.println("i="+i);
		
	}
}


/*�Ǽ��� �ڷ���
 * double(8byte) -1.7E308~1.7E308
 * float(4byte) -3.4E38~3.4E38
 * 
 * 1,2d <- ������ ���ڷ� �ν� /  1.2f <- �÷�Ʈ�� ���ڷ� �ν�
 * 
 * ��������ȯ
 * 
 * Syso + ctrl + space -> ��¸�� �ڵ��Է�
 * 
 * �������Ű ctrl + f11, Ȥ�� ��� run, run
 */