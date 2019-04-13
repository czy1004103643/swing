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
import java.awt.Color;

public class Function4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;

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
	public Function4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5B9A\u5236\u63A8\u5E7F");
		label.setBackground(Color.LIGHT_GRAY);
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(155, 10, 99, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u63A8\u5E7F\u7F16\u53F7");
		label_1.setBounds(29, 47, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u63A8\u5E7F\u5DE5\u4F5C\u4EBA\u5458");
		label_2.setBounds(29, 89, 88, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u63A8\u5E7F\u65F6\u95F4\uFF1A2017.01.01-2017.01.03");
		label_3.setBounds(191, 47, 200, 15);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 129, 66, 21);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("\u63A8\u5E7F\u5907\u6CE8");
		label_4.setBounds(29, 207, 76, 15);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(115, 204, 276, 21);
		contentPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"XXX"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(127, 86, 57, 21);
		contentPane.add(comboBox);
		
		JLabel label_5 = new JLabel("\u63A8\u5E7F\u9014\u5F84");
		label_5.setBounds(212, 89, 76, 15);
		contentPane.add(label_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0001", "0002"}));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(93, 44, 57, 21);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u4E92\u8054\u7F51", "\u4F20\u5355"}));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setBounds(274, 86, 76, 21);
		contentPane.add(comboBox_2);
		
		JLabel label_8 = new JLabel("\u63A8\u5E7F\u8D39\u7528");
		label_8.setBounds(29, 132, 76, 15);
		contentPane.add(label_8);
		
		JLabel label_6 = new JLabel("\u63A8\u5E7F\u8054\u7CFB\u7535\u8BDD");
		label_6.setBounds(29, 175, 76, 15);
		contentPane.add(label_6);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(115, 172, 117, 21);
		contentPane.add(textField);
		
		JButton button = new JButton("\u63A8\u5E7F\u786E\u8BA4");
		button.setBounds(115, 235, 93, 23);
		contentPane.add(button);
	}

}
