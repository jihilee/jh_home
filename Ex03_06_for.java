import java.util.Scanner;

public class Ex03_06_for 
{
	public static void main(String[] args)
	{
		int i;
		for(i=1;i<=10;i++)	// 1~10까지 출력
		{
			if(i % 2 == 0)	//2의 배수인 i값만 출력
				System.out.println(i);
		}

		System.out.println();

		Scanner sc = new Scanner(System.in);

		int dan;

		System.out.println("구구단 몇 단을 출력하시겠습니까? (짝수만 가능)");
		dan = sc.nextInt();

		if(dan%2==0)
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
		}
		else	
			System.out.println("홀수단입니다.");


	}
}

// 괄호 행렬 맞춰주기 : ctrl+a, ctrl+i