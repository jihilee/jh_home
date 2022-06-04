class Person2
{
	String name;
	int age;
	Person2()
	{
		//Teacher와 Employee2의 생성자 때문에 반드시 기입해야한다. 
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
//		super();	//Teacher와 Employee2의 생성자 때문에 반드시 기입해야한다. 
	}

	
	Employee2(String name, int age, String company, String title)
	{
		super(name, age);
		this.company = company;
		this.title = title;
	}
	
	void show()			// 오버라이딩
	{
		super.show();
		System.out.println("company : " + company);
		System.out.println("title : " + title);
	}
	
}//class Employee2 end

class Teacher extends Employee2
{
	String subject; // teacher는 서브젝트1, 부모 2개, 조부모 2개 총 5개의 변수를 가지고 있다.
	
	Teacher(String name, int age, String company, String title, String subject)
	{
		super(name, age, company, title);	//Teacher와 Employee2의 생성자 때문에 반드시 기입해야한다. 
		this.subject = subject;
	}
	
	void show()			// 오버라이딩
	{
		super.show();
		System.out.println("subject : " + subject);
	}
	
}//class Teacher end

public class Ex06_03_상속 
{
	public static void main(String[] args) 
	{
		Person2 p = new Person2("강호동",43);
		Person2 e = new Employee2("송은이",35,"mbc","과장");	
		Employee2 t = new Teacher("아이유",33,"서울고","부장교사","music");		// 부모변수로 업캐스팅
		// 고조할아버지, 할아버지, 부모 타입으로 바꿀 수 있다.
		
		p.show();
		System.out.println("----------");
		e.show();
		System.out.println("----------");
		t.show();
		System.out.println();
		
		Person2[] arr = {new Person2("강호동",43),
						 new Employee2("송은이",35,"mbc","과장"),
						 new Teacher("아이유",33,"서울고","부장교사","music")};
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i].show();
			System.out.println("====");
		}
	}

}// public class end



