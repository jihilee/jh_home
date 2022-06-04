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
			hs.add(num);	//  => new integer(3) = autoboxing 	//���ĵǾ� ��µȴ�.
			count++;
			
			if(hs.size()==6)	//�ߺ��� ���ڸ� �����ϰ� ����ϱ� ���ؼ� hs�� ����� 6���� ��� ����ؾ��Ѵ�.
			break;
		}//count�� 6�� �� 3,4,5���� ��µǴ� ���� : �ߺ��� ���ڰ� ����� ��µ��� �ʴ´�.
		
		System.out.println(hs);		//Integer�� toString ���
		System.out.println("count : " + count);
		System.out.println("--------------------");
		System.out.println();
	}


}
