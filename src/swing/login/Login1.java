package swing.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login1 extends JFrame {

	private JPanel contentPane;
	JPanel panel=new JPanel();
    JLabel label1=new JLabel("ÕËºÅ:");
    JTextField username=new JTextField();
    JLabel label2=new JLabel("ÃÜÂë:");
    JPasswordField password=new JPasswordField();
    JButton enter=new JButton("µÇÂ¼");
    JButton exit=new JButton("ÍË³ö");
    ImageIcon background;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 frame = new Login1();
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
	public Login1() {
		setTitle("µÇÂ¼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		 background=new ImageIcon("login_back.png");
	        JLabel back=new JLabel(background);
	        this.setResizable(false);
	        this.setSize(451,327);
	        enter.setBounds(110,180,70,20);
	        exit.setBounds(240,180,70,20);
	        this.getLayeredPane().add(back,new Integer(Integer.MIN_VALUE));
	        back.setBounds(0,0,background.getIconWidth(),background.getIconHeight());
	        Font font=new Font("Î¢ÈíÑÅºÚ",Font.BOLD,15);
	        label1.setBounds(115,90,50,25);
	        label1.setFont(font);
	        username.setBounds(150,90,150,25);
	        label2.setBounds(115,125,50,25);
	        label2.setFont(font);
	        password.setBounds(150,125,150,25);
	        panel=(JPanel)this.getContentPane();
	        panel.setLayout(null);
	        panel.setOpaque(false);
	        panel.add(enter);
	        panel.add(exit);
	        panel.add(label1);
	        panel.add(username);
	        panel.add(label2);
	        panel.add(password);
	        this.setLocationRelativeTo(null);
	        this.setVisible(true);
	        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
