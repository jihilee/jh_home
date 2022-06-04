import java.util.HashMap;
import java.util.Scanner;

class Student{
	private String school;
	private int java;
	
	public Student() {	
		super();
	}
	public Student(String school, int java) {	//ctrl+shift+s
		super();
		this.school = school;
		this.java = java;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public String toString()
	{
		return school + "/" + java; 
	}
	
}//class Student

public class Ex09_11_HashMap {

	public static void main(String[] args) {

		String name, school, retry,search_name;
		int java;
		boolean flag;
		
		HashMap<String,Student> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("�̸� : ");
			name = sc.next();
			System.out.print("�б� : ");
			school = sc.next();
			System.out.print("�ڹ� : ");
			java = sc.nextInt();
			
			Student s = new Student(school,java);	//student��ü�����****
			
			hm.put(name, s);		//***map���� ���� �߰��Ϸ��� put***
			
			System.out.println("���?");
			retry = sc.next();
			if(retry.equals("n"))
				break;

		}while(true);
		
		System.out.println(hm);
	
		do {//Ű�� �Է��ϸ� ������ ������ �ϴ� ��
			System.out.println("ã�� �̸�?");
			search_name = sc.next();

			if(hm.get(name)==null)
			{
				System.out.println("ã�� �̸� ����");
			}
			else
			{
				System.out.println(name + "�� �б�/������ " + hm.get(name) + " �Դϴ�.");
			}
			System.out.println("���?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
			
		}while(true);
	
	
	
	}

}
