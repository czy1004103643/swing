package swing.function;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Function3 extends JFrame {

	private JPanel contentPane;
	JLabel label1=new JLabel("书名",JLabel.CENTER);
    JLabel label2=new JLabel("作者",JLabel.CENTER);
    JLabel label3=new JLabel("状态",JLabel.CENTER);
    JLabel label4=new JLabel("编号",JLabel.CENTER);
    JLabel label5=new JLabel("出版社",JLabel.CENTER);
    JTextField name=new JTextField(2);
    JTextField author=new JTextField(4);
    ButtonGroup bgp=new ButtonGroup();
    JRadioButton R1=new JRadioButton("已借出");
    JRadioButton R2=new JRadioButton("未借出",true);
    JTextField id=new JTextField();
    JTextField house=new JTextField();
    JButton reset=new JButton("清空");
    JButton addmsg=new JButton("修改");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function3 frame = new Function3();
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
	public Function3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		 Font font=new Font("微软雅黑",Font.BOLD,20);
	        this.setSize(500,400);
	        this.setLocationRelativeTo(null);
	        this.setResizable(false);
	        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	        this.setLayout(null);
	        label1.setFont(font);
	        label2.setFont(font);
	        label3.setFont(font);
	        label4.setFont(font);
	        label5.setFont(font);
	        label1.setBounds(135, 60, 70, 20);
	        label2.setBounds(135, 100, 70, 20);
	        label3.setBounds(135, 140, 70, 20);
	        label4.setBounds(135, 180, 70, 20);
	        label5.setBounds(125, 220, 70, 20);
	        this.add(label1);
	        this.add(label2);
	        this.add(label3);
	        this.add(label4);
	        this.add(label5);
	        name.setBounds(190,60,140,20);
	        author.setBounds(190,100,140,20);
	        R1.setBounds(200,140,80,20);
	        R2.setBounds(280,140,80,20);
	        id.setBounds(190,180,140,20);
	        house.setBounds(190,220,140,20);
	        reset.setBounds(190,260,65,20);
	        addmsg.setBounds(265,260,65,20);
	        name.setText("");
	        author.setText("");
	        R1.setSelected(true);
	        R2.setSelected(true);
	        id.setText("");
	        house.setText("");
	        this.add(name);
	        this.add(author);
	        this.add(R1);
	        this.add(R2);
	        this.add(id);
	        this.add(house);
	        this.add(reset);
	        this.add(addmsg);
	        bgp.add(R1);
	        bgp.add(R2);
	        this.setVisible(true);
	}

}
