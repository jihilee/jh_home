
public class Ex05_03_메서드 
{
	public static void main(String[] args) 		// main이란 이름을 가진 method
	{
		show(); 	// show method 호출
		System.out.println("\t~~~가나다~~~");
		show();		// show method 여러번 호출 가능
		System.out.println("\t~~~라마바~~~");
		show();
		System.out.println("\t================");
		
		add(3,4);		// 호출할 때 넘어가는 값 3,4를 인자(전달인자) 혹은 argument라고 칭한다
		add(100,200);	// 호출할 때 3과 4를 가지고 add() method로 온다
		System.out.println("\t================");
			
		double a = sub(100,11,22);		//method 호출, == double a = 67;
		System.out.println("  a = " + a);		//a 변수에 sub method 결과값을 넣은 후 출력
		
		int b = multiply(5,20);		// 전달인자(혹은 파라미터) 5와 20을 mul- method로 넘겨서 리턴받은 후 출력
		System.out.println("  b = " + b);
		
	}
	
 static void show() { //show method 정의
	 				 System.out.println();	
					 System.out.println("*****show method 정의 부분*****");
					 System.out.println("\t즐거운 자바 공부");
					 System.out.println();
 					}	
 
 //매개변수 혹은 parpameter : 호출할 때 넘어오는 값을 받아주는 변수
 static void add(int x, int y) { //add method 정의
	 							System.out.println("\t두 수의 합 : " + (x+y));	// 첫번째+ : 연결의미, 두번째+ : 연산의미
	 							return;		// 호출한 곳으로 돌아가라
 								}
 
 static double sub(int x, int y, int z) {	// sub method 정의
	 	// 가지고 돌아갈 값이 있다면 void 대신 해당 값에 대한 자료형을 기입한다.	
	 									System.out.println();
	 									double result = x - y - z;		// 67
	 									return result;				// main으로 result값을 가지고 돌아가라
										}	// 각 method에서 사용하는 변수의 이름이 다른 method의 변수와 중복되어도 상관 없다. 선언된 변수는 각 method 안에서만 사용되기 때문에

static int multiply(int x, int y) {	
								System.out.println();
								int result = x* y;
								return result;
							}	// 정수 2개를 입력받아 곱셈 후 리턴하는 mul- method


}
// method : 어떤 특정한 작업을 수행하도록 독립적으로 작성된 프로그램이다.
//			method 정의 부분이 필요할 때마다 호출하여 정의할 수 있다.
//			method 정의 부분 처리가 끝나면 무조건 호출한 곳으로 돌아간다.
// 			** 항상 main method 먼저 실행한다.
// 리턴타입 : static "void" method이름 - 가지고 돌아갈 값이 없을 때 
//			static "int" method이름 - 가지고 돌아갈 값이 정수일 때 

// 변수 : 멤버변수, 매개변수(parameter), instance변수, static변수(=class변수)