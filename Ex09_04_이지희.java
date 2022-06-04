import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;
	
	Music(String title, String singer, int price)
	{
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	public String toString()
	{
		return title + "/" + singer + "/" + price;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setSinger(String singer)
	{
		this.singer = singer;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public String getTitle()
	{
		return title;
	}
	public String getSinger()
	{
		return singer;
	}
	public int getPrice()
	{
		return price;
	}	
}// Music class end


public class Ex09_04_이지희 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		ArrayList<Music> m = new ArrayList<Music>();
		System.out.println("Music 객체를 생성합니다");
		
		do{
			System.out.print("제목 > ");
			String title = sc.next();
			
			System.out.print("가수 > ");
			String singer = sc.next();
			
			System.out.print("가격 > ");
			int price = sc.nextInt();
			
			m.add(new Music(title, singer, price));
			
			System.out.println("계속 진행 하시겠습니까? (종료 : n)");
			System.out.println(">");
			String stop = sc.next();
			
			if(stop.equals("n"))
			{
				System.out.println("출력을 종료합니다.");
				break;
			}

		}while(true); //do_while end
		
		System.out.println("입력하신 Music 객체를 출력합니다");
		System.out.println(m.toString());	//music객체 출력

		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		
		do {
			flag = true;	//깃발 초기화
			
			System.out.println("음악의 정보를 출력합니다. 곡명을 입력하세요.");
			System.out.print(">");
			String findTitle = sc.next();
			
			
			for(int i=0;i<m.size();i++)
			{
				Music f = m.get(i);
				if(findTitle.equals(f.getTitle()))
				{	
					flag = false;
					System.out.println(f.getTitle() + "의 가수명은 " +  f.getSinger() + " 입니다.");
					break;
				}	
			}
			if(flag == true)
			{
				System.out.println("찾는 제목이 없습니다.");
			}
			
			System.out.println("계속 진행 하시겠습니까? (종료 : n)");
			System.out.println(">");
			String stop = sc.next();
			
			if(stop.equals("n"))		// !retry.equals("y") -> y만 입력하지 않으면 참이다
			{
				System.out.println("출력을 종료합니다.");
				break;
			}
			
		} while(true);
		
	}

}
