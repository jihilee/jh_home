public class Ex05_06_02_배열넘기기 
{
	public static void main(String[] args) 
	{

		int[][] arr = {{1,2,3},{4,5,6}};
		
		Ex05_06_02_배열넘기기 Ex = new Ex05_06_02_배열넘기기();

		Ex.sub3(arr);	
		
	}	// main end
	
	void sub3(int[][] x)
	{
	
		int i,j;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
			System.out.print(x[i][j] + " ");
			}
			
			System.out.println();
		}
		System.out.println();

		for(int[] t : x)						// 확장포문
		{
			for(int q : t)
			{
				System.out.print(q + " ");
			}
		System.out.println();
		}
			
	}

}
