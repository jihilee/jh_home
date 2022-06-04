class DaemonTest extends Thread{
	public void run()
	{	
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(Ex10_05_데몬스레드.autoSave) {
				autoSave();
			}
		}//while	
	}//run

	private void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
		
	}
		
}//Daemon
public class Ex10_05_데몬스레드 {
	
	static boolean autoSave = false;

	public static void main(String[] args) {

		DaemonTest t = new DaemonTest();
		t.setDaemon(true);	//런메소드를 데몬이라 선언
		t.start();	//데몬인 런메서드 시작
			
		for(int i=1;i<=20;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			System.out.println(i);
			if(i==5)
			autoSave = true;	//5이후부터 계속 true
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
//데몬스레드 : 주스레드에 보조적인 역할을 하는 스레드
//autosave : 정해놓은 시간에 따라 자동저장되는 프로그램, 자동저장되는 시스템-데몬스레드
//주 스레드가 끝나면 데몬스레드도 같이 끝난다