
public class Ex03_12_while 
{
	public static void main(String[] args) 
	{
		
		int i;
		
		System.out.println("for������ 1~10���� ���");
		
		for(i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		
			System.out.println();
		
		
		System.out.println();	
		System.out.println("while������ 1~10���� ���");
			
		i=1;
		while(i<=10)
		{
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("while�� ���� i �� : " + i);
	
	
		System.out.println();	
		System.out.println("while������ 7�� ��� ���");
		
		
		i=1;
		while(i<=100)
		{	
			if(i%7==0)
			{
				System.out.print(i + " ");
			}
			
			i++;
		}
		
		System.out.println();
		
		
		System.out.println();	
		System.out.println("do_while ����Ͽ� 1~10���� ���");
		
		i=1;
		do {
			System.out.print(i + " ");
			i++;
			}while(i<=10);
		
		System.out.println();
		
		System.out.println();
		System.out.println("do_while�� ���� i�� : " + i);
		System.out.println();
	}
}
/*	�ʱ��;
*	while(���ǽ�)
*	{
*	�ݺ��� ����;
*	������;
*	}	
*
*	�ʱ��;
*	do{
*		�ݺ��� ����;
*		������;
*	}while(���ǽ�);	// ���ǽ��� �����̾ �ּ� �ѹ��� �ݵ�� �����Ѵ�. 
*
*	�ּ� �ѹ��� �����ؾ� �� �� do_while ����ؾ� �Ѵ�.
*
*	for�� �ȿ� while��, while�� �ȿ� for�� �־ ��� ����
*	*/