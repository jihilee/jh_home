
public class Ex04_03 
{
	public static void main(String[] args) 
	{
		// array : ���� Ÿ���� �����͸� �� �������� ��� �����ϴ� ��
		// arr = �������� = �������� ���� ����
		
		// int[] arr = {10, 9, 8};
		// int[] arr = new int[] {10, 9, 8};
		
		int[] arr = new int[3];		//int arr[] = {0, 0, 0};
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 8;
		
		int i;
		
		System.out.println("<�迭 arr�� for�� ���� ���������>");
		System.out.println();
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("arr[i] =" + arr[i]);
		}
		
		
		System.out.println();
		System.out.println("<�迭 arr�� Ȯ��for�� ���� ����ϱ�>");
		System.out.println();
		
			
		for(int j : arr)
		{
			System.out.println("arr[i] = " + j);
					
		}

	}

}
