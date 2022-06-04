import java.util.Scanner;

public class Ex07_05_예외처리 {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100) + 1;	// 난수
//		System.out.println(answer);
		
		/*  0*100 <= d < 1*100
		 *	0.xx < = d < 99.xx
		 *  0+1 < = d <= 99+1
		 *  1 <= d <= 100
		 *  
		 *  a에서 b사이의 랜덤숫자 ?를 구하고 싶을 때 (a <= ? <= b),
		 *  (int)Math.random() * [(b-a)+1]) + a
		 */
		
			int input;
			int count = 0;
			
			do{
				count++;
				System.out.println("1~100 사이의 정수를 입력하세요.");
				Scanner sc = new Scanner(System.in);
				
				try {
					System.out.println(">");
					input = sc.nextInt();
					
					if(input <= 0) {	//강제로 예외 발생시킬 때
						throw new Exception();}
					}catch(Exception e) {
						System.out.println("유효하지 않은 값입니다. 다시 입력하세요.");
						System.out.println(e.toString());
						continue;
					}//예외를 미연에 방지하기 위해 작성하는 try_catch
				
				if(answer > input)
					System.out.println("더 큰 수를 입력하세요");
				else if(answer < input)
					System.out.println("더 작은 수를 입력하세요");
				else{
					System.out.println("정답입니다");
					System.out.println("시도한 횟수는 " + count + "입니다");
					break;
					}
			}while(true);
				System.out.println("프로그램을 종료합니다.");
	
	}

}
