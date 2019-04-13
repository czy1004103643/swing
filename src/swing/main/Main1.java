package swing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Main1 extends JFrame {

	private JPanel contentPane;
	JMenuBar menuManagerBar; // 菜单条
	JMenu menuFile, menuEdit, menuHelp, Show_Family, Select_Member; // 主菜单
	JMenuItem File_Open, File_Save, Exit; // 文件菜单中的子菜单
	JMenuItem Add_Member, Delete_Member, Modify_Member;// 编辑菜单的子菜单
	JMenuItem Show_Law;// 帮助菜单下的子菜单
	JMenuItem Show_NTable, Show_Tree;// 显示信息的子菜单
	JMenuItem Show_All, Select_Brithday, Select_Relationship;// 查询下的子菜单
	private JMenu mnMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnMenu_1;
	private JMenu mnMenu_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
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
	public Main1() {
		
		menuManagerBar = new JMenuBar();
		menuFile = new JMenu("文件");
		menuEdit = new JMenu("编辑");
		menuHelp = new JMenu("帮助");
		File_Open = new JMenuItem("连接数据库");
		File_Save = new JMenuItem("保存");
		Exit = new JMenuItem("退出");
		Show_Family = new JMenu("显示家谱");
		Add_Member = new JMenuItem("添加成员");
		Select_Member = new JMenu("查询");
		Delete_Member = new JMenuItem("删除");
		Modify_Member = new JMenuItem("修改");
		Show_Law = new JMenuItem("使用规则");
		Show_Tree = new JMenuItem("图谱显示");
		Show_NTable = new JMenuItem("显示第n代的信息");
		Show_All = new JMenuItem("表格显示所有信息");
		Select_Brithday = new JMenuItem("生日相同成员");
		Select_Relationship = new JMenuItem("关系查询");

		/*********** 开始构建文件菜单 *******************/
		menuFile.add(File_Open);
		menuFile.add(File_Save);
		menuFile.addSeparator();// 加一条横向线
		menuFile.add(Exit);

		/************ 开始构建编辑菜单 ******************/
		Show_Family.add(Show_Tree);
		Show_Family.addSeparator();
		Show_Family.add(Show_NTable);
		Select_Member.add(Show_All);
		Select_Member.addSeparator();
		Select_Member.add(Select_Brithday);
		Select_Member.addSeparator();
		Select_Member.add(Select_Relationship);
		menuEdit.add(Show_Family);
		menuEdit.addSeparator();
		menuEdit.add(Add_Member);
		menuEdit.addSeparator();
		menuEdit.add(Select_Member);
		menuEdit.addSeparator();
		menuEdit.add(Delete_Member);
		menuEdit.add(Modify_Member);

		/**************** 帮助菜单构建 ******************/
		menuHelp.add(Show_Law);

		/****************** 主菜单的构建 ******************/
		menuManagerBar.add(menuFile);
		menuManagerBar.add(menuEdit);
		menuManagerBar.add(menuHelp);
		setJMenuBar(menuManagerBar);
		
		mnMenu = new JMenu("menu4");
		menuManagerBar.add(mnMenu);
		
		mntmNewMenuItem = new JMenuItem("menu4item");
		mnMenu.add(mntmNewMenuItem);
		
		mnMenu_1 = new JMenu("menu5");
		menuManagerBar.add(mnMenu_1);
		
		mnMenu_2 = new JMenu("menu6");
		menuManagerBar.add(mnMenu_2);
		
		setTitle("家谱管理系统");
		getContentPane().setLayout(new BorderLayout());
		setLocation(200, 200);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
