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
	
	void show()			// 오버라이딩
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

public class Ex06_02_상속 
{
	public static void main(String[] args) 
	{		
		Person p = new Person("강호동",43,"서울");
		Person e = new Employee("송은이",35,"경기","mbc","과장");	// 부모인 Person으로 변수 변경해도 오류 없음 -> upcasting
		Person s = new Student("유재석",18,"인천","중앙고",77);		// 변수 다 달라야함
		
		p.show();
		System.out.println();
		e.show();
		System.out.println();
		s.show();	
		
		
		System.out.println();
		Person [] per = {new Person("강호동",43,"서울"),
						 new Employee("송은이",35,"경기","mbc","과장"),
						 new Student("유재석",18,"인천","중앙고",77)};
		int i;
		for(i=0;i<per.length;i++)
		{
			per[i].show();
			System.out.println("-----");	// 배열arr로 받아 출력하기
		}
	}
}
// 단어 모두입력 귀찮을 때 어느 정도 입력한 후 ctrl+space 확인 후 enter