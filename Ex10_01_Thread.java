class AA implements Runnable{	//�������̽� ��ӹ��� �� implements, �̿ϼ��޼���(�߻�޼���) �ϼ����Ѿ���, runnable�� ��ӹ��� Ŭ�������߸� Thread ��밡��
//	void method(){
//		for(int i=1;i<=30;i++)
//			System.out.print(i + " ");
//		System.out.println();
//	}
	public void run() {	//******
		for(int i=1;i<=30;i++)
			System.out.print(i + " ");
		System.out.println();
	}
}//class AA
public class Ex10_01_Thread {

	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		AA a = new AA();
		Thread trd = new Thread(a); 	//java.lang��Ű���� �����ؼ� import�ʿ����
		//Thread trd = new Thread(new AA());
		
		//a.method();
		//a.run();
		trd.start();	//start�� ȣ���ϸ�, run�޼��尡 ��µȴ�	
		
		System.out.println("���α׷� ����");

	}

}
//������ �ΰ��� �޼��带 ������ ���� �� thread���
//���θ޼���� ���޼��尡 ���ÿ� ���ư���. ���� ����� ���� ������� ���� �ʴ´�