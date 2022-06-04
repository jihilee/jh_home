class Parent
{
	int x=10;
	//private int x=10;
	void method()
	{
		System.out.println("P_x:" + x);
	}
}// class Parent end

class Child extends Parent
{
	int x = 20;			// child변수에 x가 없으면 부모의x를 가지고와 사용한다. -> super.x=10, this.x=10
	void method()		//method overriding
	{
		int x = 30;									// 지역변수x가 없으면 다음 x변수에 접근한다.
		System.out.println("x:" + x);				// 자기 것이 없을 때 부모 것 사용, 지역변수, 이 지역을 벗어나면 사라진다
		System.out.println("this.x:" + this.x);		// this:child안의 멤버변수(instance변수)에 접근할 때 사용
		System.out.println("super.x:" + super.x);	// super : 부모변수접근할때, q부모의 x변수가 private일때는 접근불가능
	
		super.method();
	}
}// class Child end

public class Ex06_05_super 
{
	public static void main(String[] args) 
	{
		Parent c = new Child();		// 부모변수로 업캐스팅
		c.method();
	}
}
