
public class Ex02_04_관계논리 {

	public static void main(String[] args) 
	{
		
		int a = 20, b = 10;
		boolean c;
		
		c = a>=b;
		System.out.println("a>b : " + c);	// false or true
		
		System.out.println(a>b);	// false or true
		System.out.println(a==b);	// 같다
		System.out.println(a!=b);	// 다르다
		
		boolean result = a>10 && b>10;	// AND 연산자
		System.out.println("result : " + result);
		
		result = a>10 || b>10;	// OR 연산자, result 재사용
		System.out.println("result : " + result);
		
		result = !(a>3);	// 10>3 !(true) = flase, 참값을 거짓으로 바꿔주는 연산자
		System.out.println("result : " + result);

	}

}
/*	T && T : T
*	F // F : F
*/