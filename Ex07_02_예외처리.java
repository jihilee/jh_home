import java.util.Scanner;

public class Ex07_02_예외처리 {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		System.out.print(">");
		num1 = sc.nextInt();
		System.out.print(">");
		num2 = sc.nextInt();
		
		System.out.println(num1 + "과 " + num2 + "를 입력하였습니다.");
		
		boolean div = divider(num1,num2);	//divider 호출********
		if(div)
		{
			System.out.println("연산성공");
		}
		else
		{
			System.out.println("연산실패");
		}
	}//main
	
	static boolean divider(int x, int y)	//**********
	{//divider정의 
		try{
			int result = x/y;	//  5/0을 입력했을 시, ArithmeticException e = new ArithmeticException
			System.out.println("result : " + result);
			return true;	// return없어도 돌아감
			
		}catch(ArithmeticException e){
			
			System.out.println("젯수가 0이면 안된다");
			System.out.println("ArithmeticException error by zero");
			System.out.println(e.getMessage());	// e.getMessage():오류난 이유를 문자열로 만들어 리턴해준다
			System.out.println(e.toString());	// e.toString():오류난 이유 리턴
			return false;
			}
	}//divider
}//class
// 예외가 발생하면 예외 클래스가 자동으로 만들어진다\







