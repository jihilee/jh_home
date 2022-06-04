package com.javastudy;

import java.util.Date;	// 패키지 먼저, import는 그 아래 위치해야한다. 순서를 내맘대로 해서는 안된다

public class Car {
	
	private String name;
	private int len;
	
	public Car(String name, int len)	//공용으로 사용하기 위해 public을 붙인다
	{
		this.name = name;
		this.len = len;
	}
	public void prnCar()
	{
		System.out.println("c.j.이름 : " + name);
		System.out.println("c.j.거리 : " + len);
		
		Date d = new Date();
		System.out.println(d);
	}
	
}// class car end

/* 접근 제어자
- public : 모두사용가능
- protected : 자기 패키지, 다른패키지 자식까지 사용 가능
- default : 같은 패키지 사용 가능
- private : 부모클래스 안에서만 사용 가능
- 클래스, 메소드, 변수 앞에 사용
- 기본패키지에서 다른 패키지에 있는 것은 사용가능하지만 
  다른import패키지에서는 기본패키지의 잇는 것을 사용하기 어렵다*/