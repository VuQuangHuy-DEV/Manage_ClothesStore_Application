/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

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
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.MenuItem;

import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;

import DAO.DangNhap_DAO;
import Main.Main;
import connectDB.Database;
import entity.DangNhap;
import entity.luuNhanVien;

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
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 *
 * @author RavenPC
 */
public class FrmDangNhap extends javax.swing.JFrame {
	
	List<DangNhap> lDN = new  ArrayList<>();

	/**
	 * Creates new form Main
	 */
	public FrmDangNhap() {
		execute();
		initComponents();
		this.setExtendedState(500);
		
	}

	public void execute() {
		

		
		Database.getInstance().connect();
		DangNhap_DAO dnd= new DangNhap_DAO();
		lDN= dnd.docTuBang();
		

		
	
		
	

	}

	

	
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		panelHeader = new javax.swing.JPanel();
		panelHeader.setBounds(0, 0, 857, 50);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

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

		getContentPane().add(panelHeader);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 66, 847, 360);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tên đăng nhập");
		lblNewLabel_1.setBounds(150, 54, 115, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mật khẩu");
		lblNewLabel_1_1.setBounds(150, 122, 115, 45);
		panel.add(lblNewLabel_1_1);
		
		txtUser = new JTextField();
		txtUser.setBounds(275, 54, 355, 45);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (DangNhap dangNhap : lDN) {
					if(txtUser.getText().toString().equalsIgnoreCase(dangNhap.getUser())
							&& txtPass.getText().toString().equalsIgnoreCase(dangNhap.getPass())) {
						
						
						luuNhanVien.setMaNhanVien(Integer.parseInt(txtUser.getText().toString()));
						
						setVisible(false);
						Main main = new Main();
						main.setVisible(true);
						
					}
					else lblErr.setText("Thông tin đăng nhập sai!!!");
					
					
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(289, 239, 85, 34);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thoát");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnNewButton_1.setBounds(518, 239, 85, 34);
		panel.add(btnNewButton_1);
		
		 lblErr = new JLabel("");
		lblErr.setForeground(new Color(255, 0, 0));
		lblErr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblErr.setHorizontalAlignment(SwingConstants.CENTER);
		lblErr.setBounds(242, 10, 388, 34);
		panel.add(lblErr);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(275, 122, 355, 45);
		panel.add(txtPass);

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
			java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrmDangNhap().setVisible(true);
			}
		});
	}
	private javax.swing.JPanel panelHeader;
	private JTextField txtUser;
	JLabel lblErr;
	private JPasswordField txtPass;

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
