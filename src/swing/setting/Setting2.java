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

public class Setting2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setting2 frame = new Setting2();
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
	public Setting2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("11");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7CFB\u7EDF\u8BBE\u7F6E");
		label.setFont(new Font("����", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(162, 10, 96, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7CFB\u7EDF\u80CC\u666F\u56FE");
		label_1.setBounds(41, 123, 87, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5173\u95ED\u6309\u94AE\u529F\u80FD");
		label_2.setBounds(41, 165, 87, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u7CFB\u7EDF\u80CC\u666F\u4EAE\u5EA6");
		label_3.setBounds(41, 200, 87, 15);
		contentPane.add(label_3);
		
		JButton button = new JButton("\u67E5\u770B\u5E2E\u52A9\u4FE1\u606F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(248, 228, 105, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u4E0A\u4F20");
		btnNewButton.setBounds(138, 119, 93, 23);
		contentPane.add(btnNewButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(138, 200, 146, 14);
		contentPane.add(progressBar);
		
		JRadioButton radioButton = new JRadioButton("\u9000\u51FA\u7CFB\u7EDF");
		radioButton.setSelected(true);
		radioButton.setBounds(134, 161, 87, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u540E\u53F0\u9690\u85CF");
		radioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton_1.setBounds(196, 161, 146, 23);
		contentPane.add(radioButton_1);
		
		JLabel label_4 = new JLabel("按键提示音");
		label_4.setBounds(41, 81, 87, 15);
		contentPane.add(label_4);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(138, 81, 103, 23);
		contentPane.add(checkBox);
		
		JButton button_1 = new JButton("清空缓存");
		button_1.setBounds(71, 228, 105, 23);
		contentPane.add(button_1);
		
		JLabel label_5 = new JLabel("语言");
		label_5.setBounds(41, 44, 87, 15);
		contentPane.add(label_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"中文", "英语"}));
		comboBox.setBounds(144, 41, 77, 21);
		contentPane.add(comboBox);
	}
}
