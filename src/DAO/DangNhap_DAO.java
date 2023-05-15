package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;
import entity.ChucVu;
import entity.DangNhap;

public class DangNhap_DAO {

	ArrayList<DangNhap> dsDN;
	DangNhap dn;

	public DangNhap_DAO() {
		dsDN = new ArrayList<DangNhap>();

	}

	public ArrayList<DangNhap> docTuBang() {

		try {
			Connection con = Database.getInstance().getConnection();
			String sql = "select * from DangNhap";
			java.sql.Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				

				String ten = rs.getString(1);
				String mk = rs.getString(2);
				

				dn= new DangNhap(ten,mk);
				dsDN.add(dn);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsDN;
	}

	
}
