
public class Ex03_13_break_continue 
{
	public static void main(String[] args) 	
	{
		
		System.out.println("~~~~~~for문~~~~~~");	
		System.out.println();
		System.out.println("----break;----");
		
		int i;
		
		for(i=1;i<=10;i++)
		{	
			if(i==5)
			{
				break;	//반복문을 빠져나간다. 1 2 3 4 
			}
			System.out.print(i + " ");
		}
			System.out.println();
		
		System.out.println();
		System.out.println("---continue;---");
		
		for(i=1;i<=10;i++)
		{	
			if(i==5)
			{
				continue;	//반복문을 빠져나가 증감식으로 간다. 5를 제외한 1~10까지 출력
			}
			System.out.print(i + " ");
		}
			System.out.println();		
			
		System.out.println();	
		
		System.out.println("~~~~~~while문~~~~~~");	
		System.out.println();
		System.out.println("----break;----");
		
		i=1;
		while(i<=10)
		{
			if(i==5)
				break;		// 증감식으로 간다.
			System.out.print(i + " ");
			i++;
		}
			System.out.println();
		
		System.out.println();	
			
		System.out.println("---continue;---");
		i=0;
		while(i<10)
		{
			i++;
			if(i==5)
				continue;		// 조건식으로 간다. 증감식 위에 continue가 있으므로 i는 계속 5
			System.out.print(i + " ");
			
		}
			System.out.println();	
			
			
			
			
			
	}

}
// 반복문 : for, while, do_while
// 문장이동 : art + 방향키
// 분기문 : break, continue
// break : 반복문을 빠져나간다.
// continue : 반복문을 빠져나가 증감식을 이동한다.