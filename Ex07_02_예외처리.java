import java.util.Scanner;

public class Ex07_02_����ó�� {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		System.out.print(">");
		num1 = sc.nextInt();
		System.out.print(">");
		num2 = sc.nextInt();
		
		System.out.println(num1 + "�� " + num2 + "�� �Է��Ͽ����ϴ�.");
		
		boolean div = divider(num1,num2);	//divider ȣ��********
		if(div)
		{
			System.out.println("���꼺��");
		}
		else
		{
			System.out.println("�������");
		}
	}//main
	
	static boolean divider(int x, int y)	//**********
	{//divider���� 
		try{
			int result = x/y;	//  5/0�� �Է����� ��, ArithmeticException e = new ArithmeticException
			System.out.println("result : " + result);
			return true;	// return��� ���ư�
			
		}catch(ArithmeticException e){
			
			System.out.println("������ 0�̸� �ȵȴ�");
			System.out.println("ArithmeticException error by zero");
			System.out.println(e.getMessage());	// e.getMessage():������ ������ ���ڿ��� ����� �������ش�
			System.out.println(e.toString());	// e.toString():������ ���� ����
			return false;
			}
	}//divider
}//class
// ���ܰ� �߻��ϸ� ���� Ŭ������ �ڵ����� ���������\







