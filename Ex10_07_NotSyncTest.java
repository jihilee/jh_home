class Data2{
	int i;	//i = 공유자원, 동기화필요
	
}
class AAA2 extends Thread {
	public void run() {
		for(int i=0;i<100000;i++)
		{
			synchronized(Ex10_07_NotSyncTest.d1) {
				Ex10_07_NotSyncTest.d1.i++;	//임계영역:공유자원이 사용되는 자리}
				}
		}
			System.out.println("AAA_i : " + Ex10_07_NotSyncTest.d1.i);
	}
	
}
class BBB2 extends Thread {
	public void run() {
		for(int i=0;i<100000;i++)
		{
			synchronized(Ex10_07_NotSyncTest.d1) {
				Ex10_07_NotSyncTest.d1.i++;	//임계영역:공유자원이 사용되는 자리}
				}
		}
		System.out.println("BBB_i : " + Ex10_07_NotSyncTest.d1.i);
	}
}
public class Ex10_07_NotSyncTest {
	
	static Data2 d1 = new Data2();
	
	public static void main(String[] args) {

		System.out.println("main 시작");
		
		AAA2 a = new AAA2();
		BBB2 b = new BBB2();
		
		a.start();
		b.start();
		
		System.out.println("main 종료");
		
	}

}

//동기화 : 다른 런메서드를 막아주는 작업, run()안의 synchronized블록처리 : 반복하는 도중에만 동시에 접근 못하게 함