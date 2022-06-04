interface RemoteControl{
	void turnOn();
	void turnOff();
}//interface

class Tv implements RemoteControl{
	
	public void turnOn()
	{
		System.out.println("tv�� �Ҵ�.");
	}
	public void turnOff()
	{
		System.out.println("tv�� ����.");
	}
}//Tv

public class Ex07_09_�͸�Ŭ���� {
	public static void main(String[] args) {
		//new RemoteControl(); ��ü���� �Ұ���
		
		Tv t = new Tv();
		
		t.turnOn();
		t.turnOff();
		System.out.println();
		
		RemoteControl rc = new RemoteControl()
		{
			public void turnOn()
			{
				System.out.println("tv�� �Ҵ�.");
			}
			public void turnOff()
			{
				System.out.println("tv�� ����.");
			}	//�̿ϼ��޼ҵ� �ΰ� �ϼ�
		};	//��ü���� ��
		
		rc.turnOn();
		rc.turnOff();	//�͸�Ŭ������ ��ü�����
	}

}

//�������̽��� �߻�Ŭ������ ������ ���� ���� �ʿ�
//interface : ���߻��, �̿ϼ��޼ҵ常 ����. �տ� abstract public�� �ڵ����� �ٴ´�
//final������ �ִ�
//��ӹ޴� Ŭ�������� implements�� �޴´�
//��ü���� �Ұ����ϴ�
//�߻�Ŭ���� : �̿ϼ��� Ŭ������ �ϼ��ϱ� ���ؼ� ���
//��ӹ��� Ŭ�������� �ݵ�� �ʿ��� �޼��尡 �ִٸ� �θ�Ŭ������ �߻�޼��带 �������� ���..?