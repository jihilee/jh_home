
public class Ex04_07_정렬 
{
	public static void main(String[] args) 
	{
		int a=10, b=20;
		
//		a=b;
//		b=a;
//		System.out.println(a + ", " + b);	// 20, 20
		
		System.out.println("<두 변수값 바꾸기 : 정수>");
		System.out.println();
		
		int temp;
		temp = b;
		b = a;
		a = temp;
		System.out.println(a + ", " + b);
		
		
		
		System.out.println();
		System.out.println("<배열 출력하기>");
		System.out.println();
		
		int i, j;
		int[] arr = {8,3,5,2,9};
		
		for(i=0;i<arr.length;i++)
		System.out.print(arr[i] + " ");
		
		System.out.println();
		
		
		System.out.println();
		System.out.println("<오름차순 정렬하기 (선택정렬)>");
		System.out.println();

		
//		for(i=0;i<arr.length;i++)
//		{
//			for(j=i+1;j<arr.length;j++)
//			{
//				if(arr[i] > arr[j])
//					{
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//					}
//			}
//			
//			System.out.print(arr[i] + " ");
//		}
		
		
		for(i=0;i<4;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(arr[i] > arr[j])
					{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					}
			}
		}// 변수 이동시키기
			
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
			System.out.println();
		// 출력하기

	}

}
