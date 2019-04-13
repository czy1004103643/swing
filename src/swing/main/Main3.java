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
		
		JLabel label = new JLabel("\u76DB\u4E16\u9F50\u5929\u641C\u7D22\u670D\u52A1\u5E73\u53F0");
		label.setForeground(new Color(128, 0, 128));
		label.setFont(new Font("宋体", Font.PLAIN, 30));
		label.setBounds(251, 22, 318, 55);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(29, 108, 246, 156);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\notebook\\\u5DE5\u4F5C\u6587\u6863\\\u84DD\u660E\u8F6F\u8457\\\u8F6F\u4EF6\u56FE\u7D20\\\u56FE\u6807\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021325177_easyicon_net_128.png"));
		label_2.setBounds(62, -15, 128, 107);
		panel.add(label_2);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u4E2D\u5FC3");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("宋体", Font.PLAIN, 27));
		label_1.setBounds(49, 103, 146, 39);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(301, 108, 246, 156);
		contentPane.add(panel_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\notebook\\\u5DE5\u4F5C\u6587\u6863\\\u84DD\u660E\u8F6F\u8457\\\u8F6F\u4EF6\u56FE\u7D20\\\u56FE\u6807\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021339691_easyicon_net_128.png"));
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(49, -14, 128, 107);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("\u641C\u7D22\u5F15\u64CE");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("宋体", Font.PLAIN, 27));
		label_4.setBounds(49, 103, 146, 39);
		panel_1.add(label_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(570, 108, 246, 156);
		contentPane.add(panel_2);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\notebook\\\u5DE5\u4F5C\u6587\u6863\\\u84DD\u660E\u8F6F\u8457\\\u8F6F\u4EF6\u56FE\u7D20\\\u56FE\u6807\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021354269_easyicon_net_128.png"));
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(49, -14, 128, 107);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("\u65B9\u6848\u5B9E\u65BD");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("宋体", Font.PLAIN, 27));
		label_6.setBounds(49, 103, 146, 39);
		panel_2.add(label_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(29, 320, 246, 156);
		contentPane.add(panel_3);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\notebook\\\u5DE5\u4F5C\u6587\u6863\\\u84DD\u660E\u8F6F\u8457\\\u8F6F\u4EF6\u56FE\u7D20\\\u56FE\u6807\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021415434_easyicon_net_128.png"));
		label_7.setVerticalAlignment(SwingConstants.TOP);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(49, -14, 128, 107);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("\u670D\u52A1\u7EF4\u62A4");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("宋体", Font.PLAIN, 27));
		label_8.setBounds(49, 103, 146, 39);
		panel_3.add(label_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(301, 320, 246, 156);
		contentPane.add(panel_4);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\notebook\\\u5DE5\u4F5C\u6587\u6863\\\u84DD\u660E\u8F6F\u8457\\\u8F6F\u4EF6\u56FE\u7D20\\\u56FE\u6807\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021413199_easyicon_net_128.png"));
		label_9.setVerticalAlignment(SwingConstants.TOP);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(49, -14, 128, 107);
		panel_4.add(label_9);
		
		JLabel label_10 = new JLabel("\u641C\u7D22\u52A8\u6001");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("宋体", Font.PLAIN, 27));
		label_10.setBounds(49, 103, 146, 39);
		panel_4.add(label_10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(570, 320, 246, 156);
		contentPane.add(panel_5);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\notebook\\\u5DE5\u4F5C\u6587\u6863\\\u84DD\u660E\u8F6F\u8457\\\u8F6F\u4EF6\u56FE\u7D20\\\u56FE\u6807\\\u9ED1\u8272\u900F\u660E\u7684\u624B\u673A\u8F6F\u4EF6\u56FE\u6807\\20130807021323486_easyicon_net_128.png"));
		label_11.setVerticalAlignment(SwingConstants.TOP);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(49, -14, 128, 107);
		panel_5.add(label_11);
		
		JLabel label_12 = new JLabel("\u5E2E\u52A9\u548C\u53CD\u9988");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("宋体", Font.PLAIN, 27));
		label_12.setBounds(49, 103, 146, 39);
		panel_5.add(label_12);
	}
}
