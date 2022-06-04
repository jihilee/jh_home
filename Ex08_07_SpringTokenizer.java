import java.util.StringTokenizer;
public class Ex08_07_SpringTokenizer {

	public static void main(String[] args) {
		
		StringTokenizer stn = new StringTokenizer("2022/05/30,10:43",",/");	//매개변수 없는 생성자가 정의되지 않았다.
																			// ,를 기준으로 분리한다
		int count = stn.countTokens();	// token의 개수가 입력됨, 4
		System.out.println("파싱한 갯수 : " + count);	//구분자로 글자를 쪼개는 행위 : 파싱, 파싱된 글자 하나하나 : 토큰
		
		while(stn.hasMoreTokens())		//stn.hasMoreTokens() -> boolean 형태로 t/f리턴
		{
			String s = stn.nextToken();
			System.out.println("s : " + s);
		}
		System.out.println();
		
		String stn2 = "2022/05/31,10;43";
		String[] sp = stn2.split("/");
		System.out.println(sp.length);
		
		int i;
		for(i=0;i<sp.length;i++)
		{
		System.out.println(sp[i] + " ");
		}System.out.println();
	}

}//자바 유틸패키지에 
//특정 문자를 특정한 구분자로 구분하고 싶을 때 SpringTokenizer사용
//SpringTokenizer에서 공백은 기본 구분자, 따로 구분자를 정하지 않으면 자동으로 공백으로 파싱된다
//.split는 구분자 1개밖에 못함 여러개를 하고 싶으면 SpringTokenizer사용한다.