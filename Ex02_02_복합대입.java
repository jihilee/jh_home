
public class Ex02_02_복합대입 
{
	public static void main(String[] args) 
	{
		int a=10, b=20, c=30, d=40;
		
		//a  더하기
		System.out.println("a = " + a);
		
		a += 3;	// a = a+3; 
		System.out.println("a = " + a);
		
		
		//b  빼기
		System.out.println("b = " + b);
		
		b -= 5;	// b = b-5;
		System.out.println("b = " + b);
		
		
		//c  곱하기
		System.out.println("c = " + c);
		
		c *= 2;	// c = c*2;
		System.out.println("c = " + c);
		
		
		//d  나머지
		System.out.println("d = " + d);
				
		d %= 6;	// d = d%6;
		System.out.println("d = " + d);
		
		
		// 문자열 복합대입
		String fruit = "apple";
		System.out.println("fruit = " + fruit);
		
		fruit += "banana";	// fruit = fruit + "banana";
		System.out.println("fruit = " + fruit);
	}
}
