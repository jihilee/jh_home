class calculator
{	
	int x, y; 
	
	static int add(int a, int b)	// 두 정수의 덧셈을 리턴하는 add 메서드의 정의
	{
		return a+b;
	}	
	static int multiply(int a, int b)		// 두 정수의 곱셈을 리턴하는 multiply 메서드의 정의
	{
		int c = a*b;
		System.out.println(c + "입니다");
		return c;
	}	
}

public class Ex05_04_메서드 
{
	public static void main(String[] args) 			//실행메서드, 정의
	{
		//main(); 자바가상머신에 의해 main메서드가 자동으로 호출된다
		
		
		// Ex05_04_메서드 ab = new Ex05_04_메서드();
		// ab.main()			
		
		
		calculator p1 = new calculator();
		p1.x = 100;
		p1.y = 200;
		System.out.println(p1.x);
		System.out.println(p1.y);
		
		int result = p1.add(10,20);
		// add(10,20);		// class 안의 add method를 main 메서드에서 
		System.out.println("add result = " + result);
		
		
		
		int result2 = p1.multiply(5, 6);
		System.out.println("multiply result = " + result2);
		
		
		
		System.out.println();
		System.out.println("================");
		System.out.println();
		
		
	
		int result3 = sub(100,11,22);
		System.out.println("result3 = " + result3);
		
		
		
		Ex05_04_메서드 e = new Ex05_04_메서드();		//Ex05_04_메서드라는 method를 만들고 참조변수 e로 선언*********
		int result4 = e.sub2(100,11,22);
		System.out.println("result4 = " + result4);
	
	}																	// 메인
	
	static int sub(int x, int y, int z) {
	 									System.out.println();
	 									int result = x - y - z;	
	 									return result;			
										}								//sub 메서드
	int sub2(int x, int y, int z) {
									System.out.println();
									int result = x - y - z;	
									return result;			
									}									//sub2 메서드
}	

// static method에서는 static method만 호출할 수 있다
// static method가 포함된 class의 객체를 만들어 method에 접근하면 static 붙지 않은 method도 출력 가능