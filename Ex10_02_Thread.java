class BB extends Thread{	//Ŭ���� BB�� Thread��� Ŭ������ ��ӹ޴´�
							//thread�� �����ִ� �޼��� �� start�� ����
	public void run() {	//******
		for(int i=1;i<=30;i++)
			System.out.print(i + " ");
		System.out.println();
	}//run
}//BB

public class Ex10_02_Thread {
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		BB b = new BB();
		b.start();		//***start()****threadŬ������ ������ start�޼��� 
		//run()�� ������� ����ϰ����� start()�� Thread�� ������ �޼����̱⶧���� ���ÿ� ���ư���.
		System.out.println("���α׷� ����");
	}

}
