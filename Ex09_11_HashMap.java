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
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("학교 : ");
			school = sc.next();
			System.out.print("자바 : ");
			java = sc.nextInt();
			
			Student s = new Student(school,java);	//student객체만들기****
			
			hm.put(name, s);		//***map에서 내용 추가하려면 put***
			
			System.out.println("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;

		}while(true);
		
		System.out.println(hm);
	
		do {//키를 입력하면 벨류가 나오게 하는 것
			System.out.println("찾는 이름?");
			search_name = sc.next();

			if(hm.get(name)==null)
			{
				System.out.println("찾는 이름 없음");
			}
			else
			{
				System.out.println(name + "의 학교/점수는 " + hm.get(name) + " 입니다.");
			}
			System.out.println("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
			
		}while(true);
	
	
	
	}

}
