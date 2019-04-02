package swing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main4 extends JFrame {

	private JPanel contentPane;
	private JLabel card0 = new JLabel();
    private JPanel card1 = new JPanel();
    private JLabel card2 = new JLabel();
    private JLabel card3 = new JLabel();
    private JPanel card4 = new JPanel();
    private JLabel card5 = new JLabel();

    private JLabel id = new JLabel("用户账号");
    private JTextField textId = new JTextField();
    private JButton btnSchU = new JButton("查 找");
    private JLabel delU = new JLabel("您可以做如下操作：");
    private JButton btnDelU = new JButton("删除该用户");
    private JPasswordField textNewPswd = new JPasswordField();
    private JButton newPswd = new JButton("修改其密码");

    private JLabel newUid = new JLabel("账  号");
    private JLabel newUname = new JLabel("用户名");
    private JLabel newUpswd = new JLabel("密  码");
    private JTextField textUid = new JTextField();
    private JTextField textUname = new JTextField();
    private JPasswordField textUpswd = new JPasswordField();
    private JButton btnNewUser = new JButton("确定");

    private JLabel bookname = new JLabel("书 名");
    private JButton btnSchB = new JButton("查 找");
    private JTextField textName = new JTextField();
    private JButton btnDelB = new JButton("删 除");

    private JLabel count5 = new JLabel("数 量");
    private JLabel type5 = new JLabel("类 型");
    private JLabel author5 = new JLabel("作 者");
    private JLabel address5 = new JLabel("藏书位置");
    private JTextField count_5 = new JTextField();
    private JTextField type_5 = new JTextField();
    private JTextField author_5 = new JTextField();
    private JTextField address_5 = new JTextField();
    private JButton button5 = new JButton("添 加");
    private JButton btnUpdate5 = new JButton("修 改");
    
    private JButton lendBtn = new JButton("借出");
    private JButton returnBtn = new JButton("还回");
    
    private String[] userTableHead = {"账号", "用户名", "密码", "积分"};
    private String tableUser = new String("<html><style>"
            + "table{margin-top:0px;padding-left:80px;}"
            + "td{width:150px;}</style>"
            + "<table><tr><td>账号</td><td>用户名</td><td>密码</td><td>积分</td></tr>");

    String[] bookTableHead = {"编号", "书 名","剩余库存","类型","作者","借阅总次","所在位置"};

    private Font font = new Font("楷体", 0, 20);
    private Font font1 = new Font("楷体", 0, 16);

    private JTabbedPane tabbedPane;
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
					Main4 frame = new Main4();
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
	public Main4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		  setTitle("系统");
	        setResizable(false);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        tabbedPane = new JTabbedPane(JTabbedPane.LEFT);// 点击栏位置
	        tabbedPane.setFont(font);// 左栏字体，字号
	        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	        this.setJMenuBar(menuBar);
	        menuBar.add(reFresh);
	        menuBar.add(btnexit);

	        getContentPane().add(tabbedPane);
	        tabbedPane.addTab("欢迎管理员", card0);// 后面将card0设为不可用
	        tabbedPane.addTab("1.所有用户信息", card1);
	        tabbedPane.addTab("2.用户管理", card2);
	        tabbedPane.addTab("3.添加用户", card3);
	        tabbedPane.addTab("4.查看所有书籍", card4);
	        tabbedPane.addTab("5.书籍管理", card5);
	        tabbedPane.setSelectedIndex(1);
	        tabbedPane.setEnabledAt(0, false);
	}

}
