
public class Ex08_05_Wrapper {

	public static void main(String[] args) {
		
		int a = 10;
		
		Integer it1 = new Integer(11);	//정수를 Integer라는 class 안에 객체로 만들어 참조변수(주소를 넣음)에 넣을 수 있다
		Integer it2 = new Integer(22);
		System.out.println("it1 + it2 : " + (it1 + it2));	//33
		

		Integer it3 = 11;	
		Integer it4 = 22;
		System.out.println("it3 + it4 : " + (it3 + it4));	//33 -> autoboxing***
		
		int it5 = new Integer(11);	// new Integer(11) = 11 -> unboxing***
		
		
		double b = 1.1;
		Double d1 = new Double(1.1);
		System.out.println();
		
		
		
		System.out.println("<parseInt와 valueof의 차이>");
		int x = Integer.parseInt("100");	//parseInt : 문자열 안의 숫자를 정수형으로 바꿔준다(기본형리턴)
		int y = Integer.parseInt("200");
		System.out.println(x+y);	//"100"+"200" != 100200 
		
		
		Integer t = Integer.valueOf("100");		//parseInt : 문자열 안의 숫자를 정수형으로 바꿔준다(class타입 리턴)
		Integer u = Integer.valueOf("200");
		System.out.println(t+u);
		System.out.println();
		
		double z = Double.parseDouble("1.1");	// 실수 1.1 출력
		
		System.out.println("<for문을 통한 정수 배열의 총 합>");
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		System.out.println("합 : " + sum);
		System.out.println();
		
		System.out.println("<for문을 통한 문자열을 정수로 변경, 배열의 합>");
		String[] arr2 = {"10","20","30","40","50"};
		sum=0;
		for(int i=0;i<arr2.length;i++)
		{
			sum += Integer.parseInt(arr2[i]);
		}
		System.out.println("합 : " + sum);
		System.out.println();
		
		System.out.println("<for문을 통한 문자열을 정수로 변경, 점수만 출력, 배열의 합>");
		String[] arr3 = {"슬기:80","크리스탈:90","아이유:40"};
		sum=0;
		for(int i=0;i<arr3.length;i++)
		{
//			int index = arr3[i].indexOf(":");
//			System.out.println(index + ":");		//2 4 3 -> 문자열
//			String sub = arr3[i].substring(index+1);
//			System.out.println(sub);				//"80","90","40"
//			sum += Integer.parseInt(sub);
			
			sum += Integer.parseInt(arr3[i].substring(arr3[i].indexOf(":")+1));
		}
		System.out.println("합 : " + sum);
		System.out.println();
		
		
		
	}

}
// Wrapper class : 기본 데이터를 객체로 만들어야 하는 경우
// int -> Integer, double -> Double ...character boolean float short byte (총8가지)
// 기본자료형은 소문자로, 객체로 만드는 참조변수는 대문자로 시작