//class String{
//	int length()
//	{
//		
//	}
//}

public class Ex07_01_NullPointerException 
{
	public static void main(String[] args) 
	{
		try{
			String str = null;				// 참조변수에 어떤 수를 넣어야할지 모르겠을 때 null
			//String str = "Orange";		// == new String("Orange");
			System.out.println(str);
			System.out.println(str.length());	//new NullPointerException() 
												//에러가 나면 갑자기 내부적으로 이러한 에러객체가 만들어진다			
			System.out.println("예외처리");	//에러난 부분에서 출력이 멈춘다.
			//예외처리 : 콘솔창에 빨간글자가 나오지 않도록 하는 처리행위, 마치 정상적인 행위처럼 보이게 함
			
			// NullPointerException e = new NullPointerException();
			
		} catch(NullPointerException e) {	//에러발생하면 즉시 catch로 이동 -> 에러를 처리하다
			System.out.println("에러발생");
		} finally{
			System.out.println("finally부분");
		}
		
	}//main end

}//class end
// catch:에러발생하면 출력, finally:오류유무관계없이 출력
//컴파일에러 : 오타, 자료형체크
//런타임에러 : 배열범위 넘어갈 때, 실행할 때 발생하는 에러
//			-에러 : 메모리 부족 등의 코드에 의해 수습될 수 없는 에러
//			-예외 : 코드에 의해 수습할 수 있는 오류


/*java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException			-> ***
java.lang.NullPointerException*/

/*java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException	-> RuntimeException을 상속받는 에러들은 내가 잘 하면 이러한 에러가 발생하지 않는다
java.lang.IndexOutOfBoundsException
java.lang.ArrayIndexOutOfBoundsException*/

/*java.lang.Object
java.lang.Throwable				-> RuntimeException을 상속받지 않는 에러들은 신경쓴다고 확인할 수 있는 에러가 아니다
java.lang.Exception					따라서 interruption~와 같은 에러들은 무조건 try/catch를 사용해서 예외처리를 해주어야한다.
java.lang.InterruptedException*/