interface RemoteControl{
	void turnOn();
	void turnOff();
}//interface

class Tv implements RemoteControl{
	
	public void turnOn()
	{
		System.out.println("tv를 켠다.");
	}
	public void turnOff()
	{
		System.out.println("tv를 끈다.");
	}
}//Tv

public class Ex07_09_익명클래스 {
	public static void main(String[] args) {
		//new RemoteControl(); 객체생성 불가능
		
		Tv t = new Tv();
		
		t.turnOn();
		t.turnOff();
		System.out.println();
		
		RemoteControl rc = new RemoteControl()
		{
			public void turnOn()
			{
				System.out.println("tv를 켠다.");
			}
			public void turnOff()
			{
				System.out.println("tv를 끈다.");
			}	//미완성메소드 두개 완성
		};	//객체생성 끝
		
		rc.turnOn();
		rc.turnOff();	//익명클래스로 객체만들기
	}

}

//인터페이스와 추상클래스의 차이점 말로 설명 필요
//interface : 다중상속, 미완성메소드만 존재. 앞에 abstract public가 자동으로 붙는다
//final변수가 있다
//상속받는 클래스에서 implements로 받는다
//객체생성 불가능하다
//추상클래서 : 미완성된 클래스를 완성하기 위해서 사용
//상속받은 클래스에서 반드시 필요한 메서드가 있다면 부모클래스에 추상메서드를 만들어놓고 사용..?