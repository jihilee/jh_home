import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08_06_Math_teacher {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int[] my = new int[6];
		
		//Scanner sc = new Scanner(System.in);
		
		int i,j, count=0;
		for(i=0;i<lotto.length;i++)
		{
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(j=0;j<i;j++)
				if(lotto[i]==lotto[j])
				{
					lotto[i] = (int)(Math.random() * 45) + 1;
					j-=1;
				}
		}
		
		for(i=0;i<my.length;i++) 
		{
			Scanner sc = new Scanner(System.in);	//예외가 발생할 경우에는 스캐너를 다시 만들어야한다
			
			try {
				System.out.print("숫자" + (i+1) + ":");
				my[i] = sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("유효하지 않은 값입니다");
				i--;
				continue;
			}
			
			if(my[i]<1 || my[i]>45)
			{
				System.out.println("1~45사이의 수만 입력하세요.");
				i--;
			}
			//i번쨰 숫자 입력한 상태
			
			for(j=0;j<i;j++)
			{
				if(my[i]==my[j])
				{
					System.out.println("중복됨");
					i--;
					break;
				}
			}
		}
		
		System.out.println("<컴에서 발생시킨 로또번호>");
		for(i=0;i<lotto.length;i++)
		{
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("<내가 입력한 로또번호>");
		for(i=0;i<my.length;i++)
		{
			System.out.print(my[i] + " ");
		}
		
		
		for(i=0;i<lotto.length;i++)
			{
			for(j=0;j<my.length;j++)
				{
					if(lotto[i]==my[j])
					{
						count++;
					}
				}
			}
		
		System.out.println();
		System.out.println("맞은 갯수 : " + count);
		switch(count) 
		{
		case 6 : System.out.println("1등 당첨"); break;
		case 5 : System.out.println("2등 당첨"); break;
		case 4 : System.out.println("3등 당첨"); break;
		default : System.out.println("꽝");
		}
	}

}
