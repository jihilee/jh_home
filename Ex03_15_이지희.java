
public class Ex03_15_이지희 
{
	public static void main(String[] args) 
	{
		
		System.out.println("==구구단을 세로로 출력합니다==");
		System.out.println();
		
		int i, j;
		
		for(i=2;i<10;i++)
		{
			System.out.println("<" + i + "단을 출력합니다>");
			
			for(j=1;j<10;j++)
			{
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("==2 배수 구구단을 출력합니다==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==0)
			{
				System.out.println("<" + i + "단을 출력합니다>");
				
				for(j=1;j<=i;j++)
				{
					System.out.println("    " + i + "*" + j + "=" + (i*j));
				}
			
					System.out.println();
			}
			
		}
		
		System.out.println();
		System.out.println("==2배수 구구단 출력 // 증감식 이용==");
		System.out.println();
		
		
		for(i=2;i<10;i+=2)
		{
			
				System.out.println("<" + i + "단을 출력합니다>");
				
				for(j=1;j<=i;j++)
				{
					System.out.println("    " + i + "*" + j + "=" + (i*j));
				}
			
					System.out.println();
			
		}
		
		System.out.println();
		System.out.println("==2배수 구구단 출력 // continue==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==1)
				continue;		// 참이면 바로 증감식으로 이동
				
			System.out.println("<" + i + "단을 출력합니다>");
				
			for(j=1;j<=i;j++)
			{
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
				System.out.println();
			
		}
		
		System.out.println();
		System.out.println("==2배수 구구단 출력 // break==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==1)
				break;		// 참이면 식을 반복문을 빠져나간다
				
			System.out.println("<" + i + "단을 출력합니다>");
				
			for(j=1;j<=i;j++)
			{
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
				System.out.println();
			
		}
		
		
		System.out.println();
		System.out.println("==2배수 구구단 출력 // break와 continue==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==1)
				continue;		// 증감식으로 이동한다. 홀수단은 건너뛰어라
				
			System.out.println("<" + i + "단을 출력합니다>");
				
			for(j=1;j<=9;j++)
			{
				if(i<j)	
					break;		// 가장 가까운 반복문을 빠져나간다.
				
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
				System.out.println();
			
		}
		
		
		System.out.println();
		System.out.println("==2배수 구구단 출력 // continue와 continue==");
		System.out.println();
		
		
		for(i=2;i<10;i++)
		{
			
			if(i%2==1)
				continue;		
				
			System.out.println("<" + i + "단을 출력합니다>");
				
			for(j=1;j<=9;j++)
			{
				if(i<j)	
					continue;		// j가 i보다 크면 반복문을 빠져나간다.
				
				System.out.println("    " + i + "*" + j + "=" + (i*j));
			}
			
				System.out.println();
			
		}
	}

}

//	break가 속도가 더 빠른 이유
//	break는 참인 순간이 오면 반복문을 바로 빠져나가지만
//	continue는 일단 증감식으로 이동하여 모든 수를 대입해보기 때문에 시간이 비교적 오래걸린다.
