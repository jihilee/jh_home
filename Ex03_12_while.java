
public class Ex03_12_while 
{
	public static void main(String[] args) 
	{
		
		int i;
		
		System.out.println("for문으로 1~10까지 출력");
		
		for(i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		
			System.out.println();
		
		
		System.out.println();	
		System.out.println("while문으로 1~10까지 출력");
			
		i=1;
		while(i<=10)
		{
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("while문 밖의 i 값 : " + i);
	
	
		System.out.println();	
		System.out.println("while문으로 7의 배수 출력");
		
		
		i=1;
		while(i<=100)
		{	
			if(i%7==0)
			{
				System.out.print(i + " ");
			}
			
			i++;
		}
		
		System.out.println();
		
		
		System.out.println();	
		System.out.println("do_while 사용하여 1~10까지 출력");
		
		i=1;
		do {
			System.out.print(i + " ");
			i++;
			}while(i<=10);
		
		System.out.println();
		
		System.out.println();
		System.out.println("do_while문 밖의 i값 : " + i);
		System.out.println();
	}
}
/*	초기식;
*	while(조건식)
*	{
*	반복할 문장;
*	증감식;
*	}	
*
*	초기식;
*	do{
*		반복할 문장;
*		증감식;
*	}while(조건식);	// 조건식이 거짓이어도 최소 한번은 반드시 수행한다. 
*
*	최소 한번은 실행해야 할 때 do_while 사용해야 한다.
*
*	for문 안에 while문, while문 안에 for문 넣어서 사용 가능
*	*/