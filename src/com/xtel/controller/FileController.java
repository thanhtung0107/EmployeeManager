package com.xtel.controller;

import java.io.File;
import java.io.FileNotFoundException;

import com.xtel.model.ReadFile;
import com.xtel.model.ReadFileImpl;
import com.xtel.utils.ReadFileUtils;

public class FileController {
	public void runFile() throws FileNotFoundException {
		String URL_FILE = "C:\\Users\\ADMIN\\Desktop\\NhanVien.txt";
		File fis = new File(URL_FILE);
		
		// check url file
		if (ReadFileUtils.checkFile(fis)) {
			ReadFile nv = new ReadFileImpl();
			nv.dataFile(fis);
		}
	}
}
