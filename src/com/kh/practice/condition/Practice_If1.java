package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main(String [] args) {
		// 정수판별1
		//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
		//양수가 아닌 경우 중에서 0이면 “0이다“, 
		//0이 아니면 “음수다”를 출력하세요.
		//ex.
		//정수 : -9
		//음수다
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		String result = "";
		// 짝수 판별
		// (input % 2 == 0) ? "짝수" : "홀수";
		if(input % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		// 판별 후 출력
		System.out.println(input + "은/는 "+result+"입니다.");
	}
}
