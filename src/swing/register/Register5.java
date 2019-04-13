package swing.register;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import swing.util.ValidCode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register5 frame = new Register5();
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
	public Register5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 468);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255, 150));
		panel.setBounds(0, 0, 434, 32);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u6CE8\u518C");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("����", Font.PLAIN, 16));
		label.setBounds(87, 5, 107, 22);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u8D26\u53F7");
		label_1.setFont(new Font("����", Font.PLAIN, 14));
		label_1.setBounds(51, 56, 165, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801");
		label_2.setFont(new Font("����", Font.PLAIN, 14));
		label_2.setBounds(51, 123, 165, 15);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(51, 79, 165, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(51, 148, 165, 21);
		contentPane.add(textField_1);
		
		JLabel label_4 = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		label_4.setFont(new Font("����", Font.PLAIN, 14));
		label_4.setBounds(51, 189, 165, 15);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(51, 214, 165, 21);
		contentPane.add(textField_3);
		
		JLabel label_3 = new JLabel("\u7535\u8BDD\u53F7\u7801");
		label_3.setFont(new Font("����", Font.PLAIN, 14));
		label_3.setBounds(51, 256, 99, 15);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(51, 281, 165, 21);
		contentPane.add(textField_2);
		
		JButton button = new JButton("\u6CE8   \u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(51, 398, 165, 23);
		contentPane.add(button);
		
		JLabel label_5 = new JLabel("\u77ED\u4FE1\u9A8C\u8BC1\u7801");
		label_5.setFont(new Font("����", Font.PLAIN, 14));
		label_5.setBounds(51, 323, 99, 15);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(51, 348, 60, 21);
		contentPane.add(textField_4);
		
		JButton button_1 = new JButton("获取验证码");
		button_1.setBounds(121, 347, 93, 23);
		contentPane.add(button_1);
	}
}
