
public class Ex03_11_이중for 
{
	public static void main(String[] args)
	{
		
		System.out.println("==이중for문을 이용한 * 출력 1==");
		System.out.println();
		
		int i, j;
		
		for(i=0;i<5;i++)
			{
				for(j=0;j<5;j++)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
				
		
		
		System.out.println();
		System.out.println("==이중for문을 이용한 * 출력 2==");
		System.out.println();
		
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		

		System.out.println();
		System.out.println("==이중for문을 이용한 * 출력 3==");
		System.out.println();
		
		int k;
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}	//공백 반복

			for(k=5;k>i;k--)
			{
				System.out.print("*");
			}	//별 반복
			
			System.out.println();
		}//5번 반복 0~4
		
		
		System.out.println();
		System.out.println("==이중for문을 이용한 * 출력 4==");
		System.out.println();
		
		
		for(i=0;i<5;i++)
		{
			
			for(k=4;k>i;k--)
			{
				System.out.print(" ");
			}	//공백 반복
			
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}	//별 반복
			
			System.out.println();
			
		}
			
			
			
			System.out.println();
			System.out.println("==이중for문을 이용한 * 출력 5==");
			System.out.println();
				
			for(i=5;i>0;i--)
			{	
				for(k=1;k<i;k++)
				{
					System.out.print(" ");
				}	//공백 반복
					
				for(j=5;j>=i;j--)
				{
					System.out.print("*");
				}	//별 반복
					
				System.out.println();
				
			}//5번 반복 1~5
		
	}
}


