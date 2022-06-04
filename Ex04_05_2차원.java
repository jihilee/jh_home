
public class Ex04_05_2차원 
{
	public static void main(String[] args) 
	{
		//int[] a = {10,20,30,40,50}; 1차원 배열
		// for(int x : arr)
		//	System.out.println(x);
		
		
//		System.out.println("<2차원 배열을 표현하는 3가지 방법>");
//		System.out.println();
//		
//		System.out.println("1.직접 지정");
//		System.out.println();
		int[][] arr = {						// == int arr[][]
						{80,72,63,55}, 
						{93,21,}, 
						{99,49,59,}
						};					// 배열이 여러개면 괄호로 한번 더 묶음
		
//		System.out.println();
//		
//		
//		System.out.println("2.직접 지정 : new int[][]");
//		System.out.println();
//
//		int[][] arr = new int[][] { 
//									{80,72,63,55},
//									{93,21},
//									{99,49,59}
//									};
//		
//		System.out.println();
//		
//		
//		System.out.println("3.방 개수 선언 후 직접 입력");
//		System.out.println();
//		
//		int[][] arr = new int[3][4];
//		arr[0][0] = 80;
//		arr[0][3] = 55;
//		arr[1][1] = 21;
//		arr[2][2] = 59;
//		
//		System.out.println();
//		
//		
//		System.out.println("3.방 개수 선언 후 직접 입력");
//		System.out.println();
//		// 행마다 다른 갯수를 생성하고 싶다면 아래와 같은 방법을 사용한다.
//		
//		int[][] arr = new int[3][];		// 3행이고 열은 모른다.
//
//		arr[0] = new int[4];		// 중간관리자 arr[i]이 관리하는 방의 수를 직접 지정.
//		arr[1] = new int[2];
//		arr[2] = new int[3];
//		
//		arr[0][0] = 80;
//		arr[0][3] = 55;
//		arr[1][1] = 21;
//		arr[2][2] = 59;
		
		
		System.out.println("중간관리자의 갯수 : " + arr.length);		// 중간관리자의 갯수, 3
		System.out.println();
		
		System.out.println("중간관리자 arr[0]의 주소 : " + arr[0]);			// 중간관리자의 주소
		System.out.println("중간관리자 arr[1]의 주소 : " + arr[1]);		
		System.out.println("중간관리자 arr[2]의 주소 : " + arr[2]);
		System.out.println();
		
		System.out.println("중간관리자 arr[0]이 관리하는 방의 길이 : " + arr[0].length);	// 중간 관리자가 관리하는 방의 갯수
		System.out.println("중간관리자 arr[1]이 관리하는 방의 길이 : " + arr[1].length);
		System.out.println("중간관리자 arr[2]이 관리하는 방의 길이 : " + arr[2].length);
		System.out.println();
		
		
		
		System.out.println("<배열 출력>");
		System.out.println();
		
		System.out.println("arr[0][3] = " + arr[0][3]);	// 55
		System.out.println("arr[2][2] = " + arr[2][2]);	// 59
		// System.out.println(arr[1][2]);	// 배열의 범위를 벗어나면 에러가 남
		System.out.println();
		
		
		
//		int[][] arr = {	
//				{80,72,63,55}, 
//				{93,21}, 
//				{99,49,59}
//				};			
		
		System.out.println("<이중 for문 활용한 배열 출력>");
		System.out.println();
		
		int i, j;		// arr[i][j] = arr[행][열]
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
				System.out.println();
		}
	
		
		System.out.println();
		System.out.println("<확장 이중 for문 활용한 배열 출력>");
		System.out.println();
		
		// int[] t = {80,72,63,55}
		// int[] t = {93,21}
		// int[] t = {99,49,59}
		
		for( int[] t : arr)
		{
			for(int x : t)
			{
				System.out.print(x + " ");
			}	
				System.out.println();
		}
		
		
	}

}
