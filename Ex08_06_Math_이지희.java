import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08_06_Math_������ {
	public static void main(String[] args)
	{	
//	double result = Math.random();	// 0<=random<1 ������ �Ǽ�
//	System.out.println(result);
//	
//	result = (int)Math.random() * 26 + 10;	//10~35 ��������
//	System.out.println(result);
//	
//	result = (int)Math.random() * 45 + 1;	//1~45 ��������
//	System.out.println(result);
	
	int i,j;
	int[] input = new int[6];
	int[] lotto = new int[6];
	
	for(i=0;i<lotto.length;i++)
	{
		lotto[i] = (int)(Math.random() * 45) + 1;		//*****
		
		for(j=0;j<i;j++)
		{	
			if(lotto[i] == lotto[j])
			{
				lotto[i] = (int)(Math.random() * 45) + 1;
				j=-1;	//j �������� ���� 0���� �ʱ�ȭ�ȴ�
						//�ٽ� for���� ó������ �� �� �ֵ��� ���´�.
			}
			
		}//�̸� ���� ������ ���ڵ�� ���Ͽ� ���� ���ڰ� ������ �ٽ� ��¹޴� for��
	}//for
	
	int count=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("1~45������ ���� 6���� �Է��ϼ���.");
	
	for(i=0;i<6;i++)
	{
		try {
				System.out.print("����" + count + ">");
				input[i] = sc.nextInt();

				if(input[i]>=1 && input[i]<=45)
				{
					for(j=0;j<i;j++)
					{
						if(input[i] == input[j])
						{
							System.out.println("�ߺ��Ǿ����ϴ�.");
							System.out.print("����" + count + ">");
							input[i] = sc.nextInt();
							j-=1;
						}
					}
					count++;
				}
				else
				{
					System.out.println("1~45������ ���� �Է��ϼ���.");
					i--;
					continue;
				}

		} catch(InputMismatchException e) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			i--;
			sc.next();
			continue;
		}
		
	}//for
	
	System.out.println();
	System.out.println("<��ǻ�Ϳ��� �߻���Ų �ζ� ��ȣ�� ���>");
	
	for(i=0;i<lotto.length;i++)
	{
		System.out.print(lotto[i] + " ");
	}
	System.out.println();
	
	System.out.println("<���� ������ �ζ� ��ȣ�� ���>");
	
	for(i=0;i<input.length;i++)
	{
		System.out.print(input[i] + " ");
	}
	System.out.println();
	
	
	count=0;
	for(i=0;i<6;i++)
	{
		for(j=0;j<6;j++)
		{
			if(input[i] == lotto[j])
			{
				count=count+1;
			}
		}
	}
	
	System.out.print("���� ���� : " + count);
	if(count==0)
	{
		System.out.println();
		System.out.println("��!");
	}
	System.out.println();

	
	}//main	
}
