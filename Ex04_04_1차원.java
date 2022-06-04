import java.util.Scanner;
public class Ex04_04_1차원
{

	public static void main(String[] args) 
	{
		
		int [ ] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("<배열 arr에 정수를 입력받아 출력합니다>");
		System.out.println();
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print("정수를 입력하세요 : ");
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println();
	
		for(i=0;i<arr.length;i++)
		{
			System.out.println("arr[" + i + "] = " + arr[i]);
					
		}
		

	}

}
