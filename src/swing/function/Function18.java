package swing.function;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;

public class Function18 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function18 frame = new Function18();
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
	public Function18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 438);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("帮助和反馈");
		label.setBounds(205, 10, 200, 52);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("����", Font.PLAIN, 33));
		contentPane.add(label);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(22, 72, 583, 317);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		splitPane.setLeftComponent(panel);
		
		JButton button_1 = new JButton("反馈");
		panel.add(button_1);
		
		JButton button = new JButton("帮助");
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("用户编号");
		lblNewLabel.setBounds(10, 23, 54, 15);
		panel_1.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00001"}));
		comboBox.setBounds(74, 20, 68, 21);
		panel_1.add(comboBox);
		
		JLabel label_1 = new JLabel("用户名称：");
		label_1.setBounds(10, 66, 68, 15);
		panel_1.add(label_1);
		
		JLabel lblXxx = new JLabel("XXX");
		lblXxx.setBounds(77, 66, 54, 15);
		panel_1.add(lblXxx);
		
		JLabel label_2 = new JLabel("搜索关键字：");
		label_2.setBounds(161, 23, 80, 15);
		panel_1.add(label_2);
		
		JLabel label_4 = new JLabel("申请时间：");
		label_4.setBounds(161, 66, 68, 15);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("2018-05-05");
		label_5.setBounds(228, 66, 80, 15);
		panel_1.add(label_5);
		
		JButton button_2 = new JButton("上传");
		button_2.setBounds(92, 127, 80, 23);
		panel_1.add(button_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"完成时间"}));
		comboBox_1.setBounds(92, 165, 74, 23);
		panel_1.add(comboBox_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(90, 198, 169, 67);
		panel_1.add(editorPane);
		
		JLabel label_6 = new JLabel("搜索结论表：");
		label_6.setBounds(10, 131, 80, 15);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("完成时间：");
		label_7.setBounds(10, 169, 80, 15);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("备注信息：");
		label_8.setBounds(10, 211, 80, 15);
		panel_1.add(label_8);
		
		JButton button_3 = new JButton("提交");
		button_3.setBounds(417, 233, 109, 32);
		panel_1.add(button_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"XXX"}));
		comboBox_2.setBounds(240, 20, 68, 21);
		panel_1.add(comboBox_2);
	}
}
