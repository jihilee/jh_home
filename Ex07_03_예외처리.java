
public class Ex07_03_예외처리 
{
	public static void main(String[] args) {
	
		try {
			int[] arr = {10,20,30};
			System.out.println(arr[1]);
			System.out.println(arr[3]);	//ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			
			String str = null;
			System.out.println(str.length());	//error, 위 에러를 만나 내용을 처리하고 빠져나가기 때문에 두번째 에러는 확인하지 못한다
												// try_catch는 첫번째 에러만 처리한다
			int result = 3/0;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 Index에 접근하였습니다.");
			System.out.println(e.getMessage());	// Index 3 out of bounds for length 3
			System.out.println(e.toString());	// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		} catch(NullPointerException e) {
			System.out.println("null로 초기화한 변수의 길이는 구하ㅣ 못한다.");
			System.out.println(e.getMessage());	
			System.out.println(e.toString());
		} catch(Exception e){	//Exception catch는 맨 마지막 부분에 사용하는 것이 적절하다/
			System.out.println("에러를 잡았습니다.");
		} finally {
			System.out.println("finally부분");
		}
		
	
	}//main
}//class
//예외처리 자체의 목적으로만 catch를 사용하고 싶다면 catch(Exception e)형태로 사용할 수 있다
//Exception e : 모든 예외를 다 잡아준다, 어떤 에러가 났는지 확인하고 싶을 때는 구체적인 예외처리가 필요하다