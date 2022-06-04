import java.util.Scanner;
public class Ex03_01_ifelse 
{
	public static void main(String[] args) 
	{
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상수 a를 입력하세요.");
		a = sc.nextInt();
		
		System.out.println("상수 b를 입력하세요.");
		b = sc.nextInt();
		
		System.out.println(" ");
		System.out.printf("a는 %d, b는 %d입니다.\n", a, b);
		System.out.println(" ");
		
		System.out.println("<다수의 if으로 출력>");
		System.out.println(" ");
		
		if(a>b)
		{
			System.out.printf("%d(이)가 %d보다 큽니다.\n", a, b);
		}	// 조건식 뒤에 실행할 문장이 한 줄이라면 밖의 중괄호는 생략 가능, 두 줄 이상이라면 중괄호 반드시 사용.
		
		if(a<b)
		{
			System.out.printf("%d(이)가 %d보다 큽니다.\n", b, a);
		}
		
		if(a==b)
		{
			System.out.printf("%d(와)과 %d는 같습니다.\n", a, b);
		}
		
		System.out.println("if문을 공부 중입니다.");	//괄호 밖은 무조건 출력
		

		System.out.println(" ");		
		System.out.println("<하나의 if문으로 출력>");
		System.out.println(" ");
		
		if(a>b)	
		{
			System.out.printf("%d(이)가 %d보다 큽니다.\n", a, b);
		}
		else if(a<b)
		{
			System.out.printf("%d(이)가 %d보다 큽니다.\n", b, a);
		}
		else if(a==b)
		{
			System.out.printf("%d(와)과 %d는 같습니다.\n", a, b);
		}	
		else	
		{
			System.out.println("if문을 공부 중입니다.");
		}	
			
			
			
	}

}
// if(조건식) {실행할문장1; 문장2;}

// 조건식이 참이면 {} 안의 문장이 실행된다.
// 조건식이 거짓이면 {} 안의 문장이 실행되지 않는다.

/* if(조건식1)
 * {실행할 문장1;
 * 	실행할 문장2;}
 * else if(조건식2)
 * {실행할 문장1;
 * 	실행할 문장2;}
 * else
 * {실행할 문장1;
 * 	실행할 문장2;} */

