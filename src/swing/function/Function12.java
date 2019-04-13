package swing.function;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import swing.util.CalendarPanel;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Function12 extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel model = null;
	private JTable table = null;
	private JTable table_2;
	private JButton upBtn = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function11 frame = new Function11();
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
	public Function12() {
		setTitle("\u4EA7\u54C1\u7BA1\u7406");
		this.setIconImage(new ImageIcon("image/2.jpg").getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);
        CalendarPanel p = new CalendarPanel("txt1", "yyyy/MM/dd");
        p.setBounds(255, 75, 170, 143);
        getContentPane().add(p);
        
        
         p.initCalendarPanel();
		//WordService wordService = new WordServiceImpl();
		//List<Words> list = wordService.achieve(user.getId(),1);
		
       
       
       
        table = new JTable(new DefaultTableModel(
        	new Object[][] {
        		{"", "", "", ""},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        	},
        	new String[] {
        			"订单编号","订购产品","订单时间","订单价格"
        	}
        ));
        
        //getContentPane().add(upBtn);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 110, 599, 156);
        getContentPane().add(scrollPane);
        
      

        setSize(648, 467);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
	
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//背景图片的路径。（相对路径或者绝对路径。本例图片放于"java项目名"的文件下）
			String path = "image/2.jpg";
			// 背景图片
			ImageIcon background = new ImageIcon(path);
			// 把背景图片显示在一个标签里面
			JLabel label2 = new JLabel(background);
			// 把标签的大小位置设置为图片刚好填充整个面板
			label2.setBounds(0, 0, this.getWidth(), this.getHeight());
			// 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明
			JPanel imagePanel = (JPanel) this.getContentPane();
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setBounds(10, 44, 599, 35);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(23, 5, 93, 24);
			panel_1.add(textArea);
			textArea.setText("\u8F93\u5165\u8BA2\u5355\u7F16\u53F7");
			
			JButton button = new JButton("\u67E5\u8BE2");
			button.setBounds(434, 5, 93, 23);
			panel_1.add(button);
			
			JTextArea textArea_5 = new JTextArea();
			textArea_5.setText("\u8F93\u5165\u4EA7\u54C1\u540D\u79F0");
			textArea_5.setBounds(145, 5, 93, 24);
			panel_1.add(textArea_5);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u65E5\u671F"}));
			comboBox.setBounds(268, 6, 74, 21);
			panel_1.add(comboBox);
			
			JLabel label = new JLabel("\u8BA2\u5355\u7F16\u53F7");
			label.setBounds(20, 280, 54, 15);
			getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u8BA2\u8D2D\u4EA7\u54C1");
			label_1.setBounds(191, 280, 54, 15);
			getContentPane().add(label_1);
			
			JLabel label_2 = new JLabel("\u8BA2\u5355\u65F6\u95F4");
			label_2.setBounds(376, 280, 86, 15);
			getContentPane().add(label_2);
			
			JLabel label_3 = new JLabel("\u8BA2\u5355\u4EF7\u683C");
			label_3.setBounds(20, 326, 54, 15);
			getContentPane().add(label_3);
			
			JLabel label_4 = new JLabel("\u4EA7\u54C1\u8BC4\u4EF7");
			label_4.setBounds(376, 326, 54, 15);
			getContentPane().add(label_4);
			
			JButton button_2 = new JButton("\u4FEE\u6539");
			button_2.setBounds(315, 372, 93, 23);
			getContentPane().add(button_2);
			
			JButton button_3 = new JButton("\u5220\u9664");
			button_3.setBounds(172, 372, 93, 23);
			getContentPane().add(button_3);
			
			JLabel label_5 = new JLabel("\u8BA2\u5355\u7BA1\u7406");
			label_5.setForeground(Color.BLUE);
			label_5.setFont(new Font("宋体", Font.PLAIN, 23));
			label_5.setBounds(237, 10, 249, 35);
			getContentPane().add(label_5);
			
			JLabel lblNewLabel = new JLabel("2018-05-05");
			lblNewLabel.setBounds(459, 280, 86, 15);
			getContentPane().add(lblNewLabel);
			
			JLabel label_6 = new JLabel("00001");
			label_6.setBounds(84, 280, 86, 15);
			getContentPane().add(label_6);
			
			JLabel lblXxxx = new JLabel("XXXX");
			lblXxxx.setBounds(255, 280, 86, 15);
			getContentPane().add(lblXxxx);
			
			JLabel label_7 = new JLabel("100\u5143");
			label_7.setBounds(84, 326, 86, 15);
			getContentPane().add(label_7);
			
			JLabel label_8 = new JLabel("\u8BA2\u5355\u72B6\u6001");
			label_8.setBounds(191, 326, 54, 15);
			getContentPane().add(label_8);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u5F85\u786E\u8BA4", "\u5904\u7406\u4E2D", "\u5B8C\u6210"}));
			comboBox_1.setBounds(265, 323, 62, 21);
			getContentPane().add(comboBox_1);
			
			JLabel lblxxxxxxxxxx = new JLabel("\u8BE5\u4EA7\u54C1\u975E\u5E38\u597D");
			lblxxxxxxxxxx.setBounds(459, 316, 154, 35);
			getContentPane().add(lblxxxxxxxxxx);
			imagePanel.setOpaque(false);
			// 把背景图片添加到分层窗格的最底层作为背景
			this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
			//设置可见
			setVisible(true);
	}
}
