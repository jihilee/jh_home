
public class Ex03_05_for 
{
	public static void main(String[] args) 
	{
		int i;
		 
		for(i=1;i<=10;i+=2)
		{
			System.out.println("java\ti="+i);
		}
		
		System.out.println("i�� for�� ������ ������ �� �� : " + i);
	
		System.out.println();
		System.out.println("======1~10���� ����======");
		System.out.println();
		
		int sum = 0;	// for���� �̿��� 1~10���� ����
		
		for(i=1;i<=10;i++)
		{
			for(i=1;i<10;i++)
			{
				System.out.printf(i + "+");
				sum=sum+i; // sum += i;
			}
				System.out.printf(i + "=");
				sum=sum+i;
		}
				System.out.println(sum);
				System.out.println();
		
		
	
	}

}
/*	for(�ʱ��; ���ǽ�; ������)
*	{	�ݺ��� ����;	}	
*	
*	for�� ����	
*	1.�ʱ��, 2.���ǽ� �Ǻ�, 3.����ݺ�, 4.������ 
*
*	i�� 1�� �����ϴ� for��	-> for(i=1;i<=10;i++)
*	i�� 1�� �����ϴ� for��	-> for(i=10;i>0;i--)	
*	���ѷ����� ������ �ʵ��� ����	-> for(i=1;1<=10;i==)	*/