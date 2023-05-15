package entity;

public class SanPham {
	
	private int maSanPham;
    private String tenSanPham;
	private String loaiSanPham;
	private String kichCo;
	private double giaSanPham;
	private int soLuongConLai;
	
	private String nhaCungCap;
	public SanPham(int maSanPham, String tenSanPham, String loaiSanPham, String kichCo, double giaSanPham,
			int soLuongConLai, String nhaCungCap) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.loaiSanPham = loaiSanPham;
		this.kichCo = kichCo;
		this.giaSanPham = giaSanPham;
		this.soLuongConLai = soLuongConLai;
		this.nhaCungCap = nhaCungCap;
	}
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getLoaiSanPham() {
		return loaiSanPham;
	}
	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
	public String getKichCo() {
		return kichCo;
	}
	public void setKichCo(String kichCo) {
		this.kichCo = kichCo;
	}
	public double getGiaSanPham() {
		return giaSanPham;
	}
	public void setGiaSanPham(double giaSanPham) {
		this.giaSanPham = giaSanPham;
	}
	public int getSoLuongConLai() {
		return soLuongConLai;
	}
	public void setSoLuongConLai(int soLuongConLai) {
		this.soLuongConLai = soLuongConLai;
	}
	

	public SanPham(int maSanPham, String tenSanPham, String loaiSanPham, String kichCo, double giaSanPham,
			int soLuongConLai) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.loaiSanPham = loaiSanPham;
		this.kichCo = kichCo;
		this.giaSanPham = giaSanPham;
		this.soLuongConLai = soLuongConLai;
	}
	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", loaiSanPham=" + loaiSanPham
				+ ", kichCo=" + kichCo + ", giaSanPham=" + giaSanPham + ", soLuongConLai=" + soLuongConLai + "]";
	}
	
	
	
	
	
	

}
