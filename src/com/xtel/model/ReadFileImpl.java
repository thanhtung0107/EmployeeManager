package com.xtel.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.xtel.entity.AbstractNhanVien;
import com.xtel.entity.Developer;
import com.xtel.entity.Tester;
import com.xtel.utils.ReadFileUtils;

public class ReadFileImpl implements ReadFile {
	String[] datas = null;
	String line = null;
	int count = 0;
	double toTal = 0;
	AbstractNhanVien dev = null;
	double luongCoBan = 0;
	String maNV = null;
	String hoTen = null;
	double soGioLam = 0;
	String chucVu = null;
	Scanner sc = null;
	List<AbstractNhanVien> listNV = null;

	@Override
	public void dataFile(File fis) throws FileNotFoundException {
		sc = new Scanner(fis);

		listNV = new ArrayList<>();

		while (sc.hasNextLine()) {
			count++;
			line = sc.nextLine();

			// check dòng trống
			if (ReadFileUtils.checkLineNull(line)) {
				datas = line.split(", ");
				try {

					// check chỉ được nhập giới hạn 5 trường
					if (ReadFileUtils.check5Fields(datas)) {
						maNV = datas[0];
						hoTen = datas[1];
						luongCoBan = Double.parseDouble(datas[2]);
						soGioLam = Double.parseDouble(datas[3]);
						chucVu = datas[4];

						// check lương và giờ ko âm
						if (ReadFileUtils.checkNumber(luongCoBan) && ReadFileUtils.checkNumber(soGioLam)) {

							// check chức vụ
							if (chucVu.equalsIgnoreCase("dev")) {
								dev = new Developer(maNV, hoTen, luongCoBan, soGioLam, chucVu);
								listNV.add(dev);
							} else {
								dev = new Tester(maNV, hoTen, luongCoBan, soGioLam, chucVu);
								listNV.add(dev);
							}
						} else {
							System.out.println("Kiểm tra lại dòng: " + count);
						}

					} else {
						System.out.println("Chỉ được nhập cố định 5 trường, hãy kiểm tra lại dòng: " + count);
					}
				} catch (NumberFormatException numberErorr) {
					System.out.println(numberErorr + " >> Lương hoặc giờ phải là số, kiểm tra lại dòng " + count);
				}
			} else {
				System.out.println("kiểm tra lại dòng: " + count);
			}
		}

		// check file trống
		if (ReadFileUtils.checkLineALL(line)) {
			for (AbstractNhanVien nv : listNV) {
				System.out.println(nv.toString());
				System.out.println();
			}
		}
	}

}
