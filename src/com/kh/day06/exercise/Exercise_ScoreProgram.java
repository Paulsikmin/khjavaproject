package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// for(;;) {}
		// while(true) {}
		int kor = 0;
		int eng = 0;
		int math = 0;
		//int sum = 0;
		while(true) {
			System.out.println("====== ���� �޴� ======");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("====== ���� �Է� =======");
				System.out.print("���� : ");
				kor = sc.nextInt();
				System.out.print("���� : ");
				eng = sc.nextInt();
				System.out.print("���� : ");
				math = sc.nextInt();
				break;
			case 2 : 
				int sum = kor + eng + math;
				double avg = (double)sum / 3;
				System.out.println("====== ���� ��� ======");
				System.out.println("���� : " + kor);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);
				System.out.println("���� : " + sum);
				System.out.printf("��� : %.2f \n",avg);
				break;
			case 3 : 
				System.out.println("Good Bye~");
				break;
			}
		}
		/*
		 * ====== ���� �޴� =======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 1
		 *  
		 *  ====== ���� �Է� =======
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		*/
	}
}
