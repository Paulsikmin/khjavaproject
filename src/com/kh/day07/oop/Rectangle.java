package com.kh.day07.oop;

public class Rectangle {
	public int width;	// �ʺ�, ����
	public int height;	// ����, ����
	
	// �޼ҵ�
	// (�⺻)������
	public Rectangle() {}
	
	// �Ű������� �ִ� ������(���ް��� ���� �� �ִ� ������)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// ��ȯ���� �ִ� �޼ҵ�
	// getArea�� ȣ���� �ʿ� ��ȯ
	public int getArea() {
		int area = width * height;
		return area;
	}

}
