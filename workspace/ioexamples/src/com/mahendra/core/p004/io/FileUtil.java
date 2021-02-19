package com.mahendra.core.p004.io;

import java.net.URL;

public class FileUtil {

	public static void main(String[] args) {
		String file = "/data/input-file.txt";
		String absPath=new FileUtil().getAbsoluteFilePath(file);
		System.out.println(absPath);
	}

	public String getAbsoluteFilePath(String filePath) {
		URL url = getClass().getResource(filePath);
		return url.getPath();
	}

}
