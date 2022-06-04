
public class Ex05_18_객체배열 
{
	public static void main(String[] args) 
	{
//		Book b1 = new Book();						// 객체를 만든 것
//		Book b2 = new Book("HTML", "아이유",3000);	
//		Book b3 = new Book("DB", 5000);

//		Book[] bk = new Book[3];	//	주소를 담을 수 있는 방 3개를 만든 것 
//		Book[0] bk = new Book(); 
//		Book[1] bk = new Book("HTML", "아이유",3000);
//		Book[2] bk = new Book("DB", 5000);
	
		Book[] bk = {new Book(), new Book("HTML", "아이유",3000), new Book("DB", 5000)};
		
		int i=0;
		for(i=0;i<bk.length;i++)
		{
			bk[i].show();
			System.out.println();
		}

	}

}	// 13페이지의 class 끌어다 쓴 것 
