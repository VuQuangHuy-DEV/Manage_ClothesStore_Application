package form;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import DAO.HoaDon_DAO;
import connectDB.Database;
import entity.HoaDon;
import entity.SanPham;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelHienThiHoaDon extends javax.swing.JPanel {

	HoaDon_DAO hdD = new HoaDon_DAO();
	DefaultTableModel model = new DefaultTableModel();
	List<HoaDon> hds = new ArrayList<HoaDon>();

	/**
	 * Creates new form Panel1
	 */
	public PanelHienThiHoaDon() {
		initComponents();
		updataTableData();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		Database.getInstance().connect();
		jlbHoaDon = new javax.swing.JLabel();
		jlbHoaDon.setForeground(Color.ORANGE);

		jlbHoaDon.setBackground(new java.awt.Color(155, 156, 237));
		jlbHoaDon.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
		jlbHoaDon.setText("Hóa Đơn\r\n");
		jlbHoaDon.setOpaque(true);

		JPanel jpanelTong = new JPanel();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jlbHoaDon, GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE).addGroup(Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap().addComponent(jpanelTong,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jlbHoaDon, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jpanelTong, GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)));
		jpanelTong.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 650, 200);
		jpanelTong.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Mã Hóa Đơn");
		lblNewLabel.setBounds(0, 47, 100, 30);
		panel.add(lblNewLabel);

		txtMa = new JTextField();
		txtMa.setBounds(110, 48, 540, 30);
		panel.add(txtMa);
		txtMa.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Tên Khách Hàng :\r\n");
		lblNewLabel_1.setBounds(0, 87, 100, 30);
		panel.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(110, 88, 540, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Số Điện Thoại :");
		lblNewLabel_6.setBounds(0, 130, 100, 30);
		panel.add(lblNewLabel_6);

		textField_4 = new JTextField();
		textField_4.setBounds(110, 128, 540, 36);
		panel.add(textField_4);
		textField_4.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.CYAN);
		panel_4.setBounds(0, 0, 650, 36);
		panel.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Thông Tin Khách Hàng");
		lblNewLabel_3.setBounds(0, 0, 650, 36);
		panel_4.add(lblNewLabel_3);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(650, 0, 650, 200);
		jpanelTong.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Nhân Viên :");
		lblNewLabel_2.setBounds(0, 44, 100, 30);
		panel_1.add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 44, 516, 30);
		panel_1.add(textField_2);

		JLabel lblNewLabel_7 = new JLabel("Ngày Lập :");
		lblNewLabel_7.setBounds(0, 84, 100, 30);
		panel_1.add(lblNewLabel_7);

		textField_5 = new JTextField();
		textField_5.setBounds(110, 85, 516, 30);
		panel_1.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_3_1 = new JLabel("Thông Tin SHOP");
		lblNewLabel_3_1.setBounds(0, 0, 640, 36);
		panel_1.add(lblNewLabel_3_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 640, 36);
		panel_1.add(panel_5);

		JLabel lblNewLabel_2_1 = new JLabel("Tổng tiền");
		lblNewLabel_2_1.setBounds(0, 129, 100, 30);
		panel_1.add(lblNewLabel_2_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(110, 125, 516, 30);
		panel_1.add(textField_3);

		JLabel lblDanhSchKhch = new JLabel();
		lblDanhSchKhch.setBounds(0, 202, 1280, 37);
		lblDanhSchKhch.setText("Danh Sách Nhân Viên");
		lblDanhSchKhch.setOpaque(true);
		lblDanhSchKhch.setForeground(Color.ORANGE);
		lblDanhSchKhch.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblDanhSchKhch.setBackground(new Color(155, 156, 237));
		jpanelTong.add(lblDanhSchKhch);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 240, 1280, 346);
		jpanelTong.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(model = new DefaultTableModel(new Object[][] {},
				new String[] { "M\u00E3 H\u00F3a \u0110\u01A1n", "T\u00EAn Kh\u00E1ch H\u00E0ng",
						"S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "T\u00EAn Nh\u00E2n Vi\u00EAn", "Ng\u00E0y L\u1EADp",
						"T\u1ED5ng ti\u1EC1n" }));

		JPanel jpnButton = new JPanel();
		jpnButton.setBounds(0, 614, 1290, 43);
		jpanelTong.add(jpnButton);
		jpnButton.setLayout(null);
		updataTableData();

		JButton btnNewButton = new JButton("Xóa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(hdD.delete(Integer.parseInt(txtMa.getText().toString()))) {
					updataTableData();
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(PanelThongTinKhachHang.class.getResource("/menu/ImgXoa.png")));
		btnNewButton.setBounds(306, 0, 149, 33);
		jpnButton.add(btnNewButton);

		JButton btnSa = new JButton("Sửa");
		btnSa.setIcon(new ImageIcon(PanelThongTinKhachHang.class.getResource("/menu/ImgSua.png")));
		btnSa.setBounds(565, 0, 149, 33);
		jpnButton.add(btnSa);

		JButton btnXaTrng = new JButton("Xóa Trắng");
		btnXaTrng.setBounds(873, 0, 149, 33);
		jpnButton.add(btnXaTrng);
		this.setLayout(layout);
	}// </editor-fold>

	private void updataTableData() {

		model.getDataVector().removeAllElements();
		hds.removeAll(hds);

		hds = hdD.docTuBang();
		for (HoaDon s : hds) {

			String[] rowData = { s.getMahoadon() + "",
					s.getTenKhachHang(),
					s.getSoDienThoai(),
					
					s.getTenNhanVien(), 
					s.getNgayLap().toString(),
                    s.getTongTien() + ""}; 
                   
			model.addRow(rowData);
		}
		table.setModel(model);
	}

	private javax.swing.JLabel jlbHoaDon;
	private JTextField txtMa;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_3;
}
