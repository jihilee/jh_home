import java.util.Scanner;

public class Ex0517_�ǽ� 
{
	public static void main(String[] args)
	{
		//Ex01_��¹� 
		
		// <-�ּ� Ȥ�� �����̶� ��Ī
		
		System.out.println(true);	//	printf, println�� connsoleâ�� ����ϴ� ��ɾ�
		System.out.println(false);	// t, f �ҹ��� ����
		
		System.out.println('a');	// '����'
		System.out.println("a"); 	// "���ڿ�"
		
		System.out.println("�ȳ��ϼ���\n����\t�̸���\t�̣��Դϴ�.");	// \n -> ����, \t -> �����̽���	
		System.out.println("��ſ�"+"����");	// +�� ���Ῥ����
	
		System.out.println("1+2");			// �״�� ���
		System.out.println(1+2);			// �����Ͽ� ���
		System.out.println("1"+"2");		// ���޾� ���
		
		
		System.out.println(" ");
		
		// �ڷ���
		
		int a = 100;		//4����Ʈ
		char b = 'R';		//2����Ʈ
		double c = 3.14;	//8����Ʈ
		String d = "����";
		
		// ���
		
		System.out.println("a="+a);
		System.out.printf("a=%d\n", a);	// ���� %d
		System.out.printf("b=%c\n", b);	// ���� %c
		
		System.out.printf("c=%f\n", c);	// �Ǽ� %f
		System.out.printf("c=%10.2f\n", c);	// ��ü 10�ڸ� �߿��� �Ҽ�2�ڸ����� ������ ���� ���
		
		System.out.printf("d=%s\n", d);	// ���ڿ� %s
		
		/* printf, \n ����Ͽ� ��� */
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		//Ex02_������ 
		
		
		int a2, b2;	//����
		a2=1;		//�ʱ�ȭ
		b2=2;
		
		int c2;
		
		c2 = a2 + b2;
		System.out.println(c2);	//3
		
		byte a1=10, b1=20;
		int c1;				//������ �� ��ȯ : int���� ���� �ڷ����� �����ϸ� ������� int���� �ȴ�
		
		c1=a1+b1;			
		System.out.println(c1);	//30
		
		int x = 10000;
		int y = 2000000;
		
		long z = (long)x * y;	// ��갪�� int���� ����ٸ� �� ���� ���� �ӽ÷� long������ �����ؾ� �� 
		System.out.println(z);	// 20000000000
		
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		// Ex03_�Ǽ���
		
		double d1 = 3.14;
		double d2 = .12345;		// 0.12345
		double d3 = .45153E3;	// 451.53
		double d4 = .45153E-3;	// 0.00045153 == 4.5153E-4
		
		System.out.println(d1 + "\t" + d2 + "\t" + d3 + "\t" + d4);
		
		
		
		float f1, f2;
		
		f1 = 0.578654f;
		// f1 = 0.578654;  <-����  �Ǽ��� double������ �ڵ� ��ȯ�Ǳ� ������ �Ǽ�f�� ��������� ��
		
		f2 = 3;			
		// 3.0���� ��� (�ڵ�����ȯ)
		
		System.out.println(f1 + "\t" + f2);
		
		
		int i = (int)3.543;
		// 3���� ��� (��������ȯ)
		// int < float
		
		System.out.println(i);
		
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		// Ex04_������
		
		char ch1 = 'A';		// A=65, a=97 �ƽ�Ű�ڵ尪
		char ch2 = 'a';	
				
		System.out.println(ch1 + "\n" + ch2);
		System.out.println((char)(ch1+1));		// ���� ���������� ��ȯ B���
	
		
		String s = "���";
		System.out.println(s);
	
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		// Ex05_�Է¹�
	
	//Ŭ���� ���ٿ� import java.util.Scanner; �Է�
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		Scanner sc = new Scanner(System.in);
		String hs, name;
	
		System.out.println("����� �����Դϱ�?");
		name = sc.next();
		
		System.out.println("����� � ����Դϱ�?");
		hs = sc.next();
		
		System.out.println("======================");
		System.out.println("�̸�\t����");
		System.out.println("----------------------");
		System.out.println(name + "\t" + hs);
		System.out.println("=========���m==========");
	
	
	}
}
