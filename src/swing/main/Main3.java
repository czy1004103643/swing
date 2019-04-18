package swing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Main3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main3 frame = new Main3();
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
	public Main3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("政务服务信息资源目录管理系统");
		label.setForeground(new Color(128, 0, 128));
		label.setFont(new Font("����", Font.PLAIN, 30));
		label.setBounds(205, 22, 438, 55);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(29, 108, 246, 156);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("信息管理");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("����", Font.PLAIN, 27));
		label_1.setBounds(54, 56, 146, 39);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(301, 108, 246, 156);
		contentPane.add(panel_1);
		
		JLabel label_4 = new JLabel("服务管理");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("����", Font.PLAIN, 27));
		label_4.setBounds(60, 54, 146, 39);
		panel_1.add(label_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(570, 108, 246, 156);
		contentPane.add(panel_2);
		
		JLabel label_6 = new JLabel("资源管理");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("����", Font.PLAIN, 27));
		label_6.setBounds(59, 56, 146, 39);
		panel_2.add(label_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(29, 320, 246, 156);
		contentPane.add(panel_3);
		
		JLabel label_8 = new JLabel("目录管理");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("����", Font.PLAIN, 27));
		label_8.setBounds(50, 64, 146, 39);
		panel_3.add(label_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(301, 320, 246, 156);
		contentPane.add(panel_4);
		
		JLabel label_10 = new JLabel("分类查看");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("����", Font.PLAIN, 27));
		label_10.setBounds(48, 58, 146, 39);
		panel_4.add(label_10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(570, 320, 246, 156);
		contentPane.add(panel_5);
		
		JLabel label_12 = new JLabel("系统设置");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("����", Font.PLAIN, 27));
		label_12.setBounds(54, 57, 146, 39);
		panel_5.add(label_12);
	}
}
