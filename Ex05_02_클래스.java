
class Product 
{// ù���ڴ� �빮��, ���� ������Ʈ �ȿ� ���� �̸��� Ŭ������ �� �� �̻��̶�� error
		
	Product()
	{// Product �����ڻ���
		
	}
	
	static String company;		
	private String name;		
	private int price;		
	
	void setName(String name)	//�Ű����� name
	{
		this.name = name;		// ������� this.name = �Ű����� name
	}//�� ����(void setName�κ�) ������ ���Ƽ� ������� name�� �Ű�������� �ν��Ѵ�, �����=null, ������� �տ� this.�� �ٿ� ���������� ���� �Ϸ��ش�.
	void setPrice(int price)	// ������� this.price = �Ű����� price
	{
		this.price = price;		// this.�� ����������� ���� �� �ִ�.
	}
	
	String getName()
	{
		return this.name;
	}
	int getPrice()
	{
		return price;
	}
	
}// ������ ���� ���� ������ �� ���� -> p1, p2 ���� �� ���

public class Ex05_02_Ŭ���� 
{
	public static void main(String[] args) 
	{
		// new Product();		-> ��ü ����, instance
		
		
		Product.company = "���";		// static����, class ����

		Product p1 = new Product();
		
		p1.setName("�����");
		p1.setPrice(1000);
		
		System.out.println(Product.company);
		System.out.println(p1.getName());
		
		int p1_price = p1.getPrice();
		System.out.println(p1_price);
		// ������ ��Ƽ� ���_1
		System.out.println(p1.getPrice());
		// �ٷ� ���_2
		
//		p1.name = "�����";
//		p1.price = 1000;
//		
//		System.out.print(Product.company + " ");
//		System.out.print(p1.name + " ");
//		System.out.println(p1.price + "��");
		
		
		System.out.println("=======");
		
		
		Product p2 = new Product();
		
		p2.setName("�����");
		p2.setPrice(2000);
		
		System.out.println(Product.company);
		System.out.println(p2.getName());
		System.out.println(p2.getPrice());
		
//		System.out.print(p2.company + " ");		
//		System.out.print(p2.name + " ");			//null
//		System.out.println(p2.price);				// 0
	
		
		
//		Product p3 = new Product();
		
//		p3.name = "�����";
//		p3.price = 700;
//		
//		System.out.print(Product.company + " ");			//null
//		System.out.print(p3.name + " ");			//null
//		System.out.println(p3.price);				// 0
	
	}

}
