
public class Ex03_13_break_continue 
{
	public static void main(String[] args) 	
	{
		
		System.out.println("~~~~~~for��~~~~~~");	
		System.out.println();
		System.out.println("----break;----");
		
		int i;
		
		for(i=1;i<=10;i++)
		{	
			if(i==5)
			{
				break;	//�ݺ����� ����������. 1 2 3 4 
			}
			System.out.print(i + " ");
		}
			System.out.println();
		
		System.out.println();
		System.out.println("---continue;---");
		
		for(i=1;i<=10;i++)
		{	
			if(i==5)
			{
				continue;	//�ݺ����� �������� ���������� ����. 5�� ������ 1~10���� ���
			}
			System.out.print(i + " ");
		}
			System.out.println();		
			
		System.out.println();	
		
		System.out.println("~~~~~~while��~~~~~~");	
		System.out.println();
		System.out.println("----break;----");
		
		i=1;
		while(i<=10)
		{
			if(i==5)
				break;		// ���������� ����.
			System.out.print(i + " ");
			i++;
		}
			System.out.println();
		
		System.out.println();	
			
		System.out.println("---continue;---");
		i=0;
		while(i<10)
		{
			i++;
			if(i==5)
				continue;		// ���ǽ����� ����. ������ ���� continue�� �����Ƿ� i�� ��� 5
			System.out.print(i + " ");
			
		}
			System.out.println();	
			
			
			
			
			
	}

}
// �ݺ��� : for, while, do_while
// �����̵� : art + ����Ű
// �б⹮ : break, continue
// break : �ݺ����� ����������.
// continue : �ݺ����� �������� �������� �̵��Ѵ�.