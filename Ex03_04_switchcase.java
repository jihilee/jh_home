
public class Ex03_04_switchcase 
{
	public static void main(String[] args)
	{
		
		int n=2;
		
		System.out.println("====if_else====");
		System.out.println();
		
		if(n==1)
		{
			System.out.println("n�� 1�Դϴ�.");
		}
		else if(n==2)
		{
			System.out.println("n�� 2�Դϴ�.");
		}
		else if(n==3)
		{
			System.out.println("n�� 3�Դϴ�.");
		}
		else
		{
			System.out.println("n�� 1~3 ������ ���ڰ� �ƴմϴ�.");
		}
		
		
		System.out.println();
		System.out.println("==switch_case==");
		System.out.println();
		
		
		switch(n)		// �ش� ���ڸ� ã�� �Ʒ��� break������ ������ ���
		{
			case 1 : System.out.println("n�� 1�Դϴ�.");
					break;
					
			case 2 : System.out.println("n�� 2�Դϴ�.");
					break;
					
			case 3 : System.out.println("n�� 3�Դϴ�.");
					break;
			
			default : System.out.println("n�� 1~3 ������ ���ڰ� �ƴմϴ�.");
					break;
		}
		
		System.out.println("switch_case ���� ���Դϴ�");
		
		
		System.out.println();
		
		String fruit = "apple";
		switch(fruit)
		{
		case "apple" : 	System.out.println("����� ���־�"); 
						break;
		case "banana" : System.out.println("�ٳ����� ���־�"); 
						break;
		default : 		System.out.println("������ ���־�"); 
		
		}
		
		System.out.println();
		
		
		char ch='m';

		switch(ch)
		{
		case 'm' : 
		case 'M' : System.out.println("Morning"); break;	
		case 'a' : 
		case 'A' : System.out.println("Afternoon"); break;
		case 'e' : 
		case 'E' : System.out.println("Evening"); break;
				//���Ʒ� �ؾ��� ���� ���ٸ� ��¸�ɰ� �극��ũ �ߺ������� �ʿ� ����.
		default : System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}
}
/*	Switch(���� or ���������� or ���ڿ� or ����)
	{
		case ����1 : ����1;
					break;
		case ����2 : ����2;
					break;
		case ����n : ����n;
					break;
		default : 	����n+1;
					break; <-switch_case�� �������󰡴� ��ɾ�
	}	*/