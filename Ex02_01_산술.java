import java.util.Scanner;
public class Ex02_01_산술 
{
	public static void main(String[] args) 
	{
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1을 입력하세요.");
		num1 = sc.nextInt();
		
		System.out.println("숫자2를 입력하세요.");
		num2 = sc.nextInt();
		
		System.out.println(" ");	
		System.out.println(num1 + "+" + num2 + "=" + num1+num2);
		System.out.println(" -> 문자열 뒤의 연산자는 연결의 의미, 50+90=5090");
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(" -> 문자열 뒤에서 연산을 하기 위해서는 연산부분 괄호 필수");
		
		System.out.println(" ");	
		System.out.println(" ");	
		
		System.out.println("===산술 연산===");	
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		
		System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
		System.out.printf("%d / %d = %.2f\n", num1, num2, ((double)num1/num2));
		
		System.out.println(num1 + " % " + num2 + " = " + ((double)num1%num2));
		System.out.printf("%d %% %d = %.2f\n", num1, num2, ((double)num1%num2));
		//%값 소수점 지정해서 출력하기 위해선 %% 두 번 입력해야 함 -> 컴퓨터가 %뒤에 다른 것이 나올 것으로 예상하기 때문
	
	
	}
}
// import java.util.Scanner;
//Scanner sc = new Scanner(System.in);

//num1 = sc.nextInt();