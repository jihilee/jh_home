import java.util.ArrayList;
import java.util.Scanner;
class Music2
{


	private String title;
	private String singer;
	private int price;
	
	Music2(String title, String singer, int price)
	{
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	
	public String toString()
	{
		return title+"/"+singer+"/"+price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

public class Ex09_04_teacher {
	public static void main(String[] args)
	{
		ArrayList<Music2> list = new ArrayList<Music2>();
		Scanner sc = new Scanner(System.in);
		
		String title, singer, retry, search_title;
		int price,i;
		boolean flag = false;
		
		do {
		System.out.print("title : ");
		title = sc.next();
		System.out.print("singer : ");
		singer = sc.next();
		System.out.print("price : ");
		price = sc.nextInt();
		
		list.add(new Music2(title, singer, price));
		
		System.out.println("계속?");
		retry = sc.next();
		
		if(retry.equals("n"))
			break;
		
		}while(true);
		
		System.out.println(list);	//list의 toString은 요소(element)의 toString을 호출한다.
		
		do{
			flag = false; //초기화작업, 없는 제목이 또 발견되었을 때 제목이 없음을 출력하기 위해//********
			System.out.println("찾는 제목을 입력하세요.");
			search_title = sc.next();
			
			for(i=0;i<list.size();i++)
			{
				Music2 m = list.get(i);	//music객체 한덩이를 가져와라
				if(m.getTitle().equals(search_title))
				{
					System.out.println(m.getTitle() + "의 가수명은 " + m.getSinger() + "입니다.");
					flag = true;
					break;	// 시간을 줄일 수 있는 방법
				}
			}
			if(flag==false)
			{
				System.out.println("찾는 제목이 없습니다.");
			}
			
			System.out.println("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
			
		}while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
}
//배열 : 같은 타입의 데이터를 한 묶음으로 묶어서 관리하는 것, 위치번호가 0부터 시작한다 (고정된 크기를 갖는다)
//컬렉션 : 클래스로 만든 객체만 저장할 수 있는 여러 데이터를 묶어 관리할 수 있는 저장소 (동적으로 메모리 확장/축소 가능)
//list interface : 중복허용, 순서있다
//set interface : 중복불허, 순서없다.
