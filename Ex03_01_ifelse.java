import java.util.Scanner;
public class Ex03_01_ifelse 
{
	public static void main(String[] args) 
	{
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� a�� �Է��ϼ���.");
		a = sc.nextInt();
		
		System.out.println("��� b�� �Է��ϼ���.");
		b = sc.nextInt();
		
		System.out.println(" ");
		System.out.printf("a�� %d, b�� %d�Դϴ�.\n", a, b);
		System.out.println(" ");
		
		System.out.println("<�ټ��� if���� ���>");
		System.out.println(" ");
		
		if(a>b)
		{
			System.out.printf("%d(��)�� %d���� Ů�ϴ�.\n", a, b);
		}	// ���ǽ� �ڿ� ������ ������ �� ���̶�� ���� �߰�ȣ�� ���� ����, �� �� �̻��̶�� �߰�ȣ �ݵ�� ���.
		
		if(a<b)
		{
			System.out.printf("%d(��)�� %d���� Ů�ϴ�.\n", b, a);
		}
		
		if(a==b)
		{
			System.out.printf("%d(��)�� %d�� �����ϴ�.\n", a, b);
		}
		
		System.out.println("if���� ���� ���Դϴ�.");	//��ȣ ���� ������ ���
		

		System.out.println(" ");		
		System.out.println("<�ϳ��� if������ ���>");
		System.out.println(" ");
		
		if(a>b)	
		{
			System.out.printf("%d(��)�� %d���� Ů�ϴ�.\n", a, b);
		}
		else if(a<b)
		{
			System.out.printf("%d(��)�� %d���� Ů�ϴ�.\n", b, a);
		}
		else if(a==b)
		{
			System.out.printf("%d(��)�� %d�� �����ϴ�.\n", a, b);
		}	
		else	
		{
			System.out.println("if���� ���� ���Դϴ�.");
		}	
			
			
			
	}

}
// if(���ǽ�) {�����ҹ���1; ����2;}

// ���ǽ��� ���̸� {} ���� ������ ����ȴ�.
// ���ǽ��� �����̸� {} ���� ������ ������� �ʴ´�.

/* if(���ǽ�1)
 * {������ ����1;
 * 	������ ����2;}
 * else if(���ǽ�2)
 * {������ ����1;
 * 	������ ����2;}
 * else
 * {������ ����1;
 * 	������ ����2;} */

