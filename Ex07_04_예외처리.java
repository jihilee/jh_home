
public class Ex07_04_����ó�� {
	public static void main(String[] args) {
		
		try {
		sub();
		} catch (Exception e) {
			System.out.println("main���� ���� �߻�");
			System.out.println(e.toString());
		}
	}//main
	
	static void sub() throws Exception {	// ����ó�� ȣ��κп� ���ѱ�� = throws
		int result = 10/0;	//new ArithmeticException()
		System.out.println(result);
	}//sub
}
//����ó��+������
//exception�� ArithmeticException�� ����Ŭ������ ArithmeticException ��� ��� �����ϴ�
//���ѱ�� �κа� ���� �κ��� ����ó���� ������ Ŭ������ �Է��ؾ��Ѵ�.