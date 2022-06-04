
public class Ex07_04_예외처리 {
	public static void main(String[] args) {
		
		try {
		sub();
		} catch (Exception e) {
			System.out.println("main에서 예외 발생");
			System.out.println(e.toString());
		}
	}//main
	
	static void sub() throws Exception {	// 예외처리 호출부분에 떠넘기기 = throws
		int result = 10/0;	//new ArithmeticException()
		System.out.println(result);
	}//sub
}
//예외처리+다형성
//exception은 ArithmeticException의 조상클래스로 ArithmeticException 대신 사용 가능하다
//떠넘기는 부분과 받은 부분의 예외처리는 동일한 클래스로 입력해야한다.