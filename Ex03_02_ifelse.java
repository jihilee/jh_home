import java.util.Scanner;

public class Ex03_02_ifelse 
{

	public static void main(String[] args) 
	{
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� n�� �Է��ϼ���.");
		n = sc.nextInt();
		
		System.out.printf("n�� %d�Դϴ�.\n", n);
		System.out.println(" ");
		
		if(n>=1 && n<=10) // n==1 || n==2 || ... || n==10
		{
			System.out.println("�Է��� ���ڴ� 1~10 ������ �����Դϴ�.");
		}
		else if (n>10 && n<=20)	// else if(���ǹ�) ������ ��� ����
		{
			System.out.println("�Է��� ���ڴ� 10~20 ������ �����Դϴ�.");
		}
		else
		{
			System.out.println("�Է��� ���ڴ� 1���� �۰ų� 20���� ū �����Դϴ�.");
		}
		
		System.out.println("if~else ���� ���Դϴ�.");
		
		int m;
		
		
		System.out.println(" ");
		System.out.println("====5�� ��� �� ����====");
		System.out.println(" ");
		
		System.out.println("��� m�� �Է��ϼ���.");
		m = sc.nextInt();
		
		System.out.println(" ");
		System.out.printf("m�� %d�Դϴ�.\n", m);
		
		if(m%5==0)
		{
			System.out.printf("%d�� 5�� ����Դϴ�.", m);
		}
		else
		{
			System.out.printf("%d�� 5�� ����� �ƴմϴ�.", m);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
