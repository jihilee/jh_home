interface Camera
{
	/* public abstract */ void takePhoto();
	
}// 
interface Music
{
	/* public abstract */ void playMusic();
}
interface DMB
{
	/* public abstract */ void viewTv();
}

class Shape2{
	
	private int size;
	private String color;
	
//	Shape2()
//	{
//		
//	}
	Shape2(int size, String color)
	{
		this.size = size;
		this.color = color;
	}
	void setSize(int size)
	{
		this.size = size;
	}
	void setcolor(String color)
	{
		this.color = color;
	}
	int getSize()
	{
		return size;
	}
	String getColor()
	{
		return color;
	}
	void show()
	{
		System.out.println("size : " + size);
		System.out.println("color : " + color);
	}
}//
class Phone extends Shape2 implements Camera, Music		// extends �ϰ� implements 
{
	Phone(int size, String color)
	{
		super(size,color);
	}

	public void playMusic() 
	{
		System.out.println("���ǰ���");
	}
	public void takePhoto() 
	{
		System.out.println("�������");
	}// ��ӹް� �ϼ�
	
}//phone

public class Ex06_13_�������̽� 
{
	public static void main(String[] args) 
	{
		Phone p = new Phone(7,"blue");
		//Music p = new Phone(7,"blue");		-> p.takeMusic()�� ��� ����

		p.show();
		System.out.println("-----");
		
		System.out.println("size : " + p.getSize());
		System.out.println("color : " + p.getColor());
		System.out.println("-----");
		
		p.playMusic();
		p.takePhoto();	
	}

}
