package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {
	public static void main(String [] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			char [] data = "������&Ŭ���� �� ������ �缺����".toCharArray();
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			System.out.println("���� �Ϸ�!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}