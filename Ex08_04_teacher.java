//import java.util.Scanner;
//
//class Person{
//	String id;
//	String pw;
//	String name;
//
//	Person()
//	{
//		
//	}
//	Person(String id, String pw, String name)
//	{
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
//	}
//
//}//class person
//public class Ex08_04_teacher {
//
//	
//	String id;
//	String pw;
//	String name;
//	String retry; 
//	int i;
//	
//	Person[] p = {new Person("kim","1234","�迬��"),
//				  new Person("son","7777","�����"),
//				  new Person("jang","9876","��̶�")};
//	
//	Scanner sc = new Scanner(System.in);
//	
//	boolean flag = false;	//t or f
//	
//	do {
//		flag=false;
//		System.out.println("id �Է� > ");
//		id =sc.next();
//		
//		if(id.length()<3 || id.length()>8)
//		{
//			System.out.println("id�� 3~8���ڷ� �Է��ϼ���.");
//			continue;	//���ǽ����� ��
//		}
//		System.out.println("pw �Է� > ");
//		pw =sc.next();
//		
//		for(i=0;i<p.length;i++)
//		{
//			if(p[i].id.equals(id))
//			{
//				if(p[i].pw.equals(pw))
//				{
//					System.out.println(p[i].name + "�� �ݰ����ϴ�.");
//					flag = true;	//ã������ �ʰ�ȭ�� ���� �ݴ�� ����
//					break;	//1���濡�� ������� ã������ �ٸ� ���� ���� �ʿ� ����. ����ӵ� ����
//				}
//				else	//pw�� ��ġ���� ���� ��
//				{
//					System.out.println("pw�� �ٽ� Ȯ���ϼ���.");
//					flag = true;
//				}
//			}
//		}//for
//		
//		if(flag==false)
//		{
//			System.out.println("�ش� ���̵� �����ϴ�.");
//		}
//		
//		
//		System.out.println("��� �Ͻðڽ��ϱ�? > ");
//		retry =sc.next();
//		if(retry.equals("n"))
//		{
//			break;	//while�� �������� ��
//		}
//		
//	}while(true);
//	
//}
