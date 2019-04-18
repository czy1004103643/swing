package swing.util;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 * ��������ΪͼƬ���java swing�߿�
 * @author Administrator
 *
 */
public class AddImgIntoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					AddImgIntoFrame frame = new AddImgIntoFrame();
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
	public AddImgIntoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\QQ截图20190418154812.png"));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon icon = new ImageIcon("C:\\Users\\Administrator\\Desktop\\notebook\\\u5DE5\u4F5C\u6587\u6863\\\u84DD\u660E\u8F6F\u8457\\\u8F6F\u8457\u4EE3\u7801\u548C\u6587\u6863\\4.\u535A\u745E\u4E16\u7EAA\u4EA7\u54C1\u8D44\u6599\u5F55\u5165\u76D1\u7BA1\u7CFB\u7EDF\\\u535A\u745E\u4E16\u7EAA\u4EA7\u54C1\u5F55\u5165\u7CFB\u7EDF\\\u767B\u5F55.png");
		lblNewLabel.setBounds(0, 0, 1325, 679);
		contentPane.add(lblNewLabel);
		setSize(966, 503);
	}
}
