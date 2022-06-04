
public class Ex07_03_����ó�� 
{
	public static void main(String[] args) {
	
		try {
			int[] arr = {10,20,30};
			System.out.println(arr[1]);
			System.out.println(arr[3]);	//ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			
			String str = null;
			System.out.println(str.length());	//error, �� ������ ���� ������ ó���ϰ� ���������� ������ �ι�° ������ Ȯ������ ���Ѵ�
												// try_catch�� ù��° ������ ó���Ѵ�
			int result = 3/0;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� Index�� �����Ͽ����ϴ�.");
			System.out.println(e.getMessage());	// Index 3 out of bounds for length 3
			System.out.println(e.toString());	// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		} catch(NullPointerException e) {
			System.out.println("null�� �ʱ�ȭ�� ������ ���̴� ���Ϥ� ���Ѵ�.");
			System.out.println(e.getMessage());	
			System.out.println(e.toString());
		} catch(Exception e){	//Exception catch�� �� ������ �κп� ����ϴ� ���� �����ϴ�/
			System.out.println("������ ��ҽ��ϴ�.");
		} finally {
			System.out.println("finally�κ�");
		}
		
	
	}//main
}//class
//����ó�� ��ü�� �������θ� catch�� ����ϰ� �ʹٸ� catch(Exception e)���·� ����� �� �ִ�
//Exception e : ��� ���ܸ� �� ����ش�, � ������ ������ Ȯ���ϰ� ���� ���� ��ü���� ����ó���� �ʿ��ϴ�