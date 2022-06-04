class Var{
			static int a;		//static변수		각 클래스의 멤버변수들인데 하나는 static변수 하나는 instance변수이다
			int b;				//instance변수	두 변수 다 0으로 자동 초기화
			void increment()
				{
				int c = 0;		// 메서드 안의 변수는 지역변수, 이 지역 안에서만 사용 가능하다
				a++;			// 지역변수는 0으로 초기화를 해야한다.
				b++;
				c++;
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
				}	// increment, 메서드 정의
	
			}	//var

public class Ex05_07_변수 {
	public static void main(String[] args) 
	{
		Var v1 = new Var();
		v1.increment();		// Var라는 동네에서 increment라는 메서드를 호출할 때, 변수를 통해 클래스를 호출하고 변수.메소드();
		v1.increment();
		System.out.println();
		
		Var v2 = new Var();
		v2.increment();		
		v2.increment();
		System.out.println();
		
		Var v3 = new Var();
		v3.increment();		
		v3.increment();
		System.out.println();
	}

}
