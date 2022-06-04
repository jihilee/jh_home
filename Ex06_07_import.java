//import java.util.Date;
//import java.util.Scanner;
import java.util.*;

import com.javastudy.Car;

//import java.lang.Math;
//import java.lang.System;
//import java.lang.*;	//	java.lang.안의 모든 클래스를 사용하겠다, 클래스만 *로 대신할 수 있다. 
//							lang패키지만 별도의 작성 없이 사용 가능하다

//class Car {
//	
//	private String name;
//	private int len;
//	
//	Car(String name, int len)
//	{
//		this.name = name;
//		this.len = len;
//	}
//	
//	void prnCar()
//	{
//		System.out.println("이름 : " + name);
//		System.out.println("주행거리 : " + len);
//		
//	}
//}// class car end

public class Ex06_07_import {
	public static void main(String[] args) {
		
		Car c = new Car("아반떼",3500);	// == com.javastudy.Car c = new com.javastudy.Car(~)
		c.prnCar();
		
		int a = java.lang.Math.max(10,20);	//math.max 메서드 호출
		System.out.println(a);		//20 
		
		double b = Math.abs(-3.2);		//원래는 java.lang.Math.abs라고 기입해야함
		System.out.println(b);			//상단에 import java.lang.Math;라고 기입하면 math.max로 간단하게 사용가능
		//java.lang.System.out.print(~)
		
		Scanner sc = new Scanner(System.in); // ctrl+shift+o : 상단 import 생성단축키
		
		
		Date d = new Date();	// ctrl+shift+o
		System.out.println(d);
		//날짜 알아보는 클래스
	}
}	// 가까운 곳의 car class 우선
