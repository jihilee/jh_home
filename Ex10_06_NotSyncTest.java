class Data1{
	int i;	//instance변수는 자동0으로 초기화됨
	
}
class AAA extends Thread {
	public void run() {
		for(int i=0;i<100000;i++)
		{
			Ex10_06_NotSyncTest.d1.i++;
		}
		
		System.out.println("AAA_i : " + Ex10_06_NotSyncTest.d1.i);
	}
	
}
class BBB extends Thread {
	public void run() {
		for(int i=0;i<100000;i++)
		{
			Ex10_06_NotSyncTest.d1.i++;
		}
		
		System.out.println("BBB_i : " + Ex10_06_NotSyncTest.d1.i);
	}
}
public class Ex10_06_NotSyncTest {
	
	static Data1 d1 = new Data1();
	
	public static void main(String[] args) {

		System.out.println("main 시작");
		
		AAA a = new AAA();
		BBB b = new BBB();
		
		a.start();
		b.start();
		
		System.out.println("main 종료");
		
	}

}
//은행시스템에는 적절하지 않다.
//계좌에서 동시에 출금할 때 문제가 생긴다
