import java.util.Scanner;
public class Ex02_01_��� 
{
	public static void main(String[] args) 
	{
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����1�� �Է��ϼ���.");
		num1 = sc.nextInt();
		
		System.out.println("����2�� �Է��ϼ���.");
		num2 = sc.nextInt();
		
		System.out.println(" ");	
		System.out.println(num1 + "+" + num2 + "=" + num1+num2);
		System.out.println(" -> ���ڿ� ���� �����ڴ� ������ �ǹ�, 50+90=5090");
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(" -> ���ڿ� �ڿ��� ������ �ϱ� ���ؼ��� ����κ� ��ȣ �ʼ�");
		
		System.out.println(" ");	
		System.out.println(" ");	
		
		System.out.println("===��� ����===");	
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		
		System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
		System.out.printf("%d / %d = %.2f\n", num1, num2, ((double)num1/num2));
		
		System.out.println(num1 + " % " + num2 + " = " + ((double)num1%num2));
		System.out.printf("%d %% %d = %.2f\n", num1, num2, ((double)num1%num2));
		//%�� �Ҽ��� �����ؼ� ����ϱ� ���ؼ� %% �� �� �Է��ؾ� �� -> ��ǻ�Ͱ� %�ڿ� �ٸ� ���� ���� ������ �����ϱ� ����
	
	
	}
}
// import java.util.Scanner;
//Scanner sc = new Scanner(System.in);

//num1 = sc.nextInt();