package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;
import entity.KhachHang;
import entity.Nhacungcap;
import entity.NhanVien;

public class KhachHang_DAO {

	ArrayList<KhachHang> dsKH;
	KhachHang kh;

	public KhachHang_DAO() {
		dsKH = new ArrayList<KhachHang>();

	}

	public ArrayList<KhachHang> find(String ma1, String ten1, String soDienThoai) {

		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from khachhang where  makhachhang LIKE '%'  ";

		try {

			if (ma1.equalsIgnoreCase("") && ten1.equalsIgnoreCase("") && soDienThoai.equalsIgnoreCase("")) {

				sql = sql;
			}

			if (!ma1.equalsIgnoreCase("")) {
				sql = sql + " AND makhachhang = '"+ ma1.trim()+ "'";
			}
			
			if (!ten1.equalsIgnoreCase("")) {
				sql = sql + " AND hoten = '"+ ten1.trim()+ "'";
			}
			if (!soDienThoai.equalsIgnoreCase("")) {
				sql = sql + " AND sodienthoai = '"+ soDienThoai.trim()+ "'";
			}

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				String ma = rs.getString(1);
				ma = ma.trim();
				int ma12 = Integer.parseInt(ma);

				String ten = rs.getString(2);
				ten = ten.trim();

				Boolean gioitinh = rs.getBoolean(3);
				Date ngaydk = rs.getDate(4);
				String sdt = rs.getString(5);

				sdt = sdt.trim();
				// sotienmua (6)
				String sinh = rs.getString(6);
				sinh = sinh.trim();
				int sinh11 = Integer.parseInt(sinh);

				String diachi = rs.getString(7);
				diachi = diachi.trim();

				Double tiendamua = rs.getDouble(8);

				kh = new KhachHang(ma12, ten, gioitinh, ngaydk, sdt, sinh11, diachi, tiendamua);
				dsKH.add(kh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return dsKH;
	}

	public ArrayList<KhachHang> docTuBang() {

		try {
			Connection con = Database.getInstance().getConnection();
			String sql = "select * from KhachHang";
			java.sql.Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String ma = rs.getString(1);
				ma = ma.trim();
				int ma1 = Integer.parseInt(ma);

				String ten = rs.getString(2);
				ten = ten.trim();

				Boolean gioitinh = rs.getBoolean(3);
				Date ngaydk = rs.getDate(4);
				String sdt = rs.getString(5);

				sdt = sdt.trim();
				// sotienmua (6)
				String sinh = rs.getString(6);
				sinh = sinh.trim();
				int sinh11 = Integer.parseInt(sinh);

				String diachi = rs.getString(7);
				diachi = diachi.trim();

				Double tiendamua = rs.getDouble(8);

				kh = new KhachHang(ma1, ten, gioitinh, ngaydk, sdt, sinh11, diachi, tiendamua);
				dsKH.add(kh);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsKH;
	}

	public KhachHang getKhSdt(String sdt2) {

		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "select * from Khachhang where sodienthoai = ? ";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, sdt2);
			rs = stmt.executeQuery();

			while (rs.next()) {
				String ma = rs.getString(1);
				ma = ma.trim();
				int ma1 = Integer.parseInt(ma);

				String ten = rs.getString(2);
				ten = ten.trim();

				Boolean gioitinh = rs.getBoolean(3);
				Date ngaydk = rs.getDate(4);
				String sdt = rs.getString(5);

				sdt = sdt.trim();
				// sotienmua (6)
				String sinh = rs.getString(6);
				sinh = sinh.trim();
				int sinh11 = Integer.parseInt(sinh);

				String diachi = rs.getString(7);
				diachi = diachi.trim();

				Double tiendamua = rs.getDouble(8);

				kh = new KhachHang(ma1, ten, gioitinh, ngaydk, sdt, sinh11, diachi, tiendamua);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return kh;
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

	public boolean create(KhachHang kh) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {

			stmt = con.prepareStatement("insert into KhachHang values(?,?,?,?,?,?,?,?)");
			stmt.setInt(1, kh.getMaKhachHang());
			stmt.setString(2, kh.getHoTen());
			stmt.setBoolean(3, kh.isGioiTinh());
			stmt.setDate(4, kh.getNgayDangKi());
			stmt.setString(5, kh.getSoDienThoai());
			stmt.setInt(6, kh.getNamSinh());
			stmt.setString(7, kh.getDiaChi());
			stmt.setDouble(8, 0);

			n = stmt.executeUpdate();

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		System.out.println("Insert thanh cong");
		return true;
	}

	public boolean update(Nhacungcap p) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement(
					"update Nhacungcap set tennhacungcap=?, sodienthoai = ?, diachi=? where manhacungcap =? ");

			stmt.setString(1, p.getTenNhaCungCap());
			stmt.setString(2, p.getSoDienThoai());
			stmt.setString(3, p.getDiaChi());
			stmt.setInt(4, p.getMaNhaCungCap());

			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n > 0;
	}

	public boolean delete(int makh) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("delete from khachhang where makhachhang =?");
			stmt.setInt(1, makh);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			return false;

		}
		return true;
	}
}
