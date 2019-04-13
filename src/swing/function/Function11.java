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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;

public class Function11 extends JFrame {

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
	public Function11() {
		setTitle("\u4EA7\u54C1\u7BA1\u7406");
		this.setIconImage(new ImageIcon("image/2.jpg").getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);
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
        			"产品编号","产品名称","产品类型","产品价格"
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
			panel_1.setBounds(10, 55, 599, 35);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(10, 5, 123, 24);
			panel_1.add(textArea);
			textArea.setText("\u8F93\u5165\u4EA7\u54C1\u4FE1\u606F");
			
			JButton button = new JButton("\u67E5\u8BE2");
			button.setBounds(272, 5, 93, 23);
			panel_1.add(button);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u4EA7\u54C1\u7C7B\u578B"}));
			comboBox.setBounds(164, 6, 74, 21);
			panel_1.add(comboBox);
			
			JButton button_1 = new JButton("\u6DFB\u52A0\u9500\u552E\u4EA7\u54C1");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button_1.setBounds(10, 22, 105, 23);
			getContentPane().add(button_1);
			
			JTextArea textArea_1 = new JTextArea();
			textArea_1.setBounds(84, 276, 76, 24);
			getContentPane().add(textArea_1);
			
			JLabel label = new JLabel("\u4EA7\u54C1\u7F16\u53F7");
			label.setBounds(20, 280, 54, 15);
			getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u4EA7\u54C1\u540D\u79F0");
			label_1.setBounds(191, 280, 54, 15);
			getContentPane().add(label_1);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(469, 276, 74, 21);
			getContentPane().add(comboBox_1);
			
			JLabel label_2 = new JLabel("\u4EA7\u54C1\u7C7B\u578B");
			label_2.setBounds(376, 280, 86, 15);
			getContentPane().add(label_2);
			
			JTextArea textArea_2 = new JTextArea();
			textArea_2.setBounds(255, 276, 76, 24);
			getContentPane().add(textArea_2);
			
			JLabel label_3 = new JLabel("\u4EA7\u54C1\u4EF7\u683C");
			label_3.setBounds(20, 326, 54, 15);
			getContentPane().add(label_3);
			
			JTextArea textArea_3 = new JTextArea();
			textArea_3.setBounds(84, 322, 76, 24);
			getContentPane().add(textArea_3);
			
			JLabel label_4 = new JLabel("\u5907\u6CE8\u4FE1\u606F");
			label_4.setBounds(191, 330, 54, 15);
			getContentPane().add(label_4);
			
			JTextArea textArea_4 = new JTextArea();
			textArea_4.setBounds(255, 307, 154, 43);
			getContentPane().add(textArea_4);
			
			JButton button_2 = new JButton("\u4FEE\u6539");
			button_2.setBounds(41, 372, 93, 23);
			getContentPane().add(button_2);
			
			JButton button_3 = new JButton("\u5220\u9664");
			button_3.setBounds(198, 372, 93, 23);
			getContentPane().add(button_3);
			
			JLabel label_5 = new JLabel("\u4EA7\u54C1\u7BA1\u7406");
			label_5.setForeground(Color.BLUE);
			label_5.setFont(new Font("宋体", Font.PLAIN, 20));
			label_5.setBounds(527, 10, 105, 35);
			getContentPane().add(label_5);
			imagePanel.setOpaque(false);
			// 把背景图片添加到分层窗格的最底层作为背景
			this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
			//设置可见
			setVisible(true);
	}
}
