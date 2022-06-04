class Inner1{
	int i=2;
	void display()
	{
		System.out.println("i=" + i);
	}
}//inner1

class Inner2 extends Inner1{	//display를 새로 정의하기 위해 만든 inner2 class
	void display()
	{
		System.out.println("i="+i*i);
	}
	
}//inner2

public class Ex07_08_익명클래스 {
	public static void main(String[] args) {
		
		Inner1 i1 = new Inner1();
		i1.display();
		
		Inner1 i2 = new Inner2();
		i2.display();
		
		
		
		new Inner1() {	//display를 새로 정의하기 위해 클래스를 만들지 않고 기존 Inner1을 수정하여 display method 새로 완성 = 익명클래스
			void display()
			{
				System.out.println("i=" + i*i*i);
			}//display
		}.display();	//메소드 새로 완성, 출력까지
		
		new Inner2()	//display method 새로 완성하기 위한 Inner2의 익명클래스
		{
			void display() {
				System.out.println("i=" + i*i*i*i);
			}
		}.display();
		
	}

}
//익명클래스 : display를 새로 정의하기 위해 클래스를 만들지 않고 기존 Inner1을 수정하여 display method 새로 완성