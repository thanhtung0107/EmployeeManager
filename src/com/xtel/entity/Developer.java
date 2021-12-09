package com.xtel.entity;

public class Developer extends AbstractNhanVien {
	private double luongCoBan;
	private double soGioLam;

	public Developer() {
		super();
	}

	public Developer(String maNV, String hoTen, double luongCoBan, double soGioLam, String chucVu) {
		super(maNV, hoTen, chucVu);
		this.luongCoBan = luongCoBan;
		this.soGioLam = soGioLam;
	}

	public Developer(double luongCoBan, double soGioLam) {
		super();
		this.luongCoBan = luongCoBan;
		this.soGioLam = soGioLam;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public double getSoGioLam() {
		return soGioLam;
	}

	public void setSoGioLam(double soGioLam) {
		this.soGioLam = soGioLam;
	}

	@Override
	public double calTotal() {
		double result = this.luongCoBan + this.soGioLam * 200000;
		return result;
	}

	@Override
	public String toString() {
		return "Developer: { \nMã nhân viên: " + maNV + ", \nHọ tên: " + hoTen + ", \nChức vụ: " + chucVu + ", \nLương cơ bản: "
				+ luongCoBan + ", \nSố giờ làm: " + soGioLam + ", \nLương Dev: " + calTotal() + "\n};";
	}

}
