class Member {

	private String id;
	private String passwd;
	
	Member()
	{// ������(=�޼���) ����
		System.out.println("Member ������");
		id = "Kim";
		passwd = "5679";
		//�ַ� ��������� �ʱ�ȭ �۾��� �����Ѵ�.
	}
	Member(String i, String p)
	{//�ߺ��� �޼���, ���ڿ� �ΰ��� �ޱ� ���� ������, ������ Overloading��
		System.out.println("Member(String i, String p)");
		id = i;
		passwd = p;
	}
	
	
	void setId(String id)	// �޼��� ����
	{
		this.id = id;
	}
	void setPw(String passwd)
	{
		this.passwd = passwd;
	}
	String getId()
	{
		return id;
	}
	String getPw()
	{
		return passwd;
	}
//������ : 		�����ڴ� �޼����. �������̸��� Ŭ�����̸��� ����.
//constractor	���ϰ��� ����. void�� ���� �ʴ´�.
//		 		��ü�� ����� �ڵ����� ȣ��ȴ�. ��ҹ��� ����
//		 		�����ڸ� �������� ������ �⺻ ����Ʈ(�Ű����� ����) �����ڰ� �ڵ����� �����ȴ�.
//		 		�ַ� ��������� �ʱ�ȭ �۾��� �����Ѵ�.	
}

public class Ex05_14_������ 
{
	public static void main(String[] args) 
	{
		Member m1 = new Member();	//��ü����
		
//		m1.id = "Kim";
//		m1.passwd = "1234";
//		System.out.println(m1.id);
//		System.out.println(m1.passwd);
		
//		m1.setId("Kim");	//�޼���ȣ��
//		m1.setPw("1234");
		
		System.out.println(m1.getId());
		System.out.println(m1.getPw());

		System.out.println("---------------");
		
		Member m2 = new Member("choi","7777");
		System.out.println(m2.getId());
		System.out.println(m2.getPw());
		
	}

}
