//abstract copymachine
//{
//	abstract void copy();
//}	-> 추상메서드의 이와 같은 형태는 인터페이스 안에 미완성된 메서드의 형태와 같다고 본다.

interface CopyMachine
{//인터페이스 안에는 미완성된 메서드만 들어갈 수 있다 (정의하면 안됨), 인터페이스는 생성자를 가질 수 없다
	final int a = 10;		// final -> a변수에 정수를 넣었으면 끝이다 final변수 변경 불가능, interface에서는 final이 자동으로 붙는다
	public void copy();				// interface 안의 메서드는 자동으로 abstract public이 붙는다(생략가능)
}//class copymachine end

interface Printmachine
{
	void print();
}

interface Facmachine
{
	void fax();
}
class Compound implements CopyMachine, Printmachine, Facmachine //<-interface 상속받을 때는 implements를 사용
{																//  interface는 한번에 상속받을 수 있다
	public void copy()		// interface 안의 메서드는 자동으로 public이 붙지만 class 안의 메서드에는 직접 입력해주어야한다
	{	//부모 메서드 완성시키는 과정
		System.out.println("복사한다");
	}
	public void print()
	{
		System.out.println("출력한다");
	}
	public void fax()
	{
		System.out.println("팩스를 보낸다");
	}
}
class Compound2 implements Printmachine, Facmachine //<-interface 상속받을 때는 implements를 사용
{
	public void fax() {
		System.out.println("팩스");
	}
	
	public void print() {
		System.out.println("출력");
	}

}
public class Ex06_12_인터페이스 
{
	public static void main(String[] args) 
	{
		//CopyMachine c = new CopyMachine();
		
		Compound com = new Compound();
		//Printmachine com = new Compound(); -> com.print();만 출력가능
		
		com.copy();
		com.print();
		com.fax();
		System.out.println(com.a);
//		com.a = 20;					 변수=필드
//		System.out.println(com.a);	 interface에서는 final이 자동으로 붙는다
		
		Compound2 comm = new Compound2();
		comm.fax();
		comm.print();
	}

}

// class는 extends를 사용하여 상속받고 interface는 implements를 사용하여 구현한다
