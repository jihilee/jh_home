import java.util.Scanner;

class Std {
			int kor, eng, math;		// �� ���� �ȿ����� ����ϴ� ����, ���� 3�� ���� �� �ִ� �ڷ��� �ۼ�
									// �������	�⺻�� 0�� ������
			
//			int sum(int k, int m, int e)	//	�Ű�����
//			{
//				return k + m + e; 
//			}
			
			int sum()
			{
				return kor+eng+math;				
			}
			
			double avg()			//avg����
			{
				//return(kor+eng+math)/3;
				return sum() / 3;				// return�� ȣ���� �ڸ��� ���ư��� sum���� ���ٰ� avg�� ���ƿͼ� ��� ���
												// �޼��� �ȿ��� �޼��� ȣ�� ����
			}									// ���� ������ �Ұ���
			
		  }							

public class Ex05_05_�޼��� 
{
	public static void main(String[] args) 
	{
		int kor, eng, math;		// �� ���������� ����ϴ� ����
		
		//Std s = new Std();
		Std s = null;			// ���������� �ʱⰪ, �������� s�� � �ּҰ� ���� ���� �𸥴�.
		s = new Std();			//new Std(); ���� �ۼ��ϸ� ���� ������ ��
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� > ");
		s.kor = sc.nextInt();
		
		System.out.print("�������� > ");
		s.math = sc.nextInt();
		
		System.out.print("�������� > ");
		s.eng = sc.nextInt();
		
		
//		int hap = s.sum(kor,  math,  eng);
//		System.out.println("hap = " + hap);

		int hap = s.sum();
		System.out.println("hap = " + hap);

		double avg = s.avg();
		System.out.println("avg = " + avg);
	}
	
	

}
