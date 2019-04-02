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
	    private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);// �����λ��

	    private JLabel bookname = new JLabel("��  ��");
	    private JButton btnSchB = new JButton("�� ��");
	    private JButton btnBook = new JButton("��������");
	    private JTextField textName = new JTextField();

	    String[] recordTableHead = {"�� ��", "�� ��","����ʱ��","����ʱ��"};
	    String[] bookTableHead = {"״̬", "�� ��","ʣ����","����","����","�����ܴ�","����λ��"};
	    
	    private JLabel uName = new JLabel("�û���");
	    private JTextField textUname = new JTextField();
	    private JLabel oldPswd = new JLabel("������");
	    private JPasswordField textOldPswd = new JPasswordField();
	    private JLabel newPswd = new JLabel("������");
	    private JPasswordField textNewPswd = new JPasswordField();
	    private JButton btnYes = new JButton("ȷ ��");
	    private JLabel myinfo = new JLabel("");

	    private Font font = new Font("����", 0, 20);
	    private Font font1 = new Font("����", 0, 16);

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
		
		 setTitle("ͼ���ϵͳ");
	        setResizable(false);
	        setBounds((sc.width - 900) / 2, (sc.height - 500) / 2, 900, 500);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        tabbedPane.setFont(font);// �������壬�ֺ�
	        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT); // WRAP_TAB_LAYOUT
	        this.setJMenuBar(menuBar);
	        menuBar.add(reFresh);
	        menuBar.add(btnexit);
	        getContentPane().add(tabbedPane);
	        
	        tabbedPane.addTab("��ӭ�û�ʹ��", card0);
	        tabbedPane.addTab("1.�����鼮", card1);
	        tabbedPane.addTab("2.�ɽ�����", card2);
	        tabbedPane.addTab("3.�軹��¼", card3);
	        tabbedPane.addTab("4.������Ϣ", card4);
	        
	        tabbedPane.setSelectedIndex(1); // ����Ĭ��ѡ�е�
	        tabbedPane.setEnabledAt(1, false);// ��������0����岻����
		
	}

}
