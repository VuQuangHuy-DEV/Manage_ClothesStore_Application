package form;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import DAO.HoaDon_DAO;
import DAO.KhachHang_DAO;
import DAO.NhanVien_DAO;
import DAO.SanPham_DAO;
import connectDB.Database;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;
import entity.SanPham;
import entity.luuNhanVien;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class PanelMuaHang extends JPanel {
	private JTable table = new JTable();
	private JTable table_1 = new JTable();
	DefaultTableModel model = new DefaultTableModel();
	DefaultTableModel model2 = new DefaultTableModel();
	SanPham_DAO spd = new SanPham_DAO();
	List<SanPham> nccs = new ArrayList<>();
	private JTextField txtSDT;
	private JTextField txtSoLuong;

	/**
	 * Create the panel.
	 */
	public PanelMuaHang() {

		Database.getInstance().connect();

		updataTableData();

		setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 32, 695, 30);
		add(panel_1);

		JLabel lblNewLabel_6 = new JLabel("SẢN PHẨM");
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));

		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 0, 1300, 30);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("THÔNG TIN GIỎ HÀNG :\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 1300, 30);
		panel.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 65, 695, 479);
		add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(model = new DefaultTableModel(new Object[][] {},
				new String[] { "M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "Lo\u1EA1i",
						"K\u00EDch c\u1EE1", "Gi\u00E1", "S\u1ED1 l\u01B0\u1EE3ng c\u00F2n l\u1EA1i",
						"Nh\u00E0 cung c\u1EA5p" }));

		updataTableData();

		JButton btnNewButton = new JButton("");

		btnNewButton.setIcon(new ImageIcon(PanelMuaHang.class.getResource("/menu/ImgTien.png")));
		btnNewButton.setBounds(756, 162, 65, 40);
		add(btnNewButton);

		JButton btnNewButton_2 = new JButton("");

		btnNewButton_2.setIcon(new ImageIcon(PanelMuaHang.class.getResource("/menu/ImgLui.png")));
		btnNewButton_2.setBounds(756, 312, 65, 40);
		add(btnNewButton_2);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(882, 65, 418, 415);
		add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(model2 = new DefaultTableModel(new Object[][] {},
				new String[] { "M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "\u0110\u01A1n gi\u00E1",
						"S\u1ED1 l\u01B0\u1EE3ng", "Th\u00E0nh ti\u1EC1n" }));

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int row = table.getSelectedRow();

				Double a = Double.parseDouble(table.getValueAt(row, 4).toString())
						* Integer.parseInt(txtSoLuong.getText());

				String[] rowData = { table.getValueAt(row, 0).toString(), table.getValueAt(row, 2).toString(),
						table.getValueAt(row, 4).toString(), txtSoLuong.getText(), a + "" };

				model2.addRow(rowData);

			}
		});

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				model2.removeRow(table_1.getSelectedRow());
			}
		});

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GREEN);
		panel_4.setForeground(Color.GREEN);
		panel_4.setBounds(882, 512, 418, 30);
		add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("Tổng Tiền :");
		lblNewLabel_9.setBounds(10, 0, 150, 30);
		panel_4.add(lblNewLabel_9);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setIcon(new ImageIcon(PanelMuaHang.class.getResource("/menu/ImgTongTien.png")));
		lblNewLabel_9.setBackground(Color.GREEN);
		lblNewLabel_9.setForeground(Color.RED);

		JLabel lblTongTien = new JLabel("");
		lblTongTien.setForeground(new Color(255, 0, 0));
		lblTongTien.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTongTien.setBounds(173, 0, 245, 30);
		panel_4.add(lblTongTien);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.CYAN);
		panel_1_1.setBounds(882, 32, 418, 30);
		add(panel_1_1);

		JLabel lblNewLabel_1 = new JLabel("GIỎ HÀNG");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1_1.add(lblNewLabel_1);

		JLabel lblNewLabel_6_1 = new JLabel("CHI TIẾT SẢN PHẨM MUA");
		lblNewLabel_6_1.setBounds(931, 256, 198, 19);
		add(lblNewLabel_6_1);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 15));

		txtSDT = new JTextField();
		txtSDT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSDT.setBounds(712, 79, 160, 40);
		add(txtSDT);
		txtSDT.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("SDT Khách hàng");
		lblNewLabel_2.setBounds(720, 49, 131, 13);
		add(lblNewLabel_2);

		txtSoLuong = new JTextField();
		txtSoLuong.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtSoLuong.setBounds(756, 224, 65, 54);
		add(txtSoLuong);
		txtSoLuong.setColumns(10);

		JButton btnNewButton_1 = new JButton("Tổng tiền");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a = model2.getRowCount();
				System.out.println(a);
				double tongtien = 0;
				for (int i = 0; i < a; i++) {
					tongtien += Double.parseDouble(table_1.getValueAt(i, 4).toString());

				}
				lblTongTien.setText(tongtien + " " + "VNĐ");

			}
		});
		btnNewButton_1.setBounds(931, 490, 85, 21);
		add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton(" Thanh toán");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				KhachHang_DAO khd = new KhachHang_DAO();
				KhachHang kht = khd.getKhSdt(txtSDT.getText().toString());
			
				
				

				//// lap hoa đơn
				Random rand = new Random();
				int ranNum = rand.nextInt(60000) + 1;

				String tenkh = kht.getHoTen();
				String sodienthoai = kht.getSoDienThoai();

				NhanVien_DAO ncc = new NhanVien_DAO();
				NhanVien nva = ncc.getNV(luuNhanVien.maNhanVien);

				String tennv = nva.getHoTen();

				Date date = new Date(new java.util.Date().getYear(), new java.util.Date().getMonth(),
						new java.util.Date().getDate());

				int a = model2.getRowCount();
				double tongtien = 0;
				for (int i = 0; i < a; i++) {
					tongtien += Double.parseDouble(table_1.getValueAt(i, 4).toString());

				}

				Double tien = tongtien;
				
				HoaDon hd = new HoaDon(ranNum, tenkh, sodienthoai, tennv, date, tien);
				
				 HoaDon_DAO hdd = new HoaDon_DAO();
				if( hdd.create(hd)) {
					
				}
				
				
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.setBounds(990, 593, 139, 40);
		add(btnNewButton_3);

	}

	private void updataTableData() {

		model.getDataVector().removeAllElements();
		nccs.removeAll(nccs);

		nccs = spd.docTuBang();
		for (SanPham s : nccs) {

			String[] rowData = { s.getMaSanPham() + "", s.getTenSanPham(), s.getLoaiSanPham().toString(),
					s.getKichCo() + "", s.getGiaSanPham() + "", s.getSoLuongConLai() + "", s.getNhaCungCap() };
			model.addRow(rowData);
		}
		table.setModel(model);
	}
}
