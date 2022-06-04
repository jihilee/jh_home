class Per
{
	String name;
	int age;
	
	Per()
	{
		//매개변수 없는 디폴트 생성자
	}
	Per(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}//per

class Stu
{
	int kor, eng, math;
//	String name;
//	int age;
	Per p;		//Per객체 포함
	
	Stu(String name, int age, int kor, int eng, int math)
	{
		
		//************************
		//p = new Per(name,age);	//Per의 주소가 p로 들어감(초기화1번방법)
		
		p = new Per();				//매개변수 없는 생성자를 만들어야 함
		p.name = name;
		p.age = age;				//Per이 관리하는 곳에 name과 age가 있으므로 p.~으로 작성(초기화2번방법)
		
		//**************************
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}//stu생성자끝

	void display()
	{		
		System.out.println(p.name);			//멤버변수 p 사용
		System.out.println(p.age);			//Per에는 display()메서드 없음
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
	}//stu void display 끝
}//Stu

public class Ex06_06_포함 {
	public static void main(String[] args) {

		//Per p = new Per();
		Stu s = new Stu("kim",25,70,80,90);
		
		System.out.println(s.p.name);		//참조변수 s 사용
		System.out.println(s.p.age);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
		
		System.out.println("========");
		s.display();

	}

}
