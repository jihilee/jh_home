import java.util.Scanner;

public class Ex07_05_����ó�� {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100) + 1;	// ����
//		System.out.println(answer);
		
		/*  0*100 <= d < 1*100
		 *	0.xx < = d < 99.xx
		 *  0+1 < = d <= 99+1
		 *  1 <= d <= 100
		 *  
		 *  a���� b������ �������� ?�� ���ϰ� ���� �� (a <= ? <= b),
		 *  (int)Math.random() * [(b-a)+1]) + a
		 */
		
			int input;
			int count = 0;
			
			do{
				count++;
				System.out.println("1~100 ������ ������ �Է��ϼ���.");
				Scanner sc = new Scanner(System.in);
				
				try {
					System.out.println(">");
					input = sc.nextInt();
					
					if(input <= 0) {	//������ ���� �߻���ų ��
						throw new Exception();}
					}catch(Exception e) {
						System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� �Է��ϼ���.");
						System.out.println(e.toString());
						continue;
					}//���ܸ� �̿��� �����ϱ� ���� �ۼ��ϴ� try_catch
				
				if(answer > input)
					System.out.println("�� ū ���� �Է��ϼ���");
				else if(answer < input)
					System.out.println("�� ���� ���� �Է��ϼ���");
				else{
					System.out.println("�����Դϴ�");
					System.out.println("�õ��� Ƚ���� " + count + "�Դϴ�");
					break;
					}
			}while(true);
				System.out.println("���α׷��� �����մϴ�.");
	
	}

}
