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

public class Login2 extends JFrame {

	private JPanel contentPane;
	JPanel panel;
    JLabel label1=new JLabel("ÕËºÅ:");
    JTextField username=new JTextField();
    JLabel label2=new JLabel("ÃÜÂë:");
    JPasswordField password=new JPasswordField();
    JButton enter=new JButton("µÇÂ¼");
    JButton register=new JButton("×¢²á");
    JButton exit=new JButton("ÍË³ö");
    ImageIcon background;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
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
	public Login2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLabel back=new JLabel(background);
        this.setResizable(false);
        this.setSize(566,347);
        //////////////////////////////////////////////////////////
        enter.setBounds(180,180,70,20);
        exit.setBounds(260,180,70,20);
        register.setBounds(100,180,70,20);
        /////////////////////////////////////////////////
        this.getLayeredPane().add(back,new Integer(Integer.MIN_VALUE));
        back.setBounds(0,0,background.getIconWidth(),background.getIconHeight());
        ///////////////////////////////////////////////////////////////////
        Font font=new Font("Î¢ÈíÑÅºÚ",Font.BOLD,15);
        label1.setBounds(115,90,50,25);
        label1.setFont(font);
        username.setBounds(150,90,150,25);
        label2.setBounds(115,125,50,25);
        label2.setFont(font);
        password.setBounds(150,125,150,25);
        //////////////////////////////////////////////////////
        //this.setBounds(110,60,540,320);
        //this.add(panel);
        panel=(JPanel)this.getContentPane();
        panel.setLayout(null);
        panel.setOpaque(false);
        panel.add(enter);
        panel.add(exit);
        panel.add(register);
        panel.add(label1);
        panel.add(username);
        panel.add(label2);
        panel.add(password);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
