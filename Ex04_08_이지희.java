import java.util.Scanner;
public class Ex04_08_������ 
{
	public static void main(String[] args) 
	{
		int num, std_Num;
		
		int i, j;
		int[] score = null;	//�л� �� null�� ���� & �ʱ�ȭ ***���������� �ּҸ� �� �� �ִ�. �ּҰ� ���� ���̴� = null�̶�� �Է��ؾ� ��****
																					// ������ ��������� ���̴�
		while(true)
		{
			System.out.println();
			System.out.println("********************��ȣ�� �Է��ϼ���********************\n");
			System.out.println(" 1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����\n");
			System.out.print(" ����> ");
			
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
					
			//if���� switch case������ �����غ���
			if(num==1)
			{
				System.out.println();
				System.out.println(" 1.�л����� �����Ͽ����ϴ�.");
				
				System.out.println();
				System.out.println(" �л� ���� �Է��ϼ���.");
				System.out.print(" �л��� > ");
				
				std_Num = sc.nextInt();
				
				score = new int[std_Num];	// �л� �� �Է¹ޱ�		****score��� �迭�� ����*****
				
				System.out.println();
			}
			
			else if(num==2)
			{
				if(score == null)			//*******
				{
					System.out.println();
					System.out.println(" 1�� ���� �����ϼ���.\n");
					continue;								//	****�Ʒ��� �ǳʶٰ� ���� �̵�******
				}
				
				System.out.println();
				System.out.println(" 2. �����Է��� �����Ͽ����ϴ�.");
				
				System.out.println();
				System.out.println(" ������ �Է����ּ���.");
				
				for(i=0;i<score.length;i++)
				{
					System.out.print(" scores[" + i + "]: ");
					score[i] = sc.nextInt();			
				}
				
				System.out.println(" ���� �Է��� �Ϸ��Ͽ����ϴ�.");
				System.out.println();
			}
			
			
			
			else if(num==3)
			{
				if(score==null)
				{
					System.out.println();
					System.out.println(" 1�� ���� �����ϼ���.\n");
					continue;
				}
				
				System.out.println();
				System.out.println(" 3.��������Ʈ�� �����Ͽ����ϴ�.");
				
				System.out.println();
				System.out.println(" ����� ������ ����մϴ�.");
				System.out.println();
				
				for(i=0;i<score.length;i++)
				{
					System.out.printf(" scores[%d] : %d", i, score[i]);
					System.out.println();
				}
				
				System.out.println();
			}
			
			
			
			else if(num==4)
			{
				if(score == null)
				{
					System.out.println();
					System.out.println(" 1�� ���� �����ϼ���.\n");
					continue;
				}
				
				System.out.println();
				System.out.println(" 4.�м��� �����Ͽ����ϴ�.");
				System.out.println();
				
				int max, min, sum, avg, arr, temp;
				
				max = score[0];
				min = score[0];
				for(i=1;i<score.length;i++)				//�ִ�
				{
					if(max<score[i])
						max = score[i];
				}
				for(i=1;i<score.length;i++)				//�ּڰ�
				{
					if(min>score[i])
						min = score[i];
				}
				
				System.out.print(" �ְ� ���� : " + max + " ��");	
				System.out.println();
				
				System.out.print(" ���� ���� : " + min + " ��");				// ���� ����
				System.out.println();
				
				
				sum = 0;
				for(i=0;i<score.length;i++)
				{
					sum = sum + score[i];
				}
				System.out.print(" ���� �հ� : " + sum + " ��");				// ���� �հ�
				System.out.println();
				
				avg = sum / score.length;
				System.out.print(" ���� ��� : " + avg + " ��");				// ���� ��� 
				System.out.println();
				

				temp = 0;
				for(i=0;i<score.length-1;i++)					//score.length-1 ������ ȸ���� ���� ���� �ʿ䰡 ����. �׷��Ƿ� -1�� �ؾ� ��
				{
					for(j=i+1;j<score.length;j++)
					{
						if(score[i] > score[j])
						{
							temp = score[i];
							score[i]= score[j];
							score[j] = temp;
						}											
					}
				}													// ����
				
				System.out.print(" ���� ���� : ");
				
				for(i=0;i<score.length;i++)
				{
					System.out.print(score[i] + " ");
				}
				System.out.println();
				
				
				
				
				System.out.println();
				System.out.println(" ������ ����� �̿��� ���������� " + score[0]);
				System.out.println(" ������ ����� �̿��� �ְ������� " + score[score.length-1]);
				
				
				
				sum = 0;
				for(int s : score)
				{
					sum += s;
				}
				System.out.println(" Ȯ��for���� �̿��� ������ " + sum);
				
				
				
				System.out.println();
				System.out.println(" �м��� �Ϸ��Ͽ����ϴ�.");
				
				
				System.out.println();
	
				
			}
			
			
			
			else if(num==5)
			{
				System.out.println();
				System.out.println(" 5.���Ḧ �����Ͽ����ϴ�.");
				break;
			}
			
			
			
			else
			{	
				System.out.println();
				System.out.println(" �߸� �Է��Ͽ����ϴ�. 1~5 ������ ��ȣ�� �Է��ϼ���.\n");
				continue;
			}
			
			
		}	//while
		
		System.out.println();
		System.out.println("*******************���α׷��� �����մϴ�******************");
		
	}	//main

}

//��ȣ �ȿ� ������ �����ϸ� �� ������ ��ȣ �ۿ��� ������ ��ġ�� �ʴ´�. 
