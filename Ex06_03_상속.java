class Person2
{
	String name;
	int age;
	Person2()
	{
		//Teacher�� Employee2�� ������ ������ �ݵ�� �����ؾ��Ѵ�. 
	}
	
	Person2(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	void show()		
	{
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
}//class Person2 end

class Employee2 extends Person2
{
	String company;
	String title;
	Employee2()
	{
//		super();	//Teacher�� Employee2�� ������ ������ �ݵ�� �����ؾ��Ѵ�. 
	}

	
	Employee2(String name, int age, String company, String title)
	{
		super(name, age);
		this.company = company;
		this.title = title;
	}
	
	void show()			// �������̵�
	{
		super.show();
		System.out.println("company : " + company);
		System.out.println("title : " + title);
	}
	
}//class Employee2 end

class Teacher extends Employee2
{
	String subject; // teacher�� ������Ʈ1, �θ� 2��, ���θ� 2�� �� 5���� ������ ������ �ִ�.
	
	Teacher(String name, int age, String company, String title, String subject)
	{
		super(name, age, company, title);	//Teacher�� Employee2�� ������ ������ �ݵ�� �����ؾ��Ѵ�. 
		this.subject = subject;
	}
	
	void show()			// �������̵�
	{
		super.show();
		System.out.println("subject : " + subject);
	}
	
}//class Teacher end

public class Ex06_03_��� 
{
	public static void main(String[] args) 
	{
		Person2 p = new Person2("��ȣ��",43);
		Person2 e = new Employee2("������",35,"mbc","����");	
		Employee2 t = new Teacher("������",33,"�����","���屳��","music");		// �θ𺯼��� ��ĳ����
		// �����Ҿƹ���, �Ҿƹ���, �θ� Ÿ������ �ٲ� �� �ִ�.
		
		p.show();
		System.out.println("----------");
		e.show();
		System.out.println("----------");
		t.show();
		System.out.println();
		
		Person2[] arr = {new Person2("��ȣ��",43),
						 new Employee2("������",35,"mbc","����"),
						 new Teacher("������",33,"�����","���屳��","music")};
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i].show();
			System.out.println("====");
		}
	}

}// public class end



