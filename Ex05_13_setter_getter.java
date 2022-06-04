class Book		//맴버변수가 private일 때 필요한 메서드 setter, getter메서드
{
	// 생성자를 정의하지 않으면 디폴트 생성자가 자동으로 생성된다
	// Book() {  숨어있는 생성자   }
	
	Book()
	{
		title = "JSP";
		author = "써니";
		price = 1000;
	}
	Book(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	Book(String title, int price)
	{
		this.title = title;
		this.author = "윤아";
		this.price = price;
	}
	
	private String title;		// private
	private String author;
	private int price; 			// 0
	
	void setTitle(String t)		// setter method
	{
		// title에 "자바"를 넣고 싶은데 private때문에 넣을 수 없어서 이를 해결하기 위한 메서드
		title = t;
	}
	void setAuthor(String a)		// setter method
	{
		author = a;
	}
	void setPrice(int p)		// setter method
	{
		price = p;
	}
	
	
	String getTitle()			// getter method
	{
		return title;
	}
	String getAuthor()			// getter method
	{
		return author;
	}
	int getPrice()			// getter method
	{
		return price;
	}
	
	void show()
	{
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}// class book end

public class Ex05_13_setter_getter 		//메인메서드를 가지고있는 실행클래스, 하나의 파일에 클래스 하나는 꼭 존재해야한다
{
	public static void main(String[] args) 
	{
		Book bk1 = new Book();		// bk1,2 = 참조변수, 주소가 들어간다		
		bk1.setTitle("자바");
		bk1.setAuthor("홍길동");
		bk1.setPrice(2000);
		
//		//bk1.title = "자바";
//		bk1.author = "홍길동";
//		bk1.price = 3000;
		
		Book bk2 = new Book();
		bk2.setTitle("데이터베이스");
		bk2.setAuthor("지희");
		bk2.setPrice(3000);
		
//		//bk2.title = "데이터베이스";
//		bk2.author = "태연";
//		bk2.price = 5000;

		//System.out.println(bk1.title);
		System.out.println(bk1.getTitle());
		
//		System.out.println(bk1.author);
//		System.out.println(bk1.price);
		System.out.println(bk1.getAuthor());
		System.out.println(bk1.getPrice());
		
		System.out.println("----------");
		bk1.show();

		System.out.println("----------");

		System.out.println(bk2.getTitle());
//		//System.out.println(bk2.title);
		
		System.out.println(bk2.getAuthor());
		System.out.println(bk2.getPrice());
//		System.out.println(bk2.author);
//		System.out.println(bk2.price);
		
		System.out.println("----------");
		bk2.show();
	}
}
//getter_setter method 한번에 입력하는 방법 : alt + Shift + s -> get_set click