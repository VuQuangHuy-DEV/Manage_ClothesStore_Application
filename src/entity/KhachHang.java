package entity;

import java.sql.Date;

public class KhachHang {
	private int maKhachHang;
	private String hoTen;
	private boolean gioiTinh;
	private Date ngayDangKi;
	private String soDienThoai;
	private int namSinh;
	private String diaChi;
	private double tienDaMua;
	
	
	public KhachHang(int maKhachHang, String hoTen, boolean gioiTinh, Date ngayDangKi, String soDienThoai, int namSinh,
			String diaChi, double tienDaMua) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngayDangKi = ngayDangKi;
		this.soDienThoai = soDienThoai;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
		this.tienDaMua = tienDaMua;
	}
	public double getTienDaMua() {
		return tienDaMua;
	}
	public void setTienDaMua(double tienDaMua) {
		this.tienDaMua = tienDaMua;
	}
	public int getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
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
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public KhachHang(int maKhachHang, String hoTen, boolean gioiTinh, Date ngayDangKi, String soDienThoai, int namSinh,
			String diaChi) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngayDangKi = ngayDangKi;
		this.soDienThoai = soDienThoai;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
	}
	public KhachHang() {
		super();
	}
	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngayDangKi="
				+ ngayDangKi + ", soDienThoai=" + soDienThoai + ", namSinh=" + namSinh + ", diaChi=" + diaChi + "]";
	}
	
	
	
	
	

}
