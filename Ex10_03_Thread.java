class Big implements Runnable{

	public void run() {

		for(char c=65;c<=90;c++)	//for(char i='A';i<='Z';i++)
		{
			System.out.print(c + " ");
			try {
				Thread.sleep(1000);//1000은 1초, Tread,sleep(1000):1초동안 잠재우는 메소드
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		System.out.println();
	}
}//big
class Small extends Thread{

	public void run() {

		for(char c=97;c<=122;c++)
		{
			System.out.print(c + " ");
			try {
				sleep(500);	// = Thread.sleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}//small
public class Ex10_03_Thread {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Big a = new Big();
		Thread trd1 = new Thread(a);
		trd1.start();
		
		Small s = new Small();	//thread에게 상속받았기 때문에 thread객체를 만들 필요가 없다.
		s.start();
		
		System.out.println("프로그램 종료");

	}

}
//static -> class이름으로 접근할 수 있다