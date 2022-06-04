class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music()
	{
		title = "INVU";
		singer = "�¿�";
		genre = "POP";
		price = 1000;		//�����ڸ� ���� �ʱ�ȭ
		
	}
	Music(String title, String singer, String genre, int price)
	{
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	void setTitle(String title)
	{
		this.title = title;
	}
	void setSinger(String singer)
	{
		this.singer = singer;
	}
	void setGenre(String genre)
	{
		this.genre = genre;
	}
	void setPrice(int price)
	{
		this.price = price;
	}
	
	String getTitle()
	{
		return title;
	}
	String getSinger()
	{
		return singer;
	}
	String getGenre()
	{
		return genre;
	}
	int getPrice()
	{
		return price;
	}
	
	void display()
	{
		System.out.print(title + " ");
		System.out.print(singer + " ");
		System.out.print(genre + " ");
		System.out.println(price);
	}

}//class end


public class Ex05_16_������ 
{
	public static void main(String[] args) 
	{
		System.out.println("===���� ���� ��� ���α׷�===");
		System.out.println();
		
		
		System.out.println("<������ ���� �ʱ�ȭ ���_1>");
		Music m1 = new Music();	
		
		System.out.print(m1.getTitle() + " ");
		System.out.print(m1.getSinger() + " ");
		System.out.print(m1.getGenre() + " ");
		System.out.println(m1.getPrice());			// m1
		System.out.println();
		
		
		System.out.println("<������ ���� �ʱ�ȭ ���_2>");
		Music m2 = new Music("that that","PSY","��",2000); 
		
		m2.display();								// m2
		System.out.println();
		
		
		System.out.println("<setter ���� �ʱ�ȭ ���_1>");
		Music m3 = new Music(); 		
		// setter ��ӳ� ������ Ʈ��Ʈ 3000
		m3.setTitle("��ӳ�");
		m3.setSinger("������");
		m3.setGenre("Ʈ��Ʈ");
		m3.setPrice(3000);							
		// ������ ������'music()'�� ��ģ �� ���� �����, �׸��� setter, getter ���
		// ������ ������ ����!
		m3.display();
		System.out.println();						//	m3
	}

}
