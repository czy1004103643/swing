package swing.function;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;

public class Function1 extends JFrame {

	private JPanel contentPane;
	private ArrayList<Thread> tList;
	private volatile int count=1;
	
	private static volatile String threadInfo=null;
	private static volatile String poolInfo=null;
	private JComboBox pro_jcb;
	private JComboBox con_jcb;
	private JTextArea bufferStatusTextArea;
	private JTextArea threadStatusTextArea;
	
	private JButton byStepButton;
	private JButton aotuButton;
	private JButton clearButton;
	
	private Thread status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function1 frame = new Function1();
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
	public Function1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLabel lblNewLabel = new JLabel("生产者数量：");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 17));
		
		pro_jcb = new JComboBox();
		pro_jcb.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		pro_jcb.setSelectedItem("1");
		JLabel label = new JLabel("消费者数量：");
		label.setFont(new Font("宋体", Font.PLAIN, 17));
		
		con_jcb = new JComboBox();
		con_jcb.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		pro_jcb.setSelectedItem("1");
		JLabel lblNewLabel_1 = new JLabel("");
//		lblNewLabel_1.setIcon(new ImageIcon(MainFrame.class.getResource("/images/producer.png")));
		
		JLabel lblNewLabel_2 = new JLabel("");
//		lblNewLabel_2.setIcon(new ImageIcon(MainFrame.class.getResource("/images/consumer.png")));
		
		JLabel lblNewLabel_3 = new JLabel("");
//		lblNewLabel_3.setIcon(new ImageIcon(MainFrame.class.getResource("/images/process.png")));
		
		JLabel lblNewLabel_4 = new JLabel("线程运行状态");
//		lblNewLabel_4.setFont(UIManager.getFont("Label.font"));
		
		JLabel lblNewLabel_5 = new JLabel("");
//		lblNewLabel_5.setIcon(new ImageIcon(MainFrame.class.getResource("/images/Buffer.png")));
		
		JLabel lblNewLabel_6 = new JLabel("缓冲池资源状态");
		
		byStepButton = new JButton("单步");
//		byStepButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/step.png")));
		byStepButton.setBackground(Color.WHITE);
		byStepButton.setFont(new Font("宋体", Font.PLAIN, 18));
		
		aotuButton = new JButton("自动");
		aotuButton.setBackground(Color.WHITE);
		aotuButton.setForeground(Color.BLACK);
		aotuButton.setFont(new Font("宋体", Font.PLAIN, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		clearButton = new JButton("清除");
		clearButton.setEnabled(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(36, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_4))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_6))
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE))
					.addGap(23))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(154)
							.addComponent(byStepButton)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(aotuButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(184)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(pro_jcb, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addComponent(lblNewLabel_2)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(con_jcb, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(84)
							.addComponent(clearButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(266, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(59)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(pro_jcb, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(con_jcb, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(75)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_5)))
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
					.addGap(51)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(byStepButton, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
						.addComponent(aotuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(clearButton))
					.addGap(96))
		);
		
		bufferStatusTextArea = new JTextArea();
		bufferStatusTextArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		scrollPane_1.setViewportView(bufferStatusTextArea);
		DefaultCaret caret_b = (DefaultCaret)bufferStatusTextArea.getCaret();
		caret_b.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		threadStatusTextArea = new JTextArea();
		threadStatusTextArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		scrollPane.setViewportView(threadStatusTextArea);
		DefaultCaret caret_t = (DefaultCaret)threadStatusTextArea.getCaret();
		caret_t.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		contentPane.setLayout(gl_contentPane);
	}

}
