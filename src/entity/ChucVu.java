package entity;

import java.sql.Date;

public class ChucVu {
	private int maChucVu;
	private String tenChucVu;
	private Date ngayTao;
	public int getMaChucVu() {
		return maChucVu;
	}
	public void setMaChucVu(int maChucVu) {
		this.maChucVu = maChucVu;
	}
	public String getTenChucVu() {
		return tenChucVu;
	}
	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}
	public Date getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}
	public ChucVu(int maChucVu, String tenChucVu, Date ngayTao) {
		super();
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
		this.ngayTao = ngayTao;
	}
	public ChucVu() {
		super();
	}
	@Override
	public String toString() {
		return "ChucVu [maChucVu=" + maChucVu + ", tenChucVu=" + tenChucVu + ", ngayTao=" + ngayTao + "]";
	}
	
	
	
	

}
