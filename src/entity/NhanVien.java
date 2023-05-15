package entity;

import java.sql.Date;

public class NhanVien {
	private int maNhanVien;
	private String hoTen;
	private boolean gioiTinh;
	private Date ngaySinh;
	private String chuVu;
	private Date ngayDangKi;
	private String soDienThoai;
	private String email;
	private String diaChi;
	public int getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getChuVu() {
		return chuVu;
	}
	public void setChuVu(String chuVu) {
		this.chuVu = chuVu;
	}
	public Date getNgayDangKi() {
		return ngayDangKi;
	}
	public void setNgayDangKi(Date ngayDangKi) {
		this.ngayDangKi = ngayDangKi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public NhanVien(int maNhanVien, String hoTen, boolean gioiTinh, Date ngaySinh, String chuVu, Date ngayDangKi,
			String soDienThoai, String email, String diaChi) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.chuVu = chuVu;
		this.ngayDangKi = ngayDangKi;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.diaChi = diaChi;
	}
	public NhanVien() {
		super();
	}
	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh="
				+ ngaySinh + ", chuVu=" + chuVu + ", ngayDangKi=" + ngayDangKi + ", soDienThoai=" + soDienThoai
				+ ", email=" + email + ", diaChi=" + diaChi + "]";
	}
	
	
	
	
	

}
