//class String{
//	int length()
//	{
//		
//	}
//}

public class Ex07_01_NullPointerException 
{
	public static void main(String[] args) 
	{
		try{
			String str = null;				// ���������� � ���� �־������ �𸣰��� �� null
			//String str = "Orange";		// == new String("Orange");
			System.out.println(str);
			System.out.println(str.length());	//new NullPointerException() 
												//������ ���� ���ڱ� ���������� �̷��� ������ü�� ���������			
			System.out.println("����ó��");	//������ �κп��� ����� �����.
			//����ó�� : �ܼ�â�� �������ڰ� ������ �ʵ��� �ϴ� ó������, ��ġ �������� ����ó�� ���̰� ��
			
			// NullPointerException e = new NullPointerException();
			
		} catch(NullPointerException e) {	//�����߻��ϸ� ��� catch�� �̵� -> ������ ó���ϴ�
			System.out.println("�����߻�");
		} finally{
			System.out.println("finally�κ�");
		}
		
	}//main end

}//class end
// catch:�����߻��ϸ� ���, finally:��������������� ���
//�����Ͽ��� : ��Ÿ, �ڷ���üũ
//��Ÿ�ӿ��� : �迭���� �Ѿ ��, ������ �� �߻��ϴ� ����
//			-���� : �޸� ���� ���� �ڵ忡 ���� ������ �� ���� ����
//			-���� : �ڵ忡 ���� ������ �� �ִ� ����


/*java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException			-> ***
java.lang.NullPointerException*/

/*java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException	-> RuntimeException�� ��ӹ޴� �������� ���� �� �ϸ� �̷��� ������ �߻����� �ʴ´�
java.lang.IndexOutOfBoundsException
java.lang.ArrayIndexOutOfBoundsException*/

/*java.lang.Object
java.lang.Throwable				-> RuntimeException�� ��ӹ��� �ʴ� �������� �Ű澴�ٰ� Ȯ���� �� �ִ� ������ �ƴϴ�
java.lang.Exception					���� interruption~�� ���� �������� ������ try/catch�� ����ؼ� ����ó���� ���־���Ѵ�.
java.lang.InterruptedException*/