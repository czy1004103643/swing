package swing.function;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Function5 extends JFrame {

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
					Function5 frame = new Function5();
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
	public Function5() {
		setTitle("\u7BA1\u7406\u7EF4\u62A4");
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
			
			JButton button_1 = new JButton("\u4FEE\u6539");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button_1.setBounds(10, 27, 93, 23);
			panel.add(button_1);
			
			JButton button_2 = new JButton("\u5220\u9664");
			button_2.setBounds(134, 27, 93, 23);
			panel.add(button_2);
			
			JButton button_3 = new JButton("\u63A8\u5E7F\u7ED3\u675F");
			button_3.setBounds(263, 27, 93, 23);
			panel.add(button_3);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(0, 0, 392, 35);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(172, 5, 82, 24);
			panel_1.add(textArea);
			textArea.setText("\u8F93\u5165\u5E73\u53F0\u7F16\u53F7");
			
			JButton button = new JButton("\u67E5\u8BE2");
			button.setBounds(276, 5, 93, 23);
			panel_1.add(button);
			
			JButton button_4 = new JButton("\u6DFB\u52A0\u63A8\u5E7F\u5E73\u53F0");
			button_4.setBounds(10, 5, 105, 23);
			panel_1.add(button_4);
			imagePanel.setOpaque(false);
			// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
			this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
			//���ÿɼ�
			setVisible(true);
	}

}
