package swing.login;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.SwingConstants;

public class Login3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login3 frame = new Login3();
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
	public Login3() {
		super("管理员登录");
		this.setIconImage(new ImageIcon("image/2.jpg").getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("用户名：");
		label.setBounds(46, 126, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setBounds(46, 165, 54, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(100, 123, 102, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 162, 102, 21);
		contentPane.add(passwordField);
		//背景图片的路径。（相对路径或者绝对路径。本例图片放于"java项目名"的文件下）
		String path2 = "image/6.gif";
		// 背景图片
		ImageIcon background2 = new ImageIcon(path2);
		ImageIcon image = new ImageIcon(Login3.class.getResource("/res/bg1.jpg"));
		int width = 414;
		int height = 96;
		Image img = image.getImage();
		img = img.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		image.setImage(img);
		JLabel lblNewLabel = new JLabel(image);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
//		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
//		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 10, width, height);

		lblNewLabel.setSize(width, height);
		contentPane.add(lblNewLabel);
		// 把背景图片添加到分层窗格的最底层作为背景
		this.getLayeredPane().add(lblNewLabel, new Integer(Integer.MIN_VALUE));
		
		
		
		//背景图片的路径。（相对路径或者绝对路径。本例图片放于"java项目名"的文件下）
		String path = "image/2.jpg";
		// 背景图片
		ImageIcon background = new ImageIcon(path);
		// 把背景图片显示在一个标签里面
		JLabel label2 = new JLabel(background);
		// 把标签的大小位置设置为图片刚好填充整个面板
//		label2.setBounds(0, 0, this.getWidth(), this.getHeight());
		// 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明
		JPanel imagePanel = (JPanel) this.getContentPane();
		imagePanel.setOpaque(false);
		// 把背景图片添加到分层窗格的最底层作为背景
		this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
		//设置可见
		setVisible(true);
		//点关闭按钮时退出
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btnNewButton = new JButton("登录");
		btnNewButton.setBounds(59, 208, 93, 23);
		contentPane.add(btnNewButton);
	}

}
