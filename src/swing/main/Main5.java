package swing.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main5 extends JFrame {

	private JPanel contentPane;
	 private int uId;
	    private Integer bid = null;

	    private Toolkit toolkit = Toolkit.getDefaultToolkit();
	    private Dimension sc = toolkit.getScreenSize();
	    private JLabel card0 = new JLabel();
	    private JPanel card1 = new JPanel();
	    private JLabel card2 = new JLabel();
	    private JPanel card3 = new JPanel();
	    private JLabel card4 = new JLabel();
	    private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);// 点击栏位置

	    private JLabel bookname = new JLabel("书  名");
	    private JButton btnSchB = new JButton("查 找");
	    private JButton btnBook = new JButton("设置提醒");
	    private JTextField textName = new JTextField();

	    String[] recordTableHead = {"序 号", "书 名","借书时间","还书时间"};
	    String[] bookTableHead = {"状态", "书 名","剩余库存","类型","作者","借阅总次","所在位置"};
	    
	    private JLabel uName = new JLabel("用户名");
	    private JTextField textUname = new JTextField();
	    private JLabel oldPswd = new JLabel("旧密码");
	    private JPasswordField textOldPswd = new JPasswordField();
	    private JLabel newPswd = new JLabel("新密码");
	    private JPasswordField textNewPswd = new JPasswordField();
	    private JButton btnYes = new JButton("确 定");
	    private JLabel myinfo = new JLabel("");

	    private Font font = new Font("楷体", 0, 20);
	    private Font font1 = new Font("楷体", 0, 16);

	    private JButton reFresh = new JButton("刷新");
	    private JButton btnexit = new JButton("退出");//
	    private JMenuBar menuBar = new JMenuBar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main5 frame = new Main5();
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
	public Main5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		 setTitle("图书馆系统");
	        setResizable(false);
	        setBounds((sc.width - 900) / 2, (sc.height - 500) / 2, 900, 500);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        tabbedPane.setFont(font);// 左栏字体，字号
	        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT); // WRAP_TAB_LAYOUT
	        this.setJMenuBar(menuBar);
	        menuBar.add(reFresh);
	        menuBar.add(btnexit);
	        getContentPane().add(tabbedPane);
	        
	        tabbedPane.addTab("欢迎用户使用", card0);
	        tabbedPane.addTab("1.所有书籍", card1);
	        tabbedPane.addTab("2.可借提醒", card2);
	        tabbedPane.addTab("3.借还记录", card3);
	        tabbedPane.addTab("4.个人信息", card4);
	        
	        tabbedPane.setSelectedIndex(1); // 设置默认选中的
	        tabbedPane.setEnabledAt(1, false);// 设置索引0的面板不可用
		
	}

}
