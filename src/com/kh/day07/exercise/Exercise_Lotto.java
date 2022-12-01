package com.kh.day07.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise_Lotto {

	public static void lottoProgram() {
		// �ζ� ��ȣ �ڵ� ������ ���α׷�, �ߺ� ���� �����ϱ�
		// ��, ����� ������������ ����
		// �ζ� ��ȣ�� 6��. �ζ� ��ȣ�� ������ 1 ~ 45
		int[] lottoNums = new int[6];
		Random rand = new Random();

		// ��ȣ�� �̴´�. X 6
		for(int i = 0; i < lottoNums.length; i++) {
			// ��ȣ�� �̴´�.
			// 1 ~ 45 -> 0 ~ 44 -> 1 ~ 45
			lottoNums[i]  = rand.nextInt(45)+1;
			for(int e = 0; e < i; e++) {
				// �񱳸� �Ѵ�. ���� ��������.
				// �񱳴� �̹̻��� �Ͱ� ù��°����~
				if(lottoNums[i] == lottoNums[e]) {
					// ������ i--;
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < lottoNums.length - 1; i++) {	// �������� 
			for (int j = 0; j < lottoNums.length - 1 - i; j++) {
				if (lottoNums[j] > lottoNums[j + 1]) {
					int tmp = lottoNums[j];
					lottoNums[j] = lottoNums[j + 1];
					lottoNums[j + 1] = tmp;
				}
			}
		}

		System.out.println("�������� �ζ� ��ȣ");
		System.out.println(Arrays.toString(lottoNums));

	}

	public static void main(String[] args) {

		lottoProgram();

	}

}
