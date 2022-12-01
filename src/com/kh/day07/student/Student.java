package com.kh.day07.student;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {
	}

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 멤버변수가 private이기 때문에 간접적으로 접근해야함
	// setters
	// 멤버변수에 각각 초기화해줌
	public void setMath(int math) {
		this.math = math;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	// getter메소드
	// 멤버변수의 값을 리턴함.
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}

}
