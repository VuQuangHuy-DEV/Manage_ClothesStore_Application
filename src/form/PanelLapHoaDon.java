package form;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelLapHoaDon extends JPanel {
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public PanelLapHoaDon() {
		setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Danh Sách Phiếu Mua Hàng");
		lblNewLabel_6.setBounds(0, 26, 1300, 30);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 26, 1300, 30);
		panel_1.setBackground(Color.CYAN);
		add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1300, 30);
		panel.setBackground(Color.YELLOW);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lập Hóa Đơn Mua Hàng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 1300, 30);
		panel.add(lblNewLabel);
		
		table_1 = new JTable();
		table_1.setBounds(0, 55, 1300, 314);
		add(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"M\u00E3 Phi\u1EBFu", "T\u00EAn Kh\u00E1ch H\u00E0ng", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i"},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		
		JPanel jpnLHD_formNV = new JPanel();
		jpnLHD_formNV.setBounds(0, 371, 1300, 319);
		add(jpnLHD_formNV);
		jpnLHD_formNV.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("THÔNG TIN HÓA ĐƠN");
		lblNewLabel_2.setBounds(0, 0, 1300, 46);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		jpnLHD_formNV.add(lblNewLabel_2);
		
		JPanel jpnThongTinHoaDon = new JPanel();
		jpnThongTinHoaDon.setBounds(0, 0, 1300, 46);
		jpnThongTinHoaDon.setBackground(Color.CYAN);
		jpnLHD_formNV.add(jpnThongTinHoaDon);
		
		JLabel lblNewLabel_1 = new JLabel("THÔNG TIN KHÁCH HÀNG");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(0, 45, 650, 40);
		jpnLHD_formNV.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Mã Phiếu :");
		lblNewLabel_3.setBounds(0, 86, 120, 40);
		jpnLHD_formNV.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tên Khách Hàng :");
		lblNewLabel_3_1.setBounds(0, 136, 120, 40);
		jpnLHD_formNV.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Số Điện Thoại");
		lblNewLabel_3_2.setBounds(0, 186, 120, 40);
		jpnLHD_formNV.add(lblNewLabel_3_2);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(126, 87, 524, 40);
		jpnLHD_formNV.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(126, 136, 524, 40);
		jpnLHD_formNV.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(126, 186, 524, 40);
		jpnLHD_formNV.add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("THÔNG TIN SHOP");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(650, 45, 650, 46);
		jpnLHD_formNV.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_3 = new JLabel("Nhân Viên Lập Hóa Đơn :");
		lblNewLabel_3_3.setBounds(650, 86, 120, 40);
		jpnLHD_formNV.add(lblNewLabel_3_3);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(780, 86, 520, 40);
		jpnLHD_formNV.add(textField_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Ngày Lập");
		lblNewLabel_3_3_1.setBounds(650, 136, 120, 40);
		jpnLHD_formNV.add(lblNewLabel_3_3_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(780, 136, 401, 40);
		jpnLHD_formNV.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(PanelLapHoaDon.class.getResource("/menu/ImgLich.png")));
		btnNewButton.setBounds(1191, 136, 85, 40);
		jpnLHD_formNV.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Lập Hóa Đơn");
		btnNewButton_1.setBounds(293, 264, 178, 45);
		jpnLHD_formNV.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Xóa Rỗng TextFied\r\n");
		btnNewButton_1_1.setBounds(944, 264, 178, 45);
		jpnLHD_formNV.add(btnNewButton_1_1);

	}
}
