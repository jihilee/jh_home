abstract class Empl1{

	private String empno; // 사원번호
	private String name;
	private int pay;
	
	abstract double getMonthPay();	//미완성 추상메서드

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
		PartTime1 p = new PartTime1("P01","제니",30,7); 
		Contract1 c = new Contract1("C02","웬디",200,3); 
		FullTime1 f = new FullTime1("F03","윤아",400,200);

		System.out.println("<Part Time Month Pay>");
		p.print(); // "P01","제니",30
		System.out.println(p.getMonthPay()); // 계산된 급여  (pay/(double)12) + (bonus/(double)12
		System.out.println();

		System.out.println("<Contract Month Pay>");
		c.print(); //"C02","웬디",200
		System.out.println(c.getMonthPay());// 계산된 급여  pay/(double)12 * hireYear
		System.out.println();

		System.out.println("<Full TIme Month Pay>");
		f.print(); //"F03","윤아",400
		System.out.println(f.getMonthPay());// 계산된 급여	 pay*workDay

		System.out.println();

		//객체 배열

		Empl1[] arr = {new PartTime1("P01","제니",30,7),c,f};
			
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("객체배열출력");
			System.out.println("<arr["+i+"]>");
			arr[i].print();
			System.out.println(arr[i].getMonthPay());
			System.out.println();
		}

	}
}
//상속받는 자식 클래스 메서드의 접근범위 
//: 부모클래스가 default면 자식클래스는 부모와 같거나 접근범위가 넓어야 한다******