
public class Ex05_12_overloading 
{
	public static void main(String[] args) 
	{
		int result = plus(3,5,10);		// method 호출, 호출하면 정의된 곳으로 간다
		System.out.println("int의 합 : " + result);
		
		float result2 = plus(0.1f, 0.2f);
		System.out.println("folat의 합 : " + result2);
		
		double result3 = plus(1.1, 2.2);
		System.out.println("doouble의 합 : " + result3);
		
		
		System.out.println();
		System.out.println(1);
		System.out.println(1.3);
		System.out.println('A');		// 이미 만들어져있는 System.out.print_overloading
	}
	
	
	// 하나의 클래스 안에 같은 메서드가 존재해선 안된다
	// 그럼에도 에러가 안나는 이유는 변수의 갯수와 자료형이 다르기 때문, 중복으로 보지 않는다
	static int plus(int x, int y, int z)	// x,y,z 매개변수
	{
		return  x + y + z;
	}
	
	static float plus(float x, float y)
	{
		return  x + y;
	}
	
	static double plus(double x, double y)
	{
		return  x + y;
	}
	 // Overloading Method
	 // 하나의 이름으로 여러 개의 메소드를 만들 수 있는 방법 = "메소드를 오버로딩하다" 라고 한다
	 // 조건 : 메소드의 이름이 같아야 하며 매개변수의 자료형이나 갯수가 달라야 한다. (변수는 중요하지 않다)
	 // 	  리턴타입은 오버로딩의 조건에 포한되지 않는다. 오버로딩은 매개변수로만 구별된다.
}
	 // Overriding Method
