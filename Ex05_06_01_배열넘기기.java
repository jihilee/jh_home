
public class Ex05_06_01_배열넘기기 
{
	public static void main(String[] args) 
	{
		
		int a=1, b=2, c=3;
		sub(a,b,c);
		
		int[] arr = {1,2,3};
		

//		System.out.println();
//		sub();
		
		Ex05_06_01_배열넘기기 ex = new Ex05_06_01_배열넘기기();
		ex.sub2(arr[0], arr[1], arr[2]);
		
		ex.sub3(arr);
	}	// main end
	
	static void sub(int x, int y, int z)
	{
		System.out.println("sub method");
		System.out.println(x + "," + y + "," + z);
		//return; 반환값은 없지만 main으로 돌아감
	}
	
	void sub2(int i, int j, int k)				//static 붙여도 됨
	{
		System.out.println("sub2 method");
		System.out.println(i + "," + j + "," + k);
	}
	
	void sub3(int[] x)			// int[] x = {1,2,3};
	{
		System.out.println("sub3 method");

		for(int t : x)						// 확장포문
			{System.out.print(t + " ");}
		System.out.println();
		
		int i;
		for(i=0;i<x.length;i++)
			{System.out.print(x[i] + " ");}
		System.out.println();
	}

}
