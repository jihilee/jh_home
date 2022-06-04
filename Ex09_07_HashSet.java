import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex09_07_HashSet {
	public static void main(String[] args) {
		
		//HashSet<String> hs = new HashSet<String>();
		Set<String> hs = new HashSet<String>();	//부모가 자식을 관리할 수 있다
		System.out.println(hs.size());
		
		hs.add("banana");
		hs.add("orange");
		hs.add("banana");
		hs.add("melon");
		System.out.println(hs.size());	// 중복 불허, 에러는 아니지만 알아서 들어가지 않음
		
		//System.out.println(hs.get(0));	HashSet에는 get메서드가 없다.
		
		System.out.println(hs);			// 요소의 toString 호출
		System.out.println("--------------------");
		
		for(String s : hs)
		{
			System.out.print(s + " ");
		}
		System.out.println();			//일반for문에는 위치번호가 있어야하는데 Set은 순서가 없어서 불가능하다
		
		//Enumeration<String> en = hs.elements();	//enumeration은 set에서 사용 불가능
		Iterator<String> it = hs.iterator();		//Interator - interface(미완성메서드를가짐) 객체를 만들 수 없다
		while(it.hasNext())	//it로 관리하는게 있느냐
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
	
		System.out.println("--------------------");
		hs.remove("orange");		//object로 되어있으면 어떤 자식이던 넣을 수 있다
		System.out.println(hs);		//삭제하려는 대상만 적어야 한다. 위치번호가 없기 때문에
		System.out.println(hs.contains("banana"));	//contains - boolean형 t/f, 출력문과 함께 기입하여 출력
		System.out.println(hs.contains("banan"));
		
		System.out.println("--------------------");
		System.out.println(hs.isEmpty());	//비어있냐
		hs.clear();	//내용을 모두 지우는 메소드
		System.out.println(hs);
	}

}
//HashSet : 부모는 set, 순서가 없고 중복 불허하다
//List : 순서가 있고, 중복허용한다, ArrayList, Vector

//list와 set은 컬렉션 공간을 만들 때 쓴다. 제공되는 메소드 안되는 메소드 확인