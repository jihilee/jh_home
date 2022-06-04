class Horizontal extends Thread{
	public void run()
	{
		for(int i=0;i<300;i++)
		{
			System.out.print("-");
			if(i%50==0)
				System.out.println();
		}
	}
}
class Vertical extends Thread{
	public void run()
	{
		for(int i=0;i<300;i++)
		{
			System.out.print("|");
			if(i%50==0)
				System.out.println();
		}
	}
}
public class Ex10_04_Thread {
	public static void main(String[] args)
	{
		System.out.println("����");
		
		Horizontal h = new Horizontal();
		Vertical v = new Vertical();
		
		h.start();
		v.start();
		
		System.out.println("h.getPriority : " + h.getPriority());	//�켱����
		System.out.println("v.getPriority : " + v.getPriority());	//�������� ������ 5����
		h.setPriority(7);	//���ڰ� Ŭ���� �켱������ ���� (1~10)
		System.out.println("h.getPriority : " + h.getPriority());
		System.out.println("����");
	}
}
//setPriority() : ������ �����ϸ� ���� ������� ���� ���� ���ɼ��� ����
//���ä�� ���α׷��� ���� �� ���ȴ�, ���ôٹ������� ���α׷��� ������ �� �� ����ڿ� ���� ���伺�� ����ų �� �ִ�