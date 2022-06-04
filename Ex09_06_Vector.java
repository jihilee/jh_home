import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex09_06_Vector {

	public static void main(String[] args) {
	
		int i;
		
		Vector<String> v = new Vector<String>();
		System.out.println(v.size());
		v.add("봄");
		v.add("여름");
		v.add("봄");
		v.add("겨울");
		System.out.println(v.size());	//중복허용
		System.out.println(v);			//[봄, 여름, 봄, 겨울] String의 toString 출력 
		System.out.println(v.get(0));
	
		for(i=0;i<v.size();i++)
		{
			String s = v.get(i);		//**************
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(String s : v)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println("---Enumeration---");
		Enumeration<String> en = v.elements();	//Enumeration : 열거된 데이터를 관리할 수 있는 인터페이스 타입
												// elements는 벡터만 가지고 있다. 
		while(en.hasMoreElements())	//hasMoreElements : boolean : en변수로 관리하는 것이 있냐
		{
			String t = en.nextElement();
			System.out.print(t + " ");
		}
		System.out.println();System.out.println("-----------------");
		System.out.println();
		
		System.out.println("-----iterator----");
		Iterator<String> it = v.iterator();	//iterator : 반복자, ArrayList에서 iterator 사용가능
		while(it.hasNext())
		{
			String j = it.next();
			System.out.print(j + " ");
		}
		System.out.println();

		
	}
	

}
//둘다 부모는 list인터페이스다
//둘다 중복 가능