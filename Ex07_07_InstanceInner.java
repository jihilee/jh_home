class Car2 {
	Car2name name;
	String color;

	class Car2name {
		String model; 
		int year;
		Car2name(String model, int year) {
			this.model = model;
			this.year = year;
		}

		Car2name(String model, int year, String col) {
			this.model = model;
			this.year = year;
			color = col; 		//car2name���忡�� ���� �� color�� ��������� �ƴϱ� ������ this�� �������ʴ´�
		}

		void Outcolor() {
			System.out.println("model:"+model+" ����:"+year+" ����:" + color + "�Դϴ�.");
		}
	}// car2 name end -> Ŭ���� �ȿ� ����� Ŭ����
	 // �ܺ� Ŭ������ ���ʿ��� ������ �������ν� ���⼺�� ���δ�

	Car2(String model, int year, String color) {
		name = new Car2name(model,year);
		this.color = color;
	}

	void OutInfo() {
		System.out.printf("�� = %s, ��� = %d, ���� = %s\n",
				name.model, name.year, color);
	}
}// car2 end

public class Ex07_07_InstanceInner {
	public static void main(String[] args) {
		Car2 pride = new Car2("�����̵�", 2005, "�Ķ�");
		pride.OutInfo(); // �� = �����̵�, ��� = 2005, ���� = �Ķ�
		System.out.println();
		
		pride.name.Outcolor(); // model:�����̵� ����:2005 ����:�Ķ��Դϴ�.
		System.out.println();
		
		//Outer.Inner ������ = �ܺΰ�ü.new Inner(������ �μ�)
		Car2.Car2name pride2 = pride.new Car2name("������", 2009);
		pride2.Outcolor(); // model:������ ����:2009 ����:�Ķ��Դϴ�.
		System.out.println();
		
		Car2.Car2name pride3 = pride.new Car2name("���������", 2015,"���");
		pride3.Outcolor(); // model:��������� ����:2015 ����:����Դϴ�.
		System.out.println();
		
		pride.OutInfo(); 
		System.out.println();
		
		pride.name.Outcolor();
		
	}
}
//�ٱ��� Ŭ������ �����Ϸ��� �ٱ��� Ŭ������ ��ü�� ���� �� �޼ҵ峪 ���������� ���� ������ �� �־���
//���� Ŭ������ �����Ϸ��� �ٱ�Ŭ������ ��ü�� ���� ���������� �������Ѵ� 