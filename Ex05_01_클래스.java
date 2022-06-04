
class Person{
				String name;
				int age;
				double height;							// 멤버변수, instance변수
				static String nation;		// static변수, class변수 : 여러 객체가 공유하여 사용할 때 static을 붙인다.
				
				Person() 
				{//Person 생성자 정의, 대소문자구별
					System.out.println("Person 생성자");	//생성자 -> 객체를 만들면 자동으로 호출된다 호출하는만큼(p1, p2 2번)
				}
			}
//class = 사용자 정의 자료형 = 종류가 다른 데이터를 넣을 수 있다.


public class Ex05_01_클래스 
{
	public static void main(String[] args) 
	{
//		String name = "이지희";
//		int a = 1;
//		double b = 3.14;
//		char c = 'X';		// java에서는 2byte로 잡히지만 다른 언어에서는 다른 크기일 수 있다
		
		Person p1 = new Person();	// 내가 만든 클래스로 공간을 만들고 싶을 때 new 클래스명(); 필요
									// p1 - 참조변수, class Person은 어딘가 만들어지고 p1 안에는 주소가 들어간다
									// Person 객체 만들어라 = new Person(); 선언 = instance
		p1.name = "윤아";
		p1.age = 30;
		p1.height = 175.1;			// 참조변수.멤버변수	
		
		System.out.println(p1);
		System.out.println(p1.toString());	//주소리턴
		
		System.out.println("--------------");
		
		Person p2 = new Person();
		
		p2.name = "지희";
		p2.age = 27;
		p2.height = 171;
		
		Person.nation = "대한민국";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p1.height);
		System.out.println(p2.height);
		
		System.out.println(p1.nation);
		System.out.println(p2.nation);		// static
		System.out.println(Person.nation);	// 주로 class 이름으로 접근한다.
	}

}

//클래스 == 사용자 정의 자료형
//객체 == instance
