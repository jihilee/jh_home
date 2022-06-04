import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;
	
	Music(String title, String singer, int price)
	{
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	public String toString()
	{
		return title + "/" + singer + "/" + price;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setSinger(String singer)
	{
		this.singer = singer;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public String getTitle()
	{
		return title;
	}
	public String getSinger()
	{
		return singer;
	}
	public int getPrice()
	{
		return price;
	}	
}// Music class end


public class Ex09_04_������ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		ArrayList<Music> m = new ArrayList<Music>();
		System.out.println("Music ��ü�� �����մϴ�");
		
		do{
			System.out.print("���� > ");
			String title = sc.next();
			
			System.out.print("���� > ");
			String singer = sc.next();
			
			System.out.print("���� > ");
			int price = sc.nextInt();
			
			m.add(new Music(title, singer, price));
			
			System.out.println("��� ���� �Ͻðڽ��ϱ�? (���� : n)");
			System.out.println(">");
			String stop = sc.next();
			
			if(stop.equals("n"))
			{
				System.out.println("����� �����մϴ�.");
				break;
			}

		}while(true); //do_while end
		
		System.out.println("�Է��Ͻ� Music ��ü�� ����մϴ�");
		System.out.println(m.toString());	//music��ü ���

		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		
		do {
			flag = true;	//��� �ʱ�ȭ
			
			System.out.println("������ ������ ����մϴ�. ����� �Է��ϼ���.");
			System.out.print(">");
			String findTitle = sc.next();
			
			
			for(int i=0;i<m.size();i++)
			{
				Music f = m.get(i);
				if(findTitle.equals(f.getTitle()))
				{	
					flag = false;
					System.out.println(f.getTitle() + "�� �������� " +  f.getSinger() + " �Դϴ�.");
					break;
				}	
			}
			if(flag == true)
			{
				System.out.println("ã�� ������ �����ϴ�.");
			}
			
			System.out.println("��� ���� �Ͻðڽ��ϱ�? (���� : n)");
			System.out.println(">");
			String stop = sc.next();
			
			if(stop.equals("n"))		// !retry.equals("y") -> y�� �Է����� ������ ���̴�
			{
				System.out.println("����� �����մϴ�.");
				break;
			}
			
		} while(true);
		
	}

}
