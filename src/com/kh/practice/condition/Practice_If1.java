package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main(String [] args) {
		// �����Ǻ�1
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, 
		//����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 
		//0�� �ƴϸ� �������١��� ����ϼ���.
		//ex.
		//���� : -9
		//������
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		String result = "";
		// ¦�� �Ǻ�
		// (input % 2 == 0) ? "¦��" : "Ȧ��";
		if(input % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		// �Ǻ� �� ���
		System.out.println(input + "��/�� "+result+"�Դϴ�.");
	}
}
