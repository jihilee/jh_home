
public class Ex03_실수형 
{
	public static void main(String[] args)
	{
		double d1 = 1.2;
		double d2;
		d2 = 3.4;
		
		double d3;
		d3 = d1 + d2;
		
		System.out.println("d3="+d3);
		
		double d4 = .123E3; 
		System.out.println("d4="+d4);	// .123 = 0.123, .123E3 = 0.123*10^3 = 123.0
		
		double d5 = .123E-3; 
		System.out.println("d5="+d5);	// .123E-3 = 0.123*10^-4 == 0.000123

		float f1;
		f1 = 0.0123f; // 실수는 자동으로 8byte 공간(double)으로 잡힌다. 그러므로 float f1은 에러가 남
						// 0.0123f <-플로트 형으로 지정
		System.out.println("f1="+f1);	// f1=0.0123
		
		float f2 = 3;					// 자동 형변환
		System.out.println("f2="+f2);	// f2=3.0
		
		int i = (int)7.8;	// 강제 형변환
							// 동일한 4byte지만 int < float, (int)7.8->이 줄에서만 잠깐 정수로 사용 7만 가져옴
		System.out.println("i="+i);
		
	}
}


/*실수형 자료형
 * double(8byte) -1.7E308~1.7E308
 * float(4byte) -3.4E38~3.4E38
 * 
 * 1,2d <- 더블형 숫자로 인식 /  1.2f <- 플로트형 숫자로 인식
 * 
 * 강제형변환
 * 
 * Syso + ctrl + space -> 출력명령 자동입력
 * 
 * 실행단축키 ctrl + f11, 혹은 상단 run, run
 */