import java.util.Scanner;

public class Ex03_03_ifelse
{
	public static void main(String[] args)
	{
//		int kor = 70;
//		int eng = 80;
//		int math = 90;
		
		Scanner sc =  new Scanner(System.in);	// �Է°� �ޱ� sc�� ��ĳ�� �̸�
		int kor, eng, math;						// �ʱ�ȭ �ʿ�
		
		System.out.print("�̸��Է�=>");
		String name = sc.next();				// sc.next() ���ڿ� �аڴ�
		
		System.out.print("��������=>");
		kor = sc.nextInt();						// nextInt() I�� �빮��, ������ �аڴ�
		
		System.out.print("��������=>");
		eng = sc.nextInt();
		
		System.out.print("��������=>");
		math = sc.nextInt();
		
		System.out.println(" ");
		
		System.out.println("----------------------------------");
		System.out.println(" �̸�\t����\t����\t����");
		System.out.println("----------------------------------");
		System.out.println(name + "\t" + kor +"\t" + eng + "\t" + math);
		
		System.out.println(" ");
		
		int total = kor + eng + math;
		System.out.println(name + "���� ������ " + total + "�� �Դϴ�.");
		
		double avg = total / 3.0;				// 163/3=54.333333, 3�� 3.0���� ���� Ȥ�� (double)total�� ����
		System.out.printf(name + "���� ����� %.2f�� �Դϴ�.", avg);	// %.2f��� �ÿ��� printf�� �����ؼ� ����غ���
		System.out.println(" ");
		//������� Ex05_�Է¹� ����� ��ġ
		
		if(avg>=90)
		{
			System.out.println(name + "���� A�����Դϴ�.");
		}
		else if(avg>=80)
		{
			System.out.println(name + "���� B�����Դϴ�.");
		}
		else if(avg>=70)
		{
			System.out.println(name + "���� C�����Դϴ�.");
		}
		else if(avg>=60)
		{
			System.out.println(name + "���� D�����Դϴ�.");
		}
		else
		{
			System.out.println(name + "���� F�����Դϴ�.");
			System.out.println("����� �����Դϴ�.");
		}
	
	}
}


