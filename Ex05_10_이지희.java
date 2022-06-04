import java.util.Scanner;
public class Ex05_10_이지희 
{
	public static void main(String[] args) 
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("거듭제곱 구하는 프로그램입니다. 정수 두 개를 입력하세요.");
		System.out.print("밑을 입력하세요 > ");
		a = sc.nextInt();
		System.out.print("지수를 입력하세요 > ");
		b = sc.nextInt();
		System.out.println();
		
		
		int result = recursive(a,b);
		System.out.println("재귀호출로 도출한 결과입니다.");
		System.out.printf("%d의 %d승은 %d입니다.", a, b, result);
		System.out.println();
	
//		int result = involution(a, b);
//		System.out.println("재귀호출로 도출한 결과입니다.");
//		System.out.printf("%d의 %d승은 %d입니다.", a, b, result);
//		System.out.println();
//		System.out.println();
		
//		int i;
//		result= 1;
//		for(i=0;i<b;i++)
//		{
//			result = result * a;
//		}
		
		int result2 = recursive2(a,b); 
		System.out.println("for문으로 도출한 결과입니다.");
		System.out.printf("%d의 %d승은 %d입니다.", a, b, result2);
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
//				return a * involution(a, (b-1)); // --b도 가능
//		}
}
