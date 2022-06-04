import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_09_Date {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now);	//toString 생략_ 부모의 toString이 싫어 오버라이딩한 것이 존재
		
		System.out.println(now.getMonth()+1); 	//월-1 출력 deprecated:곧 없어질 가능성이 있는 메소드다
		System.out.println(now.getDate());		//일 출력
		System.out.println(now.getDay());		//요일출력 월==1
		System.out.println(now.getHours());		//시
		System.out.println(now.getMinutes());	//분
		System.out.println(now.getSeconds());	//초
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("YY-MM-d");
		System.out.println(sdf1.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm:ss");
		System.out.println(sdf2.format(now));	//대문자M은 월, 소문자m은 분, E는 요일
		
		
	}

}
