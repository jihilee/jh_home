class Stu{
	
	String name;
	int kor;
	int eng;
	
	Stu()	// default������
	{
		this.name="�輼��";
		this.kor = 90;
		this.eng = 80;
	}
	Stu(String name)	// �Ű������� �ִ� �����ڰ� ��������ٸ� ����Ʈ�����ڴ� �ڵ����� ��������� �ʴ´�.
	{
		this.name = name;
		this.kor = 77;
		this.eng = 33;
	}
	Stu(String name, int kor, int eng)
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	void display() 
	{
		System.out.println(name + "," + kor + "," + eng);
	}
	
}//Stu end

public class Ex05_17_��ü�迭 
{
	public static void main(String[] args) 
	{
		//int[] arr = {10,20,30};
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		Stu s1 = new Stu();
		Stu s2 = new Stu("����");
		Stu s3 = new Stu("����",60,80);		//	int a=10,b=20,c=30�� ���� ���

		s1.display();
		s2.display();
		s3.display();
		
		
		System.out.println("-------");
		
		//Stu[] arr2 = {new Std(), new Stu("����"), new Stu("����",60,80)};
		
		Stu[] arr2 = new Stu[3];
		arr2[0] = new Stu();
		arr2[1] = new Stu("����");
		arr2[2] = new Stu("����",60,80);
		
		int i;
		for(i=0;i<arr2.length;i++)
		{
			arr2[i].display();
		}
		
	}

}
