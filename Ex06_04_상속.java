class Product
{
	private String code;	
	private String company;
	
	Product(String code, String company)
	{
		this.code = code;
		this.company = company;
	}
	
//	void setCode(String code)
//	{
//		this.code = code;
//	}
//	void setCompany(String company)
//	{
//		this.company = company;
//	}
	
	String getCode()
	{
		return code;
	}
	String getCompany()
	{
		return company;
	}
	
	public void show()			//overriding
	{
		System.out.println("code : " + code);
		System.out.println("company : " + company);
	}
}
class Computer extends Product
{
	String os;
	int ram;
	
	Computer(String code, String company, String os, int ram)
	{
		super(code, company);
		this.os = os;
		this.ram = ram;
	}
	
	public void show()	// �θ� pulic�̸� �ڽĵ� public�� �ٿ��� �Ѵ�.
	{
		super.show();
		System.out.println("os : " + os);
		System.out.println("ram : " + ram);
	}
	
}//class computer end

class Book extends Product
{
	String title;
	String author;
	
	Book(String code, String company, String title, String author)
	{
		super(code, company);
		this.title = title;
		this.author = author;
	}
	
//	void setTitle(String title)
//	{
//		this.title = title;
//	}
//	void setAuthor(String author)
//	{
//		this.author = author;
//	}
	String getTitle()
	{
		return title;
	}
	String getAuthor()
	{
		return author;
	}
	
	public void show()
	{
		super.show();
		System.out.println(title);
		System.out.println(author);
	}
	
}// class Book end

public class Ex06_04_��� {
	public static void main(String[] args) {
		
		Product p = new Product("P01","������");
		Product c = new Computer("CO2","�Ｚ","window10",64);		// �θ𺯼��� ��ĳ����
		Product b = new Book("B03","�߾����ǻ�","�ڹ�","�̹���");
		
		p.show();
		System.out.println();
		
		c.show();
		System.out.println();
		
		b.show();
		System.out.println("===============");
		
		Product[] arr = {new Product("P01","������"), 
						 new Computer("CO2","�Ｚ","window10",64),
						 new Book("B03","�߾����ǻ�","�ڹ�","�̹���")};
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i].show();
			System.out.println("----");
		}
		
		
//		b.setCode("B03");
//		b.setCompany("�߾����ǻ�");
//		b.setTitle("�ڹ�");		
//		b.setAuthor("�̹���");		// private������ ���� ���� ���
		System.out.println("=====get�޼��� ���� ���====");
		System.out.println("code : " + b.getCode());
		System.out.println("company : " + b.getCompany());
		System.out.println("title : " + ((Book) b).getTitle());
		System.out.println("author : " + ((Book) b).getAuthor());

		
		
	}
}
