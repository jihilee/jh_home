//import java.lang.String;  -> java.lang��Ű���� �ڵ� ����

/*class String extends Object
{
	length()
	{
		�������
	}
	equals()
	{
		//���ڿ���
	}
	toString()
	{
		
	}
}*/

public class Ex08_02_String {
	public static void main(String[] args) {
		
		String str1 = "Nice Day ";
		String str2 = new String("nice Day ");	//���ͷ� ���·� ����
		String str3 = "Ha ha";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println(str1 == str2);	
		System.out.println("----------------");
		
		
		int len = str1.length();
		System.out.println("len : " + len);
		
		boolean eq = str1.equals(str2);
		System.out.println("eq : " + eq);	
	
		System.out.println("str1.equalsIgnoreCase : " + str1.equalsIgnoreCase(str2));	
		// equalsIgnorecase : boolean return, ��ҹ��� ���� ����
		int c = str1.compareTo(str2);	//������ 0, �ٸ��� 0�� �ƴ� �� ���
		System.out.println("c : " + c);	
		
		System.out.println("----------------");
		
		
		String str1_Upper = str1.toUpperCase();
		System.out.println("str1_Upper : " + str1_Upper);
		
		System.out.println("str2.toLowerCase : "+ str2.toLowerCase());
		
		System.out.println(str1 + str3);	//����
		System.out.println("concat : " + str1.concat(str3));
		System.out.println("----------------");
		
		
//		String str1 = "Nice Day ";
//		String str2 = new String("nice Day ");	//���ͷ� ���·� ����
//		String str3 = "Ha ha";
		
		
		System.out.println(str1.indexOf("Day"));	//day�� ���� ��ġ ��ȯ, 0���� ����
		System.out.println(str1.indexOf("java"));	//ã�� ���ڰ� ���� �� -1��ȯ
		System.out.println(str1.charAt(2));			//2°�� ��ġ�� ���� ���
		System.out.println(str1.substring(2,7));	//2°���� 7��° �ձ����� ���
		System.out.println(str1.substring(2));		//2°���� ���������� ���
		System.out.println(str1.replace("a","x"));	//�������ִ� �޼���
	}
	

}
