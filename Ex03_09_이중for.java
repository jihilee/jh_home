
public class Ex03_09_����for 
{
	public static void main(String[] args) 
	{
		
		System.out.println("==����for���� ���� ���Դϴ�==");
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
		System.out.println("====��====");
		System.out.println();
		
		
		System.out.println();
		System.out.println("==�������� ���� ���Դϴ�==");
		System.out.println();

	
		for(i=1;i<=9;i++)
		{
			System.out.println("** "+ i + "�� **");
			
			for(j=1;j<=9;j++)
			{
				System.out.println( i + "*" + j + " = " + (i*j));
			}
			
			System.out.println();	
		}
		
		System.out.println("====��====");
		System.out.println();
	}

}
