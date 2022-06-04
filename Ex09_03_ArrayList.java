import java.util.ArrayList;
import java.util.Scanner;

class Person extends Object{
	public static Object[] list;
	private String id;
	private String pw;
//	public static toString()
//	{
//		//�ּҸ���
//	}
	
	public String toString()
	{
		return id + ":" + pw;
	}
	public Person(String id,String pw)	
	{
		this.id = id;
		this.pw = pw;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return id;
	}
	public void setPw(String pw)
	{
		this.pw = pw;
	}
	public String getPw()
	{
		return pw;
	}
}//class person end

public class Ex09_03_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();	//���� ���� Person ��ü�� ArrayList�� ���� �� �ִ�
															
		Person p1 = new Person("kim","1234");
		Person p2 = new Person("park","7777");
		//Person p3 = new Person("choi","9876");
		
		list.add(p1);	//String, Integer�� ������ ����
		list.add(p2);
		list.add(new Person("choi","9876"));
		
		System.out.println("list.size() : " + list.size());
		System.out.println();
		
		System.out.println("list : " + list);
		System.out.println("list.toString() : " + list.toString());	
		//Person�� toString���� = �ּҸ���(Object) ��ӹ��� toString ����ϱ� ����
		//�׷��� class Person�� �������̵����� ���̵�� �н����带 ����� �� �ִ� String toString() ����
		
		System.out.println();
		System.out.println("---------");
		
		for(int i=0;i<list.size();i++)
		{
			Person p = list.get(i);
			//System.out.println(p);
			System.out.println("<�ѹ��� ���>");
			System.out.println(p);
			System.out.println("---------");
			System.out.println("<�������>");
			System.out.println("id : " + p.getId());
			System.out.println("pw : " + p.getPw());
			System.out.println("---------");
		}
		
		System.out.println();
		System.out.println("======================");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id�Է� > ");
		
		String id =  sc.next();
		boolean flag = true;
		for(int i=0;i<list.size();i++)
		{
			Person p = list.get(i);
			if(id.equals(p.getId()))
			{
				System.out.println(id + "���� ��й�ȣ�� " + p.getPw() + "�Դϴ�.");
				flag = false;
			}
		}
		if(flag==true)
		{
			System.out.println("���� ���̵��Դϴ�.");
		}
	}

}
