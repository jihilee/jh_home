
public class Ex03_09_이중for 
{
	public static void main(String[] args) 
	{
		
		System.out.println("==이중for문을 공부 중입니다==");
		System.out.println();
		
		int i, j;
	
		for(i=2;i<=9;i++)
		{
			for(j=1;j<=9;j++)
			{
				System.out.println( i + "," + j);
			}
			
				System.out.println("----");
		}
		
		System.out.println();
		System.out.println("====끝====");
		System.out.println();
		
		
		System.out.println();
		System.out.println("==구구단을 공부 중입니다==");
		System.out.println();

	
		for(i=1;i<=9;i++)
		{
			System.out.println("** "+ i + "단 **");
			
			for(j=1;j<=9;j++)
			{
				System.out.println( i + "*" + j + " = " + (i*j));
			}
			
			System.out.println();	
		}
		
		System.out.println("====끝====");
		System.out.println();
	}

}
