package swing.function;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Function7 extends JFrame {

	private JPanel contentPane;
	private JTextField wordnametext;
	private static Integer current = 0;
	private JLabel qualitytext;
	private JLabel chinesetext;
	private JLabel label_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function7 frame = new Function7();
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
	public Function7() {
		super("���е���");
		this.setIconImage(new ImageIcon("image/2.jpg").getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
	
		
		JButton button = new JButton("��һ��");
		
		button.setBounds(21, 207, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("��һ��");
		
		button_1.setBounds(277, 207, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("����");
		
		button_2.setBounds(316, 10, 93, 23);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("Ӣ�ģ�");
		label.setBounds(84, 48, 54, 15);
		contentPane.add(label);
		
		wordnametext = new JTextField();
		wordnametext.setBounds(148, 45, 122, 21);
		contentPane.add(wordnametext);
		wordnametext.setColumns(10);
		
		JLabel label_1 = new JLabel("���ԣ�");
		label_1.setBounds(84, 92, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("���ģ�");
		label_2.setBounds(84, 143, 54, 15);
		contentPane.add(label_2);
		
		qualitytext = new JLabel("n");
		qualitytext.setBounds(146, 92, 97, 15);
		contentPane.add(qualitytext);
		
		chinesetext = new JLabel("����");
		chinesetext.setBounds(146, 143, 97, 15);
		contentPane.add(chinesetext);
		
		JLabel label_3 = new JLabel("��ǰ���ʣ�");
		label_3.setBounds(95, 240, 66, 15);
		contentPane.add(label_3);
		
		label_4 = new JLabel("0/0");
		label_4.setBounds(173, 240, 54, 15);
		contentPane.add(label_4);
		
		label_4.setText("label_4");
		
		JButton button_3 = new JButton("����");
		
		button_3.setBounds(150, 207, 93, 23);
		contentPane.add(button_3);
		
		qualitytext.setText("getQuality");
		chinesetext.setText("getChinese");
		
		
		
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
