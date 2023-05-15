package entity;

import java.sql.Date;

public class HoaDon {
	
	private int mahoadon;
	private String tenKhachHang;
	private String soDienThoai;
	private String tenNhanVien;
	private Date ngayLap;
	private Double tongTien;
	public int getMahoadon() {
		return mahoadon;
	}
	public void setMahoadon(int mahoadon) {
		this.mahoadon = mahoadon;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	public Double getTongTien() {
		return tongTien;
	}
	public void setTongTien(Double tongTien) {
		this.tongTien = tongTien;
	}
	public HoaDon(int mahoadon, String tenKhachHang, String soDienThoai, String tenNhanVien, Date ngayLap,
			Double tongTien) {
		super();
		this.mahoadon = mahoadon;
		this.tenKhachHang = tenKhachHang;
		this.soDienThoai = soDienThoai;
		this.tenNhanVien = tenNhanVien;
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
	}
	public HoaDon() {
		super();
	}
	
	
	
	


}
