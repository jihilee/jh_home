import java.util.Scanner;
public class Ex05_10_������ 
{
	public static void main(String[] args) 
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ŵ����� ���ϴ� ���α׷��Դϴ�. ���� �� ���� �Է��ϼ���.");
		System.out.print("���� �Է��ϼ��� > ");
		a = sc.nextInt();
		System.out.print("������ �Է��ϼ��� > ");
		b = sc.nextInt();
		System.out.println();
		
		
		int result = recursive(a,b);
		System.out.println("���ȣ��� ������ ����Դϴ�.");
		System.out.printf("%d�� %d���� %d�Դϴ�.", a, b, result);
		System.out.println();
	
//		int result = involution(a, b);
//		System.out.println("���ȣ��� ������ ����Դϴ�.");
//		System.out.printf("%d�� %d���� %d�Դϴ�.", a, b, result);
//		System.out.println();
//		System.out.println();
		
//		int i;
//		result= 1;
//		for(i=0;i<b;i++)
//		{
//			result = result * a;
//		}
		
		int result2 = recursive2(a,b); 
		System.out.println("for������ ������ ����Դϴ�.");
		System.out.printf("%d�� %d���� %d�Դϴ�.", a, b, result2);
		System.out.println();
		System.out.println();
		
	}

		static int recursive(int x, int y)		// 4,3
		{
			if(y==0)
				return 1;
			else
				return x * recursive(x, (y-1));
		}
		
		
		static int recursive2(int x, int y)
		{
			int i;
			int mul = 1;
			for(i=0;i<y;i++)
			{
				mul = mul * x;
			}
			return mul;
		}
	
//		static int involution(int a, int b)
//		{
//			if (b==1)
//				return a;
//			else 
//				return a * involution(a, (b-1)); // --b�� ����
//		}
}
