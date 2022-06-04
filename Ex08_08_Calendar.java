import java.util.Calendar;

public class Ex08_08_Calendar {

	public static void main(String[] args) {

		//Calendar cal = new Calendar():
		//��ü�� ���� �� ���� ���� : �����ڰ� protected -> protected�� ��𿡸� ���� �����ϴ�
		
		Calendar cal = Calendar.getInstance();	//ī���ٴ� �߻�Ŭ���������� ��ü�� ������ ���� �� ����. �̸� �����ִ� ������
		System.out.println(cal);				//toString��������
		System.out.println(cal.toString());		//ī���ٰ� �θ��� toString�� �������̵��Ͽ���.	
											
		int i = cal.get(Calendar.YEAR);
		System.out.println(i + "��");
		System.out.println(cal.get(Calendar.MONTH)+1 + "��");	//��ǻ���� 1���� 0, 5���� 4
		System.out.println(cal.get(Calendar.DATE) + "��");

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		
		if(ampm == Calendar.AM)		//FINAL Calendar.AM==0, PM==1
		{
			System.out.print("���� �ð��� ���� ");
		}
		else
		{
			System.out.print("���� �ð��� ���� ");
		}
		System.out.println(hour + "�� "+ minute + "�� " + second + "��");
		
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "����");	// �Ͽ��� = 1
		String[] week = {"","��","��","ȭ","��","��","��","��"};		// �迭�� ���ȣ�� ��ġ���� ���� ���
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)] + "����");
	
	}

}
