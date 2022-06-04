
public class Ex05_15_생성자 {
	public static void main(String[] args) 
	{
		Book b1 = new Book();		// src 파일 끼리 class를 공유하기 때문에 class생성은 한번만
		Book b2 = new Book("HTML", "아이유",3000);
		Book b3 = new Book("DB", 5000);
				
		// Ex05_13_setter~ class Book{} 생성되어있음
		b1.show();
		System.out.println("------------");
		b2.show();
		System.out.println("------------");
		b3.show();
	}
}
