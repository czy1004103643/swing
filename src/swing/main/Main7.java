package swing.main;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main7 extends JFrame {

	private JPanel contentPane;
	// Ĭ�ϱ��ģ��
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
					Main7 frame = new Main7();
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
	public Main7() {
		//���ñ���
				super("��ѧ�ᵥ��");
				this.setIconImage(new ImageIcon("image/2.jpg").getImage());
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setBounds(100, 100, 450, 300);

		        
		        String[][] datas = {};
		        String[] titles = { "id","����", "����","����" };
		        model = new DefaultTableModel(datas, titles);
		        table = new JTable(new DefaultTableModel(
		        	new Object[][] {
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        		{null, null, null, null},
		        	},
		        	new String[] {
		        		"id", "\u5355\u8BCD", "\u8BCD\u6027", "\u4E2D\u6587"
		        	}
		        ));
		        upBtn = new JButton("�޸�����");
		      
		        upBtn.setBounds(0, 0, 146, 23);
		        
		        for (int i= 0;i<3;i++) {

		        	model.addRow(new String[] { "id","mame","Quality","Chinese"  });
				}
		        getContentPane().setLayout(null);
		        
		        getContentPane().add(upBtn);
		        JScrollPane scrollPane = new JScrollPane(table);
		        scrollPane.setBounds(0, 24, 384, 237);
		        getContentPane().add(scrollPane);
		        
		        JButton button = new JButton("ɾ������");
		        button.setBounds(238, 0, 146, 23);
		        getContentPane().add(button);

		        setSize(400, 300);
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
					imagePanel.setOpaque(false);
					// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
					this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
					//���ÿɼ�
					setVisible(true);
	}
	
	

}
