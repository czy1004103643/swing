package swing.login;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login5 extends JFrame {

	private JPanel contentPane;
	 private JFrame register;
	    private JPanel panel12;
	    private JLabel label6;
	    private JTextField textField2;
	    private JLabel label7;
	    private JPasswordField passwordField2;
	    private JLabel label8;
	    private JPasswordField passwordField3;
	    private JButton button4;
	    private JFrame login;
	    private JPanel panel11;
	    private JLabel label4;
	    private JTextField textField1;
	    private JLabel label5;
	    private JPasswordField passwordField1;
	    private JButton button2;
	    private JButton button3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login5 frame = new Login5();
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
	public Login5() {
		register = new JFrame();
        panel12 = new JPanel();
        label6 = new JLabel();
        textField2 = new JTextField();
        label7 = new JLabel();
        passwordField2 = new JPasswordField();
        label8 = new JLabel();
        passwordField3 = new JPasswordField();
        button4 = new JButton();
        login = new JFrame();
        panel11 = new JPanel();
        label4 = new JLabel();
        textField1 = new JTextField();
        label5 = new JLabel();
        passwordField1 = new JPasswordField();
        button2 = new JButton();
        button3 = new JButton();
        
        //======== register ========
        {
            register.setTitle("register");
            register.setAlwaysOnTop(true);
            Container registerContentPane = register.getContentPane();
            registerContentPane.setLayout(new BorderLayout());

            //======== panel12 ========
            {
                panel12.setLayout(null);

                //---- label6 ----
                label6.setText("\u8d26\u53f7");
                panel12.add(label6);
                label6.setBounds(60, 55, 45, 30);
                panel12.add(textField2);
                textField2.setBounds(60, 90, 200, textField2.getPreferredSize().height);

                //---- label7 ----
                label7.setText("\u5bc6\u7801");
                panel12.add(label7);
                label7.setBounds(60, 125, 35, 25);
                panel12.add(passwordField2);
                passwordField2.setBounds(60, 155, 200, passwordField2.getPreferredSize().height);

                //---- label8 ----
                label8.setText("\u786e\u8ba4\u5bc6\u7801");
                panel12.add(label8);
                label8.setBounds(60, 190, 65, 20);
                panel12.add(passwordField3);
                passwordField3.setBounds(60, 215, 200, passwordField3.getPreferredSize().height);

                //---- button4 ----
                button4.setText("register");
                panel12.add(button4);
                button4.setBounds(90, 290, 120, 45);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel12.getComponentCount(); i++) {
                        Rectangle bounds = panel12.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel12.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel12.setMinimumSize(preferredSize);
                    panel12.setPreferredSize(preferredSize);
                }
            }
            registerContentPane.add(panel12, BorderLayout.CENTER);
            register.setSize(315, 485);
            register.setLocationRelativeTo(null);
        }

        //======== login ========
        {
            login.setTitle("login");
            login.setAlwaysOnTop(true);
            Container loginContentPane = login.getContentPane();
            loginContentPane.setLayout(new BorderLayout());

            //======== panel11 ========
            {
                panel11.setLayout(null);

                //---- label4 ----
                label4.setText("\u7528\u6237\u540d\uff1a");
                panel11.add(label4);
                label4.setBounds(140, 80, 80, 60);
                panel11.add(textField1);
                textField1.setBounds(240, 80, 280, 60);

                //---- label5 ----
                label5.setText("\u5bc6\u7801\uff1a");
                panel11.add(label5);
                label5.setBounds(140, 180, 80, 60);
                panel11.add(passwordField1);
                passwordField1.setBounds(240, 180, 280, 60);

                //---- button2 ----
                button2.setText("\u767b\u5f55");
                panel11.add(button2);
                button2.setBounds(140, 295, 100, 60);

                //---- button3 ----
                button3.setText("\u6ce8\u518c");
                panel11.add(button3);
                button3.setBounds(420, 295, 100, 60);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel11.getComponentCount(); i++) {
                        Rectangle bounds = panel11.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel11.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel11.setMinimumSize(preferredSize);
                    panel11.setPreferredSize(preferredSize);
                }
            }
            loginContentPane.add(panel11, BorderLayout.CENTER);
            login.setSize(635, 485);
            login.setLocationRelativeTo(null);
        }
        
        
	}

}
