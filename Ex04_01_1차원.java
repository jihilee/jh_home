
public class Ex04_01_1차원 
{
	public static void main(String[] args) 
	{
		
// array : 같은 타입의 데이터를 한 묶음으로 묶어서 관리하는 것
// 
		
		System.out.println("<배열 a 출력>");
		System.out.println();
		
//		int[] a = {10, 20, 30, 40, 50};	// 같은 타입만 배열에 넣을 수 있다. 
										// 배열의 이름 a는 참조변수, 참조변수에는 참조값(주소값=I@73a28541)이 들어간다.
//		int[] a = new int[] {10,20,30,40,50}; // 중괄호 앞에 new int[]를 붙여서도 사용한다
		int[] a = new int[5];	// 정수 들어가는 공간 연달아 5개 만들어라, 기본값은 0
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		// a[5] = 11;  // 배열안에 들어갈 수정할 순 있지만 공간의 갯수는 이런 식으로 수정할 순 없다
		
//		a[5]  = 1;		//ArrayIndexOutOfBoundsException error
		
		System.out.println(a);			// a에는 첫집의 주소가 들어간다.
		System.out.println(a.length);	// 배열 a의 방 갯수를 구하라
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//	System.out.println(a[5]);	 인덱스 범위를 넘어 에러가 뜬다
		System.out.println();
		
		
		System.out.println("<반복문 사용하여 배열 a 출력>");
		System.out.println();
		
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("<반복문 사용하여 배열 a 출력 - a.length>");
		System.out.println();
		
		
		for(i=0;i<a.length;i++)			// i는 a의 길이만큼 반복해라
		{
			System.out.println(a[i]);
		}
		
		
		System.out.println();
		System.out.println("<확장 for문을 활용한 배열 a 출력 : 정수>");
		System.out.println();
		
				
		for(int x : a)	// for(하나만 담을 수 있는 변수 : 반복대상) -> 배열에서만 사용가능한 확장for문
		{
			System.out.println(x);
		}
		
		
		
		
		System.out.println();
		System.out.println("<반복문 사용하여 배열 b 출력 - 실수형>");
		System.out.println();
		
//		double[] b  = {1.1, 2.2, 3.3};
//		double[] b = new double{1.1, 2.2, 3.3};
		double[] b = new double[3];
		
		b[0] = 1.1;
		b[1] = 2;		// 2.0 실수형으로 출력
		b[2] = 3.3;
		
		System.out.println(b);			// b의 첫 집 주소가 들어간다

		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

		
		System.out.println();
		System.out.println("<확장 for문을 활용한 배열 b 출력 : 실수>");
		System.out.println();
		
		for(double y : b)
		{
			System.out.println(y);
		}
		
		
		System.out.println();
		System.out.println("<확장 for문을 활용한 배열 t 출력 : 문자>");
		System.out.println();
		
		char[] t = {'a','p','p','l','e'};
		
		for(char h : t)
		{
			System.out.print(h);
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("<확장 for문을 활용한 배열 q 출력 : boolean>");
		System.out.println();
		
		boolean[] q = {true, false};
		
		for(boolean w : q)
		{
			System.out.print( w + " ");
		}
		

	}

}
/* 전체적인 용어 정리 필요, 면접대비 */
// 배열이 무엇인가, 배열활용방법, 방찾는방법 공부