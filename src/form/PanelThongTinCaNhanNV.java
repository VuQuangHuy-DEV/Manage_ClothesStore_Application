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
import javax.swing.GroupLayout.Group;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import DAO.ChucVu_DAO;
import DAO.NhaCungCap_DAO;
import DAO.NhanVien_DAO;
import connectDB.Database;

import entity.ChucVu;
import entity.Nhacungcap;
import entity.NhanVien;
import entity.luuNhanVien;

import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelThongTinCaNhanNV extends javax.swing.JPanel {

	NhanVien_DAO ncc = new NhanVien_DAO();
	JComboBox comboBox_1;
	DefaultTableModel model = new DefaultTableModel();
	List<NhanVien> nccs = new ArrayList<>();
	ButtonGroup G = new ButtonGroup();


	/**
	 * Creates new form Panel1
	 */
	public PanelThongTinCaNhanNV() {
		initComponents();
		updateComboBox();
		updataTableData();
		ncc.getNV(luuNhanVien.getMaNhanVien());
		
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

		jLabel1 = new javax.swing.JLabel();
		jLabel1.setForeground(Color.ORANGE);

		jLabel1.setBackground(new java.awt.Color(155, 156, 237));
		jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
		jLabel1.setText("Nhân Viên");
		jLabel1.setOpaque(true);

		JPanel jpanelTong = new JPanel();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE).addGroup(Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap().addComponent(jpanelTong,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jpanelTong, GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)));
		jpanelTong.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 650, 200);
		jpanelTong.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Mã Nhân Viên  :\r\n");
		lblNewLabel.setBounds(0, 0, 100, 30);
		panel.add(lblNewLabel);

		txtMa = new JTextField();
		txtMa.setBounds(110, 0, 540, 30);
		panel.add(txtMa);
		txtMa.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Tên Nhân Viên :\r\n");
		lblNewLabel_1.setBounds(0, 40, 100, 30);
		panel.add(lblNewLabel_1);

		txtTen = new JTextField();
		txtTen.setBounds(110, 40, 540, 30);
		panel.add(txtTen);
		txtTen.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Giới Tính :");
		lblNewLabel_3.setBounds(0, 78, 100, 30);
		panel.add(lblNewLabel_3);

		 rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setBounds(110, 76, 260, 36);
		panel.add(rdbtnNewRadioButton);

		 rdbtnN = new JRadioButton("Nữ");
		rdbtnN.setBounds(372, 76, 278, 36);
		panel.add(rdbtnN);

		JLabel lblNewLabel_4 = new JLabel("Ngày Sinh:");
		lblNewLabel_4.setBounds(0, 118, 100, 30);
		panel.add(lblNewLabel_4);

		txtNgaySinh = new JTextField();
		txtNgaySinh.setEditable(false);
		txtNgaySinh.setBounds(110, 116, 330, 30);
		panel.add(txtNgaySinh);
		txtNgaySinh.setColumns(10);

		/*
		 * JLabel lblNewLabel_5 = new JLabel("\r\n"); lblNewLabel_5.setIcon(new
		 * ImageIcon(PanelThongTinKhachHang.class.getResource("/menu/ImgLich.png")));
		 * lblNewLabel_5.setBounds(450, 118, 50, 30); panel.add(lblNewLabel_5);
		 */

		JLabel lblNewLabel_6 = new JLabel("Chức vụ");
		lblNewLabel_6.setBounds(0, 158, 100, 30);
		panel.add(lblNewLabel_6);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(110, 158, 180, 30);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {}));

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(650, 0, 650, 200);
		jpanelTong.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Ngày Đăng Kí");
		lblNewLabel_2.setBounds(0, 0, 100, 30);
		panel_1.add(lblNewLabel_2);

		txtNgayDK = new JTextField();
		txtNgayDK.setEditable(false);
		txtNgayDK.setColumns(10);
		txtNgayDK.setBounds(110, 0, 540, 30);
		panel_1.add(txtNgayDK);

		JLabel lblNewLabel_7 = new JLabel("Số Điện Thoại:");
		lblNewLabel_7.setBounds(0, 40, 100, 30);
		panel_1.add(lblNewLabel_7);

		txtSDT = new JTextField();
		txtSDT.setBounds(110, 40, 530, 30);
		panel_1.add(txtSDT);
		txtSDT.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("Email:");
		lblNewLabel_13.setBounds(0, 80, 100, 30);
		panel_1.add(lblNewLabel_13);

		txtEmail = new JTextField();
		txtEmail.setBounds(110, 80, 540, 30);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblNewLabel_13_1 = new JLabel("Địa Chỉ:");
		lblNewLabel_13_1.setBounds(0, 120, 100, 30);
		panel_1.add(lblNewLabel_13_1);

		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(110, 120, 540, 30);
		panel_1.add(txtDiaChi);

		updataTableData();

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 647, 806, 10);
		jpanelTong.add(panel_2);
		
		G.add(rdbtnNewRadioButton);
		G.add(rdbtnN);
		this.setLayout(layout);
	}// </editor-fold>

	private void updataTableData() {
		
		NhanVien nva = ncc.getNV(luuNhanVien.maNhanVien);
		
		
		txtMa.setText(nva.getMaNhanVien()+"");
		txtTen.setText(nva.getHoTen());
		if(nva.isGioiTinh()) {
			rdbtnNewRadioButton.setSelected(true);
			
		}
		else rdbtnN.setSelected(true);
		
		
			
		
		txtNgaySinh.setText(nva.getNgaySinh().toString());
	      ///com
		
		
		comboBox_1.setSelectedItem(nva.getChuVu());
		
		txtNgayDK.setText(nva.getNgayDangKi().toString());
		
		txtSDT.setText(nva.getSoDienThoai());
		txtEmail.setText(nva.getEmail());
		
		txtDiaChi.setText(nva.getDiaChi());

		
	}

	private void updateComboBox() {
		ChucVu_DAO ds = new ChucVu_DAO();
		List<ChucVu> list = ds.docTuBang();

		for (ChucVu s : list) {
			comboBox_1.addItem(s.getTenChucVu());
		}
	}

	private javax.swing.JLabel jLabel1;
	private JTextField txtMa;
	private JTextField txtNgayDK;
	private JTextField txtTen;
	private JTextField txtNgaySinh;
	private JTextField txtEmail;
	private JTextField txtSDT;
	private JTextField txtDiaChi;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnN; 
}