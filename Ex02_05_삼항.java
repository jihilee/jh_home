
public class Ex02_05_���� 
{

	public static void main(String[] args) 
	{
		int a=10, b=20;
	
		int result	= a<b ? a : b;		// ���ǹ� ? ���� �� : ������ �� ���
		System.out.println("result : " + result);
		
		String s;
		s = a % 2 == 0 ? "¦��" : "Ȧ��";	// a�� ¦������ Ȧ������ �˾ƺ��� ���ǿ�����
										// s = a % 2 == 1 ? "Ȧ��" : "¦��";�ε� ǥ�� ����
		System.out.println("result : " + s);
		
	}

}
/*	���׿����� : + - * / % += -= && || >= !=
*	���׿����� : -a ++a a-- !  
*	���׿�����(���ǿ�����) : ���ǹ� ? �� : ����	
*/