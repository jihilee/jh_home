
public class Ex02_03_증감 {

	public static void main(String[] args) 
	{
		int a = 5, aa, b =5, bb;	// 변수 초기화 필수, 0으로라도 초기화 해놓아야 함
		
		System.out.println("==증가연산==");
		System.out.println(" ");
		
		aa = ++a;			// 먼저 본인a를 1 증가시키고 그 수를 왼쪽으로 넘기는 연산자	
		bb = b++;			// 먼저 왼쪽으로 넘기고 본인b를 나중에 1 증가시키는 연산자
		
		
		System.out.println("a = " + a);
		System.out.println("aa = " + aa);
		
		System.out.println("b = " + b);
		System.out.println("b = " + bb);
		
		System.out.println(" ");
		
		System.out.println("==감소연산==");
		System.out.println(" ");
		
		aa = --a;			// 먼저 본인a를 1 감소시키고 그 수를 왼쪽으로 넘기는 연산자	
		bb = b--;			// 먼저 왼쪽으로 넘기고 본인b를 나중에 1 감소시키는 연산자
		
		
		System.out.println("a = " + a);
		System.out.println("aa = " + aa);
		
		System.out.println("b = " + b);
		System.out.println("bb = " + bb);
		
		
		System.out.println(" ");
		
		System.out.println("==단독증가연산==");
		System.out.println(" ");
		
		int x = 5;
		
		System.out.println("x = " + x);
		++x;
		
		System.out.println("x = " + x);
		x++;	// x=x+1;
		
		System.out.println("x = " + x);
		// 단독으로 증감 연산자 사용 시 변수 앞에 있던 뒤에 있던 결과값은 같다
		

		System.out.println(" ");
		
		System.out.println("==감소연산==");
		System.out.println(" ");
		
		System.out.println("x = " + x);
		--x;
		
		System.out.println("x = " + x);
		x--;	// x=x-1;
		
		System.out.println("x = " + x);
		// 단독으로 증감 연산자 사용 시 변수 앞에 있던 뒤에 있던 결과값은 같다
		
		
		System.out.println(" ");
		
		
		System.out.println("==연산연산11==");
		System.out.println(" ");
		
		int i=10;
		System.out.println(i);		// 10		-> 변수를 콘솔창에 넣는다고 생각하고 연산
		System.out.println(i++);	// 10		-> console = i++ 혹은 ++i
		System.out.println(++i);	// 12
		System.out.println(++i);	// 13
		System.out.println(i++);	// 13
		System.out.println(i);		// 14		
		
		System.out.println(" ");
		
		
		System.out.println("==연산연산22==");
		System.out.println(" ");
		
		
		System.out.println(i);		// 14		-> 변수를 콘솔창에 넣는다고 생각하고 연산
		System.out.println(i--);	// 14		-> console = i-- 혹은 --i
		System.out.println(--i);	// 12
		System.out.println(--i);	// 11
		System.out.println(i--);	// 11
		System.out.println(i);		// 10	
		
		// ctrl+art+아래방향키 + 윗줄복사
	
		
		
	}

}
