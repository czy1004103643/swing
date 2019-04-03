package swing.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Main12 extends JFrame {

	private JPanel contentPane;
	 public static String[] FILEPATH = { "文稿", "下载", "桌面","文稿", "下载"};
	    public static String localPath="";
	    public static String RButtonSelect="";
//	    private FileOperate operate = new FileOperate();
	    

	    public JPanel panel = new JPanel();
	    public JPanel panel1 = new JPanel();
	    public JPanel panel_left = new JPanel();
	    public JScrollPane scoll;
	    public JPanel panel_right = new JPanel();
	    public JButton btn_back;
//	    public MouseRightPopup popup;
	    public JButton btn_next;
	    public JButton btn_undo;
	    public JButton btn_new;
	    public JButton btn_newfile;
	    public JButton kong;
	    public JList list;
	    private DefaultListModel<String> item;
	    public JLabel label1 = new JLabel("     ");
	    public JLabel label2 = new JLabel("     ");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main12 frame = new Main12();
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
	public Main12() {
		setTitle("文件资源管理器");
		Toolkit kit=Toolkit.getDefaultToolkit();  
		Dimension screen=kit.getScreenSize();
		this.setSize(screen.width/2,screen.height/2);
		this.setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn_back = new JButton(new ImageIcon("./image/back.png"));
		btn_next = new JButton(new ImageIcon("./image/next.png"));
		btn_undo = new JButton("返回");
		btn_new = new JButton("新建文件夹");
		btn_newfile = new JButton("新建文件");
		kong = new JButton(" ");
		item=new DefaultListModel<>();
		list = new JList<String>(item);
		//list = new JList(Constant.STR);
//		initList();
//	
//		popup = new MouseRightPopup();
		
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		this.add(btn_back);
		this.add(btn_next);
		this.add(label1);
		this.add(label2);
		this.add(kong);
		this.add(btn_undo);
		this.add(btn_new);
		this.add(btn_newfile);
		this.add(panel1);
		this.add(list);

//		panelRightLayout("str");
		panel_right.setPreferredSize(new Dimension(0,1500));
		scoll = new JScrollPane(panel_right);
		this.add(scoll);
		panel_right.setBackground(Color.WHITE);
		kong.setBackground(null);
		list.setSelectionBackground(Color.LIGHT_GRAY);
		list.setBackground(Color.getColor("#fe1"));
		list.setFixedCellHeight(28);
		list.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1));
		panel_right.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1));
		GridBagConstraints constraints = new GridBagConstraints();//定义一个GridBagConstraints，用来控制组建的显示位置
		constraints.fill = GridBagConstraints.BOTH;
		//该方法是为了设置如果组件所在的区域比组件本身要大时的显示情况
        //NONE：不调整组件大小。
        //HORIZONTAL：加宽组件，使它在水平方向上填满其显示区域，但是不改变高度。
        //VERTICAL：加高组件，使它在垂直方向上填满其显示区域，但是不改变宽度。
        //BOTH：使组件完全填满其显示区域。
		
		constraints.gridwidth=1;//该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个
		constraints.weightx = 0;//该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
		constraints.weighty=0;//该方法设置组件垂直的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
        layout.setConstraints(btn_back, constraints);//设置组件
        constraints.gridwidth=1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        layout.setConstraints(btn_next, constraints);
        constraints.gridwidth=1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        layout.setConstraints(label1, constraints);
        constraints.gridwidth=1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        layout.setConstraints(label2, constraints);
        constraints.gridwidth=1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        layout.setConstraints(kong, constraints);
        constraints.gridwidth=1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        layout.setConstraints(btn_undo, constraints);
        constraints.gridwidth=1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        layout.setConstraints(btn_new, constraints);
        constraints.gridwidth=1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        layout.setConstraints(btn_newfile, constraints);
        constraints.gridwidth=0;
        constraints.weightx = 1;
        constraints.weighty = 0;
        layout.setConstraints(panel1, constraints);
        constraints.gridwidth=4;
        constraints.weightx = 0;
        constraints.weighty = 1;
        layout.setConstraints(list, constraints);
        constraints.gridwidth=5;
        constraints.weightx = 1;
        constraints.weighty = 1;
        layout.setConstraints(scoll, constraints);
	}

}
