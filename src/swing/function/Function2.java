package swing.function;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Function2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function2 frame = new Function2();
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
	public Function2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u63A8\u5E7F\u5E73\u53F0");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(155, 10, 99, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u54C1\u724C\u540D\u79F0");
		label_1.setBounds(29, 47, 54, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(93, 44, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u54C1\u724C\u7C7B\u578B");
		label_2.setBounds(29, 89, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u63A8\u5E7F\u5F00\u59CB\u65F6\u95F4");
		label_3.setBounds(29, 132, 76, 15);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 129, 66, 21);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("\u63A8\u5E7F\u7ED3\u675F\u65F6\u95F4");
		label_4.setBounds(29, 174, 76, 15);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(115, 171, 66, 21);
		contentPane.add(textField_3);
		
		JButton button = new JButton("\u6DFB\u52A0\u54C1\u724C\u63A8\u5E7F\u9879\u76EE");
		button.setBounds(126, 216, 128, 23);
		contentPane.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u623F\u4EA7", "\u7A7F\u6234"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(102, 86, 57, 21);
		contentPane.add(comboBox);
		
		JLabel label_5 = new JLabel("\u54C1\u724C\u7279\u70B9");
		label_5.setBounds(212, 89, 76, 15);
		contentPane.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(274, 86, 128, 21);
		contentPane.add(textField_1);
		
		JLabel label_6 = new JLabel("\u63A8\u5E7F\u9700\u6C42");
		label_6.setBounds(212, 132, 76, 15);
		contentPane.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(274, 129, 128, 21);
		contentPane.add(textField_4);
		
		JLabel label_7 = new JLabel("\u5907\u6CE8");
		label_7.setBounds(212, 171, 76, 15);
		contentPane.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(274, 168, 128, 21);
		contentPane.add(textField_5);
	}

}
