class Fruits		// (extends Object) 모든 클래스는 Object라는 클래스를 상속받는다, 
{					//object : 모든 클래스의 조상클래스
	String name;
	int price;
	
	Fruits(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	public String toString()	//주소가 리턴되는 부모의 toString overriding
	{
		//System.out.println(name + "," + price);
		return name + "," + price;
	}
	public boolean equals(Object obj)	//Object obj = (Object)new Fruits<-upcasting
	{	//this가 f1(100번지)을 받는다
		//obj가 f2(200번지)를 받는다(this,Object obj)
		
		//Object obj = new Integer(10);
		//Object obj = 10;	-> autoboxing
		
		if(obj instanceof Fruits)
		{
			Fruits fr2 = (Fruits)obj;	//fr2에 200번지
			//return this.price == fr2.price;	//과일 가격비교
			return this.name.equals(fr2.name);	//문자열 비교는 equals로 비교
		}
		else
			return false;
	}
}
public class Ex08_01_Object {
	public static void main(String[] args) {
		
		String s = "apple"; // new String("apple");
		
		Fruits f1 = new Fruits(new String("apple"),1000);
		Fruits f2 = new Fruits(new String("apple"),1000);

		System.out.println(f1.toString());
		System.out.println(f2);	//=f2.toString()
		//toString method는 참조변수만 사용해도 toString이 호출된다(조건:public, return값, toString)
		
		System.out.println(f1.price);
		System.out.println(f2.price);
		System.out.println(f1.price == f2.price);
		System.out.println(f1.name == f2.name);
		
		System.out.println("-------------");
		System.out.println(f1.equals(f2));	//f1,f2
	}

}
// object가 리턴하는 toString은 주소를 리턴하는 기능이 탑재되어있다
// toString은 자주 사용하는 문자 출력할 때 사용하기 알맞다
/* Object
 * String toString() : 주소리턴 
 * boolean equals() : 주소비교한 결과 리턴 t/f
 * String
 * String toString() : 문자열리턴 
 * boolean equals() : 문자열 비교 결과 리턴 t/f*/
//숫자는 ==으로 비교, 문자열은 equals로 비교