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

public class Ex09_05_���԰��� {
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
			System.out.println("<��ȣ�� �Է��ϼ���>");
			System.out.println("1.���� �߰� | 2.���Ի��� | 3. ���Լ��� | 4.���Ժ��� | 5.����");
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
				System.out.println("�̸��� �Է��ϼ���.");
				name = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
				tel = sc.next();
				
				a.add(new Card(name, tel));
				
				System.out.println("����Ͻðڽ��ϱ�?");
				System.out.print(">");
				retry = sc.next();
				if(retry.equals("n"))
					break;
				} while(true);
				
				System.out.println();
				break;
			
			case 2:
				flag = true;	//�ѹ� ã�Ҵٰ� ��� ã�� ���°� �Ǿ �ȵȴ�. flag �ʱ�ȭ
				//System.out.println("2");
				System.out.println("������ �̸��� �Է��ϼ���.");
				name = sc.next();
				
				for(i=0;i<a.size();i++)
				{
					Card c = a.get(i);
					if(name.equals(c.getName()))
					{
						a.remove(i);
						System.out.println("�����Ǿ����ϴ�.");
						flag=false;
					}	
				}
				
				if(flag==true)	//!false == true;
				{
					System.out.println("�̸��� �߸� �Է��Ͽ����ϴ�.");
				}
				System.out.println();
				break;
				
			case 3:
				//System.out.println("3");
				System.out.println("�̸��� �Է��ϼ���.");
				name = sc.next();
				
				for(i=0;i<a.size();i++)
				{
					Card c = a.get(i);
					if(name.equals(c.getName()))
					{
						System.out.println("������ ��ȭ��ȣ�� �Է��ϼ���.");
						tel = sc.next();
						
						//c.setTel(tel);	// c.setTel() ����_1
						
						Card update = new Card(name,tel);		//������� �ټ��� �� ����_2
						a.set(i, update);
						
						System.out.println("�����Ǿ����ϴ�.");
						
						
						flag = false;
						break;
					}
				}
				if(flag==true)
				{
					System.out.println("�̸��� �߸� �Է��Ͽ����ϴ�.");
				}
				System.out.println();
				break;
				
			case 4:
				//System.out.println("4");
				
				System.out.println("�̸�\t��ȭ��ȣ");
				
				for(Card c : a)	//Ȯ������ : �迭�� �÷��ǿ����� ��� ����
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
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);				//���α׷� ���� ����
				
				
			default : System.out.println("1~5�� �Է� �����մϴ�");
					  System.out.println();
				break;
			
			}//switch

		}//while
		
		
	}
}
