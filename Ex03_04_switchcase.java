
public class Ex03_04_switchcase 
{
	public static void main(String[] args)
	{
		
		int n=2;
		
		System.out.println("====if_else====");
		System.out.println();
		
		if(n==1)
		{
			System.out.println("n은 1입니다.");
		}
		else if(n==2)
		{
			System.out.println("n은 2입니다.");
		}
		else if(n==3)
		{
			System.out.println("n은 3입니다.");
		}
		else
		{
			System.out.println("n은 1~3 사이의 숫자가 아닙니다.");
		}
		
		
		System.out.println();
		System.out.println("==switch_case==");
		System.out.println();
		
		
		switch(n)		// 해당 숫자를 찾아 아래로 break만나기 전까지 출력
		{
			case 1 : System.out.println("n은 1입니다.");
					break;
					
			case 2 : System.out.println("n은 2입니다.");
					break;
					
			case 3 : System.out.println("n은 3입니다.");
					break;
			
			default : System.out.println("n은 1~3 사이의 숫자가 아닙니다.");
					break;
		}
		
		System.out.println("switch_case 공부 중입니다");
		
		
		System.out.println();
		
		String fruit = "apple";
		switch(fruit)
		{
		case "apple" : 	System.out.println("사과는 맛있어"); 
						break;
		case "banana" : System.out.println("바나나는 맛있어"); 
						break;
		default : 		System.out.println("과일은 맛있어"); 
		
		}
		
		System.out.println();
		
		
		char ch='m';

		switch(ch)
		{
		case 'm' : 
		case 'M' : System.out.println("Morning"); break;	
		case 'a' : 
		case 'A' : System.out.println("Afternoon"); break;
		case 'e' : 
		case 'E' : System.out.println("Evening"); break;
				//위아래 해야할 일이 같다면 출력명령과 브레이크 중복기재할 필요 없다.
		default : System.out.println("잘못 입력하였습니다.");
		}
	}
}
/*	Switch(정수 or 정수형변형 or 문자열 or 문자)
	{
		case 정수1 : 실행1;
					break;
		case 정수2 : 실행2;
					break;
		case 정수n : 실행n;
					break;
		default : 	실행n+1;
					break; <-switch_case를 빠져나라가는 명령어
	}	*/