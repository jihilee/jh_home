class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music()
	{
		title = "INVU";
		singer = "태연";
		genre = "POP";
		price = 1000;		//생성자를 통한 초기화
		
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


public class Ex05_16_이지희 
{
	public static void main(String[] args) 
	{
		System.out.println("===음반 정보 출력 프로그램===");
		System.out.println();
		
		
		System.out.println("<생성자 통한 초기화 출력_1>");
		Music m1 = new Music();	
		
		System.out.print(m1.getTitle() + " ");
		System.out.print(m1.getSinger() + " ");
		System.out.print(m1.getGenre() + " ");
		System.out.println(m1.getPrice());			// m1
		System.out.println();
		
		
		System.out.println("<생성자 통한 초기화 출력_2>");
		Music m2 = new Music("that that","PSY","댄스",2000); 
		
		m2.display();								// m2
		System.out.println();
		
		
		System.out.println("<setter 통한 초기화 출력_1>");
		Music m3 = new Music(); 		
		// setter 어머나 자윤정 트로트 3000
		m3.setTitle("어머나");
		m3.setSinger("장윤정");
		m3.setGenre("트로트");
		m3.setPrice(3000);							
		// 무조건 생성자'music()'를 거친 후 내용 덮어쓰기, 그리고 setter, getter 출력
		// 무조건 생성자 먼저!
		m3.display();
		System.out.println();						//	m3
	}

}
