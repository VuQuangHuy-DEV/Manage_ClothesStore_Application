/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import form.PanelAllSanPham;
import form.PanelCapNhatSanPham;
import form.PanelMuaHang;
import form.PanelLapHoaDon;
import form.PanelThemChucVu;
import form.PanelHienThiHoaDon;
import form.PanelThongTinKhachHang;
import form.PanelThongTinNCC;
import form.PanelThongTinNhanVien;
import form.PanelThemSanPham;
import form.PanelHoaDon;
import form.PanelTimKiemKhachHang;
import form.PanelTimKiemNCC;
import form.PanelTimKiemSanPham;
import form.PanelThongTinCaNhanNV;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.MenuItem;

import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author RavenPC
 */
public class Main extends javax.swing.JFrame {

	/**
	 * Creates new form Main
	 */
	public Main() {
		initComponents();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		execute();
	}

	public void execute() {
		ImageIcon iconStaff = new ImageIcon(getClass().getResource("/menu/user.png"));
		ImageIcon iconSetting = new ImageIcon(getClass().getResource("/menu/setting.png"));
		ImageIcon iconDatabase = new ImageIcon(getClass().getResource("/menu/database.png"));
		ImageIcon iconMessage = new ImageIcon(getClass().getResource("/menu/message.png"));
		ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
		ImageIcon iconNext = new ImageIcon(getClass().getResource("/menu/next.png"));
		ImageIcon iconGioHang = new ImageIcon(getClass().getResource("/menu/GioHang.png"));
		ImageIcon iconNhanVien = new ImageIcon(getClass().getResource("/menu/ImgNhanVien.png"));
		ImageIcon iconSanPham = new ImageIcon(getClass().getResource("/menu/ImgSanPham.png"));
		ImageIcon iconHoaDon = new ImageIcon(getClass().getResource("/menu/ImgHoaDon.png"));
		ImageIcon iconDuLieu = new ImageIcon(getClass().getResource("/menu/ImgDuLieu.png"));
		ImageIcon iconDLNhanVien = new ImageIcon(getClass().getResource("/menu/ImgTTNhanVien.png"));
		ImageIcon iconDLSanPham = new ImageIcon(getClass().getResource("/menu/ImgDLSanPham.png"));
		ImageIcon iconDLKhach = new ImageIcon(getClass().getResource("/menu/ImgDLKhach.png"));
		ImageIcon iconQuan = new ImageIcon(getClass().getResource("/menu/ImgQuan.png"));
		ImageIcon iconAo = new ImageIcon(getClass().getResource("/menu/ImgAo.png"));
		ImageIcon iconGiay = new ImageIcon(getClass().getResource("/menu/ImgGiay.png"));
		ImageIcon iconPhuKien = new ImageIcon(getClass().getResource("/menu/ImgPhuKien.png"));
		ImageIcon iconCTHoaDon = new ImageIcon(getClass().getResource("/menu/ImgCTHoaDon.png"));
		ImageIcon iconBaoCao = new ImageIcon(getClass().getResource("/menu/ImgBaoCao.png"));
		ImageIcon iconThongKe = new ImageIcon(getClass().getResource("/menu/ImgThongKe.png"));
		ImageIcon iconNCC = new ImageIcon(getClass().getResource("/menu/ImgNCC.png"));
		ImageIcon iconQuanLi = new ImageIcon(getClass().getResource("/menu/ImgBoss.png"));
		ImageIcon iconThem = new ImageIcon(getClass().getResource("/menu/ImgThem.png"));
		ImageIcon iconXoa = new ImageIcon(getClass().getResource("/menu/ImgXoa.png"));
		ImageIcon iconSua = new ImageIcon(getClass().getResource("/menu/ImgSua.png"));
		ImageIcon iconTimKiem = new ImageIcon(getClass().getResource("/menu/ImgTimKiem.png"));
		ImageIcon iconXem = new ImageIcon(getClass().getResource("/menu/ImgXem.png"));
		ImageIcon iconTien = new ImageIcon(getClass().getResource("/menu/ImgTien.png"));
		ImageIcon iconLui = new ImageIcon(getClass().getResource("/menu/ImgLui.png"));
		ImageIcon iconNhapKho = new ImageIcon(getClass().getResource("/menu/ImgNhapKho.png"));
		ImageIcon iconCapNhatKho = new ImageIcon(getClass().getResource("/menu/ImgCapNhatKho.png"));

		// create xem sản phẩm
		// ------------------------------------------------------------------------

		MenuItem menuXemSanPham = new MenuItem(iconSanPham, "Xem Sản Phẩm", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelBody.removeAll();
				panelBody.add(new PanelAllSanPham());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});

		// ---------------------------------------------------------------------------------------

		// MenuItem menuGioHang = new MenuItem(iconGioHang, "Giỏ Hàng", null);
		// create submenu setting message

		// create menu KhachHang
		// MenuItem menuKH_Them = new MenuItem(iconThem, "Thêm Khách Hàng", null);
		MenuItem menuKH_CapNhatNV = new MenuItem(iconSua, "Cập nhật khách Hàng", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelThongTinKhachHang());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});

		MenuItem menuKH_Tim = new MenuItem(iconTimKiem, "Tìm kiếm khách hàng", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelBody.removeAll();
				panelBody.add(new PanelTimKiemKhachHang());
				panelBody.repaint();
				panelBody.revalidate();

			}
		});
		MenuItem menuKH_GioHangNV = new MenuItem(iconGioHang, "GIỎ HÀNG", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelMuaHang());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});

		// create tao du lieu.NHAN VIEn..----------------------------------------------
		MenuItem menuNV_XemThongTin = new MenuItem(iconXem, "Xem thông tin", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelBody.removeAll();
				panelBody.add(new PanelThongTinCaNhanNV());
				panelBody.repaint();
				panelBody.revalidate();

			}
		});
		MenuItem menuNV_ThongKe = new MenuItem(iconThongKe, "Thống Kê", null);
		MenuItem menuNV_BaoCao = new MenuItem(iconBaoCao, "Tạo Báo Cáo", null);

		MenuItem menuNV_ThemChucVu = new MenuItem(iconHoaDon, "Chức vụ", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelBody.removeAll();
				panelBody.add(new PanelThemChucVu());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});

	

		// -------------------------------------------------------------------------------------
		// ---------------TAO MENU HOA DON------------------------

		
		MenuItem menuHD_capnhat = new MenuItem(iconSua, "Xem hóa đơn", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelHienThiHoaDon());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});

		// -----------------------------------------------------

		// -----------------------------------------------------------------------------
		// tao menu nha cung cap ------------------------

		MenuItem menuNCC_TimKiem = new MenuItem(iconTimKiem, "Tìm Kiếm Nhà Cung Cấp", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelTimKiemNCC());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});
		MenuItem menuNCC_Capnhat = new MenuItem(iconSua, "Cập Nhật Nhà Cung Cấp", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelThongTinNCC());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});

		// -------------------------------------------------------------
		// --------tao menu Quan li----------------------------------

		MenuItem menuQuanLiNhanVien = new MenuItem(iconThem, "Quản Lí Nhân viên", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelThongTinNhanVien());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});
		
		//// dung cho form đang nhap
		
		/*
		 * MenuItem menuDangNhap = new MenuItem(iconThem, "Đăng nhập", new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub panelBody.removeAll();
		 * 
		 * panelBody.repaint(); panelBody.revalidate(); } });
		 */
		MenuItem menuXemBaoCao = new MenuItem(iconBaoCao, "Xem Báo Cáo", null);

		// -----------------------------------------------------------

		// ---------tao menu San Pham-----------------------------
		MenuItem menuSP_view = new MenuItem(iconSanPham, "Xem Sản Phẩm", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelAllSanPham());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});
		MenuItem menuSP_tim = new MenuItem(iconTimKiem, "Tìm kiếm sản phẩm", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelTimKiemSanPham());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});
		MenuItem menuSP_nhapkho = new MenuItem(iconNhapKho, "Cập nhật Kho Sản Phẩm", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelCapNhatSanPham());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});
		MenuItem menuSP_capnhat = new MenuItem(iconSua, "Thêm sản phẩm", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelThemSanPham());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});
		
		
		MenuItem menuSP_Mua = new MenuItem(iconSua, "Mua hàng", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBody.removeAll();
				panelBody.add(new PanelMuaHang());
				panelBody.repaint();
				panelBody.revalidate();
			}
		});

		// ---------------------------------------------------

		// -----------------------------------------------
		// MenuItem menuNhanVien = new MenuItem(iconNhanVien, "Nhân Viên",
		// null,menuDLNhanVien,menuDLKhachHang, menuXemSanPham, menuDL,
		// menuGioHang,menuDLThongKe,menuBaoCao);
		MenuItem menuNV = new MenuItem(iconNhanVien, "Nhân Viên", null, menuNV_XemThongTin,
				menuNV_ThemChucVu,
				menuQuanLiNhanVien,
				menuNV_ThongKe, menuNV_BaoCao);
		MenuItem menuKhachHang = new MenuItem(iconDLKhach, "Khách Hàng", null, menuKH_CapNhatNV, menuKH_Tim
				);
	
		MenuItem menuNCC = new MenuItem(iconNCC, "Nhà cung cấp", null, menuNCC_TimKiem, menuNCC_Capnhat);
		MenuItem menuSanPham = new MenuItem(iconDLSanPham, "Sản Phẩm", null, menuSP_view,menuSP_Mua, menuSP_tim, menuSP_nhapkho,
				menuSP_capnhat);
		MenuItem menuHD = new MenuItem(iconHoaDon, "Hóa Đơn", null, menuHD_capnhat);
		addMenu(menuNV, menuKhachHang, menuSanPham, menuHD, menuNCC);
		menuNCC.setBackground(new java.awt.Color(155, 156, 237));
		menuNV.setBackground(new java.awt.Color(155, 156, 237));
		
		menuKhachHang.setBackground(new java.awt.Color(155, 156, 237));
		menuSanPham.setBackground(new java.awt.Color(155, 156, 237));
		menuHD.setBackground(new java.awt.Color(155, 156, 237));

	}

	private void addMenu(MenuItem... menu) {
		for (int i = 0; i < menu.length; i++) {
			menus.add(menu[i]);
			ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
			for (MenuItem m : subMenu) {
				addMenu(m);
			}
		}
		// menus.setSize(500, 500);
		menus.revalidate();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		panelHeader = new javax.swing.JPanel();
		panelMenu = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		menus = new javax.swing.JPanel();
		panelBody = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panelHeader.setBackground(new java.awt.Color(45, 113, 248));
		panelHeader.setPreferredSize(new java.awt.Dimension(561, 50));

		JLabel lblNewLabel = new JLabel("HỆ THỐNG QUẢN LÍ SHOP THỜI TRANG\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setLabelFor(lblNewLabel);

		javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
		panelHeaderLayout.setHorizontalGroup(panelHeaderLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE));
		panelHeaderLayout.setVerticalGroup(panelHeaderLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));
		panelHeader.setLayout(panelHeaderLayout);

		getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

		panelMenu.setBackground(new java.awt.Color(115, 120, 230));
		panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

		jScrollPane1.setBorder(null);

		menus.setBackground(new java.awt.Color(255, 255, 255));
		menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
		jScrollPane1.setViewportView(menus);

		javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
		panelMenu.setLayout(panelMenuLayout);
		panelMenuLayout
				.setHorizontalGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE));
		panelMenuLayout.setVerticalGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE));

		getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

		panelBody.setBackground(new java.awt.Color(255, 255, 255));
		panelBody.setLayout(new java.awt.BorderLayout());
		getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

		setSize(new java.awt.Dimension(871, 473));
		setLocationRelativeTo(null);
	}// </editor-fold>

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JPanel menus;
	private javax.swing.JPanel panelBody;
	private javax.swing.JPanel panelHeader;
	private javax.swing.JPanel panelMenu;

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
