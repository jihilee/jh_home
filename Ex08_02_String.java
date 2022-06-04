//import java.lang.String;  -> java.lang패키지는 자동 생성

/*class String extends Object
{
	length()
	{
		길이출력
	}
	equals()
	{
		//문자열비교
	}
	toString()
	{
		
	}
}*/

public class Ex08_02_String {
	public static void main(String[] args) {
		
		String str1 = "Nice Day ";
		String str2 = new String("nice Day ");	//리터럴 형태로 쓴다
		String str3 = "Ha ha";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println(str1 == str2);	
		System.out.println("----------------");
		
		
		int len = str1.length();
		System.out.println("len : " + len);
		
		boolean eq = str1.equals(str2);
		System.out.println("eq : " + eq);	
	
		System.out.println("str1.equalsIgnoreCase : " + str1.equalsIgnoreCase(str2));	
		// equalsIgnorecase : boolean return, 대소문자 구별 안함
		int c = str1.compareTo(str2);	//같으면 0, 다르면 0이 아닌 값 출력
		System.out.println("c : " + c);	
		
		System.out.println("----------------");
		
		
		String str1_Upper = str1.toUpperCase();
		System.out.println("str1_Upper : " + str1_Upper);
		
		System.out.println("str2.toLowerCase : "+ str2.toLowerCase());
		
		System.out.println(str1 + str3);	//연결
		System.out.println("concat : " + str1.concat(str3));
		System.out.println("----------------");
		
		
//		String str1 = "Nice Day ";
//		String str2 = new String("nice Day ");	//리터럴 형태로 쓴다
//		String str3 = "Ha ha";
		
		
		System.out.println(str1.indexOf("Day"));	//day의 시작 위치 반환, 0부터 시작
		System.out.println(str1.indexOf("java"));	//찾는 문자가 없을 때 -1반환
		System.out.println(str1.charAt(2));			//2째에 위치한 문자 출력
		System.out.println(str1.substring(2,7));	//2째부터 7번째 앞까지만 출력
		System.out.println(str1.substring(2));		//2째부터 마지막까지 출력
		System.out.println(str1.replace("a","x"));	//변경해주는 메서드
	}
	

}
