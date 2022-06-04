//import java.util.Scanner;
//
//class Person{
//	String id;
//	String pw;
//	String name;
//
//	Person()
//	{
//		
//	}
//	Person(String id, String pw, String name)
//	{
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
//	}
//
//}//class person
//public class Ex08_04_teacher {
//
//	
//	String id;
//	String pw;
//	String name;
//	String retry; 
//	int i;
//	
//	Person[] p = {new Person("kim","1234","김연아"),
//				  new Person("son","7777","손흥민"),
//				  new Person("jang","9876","장미란")};
//	
//	Scanner sc = new Scanner(System.in);
//	
//	boolean flag = false;	//t or f
//	
//	do {
//		flag=false;
//		System.out.println("id 입력 > ");
//		id =sc.next();
//		
//		if(id.length()<3 || id.length()>8)
//		{
//			System.out.println("id는 3~8글자로 입력하세요.");
//			continue;	//조건식으로 감
//		}
//		System.out.println("pw 입력 > ");
//		pw =sc.next();
//		
//		for(i=0;i<p.length;i++)
//		{
//			if(p[i].id.equals(id))
//			{
//				if(p[i].pw.equals(pw))
//				{
//					System.out.println(p[i].name + "님 반갑습니다.");
//					flag = true;	//찾았으니 초가화된 값과 반대로 변함
//					break;	//1번방에서 결과값을 찾았으면 다른 방은 비교할 필요 없다. 실행속도 단축
//				}
//				else	//pw가 일치하지 않을 때
//				{
//					System.out.println("pw를 다시 확인하세요.");
//					flag = true;
//				}
//			}
//		}//for
//		
//		if(flag==false)
//		{
//			System.out.println("해당 아이디가 없습니다.");
//		}
//		
//		
//		System.out.println("계속 하시겠습니까? > ");
//		retry =sc.next();
//		if(retry.equals("n"))
//		{
//			break;	//while문 빠져나갈 때
//		}
//		
//	}while(true);
//	
//}
