class Person
{
	String name;
	int age;
	String addr;
	
	Person(String name, int age, String addr)
	{
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	void show()		
	{
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("addr : " + addr);
	}
	
}//class Person end

class Employee extends Person
{
//	String name;
//	int age;
//	String addr;
	String company;
	String title;
	
	Employee(String name, int age, String addr, String company, String title)
	{
		super(name, age, addr);
		this.company = company;
		this.title = title;
	}
	
	void show()			// �������̵�
	{
		super.show();
		System.out.println("company : " + company);
		System.out.println("title : " + title);
	}
	
}//class Employee end

class Student extends Person
{
//	String name;
//	int age;
//	String addr;
	String school;
	int kor;
	
	Student(String name, int age, String addr, String school, int kor)
	{
		super(name, age, addr);
		this.school = school;
		this.kor = kor;
	}
	
	void show()
	{
		super.show();
		System.out.println("school : " + school);
		System.out.println("kor : " + kor);
	}
	
	
}//class Student end

public class Ex06_02_��� 
{
	public static void main(String[] args) 
	{		
		Person p = new Person("��ȣ��",43,"����");
		Person e = new Employee("������",35,"���","mbc","����");	// �θ��� Person���� ���� �����ص� ���� ���� -> upcasting
		Person s = new Student("���缮",18,"��õ","�߾Ӱ�",77);		// ���� �� �޶����
		
		p.show();
		System.out.println();
		e.show();
		System.out.println();
		s.show();	
		
		
		System.out.println();
		Person [] per = {new Person("��ȣ��",43,"����"),
						 new Employee("������",35,"���","mbc","����"),
						 new Student("���缮",18,"��õ","�߾Ӱ�",77)};
		int i;
		for(i=0;i<per.length;i++)
		{
			per[i].show();
			System.out.println("-----");	// �迭arr�� �޾� ����ϱ�
		}
	}
}
// �ܾ� ����Է� ������ �� ��� ���� �Է��� �� ctrl+space Ȯ�� �� enter