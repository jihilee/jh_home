import java.util.Calendar;

public class Ex08_08_Calendar {

	public static void main(String[] args) {

		//Calendar cal = new Calendar():
		//객체를 만들 수 없는 이유 : 생성자가 protected -> protected는 어디에만 접근 가능하다
		
		Calendar cal = Calendar.getInstance();	//카렌다는 추상클래스임으로 객체를 스스로 만들 수 없다. 이를 도와주는 생성자
		System.out.println(cal);				//toString생략가능
		System.out.println(cal.toString());		//카렌다가 부모의 toString을 오버라이딩하였다.	
											
		int i = cal.get(Calendar.YEAR);
		System.out.println(i + "년");
		System.out.println(cal.get(Calendar.MONTH)+1 + "월");	//컴퓨터의 1월은 0, 5월은 4
		System.out.println(cal.get(Calendar.DATE) + "일");

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		
		if(ampm == Calendar.AM)		//FINAL Calendar.AM==0, PM==1
		{
			System.out.print("현재 시간은 오전 ");
		}
		else
		{
			System.out.print("현재 시간은 오후 ");
		}
		System.out.println(hour + "시 "+ minute + "분 " + second + "초");
		
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");	// 일요일 = 1
		String[] week = {"","일","월","화","수","목","금","토"};		// 배열의 방번호를 일치시켜 요일 출력
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)] + "요일");
	
	}

}
