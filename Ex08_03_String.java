import java.util.Scanner;

public class Ex08_03_String {

	public static void main(String[] args) {

		String s1 = "    Abc    DEf      G  ";
		System.out.println("s1_print : " + s1);
		System.out.println("s1.length : " + s1.length());
		
		String s2 = s1.trim();
		System.out.println("s2_trim : " + s2);	// 앞뒤글자 공백제거
		System.out.println("s2.length : " + s2.length());
		//trim : 안정적 회원가입을 위해 ID,PW에 공백을 제거하여 등록한다
		
		System.out.println(s1.contains("DE"));	//DE를 포함하고 있는가(t/f)
		System.out.println(s1.contains("de"));	//대소문자 구별
		System.out.println(s1.contains(" "));	
		System.out.println(s1.indexOf("DE"));	//DE의 시작지점 출력 int
		System.out.println(s1.indexOf("de"));	
		
		if(s1.contains("de") == false)
		{
			System.out.println("de를 포함하지 않음");
		}
		else
		{
			System.out.println("de를 포함하고 있음");
		}//contains을 통한 확인(boolea:T/F)
		
		if(s1.indexOf("DE") == -1)
		{
			System.out.println("DE를 포함하지 않음");
		}
		else
		{
			System.out.println("DE를 포함하고 있음");
		}//indexOf를 통한 확인(int)
		
		String fullName = "Hello.java";	//a.text
		String fileName;	//Hello
		String ext;	//java
		
		int index = fullName.indexOf('.');	//'.'이라 적으면 .의 아스키코드값이 들어간다
		System.out.println("fullName.indexOf('.') = " + index);	//.의 위치를 int index변수로 받아 사용
		
		fileName = fullName.substring(0,index);
		ext = fullName.substring(index+1);
		System.out.println("fileName : " + fileName);
		System.out.println("ext : " + ext);
	
		
		System.out.println("---------------------");
		System.out.println();
		
		String id, pw;
		id = "kim";
		pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("로그인 합니다.");
		
		System.out.print("id > ");
		String loginId = sc.next();
		
		System.out.print("pw > ");
		String loginPw = sc.next();
		
		//if(loginId.equals(id) && loginPw.equals(pw))	// 문자열 같은지 비교할 때 equals*********
		//if(loginId.compareTo(id)==0 && loginPw.compareTo(pw)==0)	//compareTo()==0 -> equal 의미
		if(loginId.compareToIgnoreCase(id)==0 && loginPw.compareToIgnoreCase(pw)==0)	//대소문자구별없음
		{
			System.out.println("로그인 성공");
		}
		else
		{
			System.out.println("로그인 실패");
		}
	
		
	
	}
	
}
