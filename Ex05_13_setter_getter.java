class Book		//�ɹ������� private�� �� �ʿ��� �޼��� setter, getter�޼���
{
	// �����ڸ� �������� ������ ����Ʈ �����ڰ� �ڵ����� �����ȴ�
	// Book() {  �����ִ� ������   }
	
	Book()
	{
		title = "JSP";
		author = "���";
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
		this.author = "����";
		this.price = price;
	}
	
	private String title;		// private
	private String author;
	private int price; 			// 0
	
	void setTitle(String t)		// setter method
	{
		// title�� "�ڹ�"�� �ְ� ������ private������ ���� �� ��� �̸� �ذ��ϱ� ���� �޼���
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

public class Ex05_13_setter_getter 		//���θ޼��带 �������ִ� ����Ŭ����, �ϳ��� ���Ͽ� Ŭ���� �ϳ��� �� �����ؾ��Ѵ�
{
	public static void main(String[] args) 
	{
		Book bk1 = new Book();		// bk1,2 = ��������, �ּҰ� ����		
		bk1.setTitle("�ڹ�");
		bk1.setAuthor("ȫ�浿");
		bk1.setPrice(2000);
		
//		//bk1.title = "�ڹ�";
//		bk1.author = "ȫ�浿";
//		bk1.price = 3000;
		
		Book bk2 = new Book();
		bk2.setTitle("�����ͺ��̽�");
		bk2.setAuthor("����");
		bk2.setPrice(3000);
		
//		//bk2.title = "�����ͺ��̽�";
//		bk2.author = "�¿�";
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
//getter_setter method �ѹ��� �Է��ϴ� ��� : alt + Shift + s -> get_set click