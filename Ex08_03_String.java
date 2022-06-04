import java.util.Scanner;

public class Ex08_03_String {

	public static void main(String[] args) {

		String s1 = "    Abc    DEf      G  ";
		System.out.println("s1_print : " + s1);
		System.out.println("s1.length : " + s1.length());
		
		String s2 = s1.trim();
		System.out.println("s2_trim : " + s2);	// �յڱ��� ��������
		System.out.println("s2.length : " + s2.length());
		//trim : ������ ȸ�������� ���� ID,PW�� ������ �����Ͽ� ����Ѵ�
		
		System.out.println(s1.contains("DE"));	//DE�� �����ϰ� �ִ°�(t/f)
		System.out.println(s1.contains("de"));	//��ҹ��� ����
		System.out.println(s1.contains(" "));	
		System.out.println(s1.indexOf("DE"));	//DE�� �������� ��� int
		System.out.println(s1.indexOf("de"));	
		
		if(s1.contains("de") == false)
		{
			System.out.println("de�� �������� ����");
		}
		else
		{
			System.out.println("de�� �����ϰ� ����");
		}//contains�� ���� Ȯ��(boolea:T/F)
		
		if(s1.indexOf("DE") == -1)
		{
			System.out.println("DE�� �������� ����");
		}
		else
		{
			System.out.println("DE�� �����ϰ� ����");
		}//indexOf�� ���� Ȯ��(int)
		
		String fullName = "Hello.java";	//a.text
		String fileName;	//Hello
		String ext;	//java
		
		int index = fullName.indexOf('.');	//'.'�̶� ������ .�� �ƽ�Ű�ڵ尪�� ����
		System.out.println("fullName.indexOf('.') = " + index);	//.�� ��ġ�� int index������ �޾� ���
		
		fileName = fullName.substring(0,index);
		ext = fullName.substring(index+1);
		System.out.println("fileName : " + fileName);
		System.out.println("ext : " + ext);
	
		
		System.out.println("---------------------");
		System.out.println();
		
		String id, pw;
		id = "kim";
		pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�α��� �մϴ�.");
		
		System.out.print("id > ");
		String loginId = sc.next();
		
		System.out.print("pw > ");
		String loginPw = sc.next();
		
		//if(loginId.equals(id) && loginPw.equals(pw))	// ���ڿ� ������ ���� �� equals*********
		//if(loginId.compareTo(id)==0 && loginPw.compareTo(pw)==0)	//compareTo()==0 -> equal �ǹ�
		if(loginId.compareToIgnoreCase(id)==0 && loginPw.compareToIgnoreCase(pw)==0)	//��ҹ��ڱ�������
		{
			System.out.println("�α��� ����");
		}
		else
		{
			System.out.println("�α��� ����");
		}
	
		
	
	}
	
}
