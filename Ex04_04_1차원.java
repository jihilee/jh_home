import java.util.Scanner;
public class Ex04_04_1����
{

	public static void main(String[] args) 
	{
		
		int [ ] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("<�迭 arr�� ������ �Է¹޾� ����մϴ�>");
		System.out.println();
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print("������ �Է��ϼ��� : ");
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println();
	
		for(i=0;i<arr.length;i++)
		{
			System.out.println("arr[" + i + "] = " + arr[i]);
					
		}
		

	}

}
