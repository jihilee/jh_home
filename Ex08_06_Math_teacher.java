import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08_06_Math_teacher {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int[] my = new int[6];
		
		//Scanner sc = new Scanner(System.in);
		
		int i,j, count=0;
		for(i=0;i<lotto.length;i++)
		{
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(j=0;j<i;j++)
				if(lotto[i]==lotto[j])
				{
					lotto[i] = (int)(Math.random() * 45) + 1;
					j-=1;
				}
		}
		
		for(i=0;i<my.length;i++) 
		{
			Scanner sc = new Scanner(System.in);	//���ܰ� �߻��� ��쿡�� ��ĳ�ʸ� �ٽ� �������Ѵ�
			
			try {
				System.out.print("����" + (i+1) + ":");
				my[i] = sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("��ȿ���� ���� ���Դϴ�");
				i--;
				continue;
			}
			
			if(my[i]<1 || my[i]>45)
			{
				System.out.println("1~45������ ���� �Է��ϼ���.");
				i--;
			}
			//i���� ���� �Է��� ����
			
			for(j=0;j<i;j++)
			{
				if(my[i]==my[j])
				{
					System.out.println("�ߺ���");
					i--;
					break;
				}
			}
		}
		
		System.out.println("<�Ŀ��� �߻���Ų �ζǹ�ȣ>");
		for(i=0;i<lotto.length;i++)
		{
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("<���� �Է��� �ζǹ�ȣ>");
		for(i=0;i<my.length;i++)
		{
			System.out.print(my[i] + " ");
		}
		
		
		for(i=0;i<lotto.length;i++)
			{
			for(j=0;j<my.length;j++)
				{
					if(lotto[i]==my[j])
					{
						count++;
					}
				}
			}
		
		System.out.println();
		System.out.println("���� ���� : " + count);
		switch(count) 
		{
		case 6 : System.out.println("1�� ��÷"); break;
		case 5 : System.out.println("2�� ��÷"); break;
		case 4 : System.out.println("3�� ��÷"); break;
		default : System.out.println("��");
		}
	}

}
