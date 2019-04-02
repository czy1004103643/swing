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

    private JLabel id = new JLabel("�û��˺�");
    private JTextField textId = new JTextField();
    private JButton btnSchU = new JButton("�� ��");
    private JLabel delU = new JLabel("�����������²�����");
    private JButton btnDelU = new JButton("ɾ�����û�");
    private JPasswordField textNewPswd = new JPasswordField();
    private JButton newPswd = new JButton("�޸�������");

    private JLabel newUid = new JLabel("��  ��");
    private JLabel newUname = new JLabel("�û���");
    private JLabel newUpswd = new JLabel("��  ��");
    private JTextField textUid = new JTextField();
    private JTextField textUname = new JTextField();
    private JPasswordField textUpswd = new JPasswordField();
    private JButton btnNewUser = new JButton("ȷ��");

    private JLabel bookname = new JLabel("�� ��");
    private JButton btnSchB = new JButton("�� ��");
    private JTextField textName = new JTextField();
    private JButton btnDelB = new JButton("ɾ ��");

    private JLabel count5 = new JLabel("�� ��");
    private JLabel type5 = new JLabel("�� ��");
    private JLabel author5 = new JLabel("�� ��");
    private JLabel address5 = new JLabel("����λ��");
    private JTextField count_5 = new JTextField();
    private JTextField type_5 = new JTextField();
    private JTextField author_5 = new JTextField();
    private JTextField address_5 = new JTextField();
    private JButton button5 = new JButton("�� ��");
    private JButton btnUpdate5 = new JButton("�� ��");
    
    private JButton lendBtn = new JButton("���");
    private JButton returnBtn = new JButton("����");
    
    private String[] userTableHead = {"�˺�", "�û���", "����", "����"};
    private String tableUser = new String("<html><style>"
            + "table{margin-top:0px;padding-left:80px;}"
            + "td{width:150px;}</style>"
            + "<table><tr><td>�˺�</td><td>�û���</td><td>����</td><td>����</td></tr>");

    String[] bookTableHead = {"���", "�� ��","ʣ����","����","����","�����ܴ�","����λ��"};

    private Font font = new Font("����", 0, 20);
    private Font font1 = new Font("����", 0, 16);

    private JTabbedPane tabbedPane;
    private JButton reFresh = new JButton("ˢ��");
    private JButton btnexit = new JButton("�˳�");//
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
		
		  setTitle("ϵͳ");
	        setResizable(false);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        tabbedPane = new JTabbedPane(JTabbedPane.LEFT);// �����λ��
	        tabbedPane.setFont(font);// �������壬�ֺ�
	        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	        this.setJMenuBar(menuBar);
	        menuBar.add(reFresh);
	        menuBar.add(btnexit);

	        getContentPane().add(tabbedPane);
	        tabbedPane.addTab("��ӭ����Ա", card0);// ���潫card0��Ϊ������
	        tabbedPane.addTab("1.�����û���Ϣ", card1);
	        tabbedPane.addTab("2.�û�����", card2);
	        tabbedPane.addTab("3.����û�", card3);
	        tabbedPane.addTab("4.�鿴�����鼮", card4);
	        tabbedPane.addTab("5.�鼮����", card5);
	        tabbedPane.setSelectedIndex(1);
	        tabbedPane.setEnabledAt(0, false);
	}

}
