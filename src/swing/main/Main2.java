package swing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main2 extends JFrame {

	private JPanel contentPane;
	 JPanel panel=new JPanel();
	    ImageIcon background;
	    JButton bt1=null;
	    JButton bt2=null;
	    JButton bt3=null;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel label=new JLabel(background);
        label.setBounds(0,0,background.getIconWidth(),background.getIconHeight());
        ImageIcon pic1=new ImageIcon("admin1.png");
        ImageIcon pic2=new ImageIcon("admin2.png");
        ImageIcon pic3=new ImageIcon("admin3.png");
        bt1=new JButton();
        bt2=new JButton();
        bt3=new JButton();
        //////////修改图片的位置/////////////////////////
        bt1.setBounds(200,200,200,200);
        bt2.setBounds(400,200,200,200);
        bt3.setBounds(600,200,200,200);
        //////////修改图片的位置/////////////////////////
       
        bt1.setContentAreaFilled(false);
        bt2.setContentAreaFilled(false);
        bt3.setContentAreaFilled(false);
        bt1.setBorderPainted(false);
        bt2.setBorderPainted(false);
        bt3.setBorderPainted(false);
        this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
        panel=(JPanel)this.getContentPane();
        panel.setLayout(null);
        panel.setOpaque(false);
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        this.setSize(746,505);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
	}

}
