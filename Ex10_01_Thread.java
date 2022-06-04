class AA implements Runnable{	//인터페이스 상속받을 때 implements, 미완성메서드(추상메서드) 완성시켜야함, runnable을 상속받은 클래스여야면 Thread 사용가능
//	void method(){
//		for(int i=1;i<=30;i++)
//			System.out.print(i + " ");
//		System.out.println();
//	}
	public void run() {	//******
		for(int i=1;i<=30;i++)
			System.out.print(i + " ");
		System.out.println();
	}
}//class AA
public class Ex10_01_Thread {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		AA a = new AA();
		Thread trd = new Thread(a); 	//java.lang패키지에 존재해서 import필요없다
		//Thread trd = new Thread(new AA());
		
		//a.method();
		//a.run();
		trd.start();	//start로 호출하면, run메서드가 출력된다	
		
		System.out.println("프로그램 종료");

	}

}
//동시의 두개의 메서드를 돌리고 싶을 때 thread사용
//메인메서드와 런메서드가 동시에 돌아간다. 따라서 출력이 적은 순서대로 되지 않는다