import java.util.Scanner;
public class Ex03_14_while 
{
	public static void main(String[] args)
	{
		int num, sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.print("정수를 입력하세요 : ");
//		num = sc.nextInt();	// 입력하다
		
		while(true)		//반복 횟수를 모를 때 = while문 사용
		{	
			
			System.out.print("정수를 입력하세요 : ");
			num = sc.nextInt();	// 입력하다
			
			sum = sum + num;	//sum누적식이 break문 위에 위치하면 입력된 음수값까지 덧셈하여 출력된다 
								//sum누적식이 break문 아래 위치하면 정수값만 덧셈하여 출력된다.
			if(num<0)
			{
				break;
			}
		
		}
		
		System.out.println("sum = " + sum);
	}
}
