
public class Ex04_02_1���� 
{
	public static void main(String[] args) 
	{
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		System.out.println("�迭 score�� ���� : " + score.length);
		
		System.out.println();
		System.out.println("<�Ϲ� for���� Ȱ���� �迭 score ���>");
		
		int i;
		
		for(i=0;i<score.length;i++)
		{
			System.out.print(score[i] + " ");
		}

		System.out.println();
		
		System.out.println();
		System.out.println("<Ȯ�� for���� Ȱ���� �迭 score ���>");
	
		for(int j : score)		// Ȯ�� for -> for(���ο� ���� ���� : ��������) {System~ln(������);}
		{
			System.out.print(j + " ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("<�Ϲ� for���� Ȱ���� �迭 ����>");
		
		int sum=0;
		for(i=0;i<score.length;i++)
		{
			System.out.print(score[i] + " \n");
			sum = sum + score[i];
		}

		System.out.println("sum = " + sum);
		
		
		System.out.println();
		System.out.println();
		System.out.println("<Ȯ�� for���� Ȱ���� �迭 ����>");

		sum=0;
		for(int t : score)
		{
			System.out.println(t + " ");
			sum = sum + t;
		}
		
		System.out.println("sum = " + sum);
		System.out.println();
		

		System.out.println();
		System.out.println("<�Ϲ� for���� Ȱ���� �迭 ���>");
		
		int avg = 0;
		
		sum=0;
		
		for(i=0;i<score.length;i++)
		{	
			sum = sum + score[i];
		}
		
		avg = sum / score.length;
		System.out.println("�迭 i�� ��� : " + avg);
		
		
		System.out.println();
		System.out.println();
		System.out.println("<�Ϲ� for���� Ȱ���� �迭 �ּҰ�, �ִ밪>");
		
		int min, max;
		
		max = score[0];
		min = score[0];
		
		// int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		for(i=1;i<score.length;i++)	// max�� score[0]���� �����߱� ������ i�� 1���� �����Ѵ�.
		{
			if(max<score[i])
			{
				max = score[i];
			}
		}
		
		for(i=1;i<score.length;i++)
		{
			if(min>score[i])
			{
				min = score[i];
			}
		}
		
		System.out.println("�ִ밪 max�� " + max + "�Դϴ�.");
		System.out.println("�ּڰ� min�� " + min + "�Դϴ�.");

		System.out.println();
	}

}
