import java.util.ArrayList;
import java.util.Scanner;

class Person extends Object{
	public static Object[] list;
	private String id;
	private String pw;
//	public static toString()
//	{
//		//주소리턴
//	}
	
	public String toString()
	{
		return id + ":" + pw;
	}
	public Person(String id,String pw)	
	{
		this.id = id;
		this.pw = pw;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return id;
	}
	public void setPw(String pw)
	{
		this.pw = pw;
	}
	public String getPw()
	{
		return pw;
	}
}//class person end

public class Ex09_03_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();	//내가 만든 Person 객체를 ArrayList에 넣을 수 있다
															
		Person p1 = new Person("kim","1234");
		Person p2 = new Person("park","7777");
		//Person p3 = new Person("choi","9876");
		
		list.add(p1);	//String, Integer를 넣으면 오류
		list.add(p2);
		list.add(new Person("choi","9876"));
		
		System.out.println("list.size() : " + list.size());
		System.out.println();
		
		System.out.println("list : " + list);
		System.out.println("list.toString() : " + list.toString());	
		//Person의 toString리턴 = 주소리턴(Object) 상속받은 toString 사용하기 싫음
		//그래서 class Person에 오버라이딩으로 아이디와 패스워드를 출력할 수 있는 String toString() 생성
		
		System.out.println();
		System.out.println("---------");
		
		for(int i=0;i<list.size();i++)
		{
			Person p = list.get(i);
			//System.out.println(p);
			System.out.println("<한번에 출력>");
			System.out.println(p);
			System.out.println("---------");
			System.out.println("<따로출력>");
			System.out.println("id : " + p.getId());
			System.out.println("pw : " + p.getPw());
			System.out.println("---------");
		}
		
		System.out.println();
		System.out.println("======================");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id입력 > ");
		
		String id =  sc.next();
		boolean flag = true;
		for(int i=0;i<list.size();i++)
		{
			Person p = list.get(i);
			if(id.equals(p.getId()))
			{
				System.out.println(id + "님의 비밀번호는 " + p.getPw() + "입니다.");
				flag = false;
			}
		}
		if(flag==true)
		{
			System.out.println("없는 아이디입니다.");
		}
	}

}
