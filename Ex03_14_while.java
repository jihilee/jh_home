import java.util.Scanner;
public class Ex03_14_while 
{
	public static void main(String[] args)
	{
		int num, sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.print("������ �Է��ϼ��� : ");
//		num = sc.nextInt();	// �Է��ϴ�
		
		while(true)		//�ݺ� Ƚ���� �� �� = while�� ���
		{	
			
			System.out.print("������ �Է��ϼ��� : ");
			num = sc.nextInt();	// �Է��ϴ�
			
			sum = sum + num;	//sum�������� break�� ���� ��ġ�ϸ� �Էµ� ���������� �����Ͽ� ��µȴ� 
								//sum�������� break�� �Ʒ� ��ġ�ϸ� �������� �����Ͽ� ��µȴ�.
			if(num<0)
			{
				break;
			}
		
		}
		
		System.out.println("sum = " + sum);
	}
}
