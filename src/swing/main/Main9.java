package swing.main;

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

public class Main9 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main9 frame = new Main9();
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
	public Main9() {
		super("�޸ĵ���");
		this.setIconImage(new ImageIcon("image/2.jpg").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("���ʣ�");
		label.setBounds(29, 29, 54, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(69, 26, 101, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("���ԣ�");
		label_1.setBounds(29, 57, 54, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(69, 57, 101, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("���ģ�");
		label_2.setBounds(29, 88, 54, 15);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(69, 88, 101, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField.setText("wordname");
		textField_1.setText("quality");
		textField_2.setText("chinese");
		
		JButton button = new JButton("�޸�");
		button.setBounds(65, 136, 93, 23);
		contentPane.add(button);
		
		
		
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
