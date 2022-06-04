class Car2{
	String color="White";
	int door = 4;
	void drive()
	{
		System.out.println("~drive~");
	}
	void stop()
	{
		System.out.println("stopp!!!!");
	}
}//car2

class FireEngine extends Car2{
	int door = 6;
	int wheel = 10;
	
	void drive()	// overriding
	{
		System.out.println("~FEdrive~");
	}
	void water()	
	{
		System.out.println("*water*");
	}
}//FireEngine

public class Ex06_08_다형성 {
	public static void main(String[] args) {
		
	double x=2.2;
	int y = 1,z;
	
	x = (double)y;	// x=y; 작은 것을 큰 그릇에 넣을 때는 자료형 생략가능
	z = (int)x;		// 담는 그릇 사이즈로 강제변환 필요
	
	Car2 c = new Car2();
	FireEngine f = new FireEngine();
	FireEngine f2 = null;
	
	f.water();
	f.drive();		// 자신의 drive가 우선
	System.out.println(f.door);
	System.out.println(f.color);	// 자신 것이 없으면 부모 것을 사용
//	System.out.println(c.Wheel);	//	자식의 것은 부모가 사용할 수 없다. 
	
	System.out.println();
	c=f;		// 상속관계라면 타입이 달라도 가능 
				// == Car2 c = new FireEngine();
	//c=(Car2)f; 자식개체를 부모 타입의 변수에 넣을 때 부모타입에 맞춰야함
				// =업캐스팅했다 라고 함, 자동이고 생략 가능함
	
	System.out.println(c.color);	
	System.out.println(c.door);		//변수는 부모내용 출력
	
	c.drive();		
	c.stop();		//메소드는 자식내용 출력
	//c.water();  <-오류	//부모변수로 자식공간의 주소를 가지고 있을 때 자식 메서드가 호출되지만
						// 부모가 가지고 있는 것이 확인이 되어야 자식의 메서드가 호출된다
	
	
	System.out.println();
	if(c instanceof FireEngine)		// c변수로 FireEngine을 참조할 수 있냐
	{	
		System.out.println("다운캐스팅 가능");
	}
	else
		System.out.println("다운캐스팅 불가능");
	
	System.out.println();
	f2 = (FireEngine)c;		// 부모타입의 변수값을 자식타입에 넣는다.
							// downcasting 자동이아니다. 반드시 써줘야한다.
	
	System.out.println(f2.door);//자기것출력
	System.out.println(f2.color);//부모것가져다씀
	
	f2.drive();
	f2.stop();
	
	}//static - main end
}//public class end

// 다형성(polymorphism):부모자식관계에서 하나의 객체로 여러 타입의 객체를 참조할 수 있는 것
//					  업케스팅을 한 것이 있어야 다운케스팅을 할 수 있다
