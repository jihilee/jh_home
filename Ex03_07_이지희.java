
public class Ex03_07_이지희 
{	
	public static void main(String[] args)
	{
		int i, sum1=0;
		
		System.out.println("=====1번 문제=====");
		System.out.println();
		
		for(i=1;i<=100;i++)
		{
			if(i%5 == 0)
			{
				System.out.print(i + " + ");
				sum1 = sum1 + i;
			}
		}
		
		System.out.println("= " + sum1);
		
		//1번 문제 : for문을 이용해서 1-100까지 5의 배수 합계

		System.out.println();
		System.out.println("=====2번 문제=====");
		System.out.println();
		
		sum1 = 0;	//1번 문제에서 사용했던 sum1변수 초기화 작업 필수
		
		for(i=1;i<=100;i++)
		{
			sum1 += i;
			
			if(i%10 == 0)
			{
				System.out.println("1 ~ " + i + " = " + sum1);
			}
		}
		
		//2. for문을 이용해서 1-100사이의 수 중 1~10=55 ... 1~100=5050 10번에 걸쳐서 출력되도록 코딩
		
		
		System.out.println();
		System.out.println("=====3번 문제=====");
		System.out.println();
		
		
		int sum = 0;
		
		for(i=1;i<=100;i++)
		{
			if(i%10 == 0)
			{
				sum = ((i-9) + i) * 10 / 2;
				
				System.out.println((i-9) + " ~ " + i + " = " + sum);
			}
		}
		
		//3. for문을 이용해서 1-100까지 10의 배수가 되면 출력 1~10=55 ... 61~70=655 ... 91~100=@@

		
		System.out.println();
		System.out.println("===3번 문제 선생님 답안===");
		System.out.println();
		
			
		sum1 = 0;	//1번 문제에서 사용했던 sum1변수 초기화 작업 필수
		
		for(i=1;i<=100;i++)
		{
			sum1 += i;
			
			if(i%10 == 0)
			{
				System.out.println((i-9) + " ~ " + i + " = " + sum1);
				sum1=0;	// sum1을 초기화 한 다음 숫자 10개만 덧셈
			}
		}
		
		
		
	}
}
