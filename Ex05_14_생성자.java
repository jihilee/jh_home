class Member {

	private String id;
	private String passwd;
	
	Member()
	{// 생성자(=메서드) 정의
		System.out.println("Member 생성자");
		id = "Kim";
		passwd = "5679";
		//주로 멤버변수의 초기화 작업을 수행한다.
	}
	Member(String i, String p)
	{//중복된 메서드, 문자열 두개를 받기 위한 생성자, 생성자 Overloading함
		System.out.println("Member(String i, String p)");
		id = i;
		passwd = p;
	}
	
	
	void setId(String id)	// 메서드 정의
	{
		this.id = id;
	}
	void setPw(String passwd)
	{
		this.passwd = passwd;
	}
	String getId()
	{
		return id;
	}
	String getPw()
	{
		return passwd;
	}
//생성자 : 		생성자는 메서드다. 생성자이름은 클래스이름과 동일.
//constractor	리턴값이 없다. void도 쓰지 않는다.
//		 		객체를 만들면 자동으로 호출된다. 대소문자 구별
//		 		생성자를 정의하지 않으면 기본 디폴트(매개변수 없는) 생성자가 자동으로 생성된다.
//		 		주로 멤버변수의 초기화 작업을 수행한다.	
}

public class Ex05_14_생성자 
{
	public static void main(String[] args) 
	{
		Member m1 = new Member();	//객체생성
		
//		m1.id = "Kim";
//		m1.passwd = "1234";
//		System.out.println(m1.id);
//		System.out.println(m1.passwd);
		
//		m1.setId("Kim");	//메서드호출
//		m1.setPw("1234");
		
		System.out.println(m1.getId());
		System.out.println(m1.getPw());

		System.out.println("---------------");
		
		Member m2 = new Member("choi","7777");
		System.out.println(m2.getId());
		System.out.println(m2.getPw());
		
	}

}
