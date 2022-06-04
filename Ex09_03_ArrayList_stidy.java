import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex09_03_ArrayList_stidy {

	public static void main(String[] args) {

	ArrayList<String> kor = new ArrayList<String>();
	
	System.out.println("\"ArrayList 공부를 시작합니다\"");
	System.out.println("내용추가 : add | 내용변경 : set");
	System.out.println();
	
	kor.add("나");	// element
	kor.add("사");
	kor.add("라");
	kor.add("마");
	kor.add(0,"가");	//0번 자리에 "가" 추가	
	
	System.out.println("kor.size() : " + kor.size());			// 5
	System.out.println("kor.toString()/kor : " + kor.toString());	//[가, 나, 사, 라, 마] - AbstractCollection<E>의 toString을 오버라이딩
	
	kor.set(2, "다");	// 사 -> 다
	System.out.println("set(2,다) -> kor : " + kor.toString());
	System.out.println();
	
	System.out.println("<Iterator사용하여 kor출력>");
	Iterator<String> it = kor.iterator();	//반복자:kor출력, new쓰지 않는다.
	while(it.hasNext())
	{
		String jaum = it.next();
		System.out.print(jaum + " ");
	}
	System.out.println();
	
	System.out.println();
	System.out.println("문자열 존재유무 확인 : (int)indexOf / (boolean)contains");
	
	int index = kor.indexOf("하");	//위치번호 출력, 없으면 -1
	System.out.println("indexOf(하) : " + index);
	
	boolean con = kor.contains("하");
	System.out.println("contains(하) : " + con);
		
	System.out.println();
	System.out.println("-----------------------------");
	System.out.println();
	
		
	Scanner sc = new Scanner(System.in);
	System.out.println("<Scanner로 글자 입력받아 add로 포함한 자음 indexOf로 확인하기>");
	do {
		System.out.println("자음을 입력하세요.");
		System.out.print(">");
		String j = sc.next();
		System.out.println();
		if(kor.indexOf(j)>-1){		//indexOf
			System.out.println(j + "는 add로 포함한 자음입니다.");}
		else{
			System.out.println(j + "는 add로 포함하지 않은 자음입니다.");}
		System.out.println();
		
		if(kor.contains(j)==true) {	//contain
			System.out.println(j + "는 add로 포함한 자음입니다.");}
		else {
			System.out.println(j + "는 add로 포함하지 않은 자음입니다.");}
		System.out.println();
		
		for(int i=0;i<kor.size();i++)
		{
			
		}
		System.out.print("계속? > ");
		String n = sc.next();
		if(n.equals("n")){
			break;}
		
	}while(true);
	System.out.println("프로그램을 종료합니다");
	System.out.println();
	
		
		
	
	
		
		
		
	}

}
