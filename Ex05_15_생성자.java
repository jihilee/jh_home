
public class Ex05_15_������ {
	public static void main(String[] args) 
	{
		Book b1 = new Book();		// src ���� ���� class�� �����ϱ� ������ class������ �ѹ���
		Book b2 = new Book("HTML", "������",3000);
		Book b3 = new Book("DB", 5000);
				
		// Ex05_13_setter~ class Book{} �����Ǿ�����
		b1.show();
		System.out.println("------------");
		b2.show();
		System.out.println("------------");
		b3.show();
	}
}
