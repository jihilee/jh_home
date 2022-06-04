class Robot 
{
//	void dance() {
//		
//	}
//	void sing() {
//		
//	}
//	void draw() {
//		
//	}
}
class DanceRobot extends Robot 
{
	void dance() 
	{
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot 
{
	void sing() 
	{
		System.out.println("�뷡�� �մϴ�.");
	}
}
class DrawRobot extends Robot 
{
	void draw() 
	{
		System.out.println("�׸��� �׸��ϴ�.");
	}
}

public class Ex06_09_������ 
{
	public static void action(Robot r) 	//<-�� �κ� ��ü�� �ּ�
	{	//Robot r= (Robot) new DanceRobot();
		//Robot r= new SingRobot();
		//Robot r= new DrawRobot();			<-upcasting
		
//		r.dance();
//		r.sing();
//		r.draw();
		
		if(r instanceof DanceRobot) 
		{
			DanceRobot dr = (DanceRobot)r ;		// dr : 100����
			dr.dance();							// <- downcasting
		} 
		else if(r instanceof SingRobot) 
		{
			SingRobot sr = (SingRobot)r ;
			sr.sing();
		} 
		else if(r instanceof DrawRobot) 
		{
			DrawRobot dr = (DrawRobot)r ;
			dr.draw();
		}
		return;	//******
	}
	
	public static void main(String[] args) //������ MAIN���� 
	{ 
		//Robot a = new DanceRobot();
		Robot[] arr = { new DanceRobot(), 	//100����
						new SingRobot(),  	//200����
						new DrawRobot() }; 	//300����
		
//		arr[0].dance();	
//		arr[1].sing();	// *****************************
//		arr[2].draw();	// �̵��� ȣ���ϰ� ������ �θ� Ŭ�������� �ش� �޼ҵ尡 �����ؾ� �� 
		
		System.out.println();
		for(int i=0; i< arr.length; i++)	// i=0 / 1
			action(arr[i]);
		
	} // main end
}// public class end