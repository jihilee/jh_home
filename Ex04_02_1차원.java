
public class Ex04_02_1차원 
{
	public static void main(String[] args) 
	{
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		System.out.println("배열 score의 길이 : " + score.length);
		
		System.out.println();
		System.out.println("<일반 for문을 활용한 배열 score 출력>");
		
		int i;
		
		for(i=0;i<score.length;i++)
		{
			System.out.print(score[i] + " ");
		}

		System.out.println();
		
		System.out.println();
		System.out.println("<확장 for문을 활용한 배열 score 출력>");
	
		for(int j : score)		// 확장 for -> for(새로운 변수 선언 : 참조변수) {System~ln(새변수);}
		{
			System.out.print(j + " ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("<일반 for문을 활용한 배열 덧셈>");
		
		int sum=0;
		for(i=0;i<score.length;i++)
		{
			System.out.print(score[i] + " \n");
			sum = sum + score[i];
		}

		System.out.println("sum = " + sum);
		
		
		System.out.println();
		System.out.println();
		System.out.println("<확장 for문을 활용한 배열 덧셈>");

		sum=0;
		for(int t : score)
		{
			System.out.println(t + " ");
			sum = sum + t;
		}
		
		System.out.println("sum = " + sum);
		System.out.println();
		

		System.out.println();
		System.out.println("<일반 for문을 활용한 배열 평균>");
		
		int avg = 0;
		
		sum=0;
		
		for(i=0;i<score.length;i++)
		{	
			sum = sum + score[i];
		}
		
		avg = sum / score.length;
		System.out.println("배열 i의 평균 : " + avg);
		
		
		System.out.println();
		System.out.println();
		System.out.println("<일반 for문을 활용한 배열 최소값, 최대값>");
		
		int min, max;
		
		max = score[0];
		min = score[0];
		
		// int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		for(i=1;i<score.length;i++)	// max를 score[0]으로 선언했기 때문에 i는 1부터 시작한다.
		{
			if(max<score[i])
			{
				max = score[i];
			}
		}
		
		for(i=1;i<score.length;i++)
		{
			if(min>score[i])
			{
				min = score[i];
			}
		}
		
		System.out.println("최대값 max는 " + max + "입니다.");
		System.out.println("최솟값 min는 " + min + "입니다.");

		System.out.println();
	}

}
