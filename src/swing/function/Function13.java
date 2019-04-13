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

public class Function13 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function13 frame = new Function13();
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
	public Function13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 438);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u4E2D\u5FC3");
		label.setBounds(218, 10, 158, 52);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
		contentPane.add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 55, 427, 24);
		textArea.setText("\u5FEB\u6377\u641C\u7D22\u7528\u6237");
		contentPane.add(textArea);
		
		JButton button = new JButton("\u641C\u7D22");
		button.setBounds(456, 55, 93, 23);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 89, 617, 202);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBorder(null);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u7528\u6237\u7F16\u53F7", "\u7528\u6237\u540D\u79F0", "\u7528\u6237\u624B\u673A\u53F7", "\u7528\u6237\u7C7B\u578B"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton button_1 = new JButton("\u7528\u6237\u8BE6\u60C5");
		button_1.setBounds(31, 331, 129, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("\u7528\u6237\u641C\u7D22\u9700\u6C42");
		btnNewButton.setBounds(218, 331, 93, 23);
		contentPane.add(btnNewButton);
	}
}
