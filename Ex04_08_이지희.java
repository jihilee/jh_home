import java.util.Scanner;
public class Ex04_08_이지희 
{
	public static void main(String[] args) 
	{
		int num, std_Num;
		
		int i, j;
		int[] score = null;	//학생 수 null로 선언 & 초기화 ***참조변수는 주소만 들어갈 수 있다. 주소가 들어가기 전이다 = null이라고 입력해야 함****
																					// 공간이 만들어지기 전이다
		while(true)
		{
			System.out.println();
			System.out.println("********************번호를 입력하세요********************\n");
			System.out.println(" 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료\n");
			System.out.print(" 선택> ");
			
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
					
			//if문을 switch case문으로 변경해보기
			if(num==1)
			{
				System.out.println();
				System.out.println(" 1.학생수를 선택하였습니다.");
				
				System.out.println();
				System.out.println(" 학생 수를 입력하세요.");
				System.out.print(" 학생수 > ");
				
				std_Num = sc.nextInt();
				
				score = new int[std_Num];	// 학생 수 입력받기		****score라는 배열을 생성*****
				
				System.out.println();
			}
			
			else if(num==2)
			{
				if(score == null)			//*******
				{
					System.out.println();
					System.out.println(" 1번 먼저 진행하세요.\n");
					continue;								//	****아래는 건너뛰고 위로 이동******
				}
				
				System.out.println();
				System.out.println(" 2. 점수입력을 선택하였습니다.");
				
				System.out.println();
				System.out.println(" 점수를 입력해주세요.");
				
				for(i=0;i<score.length;i++)
				{
					System.out.print(" scores[" + i + "]: ");
					score[i] = sc.nextInt();			
				}
				
				System.out.println(" 점수 입력을 완료하였습니다.");
				System.out.println();
			}
			
			
			
			else if(num==3)
			{
				if(score==null)
				{
					System.out.println();
					System.out.println(" 1번 먼저 진행하세요.\n");
					continue;
				}
				
				System.out.println();
				System.out.println(" 3.점수리스트를 선택하였습니다.");
				
				System.out.println();
				System.out.println(" 당신의 점수를 출력합니다.");
				System.out.println();
				
				for(i=0;i<score.length;i++)
				{
					System.out.printf(" scores[%d] : %d", i, score[i]);
					System.out.println();
				}
				
				System.out.println();
			}
			
			
			
			else if(num==4)
			{
				if(score == null)
				{
					System.out.println();
					System.out.println(" 1번 먼저 진행하세요.\n");
					continue;
				}
				
				System.out.println();
				System.out.println(" 4.분석을 선택하였습니다.");
				System.out.println();
				
				int max, min, sum, avg, arr, temp;
				
				max = score[0];
				min = score[0];
				for(i=1;i<score.length;i++)				//최댓값
				{
					if(max<score[i])
						max = score[i];
				}
				for(i=1;i<score.length;i++)				//최솟값
				{
					if(min>score[i])
						min = score[i];
				}
				
				System.out.print(" 최고 점수 : " + max + " 점");	
				System.out.println();
				
				System.out.print(" 최저 점수 : " + min + " 점");				// 최저 점수
				System.out.println();
				
				
				sum = 0;
				for(i=0;i<score.length;i++)
				{
					sum = sum + score[i];
				}
				System.out.print(" 점수 합계 : " + sum + " 점");				// 점수 합계
				System.out.println();
				
				avg = sum / score.length;
				System.out.print(" 점수 평균 : " + avg + " 점");				// 점수 평균 
				System.out.println();
				

				temp = 0;
				for(i=0;i<score.length-1;i++)					//score.length-1 마지막 회전은 굳이 돌릴 필요가 없다. 그러므로 -1을 해야 함
				{
					for(j=i+1;j<score.length;j++)
					{
						if(score[i] > score[j])
						{
							temp = score[i];
							score[i]= score[j];
							score[j] = temp;
						}											
					}
				}													// 정렬
				
				System.out.print(" 점수 정렬 : ");
				
				for(i=0;i<score.length;i++)
				{
					System.out.print(score[i] + " ");
				}
				System.out.println();
				
				
				
				
				System.out.println();
				System.out.println(" 정렬의 결과를 이용한 최저점수는 " + score[0]);
				System.out.println(" 정렬의 결과를 이용한 최고점수는 " + score[score.length-1]);
				
				
				
				sum = 0;
				for(int s : score)
				{
					sum += s;
				}
				System.out.println(" 확장for문을 이용한 총합은 " + sum);
				
				
				
				System.out.println();
				System.out.println(" 분석을 완료하였습니다.");
				
				
				System.out.println();
	
				
			}
			
			
			
			else if(num==5)
			{
				System.out.println();
				System.out.println(" 5.종료를 선택하였습니다.");
				break;
			}
			
			
			
			else
			{	
				System.out.println();
				System.out.println(" 잘못 입력하였습니다. 1~5 사이의 번호를 입력하세요.\n");
				continue;
			}
			
			
		}	//while
		
		System.out.println();
		System.out.println("*******************프로그램을 종료합니다******************");
		
	}	//main

}

//괄호 안에 변수를 선언하면 그 변수는 괄호 밖에는 영향을 미치지 않는다. 
