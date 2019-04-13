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

public class Function16 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function16 frame = new Function16();
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
	public Function16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 438);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u670D\u52A1\u7EF4\u62A4");
		label.setBounds(218, 10, 158, 52);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 33));
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(42, 59, 556, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("用户编号:");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(10, 8, 73, 20);
		panel.add(label_1);
		
		JLabel label_3 = new JLabel("关键字:");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(165, 8, 72, 20);
		panel.add(label_3);
		
		JButton button = new JButton("查询");
		button.setBounds(357, 8, 93, 23);
		panel.add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(93, 8, 62, 24);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(230, 8, 62, 24);
		panel.add(textArea_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 221, 556, 168);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\u641C\u7D22\u7F16\u53F7", "用户编号","\u5173\u952E\u5B57", "\u641C\u7D22\u5F15\u64CE", "\u641C\u7D22\u65F6\u95F4", "\u641C\u7D22\u7ED3\u679C\u7B80\u4ECB"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel label_5 = new JLabel("\u641C\u7D22\u7ED3\u679C\u5217\u8868");
		label_5.setBounds(42, 205, 84, 15);
		contentPane.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(42, 129, 556, 66);
		contentPane.add(panel_1);
		
		JButton button_1 = new JButton("合并搜索结果");
		button_1.setBounds(10, 21, 121, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("删除搜索结果");
		button_2.setBounds(151, 21, 121, 23);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("导出搜索结果");
		button_3.setBounds(289, 21, 121, 23);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("打印搜索结果");
		button_4.setBounds(425, 21, 121, 23);
		panel_1.add(button_4);
	}
}
