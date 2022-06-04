class DaemonTest extends Thread{
	public void run()
	{	
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(Ex10_05_���󽺷���.autoSave) {
				autoSave();
			}
		}//while	
	}//run

	private void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
		
	}
		
}//Daemon
public class Ex10_05_���󽺷��� {
	
	static boolean autoSave = false;

	public static void main(String[] args) {

		DaemonTest t = new DaemonTest();
		t.setDaemon(true);	//���޼ҵ带 �����̶� ����
		t.start();	//������ ���޼��� ����
			
		for(int i=1;i<=20;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			System.out.println(i);
			if(i==5)
			autoSave = true;	//5���ĺ��� ��� true
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
//���󽺷��� : �ֽ����忡 �������� ������ �ϴ� ������
//autosave : ���س��� �ð��� ���� �ڵ�����Ǵ� ���α׷�, �ڵ�����Ǵ� �ý���-���󽺷���
//�� �����尡 ������ ���󽺷��嵵 ���� ������