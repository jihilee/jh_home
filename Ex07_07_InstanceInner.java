class Car2 {
	Car2name name;
	String color;

	class Car2name {
		String model; 
		int year;
		Car2name(String model, int year) {
			this.model = model;
			this.year = year;
		}

		Car2name(String model, int year, String col) {
			this.model = model;
			this.year = year;
			color = col; 		//car2name입장에서 봤을 때 color는 멤버변수가 아니기 때문에 this를 붙이지않는다
		}

		void Outcolor() {
			System.out.println("model:"+model+" 연식:"+year+" 색상:" + color + "입니다.");
		}
	}// car2 name end -> 클래스 안에 선언된 클래스
	 // 외부 클래스에 불필요한 정보를 감춤으로써 복잡성을 줄인다

	Car2(String model, int year, String color) {
		name = new Car2name(model,year);
		this.color = color;
	}

	void OutInfo() {
		System.out.printf("모델 = %s, 년식 = %d, 색상 = %s\n",
				name.model, name.year, color);
	}
}// car2 end

public class Ex07_07_InstanceInner {
	public static void main(String[] args) {
		Car2 pride = new Car2("프라이드", 2005, "파랑");
		pride.OutInfo(); // 모델 = 프라이드, 년식 = 2005, 색상 = 파랑
		System.out.println();
		
		pride.name.Outcolor(); // model:프라이드 연식:2005 색상:파랑입니다.
		System.out.println();
		
		//Outer.Inner 변수명 = 외부객체.new Inner(생성자 인수)
		Car2.Car2name pride2 = pride.new Car2name("프랑이", 2009);
		pride2.Outcolor(); // model:프랑이 연식:2009 색상:파랑입니다.
		System.out.println();
		
		Car2.Car2name pride3 = pride.new Car2name("노란프랑이", 2015,"노랑");
		pride3.Outcolor(); // model:노란프랑이 연식:2015 색상:노랑입니다.
		System.out.println();
		
		pride.OutInfo(); 
		System.out.println();
		
		pride.name.Outcolor();
		
	}
}
//바깥쪽 클래스에 접근하려면 바깥쪽 클래스의 객체를 만든 후 메소드나 참조변수를 통해 접근할 수 있엇다
//안쪽 클래스에 접근하려면 바깥클래스의 객체를 통해 참조변수를 만들어야한다 