
public class Ex03_11_����for 
{
	public static void main(String[] args)
	{
		
		System.out.println("==����for���� �̿��� * ��� 1==");
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
		System.out.println("==����for���� �̿��� * ��� 2==");
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
		System.out.println("==����for���� �̿��� * ��� 3==");
		System.out.println();
		
		int k;
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}	//���� �ݺ�

			for(k=5;k>i;k--)
			{
				System.out.print("*");
			}	//�� �ݺ�
			
			System.out.println();
		}//5�� �ݺ� 0~4
		
		
		System.out.println();
		System.out.println("==����for���� �̿��� * ��� 4==");
		System.out.println();
		
		
		for(i=0;i<5;i++)
		{
			
			for(k=4;k>i;k--)
			{
				System.out.print(" ");
			}	//���� �ݺ�
			
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}	//�� �ݺ�
			
			System.out.println();
			
		}
			
			
			
			System.out.println();
			System.out.println("==����for���� �̿��� * ��� 5==");
			System.out.println();
				
			for(i=5;i>0;i--)
			{	
				for(k=1;k<i;k++)
				{
					System.out.print(" ");
				}	//���� �ݺ�
					
				for(j=5;j>=i;j--)
				{
					System.out.print("*");
				}	//�� �ݺ�
					
				System.out.println();
				
			}//5�� �ݺ� 1~5
		
	}
}


