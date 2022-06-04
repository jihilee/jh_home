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
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot 
{
	void sing() 
	{
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot 
{
	void draw() 
	{
		System.out.println("그림을 그립니다.");
	}
}

public class Ex06_09_다형성 
{
	public static void action(Robot r) 	//<-각 로봇 객체의 주소
	{	//Robot r= (Robot) new DanceRobot();
		//Robot r= new SingRobot();
		//Robot r= new DrawRobot();			<-upcasting
		
//		r.dance();
//		r.sing();
//		r.draw();
		
		if(r instanceof DanceRobot) 
		{
			DanceRobot dr = (DanceRobot)r ;		// dr : 100번지
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
	
	public static void main(String[] args) //무조건 MAIN먼저 
	{ 
		//Robot a = new DanceRobot();
		Robot[] arr = { new DanceRobot(), 	//100번지
						new SingRobot(),  	//200번지
						new DrawRobot() }; 	//300번지
		
//		arr[0].dance();	
//		arr[1].sing();	// *****************************
//		arr[2].draw();	// 이들을 호출하고 싶으면 부모 클래스에도 해당 메소드가 존재해야 함 
		
		System.out.println();
		for(int i=0; i< arr.length; i++)	// i=0 / 1
			action(arr[i]);
		
	} // main end
}// public class end