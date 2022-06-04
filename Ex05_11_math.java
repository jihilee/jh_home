//class Calc{
//				static int max(int x, int y)
//				{
//				if(x>y)
//					return x;
//				else if(y>x)
//					return y;
//				else
//					return 1;
//				 }//max end
//}

//class Math{					// 같은 모양으로 이미 만들어져있는 class이다 

//	static int max(int x, int y)
//	{
//		 if(x>y)
//			 return x;
//		 else if(y>x)
//			 return y;
//}


public class Ex05_11_math 
{
	public static void main(String[] args) 
	{
		int a=130, b=40;
		//int result = max(a,b);
		
//		Calc c = new Calc();
//		int result2 = c.max(a,b);
		
		//int result2 = Calc.max(a,b);		//*****
		int result = Math.max(a,b);		//math class를 작성하지 않아도 자바를 만든 사람들이 이미 내부적으로 만들어놓았기 때문에 호출만으로도 사용 가능하다/
		
		System.out.println("result : " + result);
		
		System.out.println(Math.max(1.2, 3.4));
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));		//절대값을 호출한 이 자리로 바로 출력
		System.out.println(Math.min(130, 40));	//min 메소드 호출 다시 이 자리로 출력
		
		System.out.println(Math.pow(3, 4));		//거듭제곱 실수형으로 출력, 81.0
		
		double result2 = Math.pow(3,4);
		System.out.println(result2);
		
//		System.out.println("result : " + result);
	}//main end

//	static int max(int x, int y)
//	{
//		 if(x>y)
//			 return x;
//		 else if(y>x)
//			 return y;
//		 else
//			 return 1;
//	 }//max end
	
}//class end
