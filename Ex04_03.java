
public class Ex04_03 
{
	public static void main(String[] args) 
	{
		// array : 같은 타입의 데이터를 한 묶음으로 묶어서 관리하는 것
		// arr = 참조변수 = 참조값이 들어가는 변수
		
		// int[] arr = {10, 9, 8};
		// int[] arr = new int[] {10, 9, 8};
		
		int[] arr = new int[3];		//int arr[] = {0, 0, 0};
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 8;
		
		int i;
		
		System.out.println("<배열 arr을 for문 통해 출력하지기>");
		System.out.println();
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("arr[i] =" + arr[i]);
		}
		
		
		System.out.println();
		System.out.println("<배열 arr을 확장for문 통해 출력하기>");
		System.out.println();
		
			
		for(int j : arr)
		{
			System.out.println("arr[i] = " + j);
					
		}

	}

}
