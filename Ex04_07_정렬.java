
public class Ex04_07_���� 
{
	public static void main(String[] args) 
	{
		int a=10, b=20;
		
//		a=b;
//		b=a;
//		System.out.println(a + ", " + b);	// 20, 20
		
		System.out.println("<�� ������ �ٲٱ� : ����>");
		System.out.println();
		
		int temp;
		temp = b;
		b = a;
		a = temp;
		System.out.println(a + ", " + b);
		
		
		
		System.out.println();
		System.out.println("<�迭 ����ϱ�>");
		System.out.println();
		
		int i, j;
		int[] arr = {8,3,5,2,9};
		
		for(i=0;i<arr.length;i++)
		System.out.print(arr[i] + " ");
		
		System.out.println();
		
		
		System.out.println();
		System.out.println("<�������� �����ϱ� (��������)>");
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
		}// ���� �̵���Ű��
			
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
			System.out.println();
		// ����ϱ�

	}

}
