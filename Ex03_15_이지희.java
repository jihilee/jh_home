
public class Ex03_15_������ 
{
	public static void main(String[] args) 
	{
		
		System.out.println("==�������� ���η� ����մϴ�==");
		System.out.println();
		
		int i, j;
		
		for(i=2;i<10;i++)
		{
			System.out.println("<" + i + "���� ����մϴ�>");
			
			for(j=1;j<10;j++)
			{
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("==2 ��� �������� ����մϴ�==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==0)
			{
				System.out.println("<" + i + "���� ����մϴ�>");
				
				for(j=1;j<=i;j++)
				{
					System.out.println("    " + i + "*" + j + "=" + (i*j));
				}
			
					System.out.println();
			}
			
		}
		
		System.out.println();
		System.out.println("==2��� ������ ��� // ������ �̿�==");
		System.out.println();
		
		
		for(i=2;i<10;i+=2)
		{
			
				System.out.println("<" + i + "���� ����մϴ�>");
				
				for(j=1;j<=i;j++)
				{
					System.out.println("    " + i + "*" + j + "=" + (i*j));
				}
			
					System.out.println();
			
		}
		
		System.out.println();
		System.out.println("==2��� ������ ��� // continue==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==1)
				continue;		// ���̸� �ٷ� ���������� �̵�
				
			System.out.println("<" + i + "���� ����մϴ�>");
				
			for(j=1;j<=i;j++)
			{
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
				System.out.println();
			
		}
		
		System.out.println();
		System.out.println("==2��� ������ ��� // break==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==1)
				break;		// ���̸� ���� �ݺ����� ����������
				
			System.out.println("<" + i + "���� ����մϴ�>");
				
			for(j=1;j<=i;j++)
			{
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
				System.out.println();
			
		}
		
		
		System.out.println();
		System.out.println("==2��� ������ ��� // break�� continue==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==1)
				continue;		// ���������� �̵��Ѵ�. Ȧ������ �ǳʶپ��
				
			System.out.println("<" + i + "���� ����մϴ�>");
				
			for(j=1;j<=9;j++)
			{
				if(i<j)	
					break;		// ���� ����� �ݺ����� ����������.
				
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
				System.out.println();
			
		}
		
		
		System.out.println();
		System.out.println("==2��� ������ ��� // continue�� continue==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==1)
				continue;		
				
			System.out.println("<" + i + "���� ����մϴ�>");
				
			for(j=1;j<=9;j++)
			{
				if(i<j)	
					continue;		// j�� i���� ũ�� �ݺ����� ����������.
				
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
				System.out.println();
			
		}
	}

}

//	break�� �ӵ��� �� ���� ����
//	break�� ���� ������ ���� �ݺ����� �ٷ� ������������
//	continue�� �ϴ� ���������� �̵��Ͽ� ��� ���� �����غ��� ������ �ð��� ���� �����ɸ���.
