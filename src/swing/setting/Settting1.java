package swing.setting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Settting1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settting1 frame = new Settting1();
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
	public Settting1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("11");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7CFB\u7EDF\u8BBE\u7F6E");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(162, 10, 96, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7CFB\u7EDF\u80CC\u666F\u56FE");
		label_1.setBounds(44, 55, 87, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5173\u95ED\u6309\u94AE\u529F\u80FD");
		label_2.setBounds(44, 102, 87, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u7CFB\u7EDF\u80CC\u666F\u4EAE\u5EA6");
		label_3.setBounds(44, 155, 87, 15);
		contentPane.add(label_3);
		
		JButton button = new JButton("\u67E5\u770B\u5E2E\u52A9\u4FE1\u606F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(44, 197, 105, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u4E0A\u4F20");
		btnNewButton.setBounds(141, 51, 93, 23);
		contentPane.add(btnNewButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(141, 155, 146, 14);
		contentPane.add(progressBar);
		
		JRadioButton radioButton = new JRadioButton("\u9000\u51FA\u7CFB\u7EDF");
		radioButton.setSelected(true);
		radioButton.setBounds(137, 98, 87, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u540E\u53F0\u9690\u85CF");
		radioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton_1.setBounds(199, 98, 146, 23);
		contentPane.add(radioButton_1);
	}
}
