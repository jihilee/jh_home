class Data1{
	int i;	//instance������ �ڵ�0���� �ʱ�ȭ��
	
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

		System.out.println("main ����");
		
		AAA a = new AAA();
		BBB b = new BBB();
		
		a.start();
		b.start();
		
		System.out.println("main ����");
		
	}

}
//����ý��ۿ��� �������� �ʴ�.
//���¿��� ���ÿ� ����� �� ������ �����
