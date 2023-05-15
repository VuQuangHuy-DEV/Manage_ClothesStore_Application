package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;

import entity.NhanVien;
import entity.SanPham;

public class SanPham_DAO {

	ArrayList<SanPham> dssp;
	SanPham sp;

	public SanPham_DAO() {
		dssp = new ArrayList<SanPham>();
	}

	public ArrayList<SanPham> docTuBang() {

		try {
			Connection con = Database.getInstance().getConnection();
			String sql = "select * from SanPham";
			java.sql.Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String ma = rs.getString(1);
				ma = ma.trim();
				int ma1 = Integer.parseInt(ma);

				String ten = rs.getString(2);
				ten = ten.trim();

				String loai = rs.getString(3);
				loai = loai.trim();

				String lichco = rs.getString(4);
				lichco = lichco.trim();

				String gia = rs.getString(5);
				gia = gia.trim();
				double gia1 = Double.parseDouble(gia);

				String soluongcon = rs.getString(6);
				soluongcon = soluongcon.trim();
				int soluongcon1 = Integer.parseInt(soluongcon);

				String nhacc = rs.getString(7);

				sp = new SanPham(ma1, ten, loai, lichco, gia1, soluongcon1, nhacc);
				dssp.add(sp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dssp;
	}

	/*
	 * public ArrayList<Nhacungcap> getLopTheoMaLop(String mlop) { Connection con =
	 * Database.getInstance().getConnection(); PreparedStatement stmt = null;
	 * 
	 * try { String sql = "select * from Nhacungcap where malop = ?"; stmt =
	 * con.prepareStatement(sql); stmt.setString(1, mlop); ResultSet rs =
	 * stmt.executeQuery(); while (rs.next()) { String ma = rs.getString(1);
	 * System.out.println(ma); String ten = rs.getString(2); String gv =
	 * rs.getString(3); int siso = rs.getInt(4);
	 * 
	 * Nhacungcap s = new Nhacungcap(ma, ten, new GiaoVien(gv), siso); dslop.add(s);
	 * } } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return dslop; }
	 */

	public boolean create(SanPham sp) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {

			stmt = con.prepareStatement("insert into SanPham values(?,?,?,?,?,?,?)");
			stmt.setInt(1, sp.getMaSanPham());
			stmt.setString(2, sp.getTenSanPham());
			stmt.setString(3, sp.getLoaiSanPham());
			stmt.setString(4, sp.getKichCo());
			stmt.setDouble(5, sp.getGiaSanPham());
			stmt.setInt(6, sp.getSoLuongConLai());
			stmt.setString(7, sp.getNhaCungCap());

			n = stmt.executeUpdate();

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		System.out.println("Insert thanh cong");
		return true;

	}

	public boolean updateSoLuong(int ma, int soluong) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("update SanPham set soluongconlai= ? where masanpham =? ");

			stmt.setInt(1, soluong);
			stmt.setInt(2, ma);

			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return n > 0;
	}

	public boolean update(NhanVien p) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement(
					"update Nhacungcap set tennhacungcap=?, sodienthoai = ?, diachi=? where manhacungcap =? ");

			/*
			 * stmt.setString(1, p.getTenNhaCungCap()); stmt.setString(2,
			 * p.getSoDienThoai()); stmt.setString(3, p.getDiaChi()); stmt.setInt(4,
			 * p.getMaNhaCungCap());
			 */

			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n > 0;
	}

	public boolean delete(int masp) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("delete from sanpham where masanpham =?");
			stmt.setInt(1, masp);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			return false;

		}
		return true;
	}
}
