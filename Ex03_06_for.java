import java.util.Scanner;

public class Ex03_06_for 
{
	public static void main(String[] args)
	{
		int i;
		for(i=1;i<=10;i++)	// 1~10���� ���
		{
			if(i % 2 == 0)	//2�� ����� i���� ���
				System.out.println(i);
		}

		System.out.println();

		Scanner sc = new Scanner(System.in);

		int dan;

		System.out.println("������ �� ���� ����Ͻðڽ��ϱ�? (¦���� ����)");
		dan = sc.nextInt();

		if(dan%2==0)
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
		}
		else	
			System.out.println("Ȧ�����Դϴ�.");


	}
}

// ��ȣ ��� �����ֱ� : ctrl+a, ctrl+i