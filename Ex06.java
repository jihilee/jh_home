
public class Ex06 
{
	public static void main(String[] args)
	{
		int a = 123;
		double b;
		b= 1.987;
		String c = "ȫ�浿";
		char d = 'X';
		
		/* a 123
		b 1.987 �Ҽ� 2�ڸ�����
		c ȫ�浿
		d X */
		
		System.out.println("a�� "+ a + "�Դϴ�.");
		System.out.printf("b�� %.2f�Դϴ�.\n", b);
		System.out.println("c�� " + c + "�Դϴ�.");
		System.out.println("d�� " + d +"�Դϴ�.");
		System.out.printf("\t%c\t%c\t%c\t%c", d, d, d, d);
		
	}
	
}
