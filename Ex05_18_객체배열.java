
public class Ex05_18_��ü�迭 
{
	public static void main(String[] args) 
	{
//		Book b1 = new Book();						// ��ü�� ���� ��
//		Book b2 = new Book("HTML", "������",3000);	
//		Book b3 = new Book("DB", 5000);

//		Book[] bk = new Book[3];	//	�ּҸ� ���� �� �ִ� �� 3���� ���� �� 
//		Book[0] bk = new Book(); 
//		Book[1] bk = new Book("HTML", "������",3000);
//		Book[2] bk = new Book("DB", 5000);
	
		Book[] bk = {new Book(), new Book("HTML", "������",3000), new Book("DB", 5000)};
		
		int i=0;
		for(i=0;i<bk.length;i++)
		{
			bk[i].show();
			System.out.println();
		}

	}

}	// 13�������� class ����� �� �� 
