class Sports
{
	String name;
	int inwon;
	
	Sports()
	{
		name = "�߱�";
		inwon = 9;
	}
	Sports(String name, int inwon)
	{
		this.name = name;
		this.inwon = inwon;
	}
	void display() // �ż��� �����
	{
		System.out.println("name : " + name);
		System.out.println("inwon : " + inwon);
	}
}// sports class end

class Baseball extends Sports		// class �ڽ�Ŭ����(=�ڼ�, ����Ŭ����) extends �θ�Ŭ����(=����, ���� Ŭ����)
{
//	String name;		// sports�� ������ �ִ� �����̱� ������ extends Sports�� �߰��� �ۼ������ν�
//	int inwon;			   �ߺ��ؼ� �ۼ����� �ʰ� sports���� ��ӹ޴´�
	double ta;
	
	Baseball(String name, int inwon, double ta)
	{
		super(name, inwon);		// �����ڿ��� �����Ѵ�. �������� ù�ٿ� ���� �������� �ʾƵ� �ڵ����� ȣ��Ǿ��ִ�. �θ��� �����ڸ� ȣ���ϴ� �ڵ��̴�.
//		this.name = name;
//		this.inwon = inwon;
		this.ta = ta;
	}
	void display() // method overriding , �θ�� �ڽ��� ���� �����̴�(�����߿�ʴ�), ����ΰ� ���� = �޼���������̵�
	{			   // method overloading ,  �ϳ��� Ŭ���� �ȿ� ���� �̸��� �޼��尡 �����ϴ� ��, �޼����� Ÿ���̳� ������ ����
//		System.out.println("name : " + name);		
//		System.out.println("inwon : " + inwon);
		
		super.display();	// �θ� ������ �ִ� display�� ȣ��
		System.out.println("ta : " + ta);
	}
}// baseball class end

class Football extends Sports	// SportsŬ������ name�� inwon�� ��ӹ���
{
	int goal;
	
	Football(String name, int inwon, int goal) 
	{	
		super(name, inwon);
//		this.name = name;
//		this.inwon = inwon;
		this.goal = goal;
	}
	void display()
	{
//		System.out.println("name : " + name);		
//		System.out.println("inwon : " + inwon);
		super.display();
		System.out.println("goal : " + goal);
	}
}// football class end

class Basketball extends Sports
{
	int shoot;
	
	Basketball(String name, int inwon, int shoot)
	{
		super(name, inwon);
		this.shoot = shoot;
	}
	void display()
	{
		super.display();	// �θ𺯼�, �޼��� ������ �� super. ���
		System.out.println("shoot : " + shoot);
	}
}// class basketball end
 // �� �θ�� ���� �ڽ��� ���� �� �ִ�. �θ�� �ڽ�Ŭ������ ���� ������ ����� �� ����.

public class Ex06_01_��� 
{
	public static void main(String[] args) 
	{
		Sports s1 = new Sports();	//�߱�, 9
		Sports s2 = new Sports("�౸", 11);
		
		s1.display();
		System.out.println("-----");
		
		s2.display();
		System.out.println("-----");
		System.out.println();
		
		
		Sports bb = (Sports) new Baseball("�߱�", 5, 0.345);		// upcasting �ڽ��� �θ� Ÿ���� ������ �ڵ� ���ɽ��õ�
		bb.display();											// ���� ������ Sports�� �ٲٸ� �������� �����־�� �Ѵ� =>��ĳ����, ��������
		System.out.println("-----");
		
		Football fb = new Football("�౸", 7, 3);
		fb.display();
		System.out.println("-----");
		
		Basketball sb = new Basketball("��", 5, 30);
		sb.display();
		System.out.println("===========");
		
		
		Sports[] arr = {new Baseball("�߱�", 5, 0.345), 
						new Football("�౸", 7, 3),
						new Basketball("��", 5, 30)};
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i].display();
			System.out.println("-----");
		}
	}

}
// super() : �θ� �����ڸ� ȣ���ϴ� �ڵ�, �Ƚᵵ �⺻������ ����. �����Ұ�, ������ ù�ٿ��� ����
// super.  : �θ��� ����, �޼��忡 ������ �� ���