
class Person{
				String name;
				int age;
				double height;							// �������, instance����
				static String nation;		// static����, class���� : ���� ��ü�� �����Ͽ� ����� �� static�� ���δ�.
				
				Person() 
				{//Person ������ ����, ��ҹ��ڱ���
					System.out.println("Person ������");	//������ -> ��ü�� ����� �ڵ����� ȣ��ȴ� ȣ���ϴ¸�ŭ(p1, p2 2��)
				}
			}
//class = ����� ���� �ڷ��� = ������ �ٸ� �����͸� ���� �� �ִ�.


public class Ex05_01_Ŭ���� 
{
	public static void main(String[] args) 
	{
//		String name = "������";
//		int a = 1;
//		double b = 3.14;
//		char c = 'X';		// java������ 2byte�� �������� �ٸ� ������ �ٸ� ũ���� �� �ִ�
		
		Person p1 = new Person();	// ���� ���� Ŭ������ ������ ����� ���� �� new Ŭ������(); �ʿ�
									// p1 - ��������, class Person�� ��� ��������� p1 �ȿ��� �ּҰ� ����
									// Person ��ü ������ = new Person(); ���� = instance
		p1.name = "����";
		p1.age = 30;
		p1.height = 175.1;			// ��������.�������	
		
		System.out.println(p1);
		System.out.println(p1.toString());	//�ּҸ���
		
		System.out.println("--------------");
		
		Person p2 = new Person();
		
		p2.name = "����";
		p2.age = 27;
		p2.height = 171;
		
		Person.nation = "���ѹα�";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p1.height);
		System.out.println(p2.height);
		
		System.out.println(p1.nation);
		System.out.println(p2.nation);		// static
		System.out.println(Person.nation);	// �ַ� class �̸����� �����Ѵ�.
	}

}

//Ŭ���� == ����� ���� �ڷ���
//��ü == instance
