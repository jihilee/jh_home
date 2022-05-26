import java.util.Scanner;

public class Ex05_입력문 
{
	public static void main(String[] args)
	{
//		int kor = 70;
//		int eng = 80;
//		int math = 90;
		
		Scanner sc =  new Scanner(System.in);	// 입력값 받기 sc는 스캐너 이름
		int kor, eng, math;						// 초기화 필요
		
		System.out.print("이름입력=>");
		String name = sc.next();				// sc.next() 문자열 읽겠다
		
		System.out.print("국어점수=>");
		kor = sc.nextInt();						// nextInt() I는 대문자, 정수를 읽겠다
		
		System.out.print("수학점수=>");
		eng = sc.nextInt();
		
		System.out.print("영어점수=>");
		math = sc.nextInt();
		
		System.out.println(" ");
		
		System.out.println("----------------------------------");
		System.out.println(" 이름\t국어\t수학\t영어");
		System.out.println("----------------------------------");
		System.out.println(name + "\t" + kor +"\t" + eng + "\t" + math);
		
		System.out.println(" ");
		
		int total = kor + eng + math;
		System.out.println(name + "님의 총합은 " + total + "점 입니다.");
		
		double avg = total / 3.0;				// 163/3=54.333333, 3을 3.0으로 변경 혹은 (double)total로 변경
		System.out.printf(name + "님의 평균은 %.2f점 입니다.", avg);	// %.2f사용 시에는 printf로 변경해서 출력해보기
		
		
	}
}


