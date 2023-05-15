package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;

import entity.Nhacungcap;

public class NhaCungCap_DAO {

	ArrayList<Nhacungcap> dsNCC;
	Nhacungcap ncc;

	public NhaCungCap_DAO() {
		dsNCC = new ArrayList<Nhacungcap>();

	}
	
	
	
	
	
	
	

	public ArrayList<Nhacungcap> docTuBang() {

		try {
			Connection con = Database.getInstance().getConnection();
			
			
			
			
			String sql = "select * from NhaCungCap";
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
				String diachi = rs.getString(4);
				diachi = diachi.trim();

				ncc = new Nhacungcap(ma1, ten, sdt, diachi);
				dsNCC.add(ncc);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsNCC;
		
		
		
	}
	
	
	public ArrayList<Nhacungcap> find(String t , String s) {
		
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs=null;
		String sql;
		
		try {

			if(t.equalsIgnoreCase("") && s.equalsIgnoreCase("")) {
				sql = "select * from nhacungcap";
				stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();
			}
			
			if(!t.equalsIgnoreCase("") && !s.equalsIgnoreCase("")) {
				sql = "select * from nhacungcap where tennhacungcap = ? and sodienthoai =?";
				stmt = con.prepareStatement(sql);
				stmt.setString(1, t);
				stmt.setString(2, s);
				
				rs = stmt.executeQuery();
			}
			
			
			
			if(!t.equalsIgnoreCase("") && s.equalsIgnoreCase("")) {
				sql = "select * from nhacungcap where tennhacungcap = ?";
				stmt = con.prepareStatement(sql);
				stmt.setString(1, t);
				
				rs = stmt.executeQuery();
			}
			if(t.equalsIgnoreCase("") && !s.equalsIgnoreCase("")) {
				sql = "select * from nhacungcap where sodienthoai = ?";
				stmt = con.prepareStatement(sql);
				stmt.setString(1, s);
				
				rs = stmt.executeQuery();
			}
			
			
			
			while(rs.next()){
				String ma = rs.getString(1);
				ma = ma.trim();
				int ma1 = Integer.parseInt(ma);

				String ten = rs.getString(2);
				ten = ten.trim();
				String sdt = rs.getString(3);
				sdt = sdt.trim();
				String diachi = rs.getString(4);
				diachi = diachi.trim();

				ncc = new Nhacungcap(ma1, ten, sdt, diachi);
				dsNCC.add(ncc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsNCC;
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

	public boolean create(Nhacungcap p) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("insert into Nhacungcap values(?,?,?,?)");
			stmt.setString(1, p.getMaNhaCungCap()+"");
			stmt.setString(2, p.getTenNhaCungCap());
			stmt.setString(3, p.getSoDienThoai());
			stmt.setString(4, p.getDiaChi());
			n = stmt.executeUpdate();

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		System.out.println("Insert thanh cong");
		return true;
	}

	public boolean update(Nhacungcap p){
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n =0;
		
		try {
			stmt = con.prepareStatement("update Nhacungcap set tennhacungcap=?, sodienthoai = ?, diachi=? where manhacungcap =? ");	
			
			stmt.setString(1, p.getTenNhaCungCap());
			stmt.setString(2, p.getSoDienThoai());
			stmt.setString(3, p.getDiaChi());
			stmt.setInt(4, p.getMaNhaCungCap());
			
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n>0;
	}

	public boolean delete(int mancc) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("delete from NhaCungCap where maNhaCungCap =?");
			stmt.setInt(1, mancc);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			return false;

		}
		return true;
	}
}
