//abstract copymachine
//{
//	abstract void copy();
//}	-> �߻�޼����� �̿� ���� ���´� �������̽� �ȿ� �̿ϼ��� �޼����� ���¿� ���ٰ� ����.

interface CopyMachine
{//�������̽� �ȿ��� �̿ϼ��� �޼��常 �� �� �ִ� (�����ϸ� �ȵ�), �������̽��� �����ڸ� ���� �� ����
	final int a = 10;		// final -> a������ ������ �־����� ���̴� final���� ���� �Ұ���, interface������ final�� �ڵ����� �ٴ´�
	public void copy();				// interface ���� �޼���� �ڵ����� abstract public�� �ٴ´�(��������)
}//class copymachine end

interface Printmachine
{
	void print();
}

interface Facmachine
{
	void fax();
}
class Compound implements CopyMachine, Printmachine, Facmachine //<-interface ��ӹ��� ���� implements�� ���
{																//  interface�� �ѹ��� ��ӹ��� �� �ִ�
	public void copy()		// interface ���� �޼���� �ڵ����� public�� ������ class ���� �޼��忡�� ���� �Է����־���Ѵ�
	{	//�θ� �޼��� �ϼ���Ű�� ����
		System.out.println("�����Ѵ�");
	}
	public void print()
	{
		System.out.println("����Ѵ�");
	}
	public void fax()
	{
		System.out.println("�ѽ��� ������");
	}
}
class Compound2 implements Printmachine, Facmachine //<-interface ��ӹ��� ���� implements�� ���
{
	public void fax() {
		System.out.println("�ѽ�");
	}
	
	public void print() {
		System.out.println("���");
	}

}
public class Ex06_12_�������̽� 
{
	public static void main(String[] args) 
	{
		//CopyMachine c = new CopyMachine();
		
		Compound com = new Compound();
		//Printmachine com = new Compound(); -> com.print();�� ��°���
		
		com.copy();
		com.print();
		com.fax();
		System.out.println(com.a);
//		com.a = 20;					 ����=�ʵ�
//		System.out.println(com.a);	 interface������ final�� �ڵ����� �ٴ´�
		
		Compound2 comm = new Compound2();
		comm.fax();
		comm.print();
	}

}

// class�� extends�� ����Ͽ� ��ӹް� interface�� implements�� ����Ͽ� �����Ѵ�
