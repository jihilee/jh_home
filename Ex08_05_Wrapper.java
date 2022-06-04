
public class Ex08_05_Wrapper {

	public static void main(String[] args) {
		
		int a = 10;
		
		Integer it1 = new Integer(11);	//������ Integer��� class �ȿ� ��ü�� ����� ��������(�ּҸ� ����)�� ���� �� �ִ�
		Integer it2 = new Integer(22);
		System.out.println("it1 + it2 : " + (it1 + it2));	//33
		

		Integer it3 = 11;	
		Integer it4 = 22;
		System.out.println("it3 + it4 : " + (it3 + it4));	//33 -> autoboxing***
		
		int it5 = new Integer(11);	// new Integer(11) = 11 -> unboxing***
		
		
		double b = 1.1;
		Double d1 = new Double(1.1);
		System.out.println();
		
		
		
		System.out.println("<parseInt�� valueof�� ����>");
		int x = Integer.parseInt("100");	//parseInt : ���ڿ� ���� ���ڸ� ���������� �ٲ��ش�(�⺻������)
		int y = Integer.parseInt("200");
		System.out.println(x+y);	//"100"+"200" != 100200 
		
		
		Integer t = Integer.valueOf("100");		//parseInt : ���ڿ� ���� ���ڸ� ���������� �ٲ��ش�(classŸ�� ����)
		Integer u = Integer.valueOf("200");
		System.out.println(t+u);
		System.out.println();
		
		double z = Double.parseDouble("1.1");	// �Ǽ� 1.1 ���
		
		System.out.println("<for���� ���� ���� �迭�� �� ��>");
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		System.out.println("�� : " + sum);
		System.out.println();
		
		System.out.println("<for���� ���� ���ڿ��� ������ ����, �迭�� ��>");
		String[] arr2 = {"10","20","30","40","50"};
		sum=0;
		for(int i=0;i<arr2.length;i++)
		{
			sum += Integer.parseInt(arr2[i]);
		}
		System.out.println("�� : " + sum);
		System.out.println();
		
		System.out.println("<for���� ���� ���ڿ��� ������ ����, ������ ���, �迭�� ��>");
		String[] arr3 = {"����:80","ũ����Ż:90","������:40"};
		sum=0;
		for(int i=0;i<arr3.length;i++)
		{
//			int index = arr3[i].indexOf(":");
//			System.out.println(index + ":");		//2 4 3 -> ���ڿ�
//			String sub = arr3[i].substring(index+1);
//			System.out.println(sub);				//"80","90","40"
//			sum += Integer.parseInt(sub);
			
			sum += Integer.parseInt(arr3[i].substring(arr3[i].indexOf(":")+1));
		}
		System.out.println("�� : " + sum);
		System.out.println();
		
		
		
	}

}
// Wrapper class : �⺻ �����͸� ��ü�� ������ �ϴ� ���
// int -> Integer, double -> Double ...character boolean float short byte (��8����)
// �⺻�ڷ����� �ҹ��ڷ�, ��ü�� ����� ���������� �빮�ڷ� ����