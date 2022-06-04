import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex09_02_ArrayList {
	public static void main(String[] args) {
		
		int[] a = {10,20,30};	//3
		// a[3] = 40;
		
		int [] b = new int[3];
		// b[3] = 40;			-> 고정된 크기를 갖는다********
	
		String s  = "hello";
		System.out.println(s.toString());	// 입력된 문자열 출력
		
		ArrayList<String> list = new ArrayList<String>();	//class ArrayList <E>	// 만들어진 객체 공간에 수영이 효연이 각각이 위차해 있는 주소가 들어간다

		list.add("수영");	//요소=element
		list.add("효연");
		list.add("써니");
		list.add("수영");
		list.add(1,"태연");	//1번 위치로 태연이가 들어가고 효연이부터 다음 위치로 옮겨져진다
		
		System.out.println("list.size : " + list.size());	//size : 개수출력, list ->중복 허용
		System.out.println("list : " + list.toString());	//[ , , ]
		//AbstractCollection<E>의 toString을 오버라이딩
		//Object toString은 주소를 리턴 = object를 오버라이딩하지 않음
		list.set(1,"윤아");
		System.out.println("list : " + list);	//내용 변경할 때 set사용 | 추가할 때 add사용
		
		System.out.println();
		System.out.println("============================");
		Iterator<String> it = list.iterator();	//iterator : 반복자, ArrayList에서 iterator 사용가능
		while(it.hasNext())
		{
			String j = it.next();
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("======09_06_iterator->Arraylist에서 사용가능=====");
		System.out.println();
		
		int index = list.indexOf("써니"); // indexOf : 위치번호 출력, 없으면 -1출력
		System.out.println("index : " + index);
		
		boolean con = list.contains("윤아");	//포함되었느냐 t/f
		System.out.println("con : " + con);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원명을 입력하세요.");
		System.out.print("이름 > ");
		String name = sc.next();
		if(list.indexOf(name) > -1)	//indexof
		{
			System.out.println(name + "는(은) 가입한 회원입니다.");	
		}
		else
		{
			System.out.println(name + "는(은) 가입하지 않은 회원입니다.");
		}
		if(list.contains(name)==true)	//contains
		{
			System.out.println(name + "는(은) 가입한 회원입니다.");	
		}
		else
		{
			System.out.println(name + "는(은) 가입하지 않은 회원입니다.");
		}
		System.out.println();
		
		boolean flag = true;
		for(int i=0;i<list.size();i++)
		{
			String g = list.get(i);
			if(g.equals(name))
			{
				flag = false;	//강제 내용변환 = 가입한 회원을 찾았다는 의미
				System.out.println(name + "는(은) 가입한 회원입니다.");
			}
		}
		if(flag == true)	//가입한 회원을 못찾았으니 여전히 flag값은 true이다
		{
			System.out.println(name + "는(은) 가입하지 않은 회원입니다.");
		}
		
		
		
		System.out.println("--------------");
		System.out.println();
		
		String g = list.get(0);		//E get(int index) : 아직은 무슨 타입인지 모르나 사용자가 지정한 타입으로 리턴된다
		System.out.println(g);
		String g1 = list.get(1);
		System.out.println(g1);
		
		System.out.println("--------------");
		System.out.println();
		
		list.remove(2);
		System.out.println(list);
		list.remove("수영");				// object가 String(upcasting)을 받아주기 때문에 
		System.out.println(list);		// 문자열만 입력해도 출력가능, 첫번째 수영이가 삭제됨
		
		System.out.println();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(new Integer(10));	//new Integer(10)	->	기본타입11이 new Integer(11)로 오토박싱******
		list2.add(20);
		list2.add(30);		
		System.out.println(list2.size());
		System.out.println(list2.toString());
		System.out.println(list2);				//toString 생략가능
		System.out.println("--------------");
		System.out.println();
		
		Integer i1 = list2.get(1);
		System.out.println(i1);
		Integer i2 = list2.get(2);
		System.out.println(i2);
	}

}
//array : 같은 타입의 데이터를 한 묶음으로 묶어서 관리하는 것, 위치번호가 0부터 시작한다, 고정된 크기를 갖는다.
//컬렉션(=저장공간) : 여러 데이터를 묶으서 관리할 수 있다. 고정된 크기가 아니다(=동적으로 메모리를 확장/축소할 수 있다)
//		 		  회원정보를 담을 수 있는 저장소를 만들 때 필요, 객체만 저장할 수 있다**, 저장소
//ArrayList : 컬렉션을 만들 수 있는 클래스
//ArrayList의 toString : element의 toString()을 호출
//
//length : 배열의 길이 (방의 개수)
//length() : 문자열의 개수
//size() : 컬렉션 안 요소의 개수
//size : 존재 안함
//list : 순서(위치번호)있다, 중복허용, ArrayList, Vector
//set : 순서없다, 중복불허, hashSet