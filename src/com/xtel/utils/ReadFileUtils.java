package com.xtel.utils;

import java.io.File;

public class ReadFileUtils {

	// check url file
	public static boolean checkFile(File fis) {
		if (fis.exists() && !fis.isDirectory()) {
			return true;
		} else {
			System.out.println("Đường dẫn không tồn tại");
			return false;
		}
	}

	// check dòng trống
	public static boolean checkLineNull(String line) {
		if (line.trim().length() > 0) {
			return true;
		} else {
			return false;
		}
	}

	// check chỉ cho nhập 5 trường.
	public static boolean check5Fields(String[] datas) {
		if (datas.length == 5) {
			return true;
		} else {
			return false;
		}
	}

	// check file trống
	public static boolean checkLineALL(String line) {
		if (line != null) {
			return true;
		} else {
			System.out.println("không có dữ liệu.");
			return false;
		}
	}

	// check lương và giờ ko âm
	public static boolean checkNumber(double number) {
		if (number > 0) {
			return true;
		} else {
			System.out.println("Lương hoặc giờ không được âm!");
			return false;
		}
	}
}