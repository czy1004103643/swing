package swing.main;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class Main11 extends JFrame {

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
					Main11 frame = new Main11();
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
	public Main11() {
		super("用户登录日志");
		setTitle("\u8BA2\u5355\u7BA1\u7406");
		this.setIconImage(new ImageIcon("image/2.jpg").getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
        			"订单编号","订购用户","订单时间","订单状态"
        	}
        ));
  
        
        getContentPane().setLayout(null);
        
        //getContentPane().add(upBtn);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 34, 392, 158);
        getContentPane().add(scrollPane);
        
      

        setSize(408, 303);
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
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 192, 392, 72);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JButton button_1 = new JButton("\u8BA2\u5355\u786E\u8BA4");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button_1.setBounds(10, 27, 93, 23);
			panel.add(button_1);
			
			JButton button_2 = new JButton("\u8BA2\u5355\u9000\u8BA2");
			button_2.setBounds(134, 27, 93, 23);
			panel.add(button_2);
			
			JButton button_3 = new JButton("\u8BA2\u5355\u5B8C\u6210");
			button_3.setBounds(263, 27, 93, 23);
			panel.add(button_3);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(0, 0, 392, 35);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(85, 5, 82, 24);
			panel_1.add(textArea);
			textArea.setText("\u8F93\u5165\u8BA2\u5355\u7F16\u53F7");
			
			JButton button = new JButton("\u67E5\u8BE2");
			button.setBounds(195, 5, 93, 23);
			panel_1.add(button);
			imagePanel.setOpaque(false);
			// 把背景图片添加到分层窗格的最底层作为背景
			this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
			//设置可见
			setVisible(true);
	}
}
