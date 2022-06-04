
public class Ex03_05_for 
{
	public static void main(String[] args) 
	{
		int i;
		 
		for(i=1;i<=10;i+=2)
		{
			System.out.println("java\ti="+i);
		}
		
		System.out.println("i가 for문 밖으로 나왔을 때 값 : " + i);
	
		System.out.println();
		System.out.println("======1~10까지 덧셈======");
		System.out.println();
		
		int sum = 0;	// for문을 이용한 1~10까지 덧셈
		
		for(i=1;i<=10;i++)
		{
			for(i=1;i<10;i++)
			{
				System.out.printf(i + "+");
				sum=sum+i; // sum += i;
			}
				System.out.printf(i + "=");
				sum=sum+i;
		}
				System.out.println(sum);
				System.out.println();
		
		
	
	}

}
/*	for(초기식; 조건식; 증감식)
*	{	반복할 문장;	}	
*	
*	for문 순서	
*	1.초기식, 2.조건식 판별, 3.문장반복, 4.증감식 
*
*	i가 1씩 증가하는 for문	-> for(i=1;i<=10;i++)
*	i가 1씩 감소하는 for문	-> for(i=10;i>0;i--)	
*	무한루프에 빠지지 않도록 주의	-> for(i=1;1<=10;i==)	*/