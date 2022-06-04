
public class Ex02_05_삼항 
{

	public static void main(String[] args) 
	{
		int a=10, b=20;
	
		int result	= a<b ? a : b;		// 조건문 ? 참일 때 : 거짓일 때 출력
		System.out.println("result : " + result);
		
		String s;
		s = a % 2 == 0 ? "짝수" : "홀수";	// a가 짝수인지 홀수인지 알아보는 조건연산자
										// s = a % 2 == 1 ? "홀수" : "짝수";로도 표현 가능
		System.out.println("result : " + s);
		
	}

}
/*	이항연산자 : + - * / % += -= && || >= !=
*	단항연산자 : -a ++a a-- !  
*	삼항연산자(조건연산자) : 조건문 ? 참 : 거짓	
*/