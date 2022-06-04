import java.util.Scanner;

class Std {
			int kor, eng, math;		// 이 지역 안에서만 사용하는 변수, 정수 3개 담을 수 있는 자료형 작성
									// 멤버변수	기본값 0이 들어가있음
			
//			int sum(int k, int m, int e)	//	매개변수
//			{
//				return k + m + e; 
//			}
			
			int sum()
			{
				return kor+eng+math;				
			}
			
			double avg()			//avg정의
			{
				//return(kor+eng+math)/3;
				return sum() / 3;				// return은 호출한 자리로 돌아간다 sum으로 갔다가 avg로 돌아와서 결과 출력
												// 메서드 안에서 메서드 호출 가능
			}									// 리턴 여러개 불가능
			
		  }							

public class Ex05_05_메서드 
{
	public static void main(String[] args) 
	{
		int kor, eng, math;		// 이 지역에서만 사용하는 변수
		
		//Std s = new Std();
		Std s = null;			// 참조변수의 초기값, 참조변수 s에 어떤 주소가 들어갈지 아직 모른다.
		s = new Std();			//new Std(); 까지 작성하면 공간 생성한 것
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 > ");
		s.kor = sc.nextInt();
		
		System.out.print("수학점수 > ");
		s.math = sc.nextInt();
		
		System.out.print("영어점수 > ");
		s.eng = sc.nextInt();
		
		
//		int hap = s.sum(kor,  math,  eng);
//		System.out.println("hap = " + hap);

		int hap = s.sum();
		System.out.println("hap = " + hap);

		double avg = s.avg();
		System.out.println("avg = " + avg);
	}
	
	

}
