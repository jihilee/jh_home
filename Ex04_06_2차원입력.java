import java.util.Scanner;
public class Ex04_06_2�����Է� 
{
	public static void main(String[] args) 
	{
		
		System.out.println("<2�� for�� Ȱ���Ͽ� 2�����迭 �� �Է¹ޱ�>");
		System.out.println();
		
		int[][] arr = new int[2][3];
		int i, j;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("������ �Է��ϼ��� : ");
				arr[i][j] = sc.nextInt();
			}
		}	// �迭 �ȿ� �� ���� �Է¹ޱ� arr[0][0] ~ arr[1][2]
		
		
		System.out.println();
		System.out.println("<�迭�� ���� �ش� ���� ������ ���>");
		System.out.println();
		
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j] + " ");	// �Է¹��� �迭�� ����ϱ�
				sum = sum + arr[i][j];				// ���� �迭 �� �����Ͽ� ����
			}
				System.out.println();
				System.out.println(i + "�� ���� �� = " + sum);
				sum = 0;		// sum�� �ʱ�ȭ �߿�! 
								// sum�� �ʱ�ȭ�ϸ� ���� ���� ���������� ����� �� �ִ�
				System.out.println();
		}
		
	}

}
