abstract class Empl1{

	private String empno; // �����ȣ
	private String name;
	private int pay;
	
	abstract double getMonthPay();	//�̿ϼ� �߻�޼���

	Empl1(String empno, String name, int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		}

	void print(){
		System.out.println(empno);
		System.out.println(name);
		System.out.println(pay);
		}
	public int getPay()
	{
		return pay;
	}
}//Empl

class PartTime1 extends Empl1{

	int workDay;

	PartTime1(String empno, String name, int pay, int workDay)
	{
		super(empno,name,pay);
		this.workDay = workDay;
	}
	double getMonthPay() 
	{
		return getPay() * workDay;
	}
	void print() 
	{
		super.print();
		System.out.println(workDay);	
	}
}//PartTime		

class Contract1 extends Empl1{

	int hireYear;

	Contract1(String empno, String name, int pay, int hireYear)
	{
		super(empno,name,pay);
		this.hireYear = hireYear;
	}
	public double getMonthPay() 
	{
		return getPay()/(double)12 * hireYear;
	}
	void print() 
	{
		super.print();
		System.out.println(hireYear);
	}
}//Contract

class FullTime1 extends Empl1{

	int bonus;
	
	FullTime1(String empno, String name, int pay, int bonus)
	{
		super(empno,name,pay);
		this.bonus = bonus;
	}
	public double getMonthPay() 
	{
		return (getPay()/(double)12) + (bonus/(double)12);
	}
	void print() 
	{
		super.print();
		System.out.println(bonus);
	}
}//FullTime

public class Ex06_11_teacher
{
	public static void main(String[] args) 
	{
		PartTime1 p = new PartTime1("P01","����",30,7); 
		Contract1 c = new Contract1("C02","����",200,3); 
		FullTime1 f = new FullTime1("F03","����",400,200);

		System.out.println("<Part Time Month Pay>");
		p.print(); // "P01","����",30
		System.out.println(p.getMonthPay()); // ���� �޿�  (pay/(double)12) + (bonus/(double)12
		System.out.println();

		System.out.println("<Contract Month Pay>");
		c.print(); //"C02","����",200
		System.out.println(c.getMonthPay());// ���� �޿�  pay/(double)12 * hireYear
		System.out.println();

		System.out.println("<Full TIme Month Pay>");
		f.print(); //"F03","����",400
		System.out.println(f.getMonthPay());// ���� �޿�	 pay*workDay

		System.out.println();

		//��ü �迭

		Empl1[] arr = {new PartTime1("P01","����",30,7),c,f};
			
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("��ü�迭���");
			System.out.println("<arr["+i+"]>");
			arr[i].print();
			System.out.println(arr[i].getMonthPay());
			System.out.println();
		}

	}
}
//��ӹ޴� �ڽ� Ŭ���� �޼����� ���ٹ��� 
//: �θ�Ŭ������ default�� �ڽ�Ŭ������ �θ�� ���ų� ���ٹ����� �о�� �Ѵ�******