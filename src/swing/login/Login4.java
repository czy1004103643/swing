package swing.login;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login4 frame = new Login4();
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
	public Login4() {
		//���ñ���
				super("ϵͳ��¼");
				this.setIconImage(new ImageIcon("image/2.jpg").getImage());
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 300);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JLabel label = new JLabel("�û�����");
				label.setBounds(46, 126, 54, 15);
				contentPane.add(label);
				
				JLabel label_1 = new JLabel("���룺");
				label_1.setBounds(46, 165, 54, 15);
				contentPane.add(label_1);
				
				textField = new JTextField();
				textField.setBounds(100, 123, 102, 21);
				contentPane.add(textField);
				textField.setColumns(10);
				
				passwordField = new JPasswordField();
				passwordField.setBounds(100, 162, 102, 21);
				contentPane.add(passwordField);
				//����ͼƬ��·���������·�����߾���·��������ͼƬ����"java��Ŀ��"���ļ��£�
				String path2 = "image/6.gif";
				// ����ͼƬ
				ImageIcon background2 = new ImageIcon(path2);
				JLabel lblNewLabel = new JLabel(background2);
				lblNewLabel.setBounds(10, 10, 414, 96);
				contentPane.add(lblNewLabel);
				// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
				this.getLayeredPane().add(lblNewLabel, new Integer(Integer.MIN_VALUE));
				
				
				
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
				//��رհ�ťʱ�˳�
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
						
						
					
						JButton btnNewButton = new JButton("��¼");
						
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
							}
						});
						btnNewButton.setBounds(59, 208, 93, 23);
						contentPane.add(btnNewButton);
						
						JButton btnNewButton_1 = new JButton("ע��");
						
						btnNewButton_1.setBounds(253, 208, 93, 23);
						contentPane.add(btnNewButton_1);
	}

}
