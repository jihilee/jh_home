import java.util.HashSet;

public class Ex09_08_HashSet {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		int i;
		
		for(i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------");

		HashSet<Integer> hs = new HashSet<Integer>();

		int count = 0;
		while(true)
		{
			int num = (int)(Math.random() * 10) + 1;
			System.out.println("num : " + num);
			hs.add(num);	//  => new integer(3) = autoboxing 	//정렬되어 출력된다.
			count++;
			
			if(hs.size()==6)	//중복된 숫자를 제외하고 출력하기 위해선 hs의 사이즈를 6으로 잡고 출력해야한다.
			break;
		}//count가 6일 때 3,4,5개만 출력되는 이유 : 중복된 숫자가 생기면 출력되지 않는다.
		
		System.out.println(hs);		//Integer의 toString 출력
		System.out.println("count : " + count);
		System.out.println("--------------------");
		System.out.println();
	}


}
