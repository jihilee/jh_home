abstract class Empl{

	private String empno; // �����ȣ
	private String name;
	private int pay;
	
	abstract double getMonthPay();	//�̿ϼ� �߻�޼���

	Empl(String empno, String name, int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		}

	void print(){
		System.out.println(empno);
		System.out.println(name);
		System.out.println(pay);
		}
}//Empl

class PartTime extends Empl{

	int workDay;
	double monthpay;

	PartTime(String empno, String name, int pay, int workDay)
	{
		super(empno,name,pay);
		this.workDay = workDay;
		monthpay = pay * workDay;
	}
	public double getMonthPay() 
	{
		return monthpay;
	}
	void print() 
	{
		super.print();
		System.out.println(workDay);
	}
}//PartTime

class Contract extends Empl{

	int hireYear;
	double monthpay;

	Contract(String empno, String name, int pay, int hireYear)
	{
		super(empno,name,pay);
		this.hireYear = hireYear;
		monthpay = pay/(double)12 * hireYear;
	}
	public double getMonthPay() 
	{
		return monthpay;
	}
	void print() 
	{
		super.print();
		System.out.println(hireYear);
	}
}//Contract

class FullTime extends Empl{

	int bonus;
	double monthpay;
	
	FullTime(String empno, String name, int pay, int bonus)
	{
		super(empno,name,pay);
		this.bonus = bonus;
		monthpay = ((pay/(double)12) + (bonus/(double)12));;
	}
	public double getMonthPay() 
	{
		return monthpay;
	}
	void print() 
	{
		super.print();
		System.out.println(bonus);
	}

}//FullTime

public class Ex06_11_������ 

{
	public static void main(String[] args) 
	{
		PartTime p = new PartTime("P01","����",30,7); 
		Contract c = new Contract("C02","����",200,3); 
		FullTime f = new FullTime("F03","����",400,200);

		System.out.println("<Part Time Month Pay>");
		p.print(); // "P01","����",30
		System.out.println(p.getMonthPay()); // ���� �޿�  (pay/(double)12) + (bonus/(double)12
		System.out.println();

		System.out.println("<Cintract Month Pay>");
		c.print(); //"C02","����",200
		System.out.println(c.getMonthPay());// ���� �޿�  pay/(double)12 * hireYear
		System.out.println();

		System.out.println("<Full TIme Month Pay>");
		f.print(); //"F03","����",400
		System.out.println(f.getMonthPay());// ���� �޿�	 pay*workDay

		System.out.println();

		//��ü �迭

		int i;
		double monthpay;

		Empl[] arr = {new PartTime("P01","����",30,7),
					  new Contract("C02","����",200,3),
					  new FullTime("F03","����",400,200)};

		System.out.println("<<��ü �迭�� ����ϱ�>>");

		for(i=0;i<arr.length;i++)
		{	
			System.out.println("- arr[" + i + "]�� �迭 ���");
			arr[i].print();
			System.out.println(arr[i].getMonthPay());
			System.out.println();
		}
	}

}