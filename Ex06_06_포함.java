class Per
{
	String name;
	int age;
	
	Per()
	{
		//�Ű����� ���� ����Ʈ ������
	}
	Per(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}//per

class Stu
{
	int kor, eng, math;
//	String name;
//	int age;
	Per p;		//Per��ü ����
	
	Stu(String name, int age, int kor, int eng, int math)
	{
		
		//************************
		//p = new Per(name,age);	//Per�� �ּҰ� p�� ��(�ʱ�ȭ1�����)
		
		p = new Per();				//�Ű����� ���� �����ڸ� ������ ��
		p.name = name;
		p.age = age;				//Per�� �����ϴ� ���� name�� age�� �����Ƿ� p.~���� �ۼ�(�ʱ�ȭ2�����)
		
		//**************************
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}//stu�����ڳ�

	void display()
	{		
		System.out.println(p.name);			//������� p ���
		System.out.println(p.age);			//Per���� display()�޼��� ����
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
	}//stu void display ��
}//Stu

public class Ex06_06_���� {
	public static void main(String[] args) {

		//Per p = new Per();
		Stu s = new Stu("kim",25,70,80,90);
		
		System.out.println(s.p.name);		//�������� s ���
		System.out.println(s.p.age);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
		
		System.out.println("========");
		s.display();

	}

}
