package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {

//		Person person = new Person();
//		person.eat();
//		person.sleep();
//		person.speak();
//		person.walking();
//		person.name = "�Ͽ���";		// private���� �����ؼ� ���� �Ұ�.
//		person.jobName = "�ǻ�";

		Scanner sc = new Scanner(System.in);
		// ���۷��� ����(���� ����) ����
		//	-> �ּҰ� ����Ǵ� ����
		Rectangle rec = new Rectangle();	// ��ü ����, �ݵ�� new Ű���� �̿�
											// new�� ��ü�� ������ ȣ��
		System.out.print("���̸� �Է����ּ���: ");
		rec.height = sc.nextInt();
		System.out.print("�ʺ� �Է����ּ���: ");
		rec.width = sc.nextInt();
		int result = rec.getArea();
		System.out.println("�簢���� ������: " + result);
	}

}
