package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;
import entity.ChucVu;

public class ChucVu_DAO {

	ArrayList<ChucVu> dsCV;
	ChucVu cv;

	public ChucVu_DAO() {
		dsCV = new ArrayList<ChucVu>();

	}

	public ArrayList<ChucVu> docTuBang() {

		try {
			Connection con = Database.getInstance().getConnection();
			String sql = "select * from ChucVu";
			java.sql.Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String ma = rs.getString(1);
				ma = ma.trim();
				int ma1 = Integer.parseInt(ma);

				String ten = rs.getString(2);
				ten = ten.trim();
				Date ngaydk = rs.getDate(3);

				cv = new ChucVu(ma1, ten, ngaydk);
				dsCV.add(cv);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsCV;
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

	public boolean create(ChucVu p) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("insert into ChucVu values(?,?,?)");
			stmt.setString(1, p.getMaChucVu() + "");
			stmt.setString(2, p.getTenChucVu());
			stmt.setDate(3, p.getNgayTao());

			n = stmt.executeUpdate();

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Insert thanh cong");
		return true;
	}

	public boolean update(ChucVu p) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("update ChucVu set TenChucVu = ?  where MaChucVu =? ");

			stmt.setString(1, p.getTenChucVu());
			stmt.setInt(2, p.getMaChucVu());

			n = stmt.executeUpdate();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return n > 0;
	}

	public boolean delete(int mancc) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("delete from Chucvu where maChucVu = ?");
			stmt.setInt(1, mancc);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			return false;

		}
		return true;
	}
}
