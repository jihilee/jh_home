import java.util.Scanner;
class Person{
	
	String id;
	String pw;
	String name;

	Person()
	{
		
	}
	Person(String id, String pw, String name)
	{
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

}//class person
public class Ex08_04_이지희 {

	public static void main(String[] args) {
		
//		Person[] p = {new Person("kim","1234","김연아"),
//					  new Person("son","7777","손흥민"),
//					  new Person("jang","9876","장미란")};
		
		Person[] p = new Person[3];
		p[0] = new Person("kim","1234","김연아");
		p[1] = new Person("son","7777","손흥민");
		p[2] = new Person("jang","9876","장미란");
		
		
		Scanner sc =  new Scanner(System.in);

		while(true)
		{
			System.out.println("id와 pw를 입력하세요.");
			
			System.out.print("id입력 > ");
			String loginId = sc.next().trim();
			if(loginId.length()<3 || loginId.length()>8)
			{
				System.out.println("id는 3~8글자로 입력하세요.");
				continue;
			}
			System.out.print("pw입력 > ");
			String loginPw = sc.next().trim();

			System.out.println("----------");
			
			boolean flag = true;	//************
			int i;
			
			for(i=0;i<p.length;i++)
			{
				if(loginId.compareTo(p[i].id) == 0 && loginPw.compareTo(p[i].pw) == 0)
				{
					System.out.println(p[i].name + "님 반갑습니다.");
					System.out.println();
					flag = false;
				}
				else if(loginId.compareTo(p[i].id) == 0 && loginPw.compareTo(p[i].pw) != 0)
				{
					System.out.println("비밀번호가 맞지 않습니다.");
					System.out.println();
					flag = false;
				}
			}//for
			
			if(flag = true)	// 해당 아이디가 없습니다 문구가 매번 반복되어 나오는 것을 방지하기 위해
			{					// id가 틀렸을 시 한번만 출력될 수 있게 boolean형의 flag변수를 사용한다.
				System.out.println("해당 아이디가 없습니다.");
				System.out.println();
			}
			
			System.out.println("계속 하시겠습니까?");
			System.out.println("계속 : y | 종료 : n");
			String c = sc.next();
			
			if(c.equals("y") == true)
			{
				System.out.println();
				System.out.println("로그인을 시도합니다.");
				continue;
			}
			else if(c.equals("n") == true)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
		
	}//main

}//class
