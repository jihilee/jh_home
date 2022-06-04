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
	
	public void show()	// 부모가 pulic이면 자식도 public을 붙여아 한다.
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

public class Ex06_04_상속 {
	public static void main(String[] args) {
		
		Product p = new Product("P01","제조사");
		Product c = new Computer("CO2","삼성","window10",64);		// 부모변수로 업캐스팅
		Product b = new Book("B03","중앙출판사","자바","이무진");
		
		p.show();
		System.out.println();
		
		c.show();
		System.out.println();
		
		b.show();
		System.out.println("===============");
		
		Product[] arr = {new Product("P01","제조사"), 
						 new Computer("CO2","삼성","window10",64),
						 new Book("B03","중앙출판사","자바","이무진")};
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i].show();
			System.out.println("----");
		}
		
		
//		b.setCode("B03");
//		b.setCompany("중앙출판사");
//		b.setTitle("자바");		
//		b.setAuthor("이무진");		// private변수가 있을 때만 사용
		System.out.println("=====get메서드 통한 출력====");
		System.out.println("code : " + b.getCode());
		System.out.println("company : " + b.getCompany());
		System.out.println("title : " + ((Book) b).getTitle());
		System.out.println("author : " + ((Book) b).getAuthor());

		
		
	}
}
