package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;
import entity.Nhacungcap;
import entity.NhanVien;

public class NhanVien_DAO {

	ArrayList<NhanVien> dsNV;
	NhanVien nv;

	public NhanVien_DAO() {
		dsNV = new ArrayList<NhanVien>();
	}

	public ArrayList<NhanVien> docTuBang() {

		try {
			Connection con = Database.getInstance().getConnection();
			String sql = "select * from NhanVien";
			java.sql.Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String ma = rs.getString(1);
				ma = ma.trim();
				int ma1 = Integer.parseInt(ma);

				String ten = rs.getString(2);
				ten = ten.trim();

				Boolean gioitinh = rs.getBoolean(3);

				Date ngaysinh = rs.getDate(4);
				String chucvu = rs.getString(5);
				chucvu = chucvu.trim();
				Date ngaydk = rs.getDate(6);
				String sdt = rs.getString(7);
				sdt = sdt.trim();

				String email = rs.getString(8);
				email = email.trim();
				String diachi = rs.getString(9);
				diachi = diachi.trim();

				nv = new NhanVien(ma1, ten, gioitinh, ngaysinh, chucvu, ngaydk, sdt, email, diachi);
				dsNV.add(nv);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsNV;
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
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

public NhanVien getNV(int manv) {
		
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs=null;
		String sql;
		
		try {

				sql = "select * from nhanvien where manhanvien = ? ";
				stmt = con.prepareStatement(sql);
				stmt.setInt(1, manv);	
				rs = stmt.executeQuery();
			
			
			
		while (rs.next()) {
			String ma = rs.getString(1);
			ma = ma.trim();
			int ma1 = Integer.parseInt(ma);

			String ten = rs.getString(2);
			ten = ten.trim();

			Boolean gioitinh = rs.getBoolean(3);

			Date ngaysinh = rs.getDate(4);
			String chucvu = rs.getString(5);
			chucvu = chucvu.trim();
			Date ngaydk = rs.getDate(6);
			String sdt = rs.getString(7);
			sdt = sdt.trim();

			String email = rs.getString(8);
			email = email.trim();
			String diachi = rs.getString(9);
			diachi = diachi.trim();

			nv = new NhanVien(ma1, ten, gioitinh, ngaysinh, chucvu, ngaydk, sdt, email, diachi);
				
			}
		}catch(SQLException e){
		
		e.printStackTrace();
	} 
		return nv;
	}

	public boolean create(NhanVien nv) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {

			stmt = con.prepareStatement("insert into Nhanvien values(?,?,?,?,?,?,?,?,?)");

			stmt.setInt(1, nv.getMaNhanVien());
			stmt.setString(2, nv.getHoTen());
			stmt.setBoolean(3, nv.isGioiTinh());
			stmt.setDate(4, nv.getNgaySinh());
			stmt.setString(5, nv.getChuVu());

			stmt.setDate(6, nv.getNgayDangKi());
			stmt.setString(7, nv.getSoDienThoai());
			stmt.setString(8, nv.getEmail());
			stmt.setString(9, nv.getDiaChi());

			n = stmt.executeUpdate();

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		System.out.println("Insert thanh cong");
		return true;
	}

	public boolean update(NhanVien p) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement(
					"update Nhanvien set hoten=?, giotinh = ?, ngaysinh=?  , ngaysinh=? where manhacungcap =? ");

			/*
			 * stmt.setString(1, p.getTenNhaCungCap()); stmt.setString(2,
			 * p.getSoDienThoai()); stmt.setString(3, p.getDiaChi()); stmt.setInt(4,
			 * p.getMaNhaCungCap());
			 */

			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return n > 0;
	}

	public boolean delete(String maNV) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("delete from nhanvien where manhanvien =?");
			stmt.setString(1, maNV);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			return false;

		}
		return true;
	}
}
