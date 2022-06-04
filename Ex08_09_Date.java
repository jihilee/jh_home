import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_09_Date {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now);	//toString ����_ �θ��� toString�� �Ⱦ� �������̵��� ���� ����
		
		System.out.println(now.getMonth()+1); 	//��-1 ��� deprecated:�� ������ ���ɼ��� �ִ� �޼ҵ��
		System.out.println(now.getDate());		//�� ���
		System.out.println(now.getDay());		//������� ��==1
		System.out.println(now.getHours());		//��
		System.out.println(now.getMinutes());	//��
		System.out.println(now.getSeconds());	//��
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("YY-MM-d");
		System.out.println(sdf1.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh:mm:ss");
		System.out.println(sdf2.format(now));	//�빮��M�� ��, �ҹ���m�� ��, E�� ����
		
		
	}

}
