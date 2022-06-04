import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	public Card() {
		super();
	}
	public Card(String name, String tel) {
		//super();
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String toString()
	{
		return name + "\t" +  tel;
	}
	
}//card

public class Ex09_05_명함관리 {
	public static void main(String[] args)
	{
		ArrayList<Card> a = new ArrayList<Card>(); 
		Scanner sc =  new Scanner(System.in);
		int select_num = 0;
		int i;
		String retry, name, tel;
		boolean flag=true;
		
		while(true)
		{
			System.out.println("<번호를 입력하세요>");
			System.out.println("1.명함 추가 | 2.명함삭제 | 3. 명함수정 | 4.명함보기 | 5.종료");
			System.out.print(">");
			
//			if(select_num == 5)
//			{
//				break;
//			}

			select_num = sc.nextInt();
			switch(select_num) {
			case 1:
				//System.out.println("1");
				do {
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				System.out.println("전화번호를 입력하세요.");
				tel = sc.next();
				
				a.add(new Card(name, tel));
				
				System.out.println("계속하시겠습니까?");
				System.out.print(">");
				retry = sc.next();
				if(retry.equals("n"))
					break;
				} while(true);
				
				System.out.println();
				break;
			
			case 2:
				flag = true;	//한번 찾았다고 계속 찾은 상태가 되어선 안된다. flag 초기화
				//System.out.println("2");
				System.out.println("삭제할 이름을 입력하세요.");
				name = sc.next();
				
				for(i=0;i<a.size();i++)
				{
					Card c = a.get(i);
					if(name.equals(c.getName()))
					{
						a.remove(i);
						System.out.println("삭제되었습니다.");
						flag=false;
					}	
				}
				
				if(flag==true)	//!false == true;
				{
					System.out.println("이름을 잘못 입력하였습니다.");
				}
				System.out.println();
				break;
				
			case 3:
				//System.out.println("3");
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				
				for(i=0;i<a.size();i++)
				{
					Card c = a.get(i);
					if(name.equals(c.getName()))
					{
						System.out.println("수정할 전화번호를 입력하세요.");
						tel = sc.next();
						
						//c.setTel(tel);	// c.setTel() 수정_1
						
						Card update = new Card(name,tel);		//멤버변수 다수일 때 수정_2
						a.set(i, update);
						
						System.out.println("수정되었습니다.");
						
						
						flag = false;
						break;
					}
				}
				if(flag==true)
				{
					System.out.println("이름을 잘못 입력하였습니다.");
				}
				System.out.println();
				break;
				
			case 4:
				//System.out.println("4");
				
				System.out.println("이름\t전화번호");
				
				for(Card c : a)	//확장포문 : 배열과 컬렉션에서만 사용 가능
				{
					//System.out.println(c.getName() + "\t" + c.getTel());
					System.out.println(c);
				}
					
//				for(i=0;i<a.size();i++)
//				{
//					Card c = a.get(i);	
//					System.out.println(c.getName() + "\t" + c.getTel());
//				}
				
				System.out.println();
				break;
				
			case 5:
				System.out.println("5");
				System.out.println("프로그램을 종료합니다");
				System.exit(0);				//프로그램 강제 종료
				
				
			default : System.out.println("1~5만 입력 가능합니다");
					  System.out.println();
				break;
			
			}//switch

		}//while
		
		
	}
}
