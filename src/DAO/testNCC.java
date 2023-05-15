package DAO;



import java.sql.Date;
import java.util.Random;

import connectDB.Database;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;


public class testNCC {
	public static void main(String[] args) {
		Database.getInstance().connect();
		//NhanVien_DAO ncc  = new NhanVien_DAO();
		NhaCungCap_DAO nccDAO = new NhaCungCap_DAO();
		
		
		KhachHang_DAO khd= new KhachHang_DAO();
		System.out.println(khd.getKhSdt("8"));
		
		/*
		 * System.out.println(nccDAO.find("", ""));
		 * 
		 * DangNhap_DAO dnd= new DangNhap_DAO(); System.out.println(dnd.docTuBang());
		 */
		
		
		/*
		 * HoaDon_DAO hdd = new HoaDon_DAO(); HoaDon hd = new
		 * HoaDon(2222,"Vu Quang Huy","0906148340","Hoang Thuy", new Date(new
		 * java.util.Date().getYear(),new java.util.Date().getMonth(),new
		 * java.util.Date().getDate()) ,100.0); hdd.create(hd);
		 * 
		 * 
		 * Random rand = new Random(); int ranNum = rand.nextInt(60000)+1;
		 * System.out.println(ranNum);
		 */
		
		
		
		/*
		 * for (KhachHang s : ncc.docTuBang()) { System.out.println(s);
		 * 
		 * }
		 */
		
		
		
		/*
		 * KhachHang kh = new KhachHang(16329,"Vũ Quang Huy", true,new Date(new
		 * java.util.Date().getYear(),new java.util.Date().getMonth(),new
		 * java.util.Date().getDate()) ,"114",2001,"Hồ Chí Minh");
		 */
		 
		
		//ncc.create(kh);
		
		//ncc.delete(194731);
		
		//ncc.update(new Nhacungcap(14848,"huy","huy","huy"));
		//ncc.create(new Nhacungcap(1,"huy","hi","ha"));
		
	
	}

}
