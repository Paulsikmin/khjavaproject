package com.kh.day07.oop;

class Sample{
	public int a;
	private int b;
	int c;
}

public class Exam_Access {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.a = 10;	// public�̹Ƿ� ���� ����
//		s.b = 10;	// private�̹Ƿ� ���� �Ұ���
		s.c = 10;	// default�̹Ƿ� ���� ����
		
	}

}
