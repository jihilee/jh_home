abstract class Shape
{
	int a = 10;
	
	void make(){
		System.out.println("도형그리기");	
	}
	Shape(){
		System.out.println("Shape 생성자");
	}
	abstract void draw();	//abstract void 미완성메서드(); = 추상메서드
	abstract void delete();
}//shape

class Circle extends Shape
{
	// int a = 10;
	
	Circle()
	{
		super();
		System.out.println("Circle 생성자");
	}
	void draw()
	{
		System.out.println("원을 그린다");
	}
	void delete()
	{
		System.out.println("원을 지운다");
	}
}//circle

class Rectangle extends Shape
{
	// int a = 10; 
	
	Rectangle()
	{
		super();
		System.out.println("Rectangle 생성자");
	}
	void draw()
	{
		System.out.println("사각형을 그린다");
	}
	void delete()
	{
		System.out.println("사각형을 지운다");
	}
}//Rectangle

public class Ex06_10_추상클래스 {
	public static void main(String[] args) {
		
//		Shape s = new Shape(); -> 미완성 객체를 가진 추상클래스는 객체를 만들 수 없다
		Shape c = (Shape) new Circle();	// shape으로 upcasting 
		c.make();
		c.draw();
		c.delete();
		System.out.println(c.a);
		c.a = 20;
		System.out.println(c.a);
		System.out.println();
		
		Shape r = new Rectangle();		
		r.make();
		r.draw();
		r.delete();
		
		
		System.out.println();
		System.out.println("++++++++++++++++");
		System.out.println();
		
		
		//Shape[] arr = {new Circle(), new Rectangle()};
		Shape[] s = new Shape[2];
		s[0] = new Circle();
		System.out.println("===");
		s[1] = new Rectangle();
		
		
		System.out.println();
		System.out.println("````````````````");
		System.out.println();
		
		for(int i=0;i<s.length;i++)
		{
			s[i].make();
			s[i].draw();
			s[i].delete();
		}
		System.out.println();
		
	}
}

//추상클래서 : 미완성된 클래스를 완성하기 위해서 사용
// 상속받은 클래스에서 반드시 필ㅇ한 메서드가 있다면 부모클래스에 추상메서드를 만들어놓고 사용..?
// 인터페이스와 추상클래스의 차이점 말로 할 줄 알아여한다
// interface : 다중상속, 미완성메소드만 있을 수 있다. 앞에 abstract public void show()가 자동으로 붙는다
//final변수가 있다
// 상속받는 클래스에서 implements로 받는다
//ㄱㅐㄱ체생성 불가능하다
