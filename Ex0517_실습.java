import java.util.Scanner;

public class Ex0517_실습 
{
	public static void main(String[] args)
	{
		//Ex01_출력문 
		
		// <-주석 혹은 설명문이라 지칭
		
		System.out.println(true);	//	printf, println는 connsole창에 출력하는 명령어
		System.out.println(false);	// t, f 소문자 주의
		
		System.out.println('a');	// '문자'
		System.out.println("a"); 	// "문자열"
		
		System.out.println("안녕하세요\n저의\t이름은\t이짛입니다.");	// \n -> 엔터, \t -> 스페이스바	
		System.out.println("즐거운"+"수업");	// +는 연결연산자
	
		System.out.println("1+2");			// 그대로 출력
		System.out.println(1+2);			// 연산하여 출력
		System.out.println("1"+"2");		// 연달아 출력
		
		
		System.out.println(" ");
		
		// 자료형
		
		int a = 100;		//4바이트
		char b = 'R';		//2바이트
		double c = 3.14;	//8바이트
		String d = "졸려";
		
		// 출력
		
		System.out.println("a="+a);
		System.out.printf("a=%d\n", a);	// 정수 %d
		System.out.printf("b=%c\n", b);	// 문자 %c
		
		System.out.printf("c=%f\n", c);	// 실수 %f
		System.out.printf("c=%10.2f\n", c);	// 전체 10자리 중에서 소수2자리까지 오른쪽 맞춤 출력
		
		System.out.printf("d=%s\n", d);	// 문자열 %s
		
		/* printf, \n 사용하여 출력 */
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		//Ex02_정수형 
		
		
		int a2, b2;	//선언
		a2=1;		//초기화
		b2=2;
		
		int c2;
		
		c2 = a2 + b2;
		System.out.println(c2);	//3
		
		byte a1=10, b1=20;
		int c1;				//묵시적 형 변환 : int보다 작은 자료형을 연산하면 결과값은 int형이 된다
		
		c1=a1+b1;			
		System.out.println(c1);	//30
		
		int x = 10000;
		int y = 2000000;
		
		long z = (long)x * y;	// 계산값이 int형을 벗어난다면 한 변수 값을 임시로 long형으로 변경해야 함 
		System.out.println(z);	// 20000000000
		
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		// Ex03_실수형
		
		double d1 = 3.14;
		double d2 = .12345;		// 0.12345
		double d3 = .45153E3;	// 451.53
		double d4 = .45153E-3;	// 0.00045153 == 4.5153E-4
		
		System.out.println(d1 + "\t" + d2 + "\t" + d3 + "\t" + d4);
		
		
		
		float f1, f2;
		
		f1 = 0.578654f;
		// f1 = 0.578654;  <-에러  실수는 double형으로 자동 변환되기 때문에 실수f로 지정해줘야 함
		
		f2 = 3;			
		// 3.0으로 출력 (자동형변환)
		
		System.out.println(f1 + "\t" + f2);
		
		
		int i = (int)3.543;
		// 3으로 출력 (강제형변환)
		// int < float
		
		System.out.println(i);
		
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		// Ex04_문자형
		
		char ch1 = 'A';		// A=65, a=97 아스키코드값
		char ch2 = 'a';	
				
		System.out.println(ch1 + "\n" + ch2);
		System.out.println((char)(ch1+1));		// 강제 문자형으로 변환 B출력
	
		
		String s = "사과";
		System.out.println(s);
	
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		// Ex05_입력문
	
	//클래스 윗줄에 import java.util.Scanner; 입력
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		Scanner sc = new Scanner(System.in);
		String hs, name;
	
		System.out.println("당신은 누구입니까?");
		name = sc.next();
		
		System.out.println("당신은 어떤 사람입니까?");
		hs = sc.next();
		
		System.out.println("======================");
		System.out.println("이름\t별명");
		System.out.println("----------------------");
		System.out.println(name + "\t" + hs);
		System.out.println("=========헤헿==========");
	
	
	}
}
