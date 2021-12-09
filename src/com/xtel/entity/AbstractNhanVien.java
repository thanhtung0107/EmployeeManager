package com.xtel.entity;

public abstract class AbstractNhanVien {

	protected String maNV;
	protected String hoTen;
	protected String chucVu;

	public abstract double calTotal();

	public AbstractNhanVien() {
	}

	public AbstractNhanVien(String maNV, String hoTen, String chucVu) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.chucVu = chucVu;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Override
	public String toString() {
		return "AbstractNhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", chucVu=" + chucVu + "]";
	}

}
