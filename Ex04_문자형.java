
public class Ex04_������ 
{
	public static void main(String[] args)
	{
		char ch;
		ch ='A'; // �ѱ��ڸ� �� ���� �� null�� ���� �� ���� 
				 // char ch = 65(=���� A�� �ְڴ�) �ƽ�Ű�ڵ尪 ���� char������ �������� ������ �� �ִ�
		
		System.out.println("ch:"+ch);
		System.out.println(ch+1);		
		// A+1 = 66
		// 65 + 1 = 66
		
		System.out.println((char)(ch+1)); // ch+1 ���� ���������� ��ȯ => B
		
		
		boolean b1; 
		// true or false (�ҹ��ڷ� �Է�)
		b1 = false;
		System.out.println("b1="+b1);
		
		b1 = 5>3;
		System.out.println("b1="+b1);
		
		String s;		// ���ڿ� �ڷ���
		s = "Apple";
		System.out.println("s="+s);
		
		
	}
}

/* char(2byte) : '������' �ڷ��� 0~65535
 *
 * 2byte(4byte) + 4byte = 4byte <-���� �ְ� ū ����Ʈ�� �ٲ�
 * 
 * A : �ƽ�Ű�ڵ尪 65
 * a : �ƽ�Ű�ڵ尪 97
 *
 * boolean(1bit) : ���� �ڷ���  true or false
 * 
 * String "���ڿ� �ڷ���" 
 */