class Big implements Runnable{

	public void run() {

		for(char c=65;c<=90;c++)	//for(char i='A';i<='Z';i++)
		{
			System.out.print(c + " ");
			try {
				Thread.sleep(1000);//1000�� 1��, Tread,sleep(1000):1�ʵ��� ������ �޼ҵ�
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
		
		System.out.println("���α׷� ����");
		
		Big a = new Big();
		Thread trd1 = new Thread(a);
		trd1.start();
		
		Small s = new Small();	//thread���� ��ӹ޾ұ� ������ thread��ü�� ���� �ʿ䰡 ����.
		s.start();
		
		System.out.println("���α׷� ����");

	}

}
//static -> class�̸����� ������ �� �ִ�