class Car2{
	String color="White";
	int door = 4;
	void drive()
	{
		System.out.println("~drive~");
	}
	void stop()
	{
		System.out.println("stopp!!!!");
	}
}//car2

class FireEngine extends Car2{
	int door = 6;
	int wheel = 10;
	
	void drive()	// overriding
	{
		System.out.println("~FEdrive~");
	}
	void water()	
	{
		System.out.println("*water*");
	}
}//FireEngine

public class Ex06_08_������ {
	public static void main(String[] args) {
		
	double x=2.2;
	int y = 1,z;
	
	x = (double)y;	// x=y; ���� ���� ū �׸��� ���� ���� �ڷ��� ��������
	z = (int)x;		// ��� �׸� ������� ������ȯ �ʿ�
	
	Car2 c = new Car2();
	FireEngine f = new FireEngine();
	FireEngine f2 = null;
	
	f.water();
	f.drive();		// �ڽ��� drive�� �켱
	System.out.println(f.door);
	System.out.println(f.color);	// �ڽ� ���� ������ �θ� ���� ���
//	System.out.println(c.Wheel);	//	�ڽ��� ���� �θ� ����� �� ����. 
	
	System.out.println();
	c=f;		// ��Ӱ����� Ÿ���� �޶� ���� 
				// == Car2 c = new FireEngine();
	//c=(Car2)f; �ڽİ�ü�� �θ� Ÿ���� ������ ���� �� �θ�Ÿ�Կ� �������
				// =��ĳ�����ߴ� ��� ��, �ڵ��̰� ���� ������
	
	System.out.println(c.color);	
	System.out.println(c.door);		//������ �θ𳻿� ���
	
	c.drive();		
	c.stop();		//�޼ҵ�� �ڽĳ��� ���
	//c.water();  <-����	//�θ𺯼��� �ڽİ����� �ּҸ� ������ ���� �� �ڽ� �޼��尡 ȣ�������
						// �θ� ������ �ִ� ���� Ȯ���� �Ǿ�� �ڽ��� �޼��尡 ȣ��ȴ�
	
	
	System.out.println();
	if(c instanceof FireEngine)		// c������ FireEngine�� ������ �� �ֳ�
	{	
		System.out.println("�ٿ�ĳ���� ����");
	}
	else
		System.out.println("�ٿ�ĳ���� �Ұ���");
	
	System.out.println();
	f2 = (FireEngine)c;		// �θ�Ÿ���� �������� �ڽ�Ÿ�Կ� �ִ´�.
							// downcasting �ڵ��̾ƴϴ�. �ݵ�� ������Ѵ�.
	
	System.out.println(f2.door);//�ڱ�����
	System.out.println(f2.color);//�θ�Ͱ����پ�
	
	f2.drive();
	f2.stop();
	
	}//static - main end
}//public class end

// ������(polymorphism):�θ��ڽİ��迡�� �ϳ��� ��ü�� ���� Ÿ���� ��ü�� ������ �� �ִ� ��
//					  ���ɽ����� �� ���� �־�� �ٿ��ɽ����� �� �� �ִ�
