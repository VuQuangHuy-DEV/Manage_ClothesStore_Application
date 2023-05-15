package entity;

public class Nhacungcap {
	private int maNhaCungCap;
	private String tenNhaCungCap;
	private String soDienThoai;
	private String diaChi;
	public int getMaNhaCungCap() {
		return maNhaCungCap;
	}
	public void setMaNhaCungCap(int maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}
	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}
	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public Nhacungcap(int maNhaCungCap, String tenNhaCungCap, String soDienThoai, String diaChi) {
		super();
		this.maNhaCungCap = maNhaCungCap;
		this.tenNhaCungCap = tenNhaCungCap;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}
	public Nhacungcap() {
		super();
	}
	public Nhacungcap(int maNhaCungCap) {
		super();
		this.maNhaCungCap = maNhaCungCap;
	}
	@Override
	public String toString() {
		return "Nhacungcap [maNhaCungCap=" + maNhaCungCap + ", tenNhaCungCap=" + tenNhaCungCap + ", soDienThoai="
				+ soDienThoai + ", diaChi=" + diaChi + "]";
	}
	
	

}
