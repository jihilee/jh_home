import java.util.HashMap;
import java.util.Set;

public class Ex09_09_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();	//	HashMap<k,v>

		System.out.println(hm);
		System.out.println(hm.size());
		hm.put("슬기", 30);		//key, value
		hm.put("조이", 25);
		hm.put("웬디", 12);
		hm.put("웬디", 30);		//마지막에 쓴 값으로 출력된다, 순서없다
		hm.put("아이린", 25);
		
		System.out.println(hm.size());	//멥은 순서를 유지하지 않는다
		System.out.println(hm);			//key=value, String의 toString, Integer의 toString 리턴
	
		//HashMap의 toString기능 : key와 value의 toString을 {key=value}형식으로 리턴한다
	
		System.out.println();
		Integer a = hm.get("조이");
		System.out.println("조이 : " + a);
		System.out.println("웬디 : " + hm.get("웬디"));	//get : 키에 해당하는 벨류를 출력함
		System.out.println(hm.get("아이유"));				//null : 없는 키를 입력하면 널값 출력
		System.out.println(hm.get(30));					//get(key)만 가능하다. 없으면 null값이 나온다/
	
		
		System.out.println();
		boolean b = hm.containsKey("웬디");	//키의 유무 boolean
		System.out.println("containsKey(\"웬디\") : " + b);
		System.out.println(hm.containsKey("이수현"));
		
		boolean c = hm.containsValue(12);		//hashmap에서 결과값을 찾는데 덮어쓰기 당해서 false값 출력
		System.out.println("containsValue(12) : " + c);
		
		System.out.println();
		Set<String> s = hm.keySet();	//key가 String이니깐 set도 String으로 지정해줌
		System.out.println(s);
		
		for(String x : s)				//key값만 출력
		{
			System.out.println(x + " : " + hm.get(x));	//hm.get(x) : 키만 알면 벨류는 get으로 가져울 수 있다
		}
		System.out.println();
		
		hm.remove("아이린");
		System.out.println(hm);	//키만 지우면 벨류값도 같이 지워진다
		
		
	}

}
//멥은 순서를 유지하지 않는다(위치번호가 없다=set)
//키는 중복을 허용하지 않고 값은 중복을 허용한다.