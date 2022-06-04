class BB extends Thread{	//클래스 BB는 Thread라는 클래스를 상속받는다
							//thread가 물려주는 메서드 중 start가 존재
	public void run() {	//******
		for(int i=1;i<=30;i++)
			System.out.print(i + " ");
		System.out.println();
	}//run
}//BB

public class Ex10_02_Thread {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		BB b = new BB();
		b.start();		//***start()****thread클래스가 물려준 start메서드 
		//run()은 순서대로 출력하겠지만 start()는 Thread가 물려준 메서드이기때문에 동시에 돌아간다.
		System.out.println("프로그램 종료");
	}

}
