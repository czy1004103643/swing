package swing.register;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Register2 extends JFrame {

	private JPanel contentPane;
	  private JFrame jf = new JFrame("ע��");
	    private Container con = jf.getContentPane();// ������
	    private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Dimension sc = toolkit.getScreenSize();// �����Ļ�ߴ�
    private JLabel id = new JLabel("用户名");
    private JLabel name = new JLabel("密码");
    private JLabel pass = new JLabel("确认密码");
    private JLabel pass2 = new JLabel("电子邮箱");
    private JTextField textId = new JTextField();
    private JTextField textName = new JTextField();
    private JLabel title = new JLabel("用户注册");
    private JPasswordField textPs = new JPasswordField(); // �����
    private JPasswordField textPs2 = new JPasswordField();
    
    // ��ť
    private JButton registerBtn = new JButton("注册");
    private JButton backLoginBtn = new JButton("重置");
    
    // ���壬��ʽ�����壬б�壩����С
    private Font font = new Font("����", 1, 28);
    private Font font1 = new Font("����", 0, 20);
    private Font font2 = new Font("����", 0, 18);


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register2 frame = new Register2();
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
	public Register2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		jf.setTitle("注册");
		
		jf.setSize(900, 500);
        jf.setLocation((sc.width - 900) / 2, (sc.height - 500) / 2);
        jf.setResizable(false);// ���ڴ�С���ɱ�
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setVisible(true);

        title.setBounds(395, 10, 170, 30);
        title.setFont(font);
        title.setForeground(Color.black);

        id.setBounds(325, 140, 95, 30);
        id.setFont(font1);
        id.setForeground(Color.red);

        name.setBounds(325, 190, 95, 30);
        name.setFont(font1);
        name.setForeground(Color.RED);

        pass.setBounds(325, 240, 95, 30);// �����λ�ô�С
        pass.setForeground(Color.red);
        pass.setFont(font1);

        pass2.setBounds(325, 290, 95, 30);
        pass2.setForeground(Color.red);
        pass2.setFont(font1);

        textId.setBounds(430, 143, 170, 25);
        textId.setFont(font1);
        textId.setBorder(null);// �߿�

        textName.setBounds(430, 193, 170, 25);
        textName.setFont(font1);
        textName.setBorder(null);// �߿�

        textPs.setBounds(430, 243, 170, 25);
        textPs.setFont(font1);
        textPs.setBorder(null);
        // ���Խ�������ʾΪ* ��Ĭ��Ϊ�� ��Ĭ���ֶ�������������ʱ������
        textPs.setEchoChar('*');
        
        textPs2.setBounds(430, 293, 170, 25);
        textPs2.setFont(font1);
        textPs2.setBorder(null);
        textPs2.setEchoChar('*');

        registerBtn.setBounds(350, 340, 90, 25);
        registerBtn.setFont(font2);

        backLoginBtn.setBounds(490, 340, 90, 25);
        backLoginBtn.setFont(font2);
        ImageIcon bgim = new ImageIcon("resources/background.jpg");// ����ͼ��
        JLabel bg = new JLabel(bgim);
        Container laycon = jf.getLayeredPane();
        bg.setSize(jf.getSize().width, jf.getSize().height);
        bgim.setImage(bgim.getImage().getScaledInstance(bg.getSize().width,
                bg.getSize().height, Image.SCALE_DEFAULT));
        laycon.add(bg, new Integer(Integer.MIN_VALUE));

        con.add(title);
        con.add(id);
        con.add(name);
        con.add(pass);
        con.add(pass2);
        con.add(textId);
        con.add(textName);
        con.add(textPs);
        con.add(textPs2);
        con.add(registerBtn);
        con.add(backLoginBtn);
        con.add(bg);
	}

}
