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

//class Math{					// ���� ������� �̹� ��������ִ� class�̴� 

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
		int result = Math.max(a,b);		//math class�� �ۼ����� �ʾƵ� �ڹٸ� ���� ������� �̹� ���������� �������ұ� ������ ȣ�⸸���ε� ��� �����ϴ�/
		
		System.out.println("result : " + result);
		
		System.out.println(Math.max(1.2, 3.4));
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));		//���밪�� ȣ���� �� �ڸ��� �ٷ� ���
		System.out.println(Math.min(130, 40));	//min �޼ҵ� ȣ�� �ٽ� �� �ڸ��� ���
		
		System.out.println(Math.pow(3, 4));		//�ŵ����� �Ǽ������� ���, 81.0
		
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
