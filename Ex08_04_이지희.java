import java.util.Scanner;
class Person{
	
	String id;
	String pw;
	String name;

	Person()
	{
		
	}
	Person(String id, String pw, String name)
	{
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

}//class person
public class Ex08_04_������ {

	public static void main(String[] args) {
		
//		Person[] p = {new Person("kim","1234","�迬��"),
//					  new Person("son","7777","�����"),
//					  new Person("jang","9876","��̶�")};
		
		Person[] p = new Person[3];
		p[0] = new Person("kim","1234","�迬��");
		p[1] = new Person("son","7777","�����");
		p[2] = new Person("jang","9876","��̶�");
		
		
		Scanner sc =  new Scanner(System.in);

		while(true)
		{
			System.out.println("id�� pw�� �Է��ϼ���.");
			
			System.out.print("id�Է� > ");
			String loginId = sc.next().trim();
			if(loginId.length()<3 || loginId.length()>8)
			{
				System.out.println("id�� 3~8���ڷ� �Է��ϼ���.");
				continue;
			}
			System.out.print("pw�Է� > ");
			String loginPw = sc.next().trim();

			System.out.println("----------");
			
			boolean flag = true;	//************
			int i;
			
			for(i=0;i<p.length;i++)
			{
				if(loginId.compareTo(p[i].id) == 0 && loginPw.compareTo(p[i].pw) == 0)
				{
					System.out.println(p[i].name + "�� �ݰ����ϴ�.");
					System.out.println();
					flag = false;
				}
				else if(loginId.compareTo(p[i].id) == 0 && loginPw.compareTo(p[i].pw) != 0)
				{
					System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
					System.out.println();
					flag = false;
				}
			}//for
			
			if(flag = true)	// �ش� ���̵� �����ϴ� ������ �Ź� �ݺ��Ǿ� ������ ���� �����ϱ� ����
			{					// id�� Ʋ���� �� �ѹ��� ��µ� �� �ְ� boolean���� flag������ ����Ѵ�.
				System.out.println("�ش� ���̵� �����ϴ�.");
				System.out.println();
			}
			
			System.out.println("��� �Ͻðڽ��ϱ�?");
			System.out.println("��� : y | ���� : n");
			String c = sc.next();
			
			if(c.equals("y") == true)
			{
				System.out.println();
				System.out.println("�α����� �õ��մϴ�.");
				continue;
			}
			else if(c.equals("n") == true)
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
		}
		
		
	}//main

}//class
