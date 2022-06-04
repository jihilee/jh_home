
public class Ex05_09_재귀호출 
{
	public static void main(String[] args) 
	{
		System.out.println("4 factorial : " + factorial(4));
	}
	
	static int factorial(int n)
	{	//  return 0;	->	호출한 곳으로 이동
		
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}
