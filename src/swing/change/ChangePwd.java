package swing.change;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChangePwd extends JFrame {

	private JPanel contentPane;
	 JPanel panel=new JPanel();
	    JLabel label1=new JLabel("’À  ∫≈",JLabel.LEFT);
	    JLabel label2=new JLabel("æ…√‹¬Î",JLabel.LEFT);
	    JLabel label3=new JLabel("–¬√‹¬Î",JLabel.LEFT);
	    JTextField ID=new JTextField();
	    JTextField oldpassword=new JTextField();
	    JTextField newpassword=new JTextField();
	    JButton change=new JButton("÷ÿ÷√");
	    JButton reset=new JButton("«Âø’");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePwd frame = new ChangePwd();
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
	public ChangePwd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		 this.setSize(500,400);
	        this.setLocationRelativeTo(null);
	        this.setResizable(false);
	        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        this.setVisible(true);
	        this.add(panel);
	        panel.setLayout(null);
	        label1.setBounds(140,120,50,20);
	        label2.setBounds(140,160,50,20);
	        label3.setBounds(140,200,50,20);
	        ID.setBounds(190,120,150,20);
	        oldpassword.setBounds(190,160,150,20);
	        newpassword.setBounds(190,200,150,20);
	        change.setBounds(190,240,70,20);
	        reset.setBounds(270,240,70,20);
	        panel.add(label1);
	        panel.add(label2);
	        panel.add(label3);
	        panel.add(ID);
	        panel.add(oldpassword);
	        panel.add(newpassword);
	        panel.add(change);
	        panel.add(reset);
	}

}
