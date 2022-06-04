
class Product 
{// 첫글자는 대문자, 같은 프로젝트 안에 같은 이름의 클래스가 두 개 이상이라면 error
		
	Product()
	{// Product 생성자생성
		
	}
	
	static String company;		
	private String name;		
	private int price;		
	
	void setName(String name)	//매개변수 name
	{
		this.name = name;		// 멤버변수 this.name = 매개변수 name
	}//이 지역(void setName부분) 순위가 높아서 멤버변수 name을 매개변수라고 인식한다, 결과값=null, 멤버변수 앞에 this.를 붙여 멤버변수라는 것을 일러준다.
	void setPrice(int price)	// 멤버변수 this.price = 매개변수 price
	{
		this.price = price;		// this.는 멤버변수에만 붙일 수 있다.
	}
	
	String getName()
	{
		return this.name;
	}
	int getPrice()
	{
		return price;
	}
	
}// 변수에 직접 값을 지정할 수 있음 -> p1, p2 같은 값 출력

public class Ex05_02_클래스 
{
	public static void main(String[] args) 
	{
		// new Product();		-> 객체 생성, instance
		
		
		Product.company = "농심";		// static변수, class 변수

		Product p1 = new Product();
		
		p1.setName("새우깡");
		p1.setPrice(1000);
		
		System.out.println(Product.company);
		System.out.println(p1.getName());
		
		int p1_price = p1.getPrice();
		System.out.println(p1_price);
		// 변수에 담아서 출력_1
		System.out.println(p1.getPrice());
		// 바로 출력_2
		
//		p1.name = "새우깡";
//		p1.price = 1000;
//		
//		System.out.print(Product.company + " ");
//		System.out.print(p1.name + " ");
//		System.out.println(p1.price + "원");
		
		
		System.out.println("=======");
		
		
		Product p2 = new Product();
		
		p2.setName("브라보콘");
		p2.setPrice(2000);
		
		System.out.println(Product.company);
		System.out.println(p2.getName());
		System.out.println(p2.getPrice());
		
//		System.out.print(p2.company + " ");		
//		System.out.print(p2.name + " ");			//null
//		System.out.println(p2.price);				// 0
	
		
		
//		Product p3 = new Product();
		
//		p3.name = "브라보콘";
//		p3.price = 700;
//		
//		System.out.print(Product.company + " ");			//null
//		System.out.print(p3.name + " ");			//null
//		System.out.println(p3.price);				// 0
	
	}

}
