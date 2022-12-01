package com.kh.day07.student;

import java.util.Scanner;

public class StudentFunction {
	// StudentŬ������ �и�
	// private String name;
	// private int kor;
	// private int eng;
	// private int math;
	Student student;

	public StudentFunction() {
		student = new Student(); // �ʱ�ȭ
	}

	/**
	 * �л����� ���α׷� �޴� ���
	 * @return choice
	 */
	public int printMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("====== �л� ���� ���� ���α׷� ======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���α׷� ����");

		System.out.print("����: ");
		int choice = sc.nextInt();

		return choice;
	}

	/**
	 * �л� ���� �Է�
	 */
	public void inputScore() {
		Scanner sc = new Scanner(System.in);

		System.out.println("====== �л� ���� ���� ���α׷� ======");
		System.out.print("�л� �̸� �Է�: ");
		String name = sc.next();
		System.out.print("�������� �Է�: ");
		int kor = sc.nextInt();
		System.out.print("�������� �Է�: ");
		int eng = sc.nextInt();
		System.out.print("�������� �Է�: ");
		int math = sc.nextInt();

//		student = new Student(name, kor, eng, math);
		// ���� ������� �ϸ� newŰ���带 ����ϸ鼭 �޸𸮰� �߰� ����
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
	}

	/**
	 * �л� ���� ���
	 */
	public void printScore() {
		System.out.println("====== �л� ���� ��� ======");
		System.out.println(student.getName() + "�л��� ����");
		System.out.println("���� ����: " + student.getKor());
		System.out.println("���� ����: " + student.getEng());
		System.out.println("���� ����: " + student.getMath());
	}

	/**
	 * ���α׷� ����
	 */
	public void goodByeMsg() {
		System.out.println("Good Bye~~~");
	}

	/**
	 * ����ó��
	 */
	public void exception() {
		System.out.println("1~3������ ���ڸ� �Է��ϼ���!");
	}
}
