
public class Ex03_07_������ 
{	
	public static void main(String[] args)
	{
		int i, sum1=0;
		
		System.out.println("=====1�� ����=====");
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
		
		//1�� ���� : for���� �̿��ؼ� 1-100���� 5�� ��� �հ�

		System.out.println();
		System.out.println("=====2�� ����=====");
		System.out.println();
		
		sum1 = 0;	//1�� �������� ����ߴ� sum1���� �ʱ�ȭ �۾� �ʼ�
		
		for(i=1;i<=100;i++)
		{
			sum1 += i;
			
			if(i%10 == 0)
			{
				System.out.println("1 ~ " + i + " = " + sum1);
			}
		}
		
		//2. for���� �̿��ؼ� 1-100������ �� �� 1~10=55 ... 1~100=5050 10���� ���ļ� ��µǵ��� �ڵ�
		
		
		System.out.println();
		System.out.println("=====3�� ����=====");
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
		
		//3. for���� �̿��ؼ� 1-100���� 10�� ����� �Ǹ� ��� 1~10=55 ... 61~70=655 ... 91~100=@@

		
		System.out.println();
		System.out.println("===3�� ���� ������ ���===");
		System.out.println();
		
			
		sum1 = 0;	//1�� �������� ����ߴ� sum1���� �ʱ�ȭ �۾� �ʼ�
		
		for(i=1;i<=100;i++)
		{
			sum1 += i;
			
			if(i%10 == 0)
			{
				System.out.println((i-9) + " ~ " + i + " = " + sum1);
				sum1=0;	// sum1�� �ʱ�ȭ �� ���� ���� 10���� ����
			}
		}
		
		
		
	}
}
