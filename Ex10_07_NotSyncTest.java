class Data2{
	int i;	//i = �����ڿ�, ����ȭ�ʿ�
	
}
class AAA2 extends Thread {
	public void run() {
		for(int i=0;i<100000;i++)
		{
			synchronized(Ex10_07_NotSyncTest.d1) {
				Ex10_07_NotSyncTest.d1.i++;	//�Ӱ迵��:�����ڿ��� ���Ǵ� �ڸ�}
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
				Ex10_07_NotSyncTest.d1.i++;	//�Ӱ迵��:�����ڿ��� ���Ǵ� �ڸ�}
				}
		}
		System.out.println("BBB_i : " + Ex10_07_NotSyncTest.d1.i);
	}
}
public class Ex10_07_NotSyncTest {
	
	static Data2 d1 = new Data2();
	
	public static void main(String[] args) {

		System.out.println("main ����");
		
		AAA2 a = new AAA2();
		BBB2 b = new BBB2();
		
		a.start();
		b.start();
		
		System.out.println("main ����");
		
	}

}

//����ȭ : �ٸ� ���޼��带 �����ִ� �۾�, run()���� synchronized���ó�� : �ݺ��ϴ� ���߿��� ���ÿ� ���� ���ϰ� ��