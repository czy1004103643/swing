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
	JMenuBar menuManagerBar; // �˵���
	JMenu menuFile, menuEdit, menuHelp, Show_Family, Select_Member; // ���˵�
	JMenuItem File_Open, File_Save, Exit; // �ļ��˵��е��Ӳ˵�
	JMenuItem Add_Member, Delete_Member, Modify_Member;// �༭�˵����Ӳ˵�
	JMenuItem Show_Law;// �����˵��µ��Ӳ˵�
	JMenuItem Show_NTable, Show_Tree;// ��ʾ��Ϣ���Ӳ˵�
	JMenuItem Show_All, Select_Brithday, Select_Relationship;// ��ѯ�µ��Ӳ˵�
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
		menuFile = new JMenu("�ļ�");
		menuEdit = new JMenu("�༭");
		menuHelp = new JMenu("����");
		File_Open = new JMenuItem("�������ݿ�");
		File_Save = new JMenuItem("����");
		Exit = new JMenuItem("�˳�");
		Show_Family = new JMenu("��ʾ����");
		Add_Member = new JMenuItem("��ӳ�Ա");
		Select_Member = new JMenu("��ѯ");
		Delete_Member = new JMenuItem("ɾ��");
		Modify_Member = new JMenuItem("�޸�");
		Show_Law = new JMenuItem("ʹ�ù���");
		Show_Tree = new JMenuItem("ͼ����ʾ");
		Show_NTable = new JMenuItem("��ʾ��n������Ϣ");
		Show_All = new JMenuItem("�����ʾ������Ϣ");
		Select_Brithday = new JMenuItem("������ͬ��Ա");
		Select_Relationship = new JMenuItem("��ϵ��ѯ");

		/*********** ��ʼ�����ļ��˵� *******************/
		menuFile.add(File_Open);
		menuFile.add(File_Save);
		menuFile.addSeparator();// ��һ��������
		menuFile.add(Exit);

		/************ ��ʼ�����༭�˵� ******************/
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

		/**************** �����˵����� ******************/
		menuHelp.add(Show_Law);

		/****************** ���˵��Ĺ��� ******************/
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
		
		setTitle("���׹���ϵͳ");
		getContentPane().setLayout(new BorderLayout());
		setLocation(200, 200);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
