package swing.register;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register1 extends JFrame {
	public Register1() {
		init();
	}

	private static final long serialVersionUID = -1984182788841566838L;

	private JPanel jPanelCenter;
	private JTextField name, sno, department, hometown, mark, email, tel, sex;
	private JPanel panel;
	private JButton btnNewButton;


	private void init() {
		setTitle("зЂВс");
		// center panel
		jPanelCenter = new JPanel();
		jPanelCenter.setLayout(new GridLayout(9, 2));
		JLabel label_5 = new JLabel("\u7528\u6237\u540D");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		jPanelCenter.add(label_5);
		name = new JTextField();
		jPanelCenter.add(name);
		JLabel label_6 = new JLabel("\u5BC6\u7801");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		jPanelCenter.add(label_6);
		sno = new JTextField();
		jPanelCenter.add(sno);
		JLabel label_7 = new JLabel("\u90AE\u7BB1");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		jPanelCenter.add(label_7);
		sex = new JTextField();
		jPanelCenter.add(sex);
		JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText("\u7535\u8BDD\u53F7\u7801");
		jPanelCenter.add(label);
		department = new JTextField();
		jPanelCenter.add(department);
		JLabel label_1 = new JLabel();
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setText("\u5730\u5740");
		jPanelCenter.add(label_1);
		hometown = new JTextField();
		jPanelCenter.add(hometown);
		JLabel label_2 = new JLabel();
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setText("\u6027\u522B");
		jPanelCenter.add(label_2);
		mark = new JTextField();
		jPanelCenter.add(mark);
		JLabel label_3 = new JLabel();
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setText("\u5E74\u9F84");
		jPanelCenter.add(label_3);
		email = new JTextField();
		jPanelCenter.add(email);
		JLabel label_4 = new JLabel();
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setText("\u5907\u6CE8");
		jPanelCenter.add(label_4);
		tel = new JTextField();
		jPanelCenter.add(tel);

		getContentPane().add(jPanelCenter, BorderLayout.CENTER);
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnNewButton);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(470, 200, 400, 270);
		setResizable(true);
		setVisible(true);
	}
}
