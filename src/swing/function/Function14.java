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

public class Function14 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function14 frame = new Function14();
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
	public Function14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 438);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u641C\u7D22\u5F15\u64CE");
		label.setBounds(218, 10, 158, 52);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 33));
		contentPane.add(label);
		
		JButton button_1 = new JButton("\u4FDD\u5B58");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(30, 268, 113, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("\u65B0\u589E\u641C\u7D22\u5F15\u64CE");
		btnNewButton.setBounds(465, 331, 127, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(30, 77, 562, 104);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_4 = new JLabel("\u9009\u62E9\u641C\u7D22\u5F15\u64CE\uFF1A");
		label_4.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
		label_4.setBounds(10, 10, 229, 24);
		panel_1.add(label_4);
		
		JCheckBox checkBox = new JCheckBox("\u767E\u5EA6");
		checkBox.setSelected(true);
		checkBox.setBounds(10, 42, 103, 23);
		panel_1.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("360");
		checkBox_1.setSelected(true);
		checkBox_1.setBounds(127, 42, 103, 23);
		panel_1.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\u641C\u72D7");
		checkBox_2.setBounds(241, 42, 103, 23);
		panel_1.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\u5B9C\u641C");
		checkBox_3.setBounds(10, 75, 103, 23);
		panel_1.add(checkBox_3);
		
		JButton button = new JButton("\u4FEE\u6539");
		button.setBounds(179, 268, 113, 23);
		contentPane.add(button);
		
		JButton button_2 = new JButton("\u5220\u9664");
		button_2.setBounds(333, 268, 113, 23);
		contentPane.add(button_2);
	}
}
