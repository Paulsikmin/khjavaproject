package com.kh.day07.oop;

public class Circle {	// Ŭ���� ����(class Circle), Ŭ���� ���� ���� public
	
	// �ʵ�	
	// ��� ����
	public int radius;		// ���� ������ public
	public String name;
//	public int radius = 1;
//	public String name = "��";
	
	// (�⺻)������
	//	-> ���� ����
	// Ŭ������� �̸��� ���ƾ� �Ѵ�
	// ��ü ����!
	// �ʵ� �ʱ�ȭ!
	public Circle() {	// ���� ������ public
		this.radius = 1;
		this.name = "��";
	}
	
	// ��� �޼ҵ�
	// ��ȯ���� �ִ� �޼ҵ�(��ȯ���� ����, return)
	public double getArea() {	// ���� ������ public
		double area = 3.14 * radius * radius;
		return area;
//		return 3.14 * radius * radius;
	}

}
