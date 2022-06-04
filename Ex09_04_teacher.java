import java.util.ArrayList;
import java.util.Scanner;
class Music2
{


	private String title;
	private String singer;
	private int price;
	
	Music2(String title, String singer, int price)
	{
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	
	public String toString()
	{
		return title+"/"+singer+"/"+price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

public class Ex09_04_teacher {
	public static void main(String[] args)
	{
		ArrayList<Music2> list = new ArrayList<Music2>();
		Scanner sc = new Scanner(System.in);
		
		String title, singer, retry, search_title;
		int price,i;
		boolean flag = false;
		
		do {
		System.out.print("title : ");
		title = sc.next();
		System.out.print("singer : ");
		singer = sc.next();
		System.out.print("price : ");
		price = sc.nextInt();
		
		list.add(new Music2(title, singer, price));
		
		System.out.println("���?");
		retry = sc.next();
		
		if(retry.equals("n"))
			break;
		
		}while(true);
		
		System.out.println(list);	//list�� toString�� ���(element)�� toString�� ȣ���Ѵ�.
		
		do{
			flag = false; //�ʱ�ȭ�۾�, ���� ������ �� �߰ߵǾ��� �� ������ ������ ����ϱ� ����//********
			System.out.println("ã�� ������ �Է��ϼ���.");
			search_title = sc.next();
			
			for(i=0;i<list.size();i++)
			{
				Music2 m = list.get(i);	//music��ü �ѵ��̸� �����Ͷ�
				if(m.getTitle().equals(search_title))
				{
					System.out.println(m.getTitle() + "�� �������� " + m.getSinger() + "�Դϴ�.");
					flag = true;
					break;	// �ð��� ���� �� �ִ� ���
				}
			}
			if(flag==false)
			{
				System.out.println("ã�� ������ �����ϴ�.");
			}
			
			System.out.println("���?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
			
		}while(true);
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
//�迭 : ���� Ÿ���� �����͸� �� �������� ��� �����ϴ� ��, ��ġ��ȣ�� 0���� �����Ѵ� (������ ũ�⸦ ���´�)
//�÷��� : Ŭ������ ���� ��ü�� ������ �� �ִ� ���� �����͸� ���� ������ �� �ִ� ����� (�������� �޸� Ȯ��/��� ����)
//list interface : �ߺ����, �����ִ�
//set interface : �ߺ�����, ��������.
