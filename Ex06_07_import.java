//import java.util.Date;
//import java.util.Scanner;
import java.util.*;

import com.javastudy.Car;

//import java.lang.Math;
//import java.lang.System;
//import java.lang.*;	//	java.lang.���� ��� Ŭ������ ����ϰڴ�, Ŭ������ *�� ����� �� �ִ�. 
//							lang��Ű���� ������ �ۼ� ���� ��� �����ϴ�

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
//		System.out.println("�̸� : " + name);
//		System.out.println("����Ÿ� : " + len);
//		
//	}
//}// class car end

public class Ex06_07_import {
	public static void main(String[] args) {
		
		Car c = new Car("�ƹݶ�",3500);	// == com.javastudy.Car c = new com.javastudy.Car(~)
		c.prnCar();
		
		int a = java.lang.Math.max(10,20);	//math.max �޼��� ȣ��
		System.out.println(a);		//20 
		
		double b = Math.abs(-3.2);		//������ java.lang.Math.abs��� �����ؾ���
		System.out.println(b);			//��ܿ� import java.lang.Math;��� �����ϸ� math.max�� �����ϰ� ��밡��
		//java.lang.System.out.print(~)
		
		Scanner sc = new Scanner(System.in); // ctrl+shift+o : ��� import ��������Ű
		
		
		Date d = new Date();	// ctrl+shift+o
		System.out.println(d);
		//��¥ �˾ƺ��� Ŭ����
	}
}	// ����� ���� car class �켱
