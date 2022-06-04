import java.util.Scanner;
public class Ex04_06_2차원입력 
{
	public static void main(String[] args) 
	{
		
		System.out.println("<2중 for문 활용하여 2차원배열 값 입력받기>");
		System.out.println();
		
		int[][] arr = new int[2][3];
		int i, j;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("정수를 입력하세요 : ");
				arr[i][j] = sc.nextInt();
			}
		}	// 배열 안에 들어갈 정수 입력받기 arr[0][0] ~ arr[1][2]
		
		
		System.out.println();
		System.out.println("<배열의 값과 해당 행의 누적값 출력>");
		System.out.println();
		
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j] + " ");	// 입력받은 배열값 출력하기
				sum = sum + arr[i][j];				// 행의 배열 값 누적하여 덧셈
			}
				System.out.println();
				System.out.println(i + "행 누적 값 = " + sum);
				sum = 0;		// sum값 초기화 중요! 
								// sum값 초기화하면 다음 행의 누적값만을 출력할 수 있다
				System.out.println();
		}
		
	}

}
