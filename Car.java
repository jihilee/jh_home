package com.javastudy;

import java.util.Date;	// ��Ű�� ����, import�� �� �Ʒ� ��ġ�ؾ��Ѵ�. ������ ������� �ؼ��� �ȵȴ�

public class Car {
	
	private String name;
	private int len;
	
	public Car(String name, int len)	//�������� ����ϱ� ���� public�� ���δ�
	{
		this.name = name;
		this.len = len;
	}
	public void prnCar()
	{
		System.out.println("c.j.�̸� : " + name);
		System.out.println("c.j.�Ÿ� : " + len);
		
		Date d = new Date();
		System.out.println(d);
	}
	
}// class car end

/* ���� ������
- public : ��λ�밡��
- protected : �ڱ� ��Ű��, �ٸ���Ű�� �ڽı��� ��� ����
- default : ���� ��Ű�� ��� ����
- private : �θ�Ŭ���� �ȿ����� ��� ����
- Ŭ����, �޼ҵ�, ���� �տ� ���
- �⺻��Ű������ �ٸ� ��Ű���� �ִ� ���� ��밡�������� 
  �ٸ�import��Ű�������� �⺻��Ű���� �մ� ���� ����ϱ� ��ƴ�*/