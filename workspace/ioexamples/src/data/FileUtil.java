package data;

import java.net.URL;

public class FileUtil {

	public static String getAbsoluteFilePath(String filePath) {
		return new FileUtil().getAbsolutePath(filePath);
	}

	public String getAbsolutePath(String filePath) {
		URL url = getClass().getResource(filePath);
		return url.getPath();
	}

}
