class Fruits		// (extends Object) ��� Ŭ������ Object��� Ŭ������ ��ӹ޴´�, 
{					//object : ��� Ŭ������ ����Ŭ����
	String name;
	int price;
	
	Fruits(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	public String toString()	//�ּҰ� ���ϵǴ� �θ��� toString overriding
	{
		//System.out.println(name + "," + price);
		return name + "," + price;
	}
	public boolean equals(Object obj)	//Object obj = (Object)new Fruits<-upcasting
	{	//this�� f1(100����)�� �޴´�
		//obj�� f2(200����)�� �޴´�(this,Object obj)
		
		//Object obj = new Integer(10);
		//Object obj = 10;	-> autoboxing
		
		if(obj instanceof Fruits)
		{
			Fruits fr2 = (Fruits)obj;	//fr2�� 200����
			//return this.price == fr2.price;	//���� ���ݺ�
			return this.name.equals(fr2.name);	//���ڿ� �񱳴� equals�� ��
		}
		else
			return false;
	}
}
public class Ex08_01_Object {
	public static void main(String[] args) {
		
		String s = "apple"; // new String("apple");
		
		Fruits f1 = new Fruits(new String("apple"),1000);
		Fruits f2 = new Fruits(new String("apple"),1000);

		System.out.println(f1.toString());
		System.out.println(f2);	//=f2.toString()
		//toString method�� ���������� ����ص� toString�� ȣ��ȴ�(����:public, return��, toString)
		
		System.out.println(f1.price);
		System.out.println(f2.price);
		System.out.println(f1.price == f2.price);
		System.out.println(f1.name == f2.name);
		
		System.out.println("-------------");
		System.out.println(f1.equals(f2));	//f1,f2
	}

}
// object�� �����ϴ� toString�� �ּҸ� �����ϴ� ����� ž��Ǿ��ִ�
// toString�� ���� ����ϴ� ���� ����� �� ����ϱ� �˸´�
/* Object
 * String toString() : �ּҸ��� 
 * boolean equals() : �ּҺ��� ��� ���� t/f
 * String
 * String toString() : ���ڿ����� 
 * boolean equals() : ���ڿ� �� ��� ���� t/f*/
//���ڴ� ==���� ��, ���ڿ��� equals�� ��