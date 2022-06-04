class Horizontal extends Thread{
	public void run()
	{
		for(int i=0;i<300;i++)
		{
			System.out.print("-");
			if(i%50==0)
				System.out.println();
		}
	}
}
class Vertical extends Thread{
	public void run()
	{
		for(int i=0;i<300;i++)
		{
			System.out.print("|");
			if(i%50==0)
				System.out.println();
		}
	}
}
public class Ex10_04_Thread {
	public static void main(String[] args)
	{
		System.out.println("시작");
		
		Horizontal h = new Horizontal();
		Vertical v = new Vertical();
		
		h.start();
		v.start();
		
		System.out.println("h.getPriority : " + h.getPriority());	//우선순위
		System.out.println("v.getPriority : " + v.getPriority());	//순위지정 없으면 5순위
		h.setPriority(7);	//숫자가 클수록 우선순위가 높다 (1~10)
		System.out.println("h.getPriority : " + h.getPriority());
		System.out.println("종료");
	}
}
//setPriority() : 순위를 지정하면 높은 순위대로 먼저 나올 가능성이 높다
//상담채팅 프로그램을 만들 때 사용된다, 동시다발적으로 프로그램을 돌려야 할 때 사용자에 대한 응답성을 향상시킬 수 있다