import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex09_10_HashMap {
	public static void main(String[] args) {

		Map<String, String> dic = new HashMap<String, String>();	//부모타입map으로 자식타입을 관리할 수 있다
		
		dic.put("pencil", "연필");
		dic.put("sky", "하늘");
		dic.put("desk", "책상");
		dic.put("face", "얼굴");
	
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는 단어는? (q입력 시 종료)");
		System.out.print("> ");
		String word = sc.next();
		
		if(word.equals("q"))
		{
			break;
		}
		
		if(dic.get(word)==null)
		{
			System.out.println("잘못 입력하셨습니다.");
		}
		else
		{
			System.out.println("뜻 : " + dic.get(word));		//****굳이 for문 돌리지 않아도 된다*****
		}
	
//		Set<String> k = dic.keySet();
//		for(String x : k)
//		{
//			if(x.equals(word))
//			{
//				System.out.println("뜻 : " + dic.get(x));
//			}
//		}
//		System.out.println();
		
		}while(true);

		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}

}
//hashmap = 키로 벨류를 찾을 수 있다, 검색할 때(사전, 명함관리) 주로 사용된다

//list : 순서가있고 중복허용
//set : 순서가 없고 중복불허
//map : 키와 벨류의 쌍으로 구성한다. 키는 중복불허, 벨류는 중복가능