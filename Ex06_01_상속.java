class Sports
{
	String name;
	int inwon;
	
	Sports()
	{
		name = "야구";
		inwon = 9;
	}
	Sports(String name, int inwon)
	{
		this.name = name;
		this.inwon = inwon;
	}
	void display() // 매서드 선언부
	{
		System.out.println("name : " + name);
		System.out.println("inwon : " + inwon);
	}
}// sports class end

class Baseball extends Sports		// class 자식클래스(=자손, 하위클래스) extends 부모클래스(=조상, 상위 클래스)
{
//	String name;		// sports가 가지고 있는 변수이기 때문에 extends Sports를 추가로 작성함으로써
//	int inwon;			   중복해서 작성하지 않고 sports에게 상속받는다
	double ta;
	
	Baseball(String name, int inwon, double ta)
	{
		super(name, inwon);		// 생성자에만 존재한다. 생성자의 첫줄에 직접 기입하지 않아도 자동으로 호출되어있다. 부모의 생성자를 호출하는 코드이다.
//		this.name = name;
//		this.inwon = inwon;
		this.ta = ta;
	}
	void display() // method overriding , 부모와 자식이 같은 형태이다(변수중요않다), 선언부가 같다 = 메서드오버라이딩
	{			   // method overloading ,  하나의 클래스 안에 같은 이름의 메서드가 존재하는 것, 메서드의 타입이나 개수로 구분
//		System.out.println("name : " + name);		
//		System.out.println("inwon : " + inwon);
		
		super.display();	// 부모가 가지고 있는 display를 호출
		System.out.println("ta : " + ta);
	}
}// baseball class end

class Football extends Sports	// Sports클래스의 name과 inwon을 상속받음
{
	int goal;
	
	Football(String name, int inwon, int goal) 
	{	
		super(name, inwon);
//		this.name = name;
//		this.inwon = inwon;
		this.goal = goal;
	}
	void display()
	{
//		System.out.println("name : " + name);		
//		System.out.println("inwon : " + inwon);
		super.display();
		System.out.println("goal : " + goal);
	}
}// football class end

class Basketball extends Sports
{
	int shoot;
	
	Basketball(String name, int inwon, int shoot)
	{
		super(name, inwon);
		this.shoot = shoot;
	}
	void display()
	{
		super.display();	// 부모변수, 메서드 접근할 때 super. 사용
		System.out.println("shoot : " + shoot);
	}
}// class basketball end
 // 한 부모는 여러 자식을 가질 수 있다. 부모는 자식클래스의 것을 가져다 사용할 수 없다.

public class Ex06_01_상속 
{
	public static void main(String[] args) 
	{
		Sports s1 = new Sports();	//야구, 9
		Sports s2 = new Sports("축구", 11);
		
		s1.display();
		System.out.println("-----");
		
		s2.display();
		System.out.println("-----");
		System.out.println();
		
		
		Sports bb = (Sports) new Baseball("야구", 5, 0.345);		// upcasting 자식을 부모 타입의 변수로 자동 업케스팅됨
		bb.display();											// 왼쪽 변수를 Sports로 바꾸면 오른족도 맞춰주어야 한다 =>업캐스팅, 생략가능
		System.out.println("-----");
		
		Football fb = new Football("축구", 7, 3);
		fb.display();
		System.out.println("-----");
		
		Basketball sb = new Basketball("농구", 5, 30);
		sb.display();
		System.out.println("===========");
		
		
		Sports[] arr = {new Baseball("야구", 5, 0.345), 
						new Football("축구", 7, 3),
						new Basketball("농구", 5, 30)};
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i].display();
			System.out.println("-----");
		}
	}

}
// super() : 부모 생성자를 호출하는 코드, 안써도 기본적으로 들어간다. 생략불가, 생서자 첫줄에만 존재
// super.  : 부모의 변수, 메서드에 접근할 때 사용