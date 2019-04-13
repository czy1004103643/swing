package swing.function;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Function15 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function15 frame = new Function15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Function15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 438);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5B9E\u65BD\u641C\u7D22");
		label.setBounds(218, 10, 158, 52);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 33));
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 59, 556, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("\u7528\u6237:");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(10, 8, 54, 20);
		panel.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00001"}));
		comboBox.setBounds(74, 8, 64, 20);
		panel.add(comboBox);
		
		JLabel label_2 = new JLabel("\u5173\u952E\u8BCD:");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(10, 48, 72, 20);
		panel.add(label_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"XXX"}));
		comboBox_1.setBounds(74, 49, 64, 20);
		panel.add(comboBox_1);
		
		JLabel label_3 = new JLabel("\u5F15\u64CE:");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(165, 8, 72, 20);
		panel.add(label_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u767E\u5EA6"}));
		comboBox_2.setBounds(236, 8, 54, 20);
		panel.add(comboBox_2);
		
		JLabel label_4 = new JLabel("\u5339\u914D\u5EA6:");
		label_4.setFont(new Font("宋体", Font.PLAIN, 16));
		label_4.setBounds(165, 48, 72, 20);
		panel.add(label_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"\u5168\u8BCD"}));
		comboBox_3.setBounds(236, 48, 54, 20);
		panel.add(comboBox_3);
		
		JButton button = new JButton("\u641C\u7D22");
		button.setBounds(373, 28, 93, 23);
		panel.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 159, 556, 106);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"关键词", "搜索引擎", "搜索结果信息", "搜索时间"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel label_5 = new JLabel("\u641C\u7D22\u7ED3\u679C");
		label_5.setBounds(42, 143, 54, 15);
		contentPane.add(label_5);
		
		JButton button_1 = new JButton("\u4FDD\u5B58\u641C\u7D22\u7ED3\u679C");
		button_1.setBounds(42, 303, 122, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u6E05\u7A7A\u672C\u6B21\u641C\u7D22");
		button_2.setBounds(192, 303, 115, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u5BFC\u51FA\u641C\u7D22\u7ED3\u679C");
		button_3.setBounds(42, 349, 122, 23);
		contentPane.add(button_3);
	}
}
