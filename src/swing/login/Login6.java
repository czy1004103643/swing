package swing.login;

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

public class Login6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ValidCode vcode;  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login6 frame = new Login6();
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
	public Login6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		
		JLabel label = new JLabel("\u7528\u6237\u767B\u5F55");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 51, 255));
		label.setFont(new Font("����", Font.PLAIN, 16));
		label.setBounds(161, 5, 107, 22);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u8D26  \u53F7\uFF1A");
		label_1.setFont(new Font("����", Font.PLAIN, 14));
		label_1.setBounds(51, 56, 61, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5BC6  \u7801\uFF1A");
		label_2.setFont(new Font("����", Font.PLAIN, 14));
		label_2.setBounds(51, 102, 61, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u9A8C\u8BC1\u7801\uFF1A");
		label_3.setFont(new Font("����", Font.PLAIN, 14));
		label_3.setBounds(51, 146, 61, 15);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(132, 53, 165, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 99, 165, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(132, 143, 61, 21);
		contentPane.add(textField_2);
		
		JButton button = new JButton("\u767B   \u5F55");
		button.setBackground(Color.GREEN);
		button.setForeground(new Color(0, 0, 0));
		button.setIcon(new ImageIcon());
		button.setBounds(132, 190, 93, 23);
		contentPane.add(button);
		
		JLabel label_5 = new JLabel("\u8FD8\u6CA1\u6709\u8D26\u53F7\uFF01");
		label_5.setBounds(246, 230, 72, 15);
		contentPane.add(label_5);
		
		JButton button_1 = new JButton("\u6CE8\u518C");
		button_1.setBounds(328, 223, 61, 28);
		contentPane.add(button_1);
		
	    vcode = new ValidCode();  
        vcode.setBounds(220, 130, 115, 50);  
        contentPane.add(vcode);  
	}
}
