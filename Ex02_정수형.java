
public class Ex02_정수형 
{
	public static void main(String[] args)
	{
		System.out.println(1+2);
		
		int a;	// a, b는 변수(variable)상자는 정수 담는 용도로 선언하는 것
		int b;	// 선언
		
		a=1; 
		b=2;	//초기화
		
		int c=3;	// 선언 초기화 동시에 가능
		
		System.out.println(a+b);
		System.out.println("a+b");
		System.out.println("a"+"b");
		System.out.println("c");

		byte b1=10; // 선언과 초기화
		byte b2=20; 
		
		int b3; //묵시적 형변환, byte b3은 묵시적 형변환으로 인해 에러 발생
		
		b3=b1+b2; //30
		
		System.out.println("b3="+b3);
		
		
		int x = 1000000;
		int y = 2000000;
		
		long z = (long)x*y; // 2조, 이 줄에서만 변수 x가 잠깐 long으로 변경, "8byte*4byte" y가 8byte와 연산되면 8byte로 연산진행됨
		
		System.out.println("z="+z);
	}
}

/*파일명 변경 방법 - 파일이름 우클릭 - refactor - rename - 이름변경
  				- 파일이름 클릭 - f2키 - 이름변경*/
//복붙 동시에 : ctrl + art + 방향키
//한줄 삭제 : ctrl + d
//되돌리기 : ctrl + z

/* 정수형 자료형(type) : byte(1) -128~127, short(2)약-3만~3만, int(4byte) 약-21억~21억, long(8)-900경~900경
   실수형 자료형(type) : float, double */

// 변수이름 : 다른 변수와 중복될 수 없다, 숫자로 시작할 수 없다, 특수문자 _만 사용 가능하다, 한글한자도 가능

//묵시적 형변환 : int보다 작은 데이터를 연산하면 결과는 int가 된다.