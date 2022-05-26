
public class Ex06 
{
	public static void main(String[] args)
	{
		int a = 123;
		double b;
		b= 1.987;
		String c = "홍길동";
		char d = 'X';
		
		/* a 123
		b 1.987 소수 2자리까지
		c 홍길동
		d X */
		
		System.out.println("a는 "+ a + "입니다.");
		System.out.printf("b는 %.2f입니다.\n", b);
		System.out.println("c는 " + c + "입니다.");
		System.out.println("d는 " + d +"입니다.");
		System.out.printf("\t%c\t%c\t%c\t%c", d, d, d, d);
		
	}
	
}
