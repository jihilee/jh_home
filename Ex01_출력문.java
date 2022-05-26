
public class Ex01_출력문 
{
	public static void main(String[] args) 
	{
		System.out.println(false);	//<-주석문 혹은 설명문, System 첫글자 대문자, println<-출력+엔터
		System.out.println("가나다라");	// 이 명령어는 connsole창에 출력하는 명령어이다.
		
		System.out.print("a");		//한줄 마무리는 ;세미콜론, 
		System.out.println('b');	//"문자열", '문자' 
		
		System.out.println("안녕\t하세요\n\n저의이름은'홍길동'입니다"); //쌍따움표안에 홑따움표는 그대로 출력
		System.out.println("안녕\t하세요\n\n저의이름은\"홍길동\"입니다"); //쌍따움표안에 쌍따움표는 \"를 입력하면 출력가능
	
		System.out.println("1+2");	// 그대로 출력
		System.out.println(1+2);	// 연산되어 출력
		System.out.println(10);	
		System.out.println("즐거운"+"자바"+"수업");	//문자열 연결 + 사용
		System.out.println("1"+"2");	// 숫자 연달아 출력
		
		
		System.out.println(" ");
		
		
		int a = 123;					// a라는 4바이트 공간을 만들어 123이란 정수를 삽입
		char b = 'A';					// b라는 2바이트 공간을 만들어 A이란 문자를 삽입
		double c = 98.765;				// c라는 8바이트 공간을 만들어 98.~이란 실수를 삽입
		String d = "아이유";				// d라는 ?바이트 공간을 만들어 문자열 삽입
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		System.out.println(" ");
		
		System.out.printf("a=%d\n", a);
		System.out.printf("b=%c\n", b);
		
		System.out.printf("c=%f\n", c);			// 소수점 6자리까지 출력
		System.out.printf("c=%.3f\n", c);		// 소수점 3자리까지 출력
		System.out.printf("c=%.1f\n", c);		// 소수점 1자리까지 출력
		System.out.printf("c=%7.1f\n", c);		
		System.out.printf("c=%4.1f\n", c);		// 전체자리.소수아래자리.  오른쪽 맞춤으로 출력
		
		System.out.printf("d=%s\n", d);
		System.out.printf("d=%5s\n", d);		// 자리수 지정, 오른쪽 맞춤 출력
		System.out.printf("저의 이름은 %3s 입니다\n", d);
		
		
	}
}

/*	; 세미콜론
 	: 클론
	모든 것은 main 안에 작성해아하며, 주석문은 밖에 작성해도 괜찮다
	\t : 탭키
	\n : 엔터
	주석처리 방법 : /* abc */ //abc  */
//	 " " : 문자열
//	 ' ' : 문자 상수 

/*	서식문자 
 * 	정수 : %d, 실수 : %f, 문자 : %c, 문자열 : %s */


// 주석처리 단축키 : 구역 묶어서 ctrl + / 

//변수이름 예약어 사용 불가, 변수이름 첫 글자 숫자 불가

/*bin 폴더의 class파일은 사람이 이해할 수 있는 언어에서 
* 기계가 이해할 수 있는 언어(기계어)로 변환된 내용이 들어가있음 = "컴파일한다" 
* src 소스코드 자바파일 -> 사람의 언어
* bin class파일 -> 기계어 */

