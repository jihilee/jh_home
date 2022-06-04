import java.util.Scanner;

public class Ex03_02_ifelse 
{

	public static void main(String[] args) 
	{
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상수 n을 입력하세요.");
		n = sc.nextInt();
		
		System.out.printf("n은 %d입니다.\n", n);
		System.out.println(" ");
		
		if(n>=1 && n<=10) // n==1 || n==2 || ... || n==10
		{
			System.out.println("입력한 숫자는 1~10 사이의 숫자입니다.");
		}
		else if (n>10 && n<=20)	// else if(조건문) 여러번 사용 가능
		{
			System.out.println("입력한 숫자는 10~20 사이의 숫자입니다.");
		}
		else
		{
			System.out.println("입력한 숫자는 1보다 작거나 20보다 큰 숫자입니다.");
		}
		
		System.out.println("if~else 공부 중입니다.");
		
		int m;
		
		
		System.out.println(" ");
		System.out.println("====5의 배수 참 거짓====");
		System.out.println(" ");
		
		System.out.println("상수 m을 입력하세요.");
		m = sc.nextInt();
		
		System.out.println(" ");
		System.out.printf("m은 %d입니다.\n", m);
		
		if(m%5==0)
		{
			System.out.printf("%d은 5의 배수입니다.", m);
		}
		else
		{
			System.out.printf("%d은 5의 배수가 아닙니다.", m);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
