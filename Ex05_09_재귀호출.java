
public class Ex05_09_���ȣ�� 
{
	public static void main(String[] args) 
	{
		System.out.println("4 factorial : " + factorial(4));
	}
	
	static int factorial(int n)
	{	//  return 0;	->	ȣ���� ������ �̵�
		
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}
