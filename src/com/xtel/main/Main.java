package com.xtel.main;

import java.io.FileNotFoundException;

import com.xtel.controller.FileController;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		FileController fc = new FileController();
		fc.runFile();
	}
}