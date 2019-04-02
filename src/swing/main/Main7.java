package swing.main;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main7 extends JFrame {

	private JPanel contentPane;
	// 默认表格模型
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
					Main7 frame = new Main7();
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
	public Main7() {
		//设置标题
				super("已学会单词");
				this.setIconImage(new ImageIcon("image/2.jpg").getImage());
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setBounds(100, 100, 450, 300);

		        
		        String[][] datas = {};
		        String[] titles = { "id","单词", "词性","中文" };
		        model = new DefaultTableModel(datas, titles);
		        table = new JTable(new DefaultTableModel(
		        	new Object[][] {
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        	},
		        	new String[] {
		        		"id", "\u5355\u8BCD", "\u8BCD\u6027", "\u4E2D\u6587"
		        	}
		        ));
		        upBtn = new JButton("修改数据");
		      
		        upBtn.setBounds(0, 0, 146, 23);
		        
		        for (int i= 0;i<3;i++) {

		        	model.addRow(new String[] { "id","mame","Quality","Chinese"  });
				}
		        getContentPane().setLayout(null);
		        
		        getContentPane().add(upBtn);
		        JScrollPane scrollPane = new JScrollPane(table);
		        scrollPane.setBounds(0, 24, 384, 237);
		        getContentPane().add(scrollPane);
		        
		        JButton button = new JButton("删除数据");
		        button.setBounds(238, 0, 146, 23);
		        getContentPane().add(button);

		        setSize(400, 300);
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
					imagePanel.setOpaque(false);
					// 把背景图片添加到分层窗格的最底层作为背景
					this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
					//设置可见
					setVisible(true);
	}
	
	

}
