package swing.function;

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
import javax.swing.SwingConstants;

public class Function9 extends JFrame {

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
					Function9 frame = new Function9();
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
	public Function9() {
		setTitle("�����ƹ�");
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
        			"�ƹ���","�ƹ㿪ʼʱ��","�ƹ����ʱ��","�ƹ�״̬"
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
	//����ͼƬ��·���������·�����߾���·��������ͼƬ����"java��Ŀ��"���ļ��£�
			String path = "image/2.jpg";
			// ����ͼƬ
			ImageIcon background = new ImageIcon(path);
			// �ѱ���ͼƬ��ʾ��һ����ǩ����
			JLabel label2 = new JLabel(background);
			// �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
			label2.setBounds(0, 0, this.getWidth(), this.getHeight());
			// �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��
			JPanel imagePanel = (JPanel) this.getContentPane();
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 192, 392, 72);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel label = new JLabel("1  2  3  4  ....  10");
			label.setBounds(105, 24, 127, 15);
			panel.add(label);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(0, 0, 392, 35);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(67, 5, 100, 24);
			panel_1.add(textArea);
			textArea.setText("\u8F93\u5165\u63A8\u5E7F\u4FE1\u606F");
			
			JButton button = new JButton("\u67E5\u8BE2");
			button.setBounds(195, 5, 93, 23);
			panel_1.add(button);
			imagePanel.setOpaque(false);
			// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
			this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
			//���ÿɼ�
			setVisible(true);
	}
}
