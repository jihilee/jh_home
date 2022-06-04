
public class Ex05_08_재귀호출 	// 재귀 호출 : show method 안에서 show method를 호출하는 것 내가 나를 호출하는 것
{
	public static void main(String[] args) 
	{
		show(3);
	}

	static void show(int cnt)				//static 붙은 method에서 호출하는거면 void 앞에 static 붙여야함
	{
		System.out.println("Hi~^^" + cnt);
		
		if(cnt==1)
			return;	
		show(--cnt);
	}
}
