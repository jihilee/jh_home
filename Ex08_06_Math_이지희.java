import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08_06_Math_이지희 {
	public static void main(String[] args)
	{	
//	double result = Math.random();	// 0<=random<1 사이의 실수
//	System.out.println(result);
//	
//	result = (int)Math.random() * 26 + 10;	//10~35 정수난수
//	System.out.println(result);
//	
//	result = (int)Math.random() * 45 + 1;	//1~45 정수난수
//	System.out.println(result);
	
	int i,j;
	int[] input = new int[6];
	int[] lotto = new int[6];
	
	for(i=0;i<lotto.length;i++)
	{
		lotto[i] = (int)(Math.random() * 45) + 1;		//*****
		
		for(j=0;j<i;j++)
		{	
			if(lotto[i] == lotto[j])
			{
				lotto[i] = (int)(Math.random() * 45) + 1;
				j=-1;	//j 증감식을 만나 0으로 초기화된다
						//다시 for문이 처음부터 돌 수 있도록 돕는다.
			}
			
		}//미리 받은 앞전의 숫자들과 비교하여 같은 숫자가 나오면 다시 출력받는 for문
	}//for
	
	int count=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("1~45사이의 정수 6개를 입력하세요.");
	
	for(i=0;i<6;i++)
	{
		try {
				System.out.print("숫자" + count + ">");
				input[i] = sc.nextInt();

				if(input[i]>=1 && input[i]<=45)
				{
					for(j=0;j<i;j++)
					{
						if(input[i] == input[j])
						{
							System.out.println("중복되었습니다.");
							System.out.print("숫자" + count + ">");
							input[i] = sc.nextInt();
							j-=1;
						}
					}
					count++;
				}
				else
				{
					System.out.println("1~45사이의 수를 입력하세요.");
					i--;
					continue;
				}

		} catch(InputMismatchException e) {
			System.out.println("유효하지 않은 값입니다.");
			i--;
			sc.next();
			continue;
		}
		
	}//for
	
	System.out.println();
	System.out.println("<컴퓨터에서 발생시킨 로또 번호를 출력>");
	
	for(i=0;i<lotto.length;i++)
	{
		System.out.print(lotto[i] + " ");
	}
	System.out.println();
	
	System.out.println("<내가 선택한 로또 번호를 출력>");
	
	for(i=0;i<input.length;i++)
	{
		System.out.print(input[i] + " ");
	}
	System.out.println();
	
	
	count=0;
	for(i=0;i<6;i++)
	{
		for(j=0;j<6;j++)
		{
			if(input[i] == lotto[j])
			{
				count=count+1;
			}
		}
	}
	
	System.out.print("맞은 갯수 : " + count);
	if(count==0)
	{
		System.out.println();
		System.out.println("꽝!");
	}
	System.out.println();

	
	}//main	
}
