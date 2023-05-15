package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;
import entity.HoaDon;
import entity.Nhacungcap;
import entity.NhanVien;

public class HoaDon_DAO {

	ArrayList<HoaDon> dsHD;
	HoaDon hd;

	public HoaDon_DAO() {
		dsHD = new ArrayList<HoaDon>();
	}

	public ArrayList<HoaDon> docTuBang() {

		try {
			Connection con = Database.getInstance().getConnection();
			String sql = "select * from hoadontam";
			java.sql.Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String ma = rs.getString(1);
				ma = ma.trim();
				int ma1 = Integer.parseInt(ma);

				String ten = rs.getString(2);
				ten = ten.trim();
				String sdt = rs.getString(3);
				sdt = sdt.trim();
				
				String tennv = rs.getString(4);
				tennv = tennv.trim();

				

				Date ngaylap = rs.getDate(5);
				Double tongtien = rs.getDouble(6);

				hd = new HoaDon(ma1,ten,sdt,tennv,ngaylap,tongtien);
				dsHD.add(hd);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return dsHD;
	}

	

	public boolean create(HoaDon hd) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {

			stmt = con.prepareStatement("insert into Hoadontam values(?,?,?,?,?,?)");

			stmt.setInt(1, hd.getMahoadon());
			stmt.setString(2, hd.getTenKhachHang());
			stmt.setString(3, hd.getSoDienThoai());		
			stmt.setString(4, hd.getTenNhanVien());
			stmt.setDate(5, hd.getNgayLap());
		    stmt.setDouble(6, hd.getTongTien());

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
	
	public boolean delete(int mahd) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement(
					"delete from Hoadontam where mahoadon = ?");
			
		     	stmt.setInt(1, mahd);

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
	

}
