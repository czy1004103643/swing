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

public class Function8 extends JFrame {

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
					Function8 frame = new Function8();
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
	public Function8() {
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
        scrollPane.setBounds(0, 32, 392, 160);
        getContentPane().add(scrollPane);
        
      

        setSize(402, 300);
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
			
			JButton button_1 = new JButton("\u63A8\u5E7F\u4FEE\u6539");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button_1.setBounds(10, 27, 93, 23);
			panel.add(button_1);
			
			JButton button_2 = new JButton("\u63A8\u5E7F\u5220\u9664");
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
			textArea.setBounds(85, 5, 82, 24);
			panel_1.add(textArea);
			textArea.setText("\u8F93\u5165\u63A8\u5E7F\u7F16\u53F7");
			
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
