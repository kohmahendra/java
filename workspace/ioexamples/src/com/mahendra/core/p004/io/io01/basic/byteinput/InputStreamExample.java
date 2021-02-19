package com.mahendra.core.p004.io.io01.basic.byteinput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import data.FileUtil;

public class InputStreamExample {

	public static void main(String[] args) {
		String absFilePath = FileUtil.getAbsoluteFilePath("/data/input-file.txt");
		try (InputStream inputstream = new FileInputStream(absFilePath)) {

			int data = inputstream.read();
			while (data != -1) {
				data = inputstream.read();
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
