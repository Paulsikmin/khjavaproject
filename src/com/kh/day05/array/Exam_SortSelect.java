package com.kh.day05.array;

public class Exam_SortSelect {
	public static void main(String [] args) {
		// �˰��� ����
		// 1. ��������
		// 2. ��������
		// 3. ��������
		// ���������̶�?
		// �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		// Ư¡ : ������ ���� ���� �� ���� ������ �����ִ� ����������
		// ������ ���� ���� �� �ް��� ���� ���ϸ� ����.
		// �迭�� n�� �ε������� n+1�� ~ ������ �ε������� ����.
		
		// i=0�϶�
		// 1, 5, 4, 2, 3 // ù��° ���
		// i=1�϶�
		// 1, 2, 4, 5, 3 // �ι�° ���
		// i=2�϶�
		// 1, 2, 3, 5, 4 // ����° ���
		// i=3�϶�
		// 1, 2, 3, 4, 5 // �׹�° ���
		int [] arrs = {2, 5, 4, 1, 3};
		int minIndex; // �ε����� ����
		for(int i = 0; i < arrs.length; i++) {
			minIndex = i; // ���� ���� �� �ε��� ��
			for(int j = i+1; j < arrs.length; j++) {
				if(arrs[minIndex] > arrs[j]) {
					minIndex = j;
				}
			}
			int temp = arrs[minIndex];
			arrs[minIndex] = arrs[i];
			arrs[i] = temp;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
		
		
		
		
		
	}
}
