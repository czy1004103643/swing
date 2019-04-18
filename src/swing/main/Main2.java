package swing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Main2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 frame = new Main2();
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
	public Main2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setForeground(Color.ORANGE);
		panel.setBounds(97, 93, 213, 97);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("咨询管理");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(55, 21, 109, 53);
		panel.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\3\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021322357_easyicon_net_128.png"));
		label_1.setBounds(-13, 0, 117, 94);
		panel.add(label_1);
		
		JLabel label = new JLabel("政务服务咨询投诉管理系统");
		label.setFont(new Font("����", Font.PLAIN, 24));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(174, 10, 443, 73);
		contentPane.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.ORANGE);
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(432, 93, 213, 97);
		contentPane.add(panel_1);
		
		JLabel label_2 = new JLabel("服务管理");
		label_2.setFont(new Font("����", Font.PLAIN, 20));
		label_2.setBounds(61, 20, 109, 53);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\3\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021501964_easyicon_net_128.png"));
		label_3.setBounds(-13, 0, 117, 94);
		panel_1.add(label_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.ORANGE);
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(97, 239, 213, 97);
		contentPane.add(panel_2);
		
		JLabel label_4 = new JLabel("投诉管理");
		label_4.setFont(new Font("����", Font.PLAIN, 20));
		label_4.setBounds(54, 23, 109, 53);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\3\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021415434_easyicon_net_128.png"));
		label_5.setBounds(-13, 0, 117, 94);
		panel_2.add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(432, 239, 213, 97);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setForeground(Color.ORANGE);
		panel_3.setBackground(Color.PINK);
		
		JLabel label_6 = new JLabel("客户管理");
		label_6.setFont(new Font("����", Font.PLAIN, 20));
		label_6.setBounds(64, 22, 109, 53);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\3\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021415434_easyicon_net_128.png"));
		label_7.setBounds(-13, 0, 117, 94);
		panel_3.add(label_7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setForeground(Color.ORANGE);
		panel_4.setBackground(Color.PINK);
		panel_4.setBounds(97, 382, 213, 97);
		contentPane.add(panel_4);
		
		JLabel label_8 = new JLabel("投诉流程");
		label_8.setFont(new Font("����", Font.PLAIN, 20));
		label_8.setBounds(50, 20, 109, 53);
		panel_4.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\3\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021716434_easyicon_net_128.png"));
		label_9.setBounds(-13, 0, 117, 94);
		panel_4.add(label_9);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setForeground(Color.ORANGE);
		panel_5.setBackground(Color.PINK);
		panel_5.setBounds(432, 382, 213, 97);
		contentPane.add(panel_5);
		
		JLabel label_10 = new JLabel("工作实施");
		label_10.setFont(new Font("����", Font.PLAIN, 20));
		label_10.setBounds(67, 23, 109, 53);
		panel_5.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\3\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021327556_easyicon_net_128.png"));
		label_11.setBounds(-13, 0, 117, 94);
		panel_5.add(label_11);
	}

}
