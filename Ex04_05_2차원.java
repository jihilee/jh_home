
public class Ex04_05_2���� 
{
	public static void main(String[] args) 
	{
		//int[] a = {10,20,30,40,50}; 1���� �迭
		// for(int x : arr)
		//	System.out.println(x);
		
		
//		System.out.println("<2���� �迭�� ǥ���ϴ� 3���� ���>");
//		System.out.println();
//		
//		System.out.println("1.���� ����");
//		System.out.println();
		int[][] arr = {						// == int arr[][]
						{80,72,63,55}, 
						{93,21,}, 
						{99,49,59,}
						};					// �迭�� �������� ��ȣ�� �ѹ� �� ����
		
//		System.out.println();
//		
//		
//		System.out.println("2.���� ���� : new int[][]");
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
//		System.out.println("3.�� ���� ���� �� ���� �Է�");
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
//		System.out.println("3.�� ���� ���� �� ���� �Է�");
//		System.out.println();
//		// �ึ�� �ٸ� ������ �����ϰ� �ʹٸ� �Ʒ��� ���� ����� ����Ѵ�.
//		
//		int[][] arr = new int[3][];		// 3���̰� ���� �𸥴�.
//
//		arr[0] = new int[4];		// �߰������� arr[i]�� �����ϴ� ���� ���� ���� ����.
//		arr[1] = new int[2];
//		arr[2] = new int[3];
//		
//		arr[0][0] = 80;
//		arr[0][3] = 55;
//		arr[1][1] = 21;
//		arr[2][2] = 59;
		
		
		System.out.println("�߰��������� ���� : " + arr.length);		// �߰��������� ����, 3
		System.out.println();
		
		System.out.println("�߰������� arr[0]�� �ּ� : " + arr[0]);			// �߰��������� �ּ�
		System.out.println("�߰������� arr[1]�� �ּ� : " + arr[1]);		
		System.out.println("�߰������� arr[2]�� �ּ� : " + arr[2]);
		System.out.println();
		
		System.out.println("�߰������� arr[0]�� �����ϴ� ���� ���� : " + arr[0].length);	// �߰� �����ڰ� �����ϴ� ���� ����
		System.out.println("�߰������� arr[1]�� �����ϴ� ���� ���� : " + arr[1].length);
		System.out.println("�߰������� arr[2]�� �����ϴ� ���� ���� : " + arr[2].length);
		System.out.println();
		
		
		
		System.out.println("<�迭 ���>");
		System.out.println();
		
		System.out.println("arr[0][3] = " + arr[0][3]);	// 55
		System.out.println("arr[2][2] = " + arr[2][2]);	// 59
		// System.out.println(arr[1][2]);	// �迭�� ������ ����� ������ ��
		System.out.println();
		
		
		
//		int[][] arr = {	
//				{80,72,63,55}, 
//				{93,21}, 
//				{99,49,59}
//				};			
		
		System.out.println("<���� for�� Ȱ���� �迭 ���>");
		System.out.println();
		
		int i, j;		// arr[i][j] = arr[��][��]
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
				System.out.println();
		}
	
		
		System.out.println();
		System.out.println("<Ȯ�� ���� for�� Ȱ���� �迭 ���>");
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
