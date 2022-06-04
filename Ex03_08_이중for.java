
public class Ex03_08_이중for 
{
	public static void main(String[] args) 
	{
		
		System.out.println("==이중for문을 이용한 i와 j 출력하기==");
		System.out.println("==디버깅 방법 배우기==");
		System.out.println();
		
		int i, j;
		
		for(i=1;i<=3;i++)		//첫번째 for문 라인 번호 우클릭 -> 토굴 브레이크포인트 클릭 -> 파란동그라미 생성
		{						//코딩한 곳에서 우클릭 -> 디버그에즈 -> 자바어플리케이션 ->f5키를 누르면i변수에 1입력된 것을 오른쪽에서 확인할 수 있다.
			for(j=6;j<=7;j++)
			{
				System.out.println( i + "," + j);		// System ~ print 에서는 f6키를 입력**
				System.out.println("~~~~~~~");
			}// 안쪽for문
			
			System.out.println("********");
			
		}	// 바깥for문
		
		System.out.println();
		System.out.println("===========");
		System.out.println();						// f5와 f6을 입력하여 단계별로 실행시킬 수 있다. = 디버그하다 = 단계별로 실행하다 
	}												// 디버깅 종료하려면 오른쪽 상단 벌레모양 누르고 close, 왼쪽 파란동그라미 토굴 브레이크포인트 재클릭 후 해제
}
/* for(조건식1)
 * {
 *		for(조건식2)
 *			{
 *			
 *			}
 * {					*/
