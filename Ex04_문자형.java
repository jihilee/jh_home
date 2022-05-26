
public class Ex04_문자형 
{
	public static void main(String[] args)
	{
		char ch;
		ch ='A'; // 한글자만 꼭 들어가야 함 null값 가질 수 없음 
				 // char ch = 65(=문자 A를 넣겠다) 아스키코드값 참고 char값에도 정수값을 대입할 수 있다
		
		System.out.println("ch:"+ch);
		System.out.println(ch+1);		
		// A+1 = 66
		// 65 + 1 = 66
		
		System.out.println((char)(ch+1)); // ch+1 강제 문자형으로 변환 => B
		
		
		boolean b1; 
		// true or false (소문자로 입력)
		b1 = false;
		System.out.println("b1="+b1);
		
		b1 = 5>3;
		System.out.println("b1="+b1);
		
		String s;		// 문자열 자료형
		s = "Apple";
		System.out.println("s="+s);
		
		
	}
}

/* char(2byte) : '문자형' 자료형 0~65535
 *
 * 2byte(4byte) + 4byte = 4byte <-작은 애가 큰 바이트로 바뀜
 * 
 * A : 아스키코드값 65
 * a : 아스키코드값 97
 *
 * boolean(1bit) : 논리형 자료형  true or false
 * 
 * String "문자열 자료형" 
 */