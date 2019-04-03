package swing.register;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;


//日历下拉框
class YearMonthDay extends JFrame {

    private final int STARTYEAR = 2000;// 年份的开始值
    private final int ENDYEAR = 2020;// 年份的结束值

    //JPanel contentPane;
    // 年月日的选择框
    JComboBox cboYear = new JComboBox();
    JComboBox cboMonth = new JComboBox();
    JComboBox cboDay = new JComboBox();
    // 年月日标签
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();

    public YearMonthDay() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jbInit();

    }

    private void jbInit() {

//        contentPane = (JPanel) getContentPane();
//        contentPane.setLayout(null);
//        setSize(new Dimension(400, 300));
//        setTitle("年月日下拉列表级联");
        // 年的下拉选择框
        cboYear.setFont(new java.awt.Font("Dialog", Font.BOLD, 13));
        cboYear.setBounds(new Rectangle(0, 0, 55, 18));
        // 月的下拉选择框
        cboMonth.setFont(new java.awt.Font("Dialog", Font.BOLD, 13));
        cboMonth.setBounds(new Rectangle(80, 0, 45, 18));
        cboMonth.addItemListener( new DateItemAdapter(this));
        // 日的下拉选择框
        cboDay.setFont(new java.awt.Font("Dialog", Font.BOLD, 13));
        cboDay.setBounds(new Rectangle(150, 0, 45, 18));
        // cboDay.setEditable(true);
        // 年的label
        jLabel3.setFont(new java.awt.Font("Dialog", Font.BOLD, 15));
        jLabel3.setText("年");
        jLabel3.setBounds(new Rectangle(60, 0, 20, 20));
        // 月的label
        jLabel2.setFont(new java.awt.Font("Dialog", Font.BOLD, 15));
        jLabel2.setText("月");
        jLabel2.setBounds(new Rectangle(130, 0, 20, 20));
        // 日的label
        jLabel1.setFont(new java.awt.Font("Dialog", Font.BOLD, 15));
        jLabel1.setText("日");
        jLabel1.setBounds(new Rectangle(200, 0, 20, 20));

//        contentPane.add(cboYear);
//        contentPane.add(cboMonth);
//        contentPane.add(cboDay);
//        contentPane.add(jLabel3);
//        contentPane.add(jLabel2);
//        contentPane.add(jLabel1);

        // 添加初始值
        AddInfo();
    }

    private void AddInfo() {
        // 年下拉选择框
        for (int i = STARTYEAR; i < ENDYEAR; i++) {
            cboYear.addItem("" + i);
        }

        // 月下拉选择框
        for (int i = 0; i < 12; i++) {
            cboMonth.addItem("" + (i + 1));
        }

        // 日下拉选择框
        for (int j = 0; j < 31; j++) {
            cboDay.addItem("" + (j + 1));
        }
    }

    public void cboMonth_itemStateChanged(ItemEvent e) {

        Object obj = cboMonth.getSelectedItem();// 取得选中月份

        if (obj != null) {
            cboDay.removeAllItems();// 清空日的下拉列表框

            int month = Integer.valueOf(obj.toString());
            int days = 31;
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else if (month == 2) {
                // 取得选中年份
                int year = Integer.parseInt(cboYear.getSelectedItem()
                        .toString());
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    // 是闰年
                    days = 29;
                } else {
                    // 不是闰年
                    days = 28;
                }
            }// if

            for (int j = 0; j < days; j++) {
                cboDay.addItem("" + (j + 1));
            }// for
        }// if
    }// if
}// end class
//事件监听器
class DateItemAdapter implements ItemListener {
 
 private YearMonthDay adaptee;
 
 DateItemAdapter(YearMonthDay adaptee) {
  this.adaptee = adaptee;
 }
 public void itemStateChanged(ItemEvent e) {
  adaptee.cboMonth_itemStateChanged(e);
 }
}



public class Register3 extends JFrame {
	public Register3() {
		main(null);
	}

    /**
     * @param args
     */
     public static void main(String[] args){
        // TODO Auto-generated method stub
        JFrame jf = new JFrame("注册");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);// 关闭
        jf.setSize(800, 600); // 窗口大小
        jf.setLocation(200, 200); // 窗口位置
        JPanel pan = new JPanel();
        jf.getContentPane().add(pan);
        jf.setVisible(true);
        pan.setLayout(null);
        // 组件字体
        Font f = new Font("宋体", Font.BOLD, 14);

        // 添加标签和文本框
        JLabel l_account = new JLabel("账号");
        l_account.setBounds(20,0,100,100);  //设置布局
        pan.add(l_account);
        l_account.setFont(f);
        JTextField tf_account = new JTextField(10);
        tf_account.setBounds(100, 40, 150, 25);
        pan.add(tf_account);
        

        JLabel l_password = new JLabel("密码");
        l_password.setBounds(20, 40, 100, 100);
        pan.add(l_password);
        l_password.setFont(f);
        
        JPasswordField password = new JPasswordField(20);
        password.setEchoChar('*');
        password.setBounds(100, 80, 150, 25);
        pan.add(password);

        

        JLabel l_qrpassword = new JLabel("确认密码");
        l_qrpassword.setBounds(20, 80, 100, 100);
        pan.add(l_qrpassword);
        l_qrpassword.setFont(f);
        
        JPasswordField qrpassword = new JPasswordField(20);
        password.setEchoChar('*');
        qrpassword.setBounds(100, 120, 150, 25);
        pan.add(qrpassword);

        

        JLabel l_sex = new JLabel("性别");
        pan.add(l_sex);
        l_sex.setFont(f);
        l_sex.setBounds(20, 140, 100, 100);
        
        JPanel p1 = new JPanel();  //设置边框
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));    
        p1.setBounds(100, 180, 150, 100); //设置边框位置
        
        JRadioButton male = new JRadioButton("男", true);// 单选框
        JRadioButton female = new JRadioButton("女");
        ButtonGroup pan1=new ButtonGroup(); //设置单选框
        pan1.add(male);
        pan1.add(female);
        pan.add(male);
        pan.add(female);
        male.setBounds(130,200,50,20);
        female.setBounds(130,235,50,20);
        pan.add(p1);  

        
        JLabel l_birthday = new JLabel("生日");
        l_birthday.setBounds(300, 0, 100, 100);
        pan.add(l_birthday);
        l_birthday.setFont(f);
        // 日历下拉菜单
         YearMonthDay testDate = new YearMonthDay();
         JPanel p = new JPanel(); 
         p.add(testDate.cboYear);
         p.add(testDate.jLabel3);
         p.add(testDate.cboMonth);
          p.add(testDate.jLabel2);
         p.add(testDate.cboDay);
         p.add(testDate.jLabel1);
         p.setBounds(345, 30, 205, 40);
         pan.add(p);


        JLabel l_hobby = new JLabel("兴趣");
         l_hobby.setBounds(300, 50, 100, 100);
        pan.add(l_hobby);
        l_hobby.setFont(f);
        
        

        JLabel l_bz = new JLabel("备注");
          l_bz.setBounds(300, 140, 100, 100);
        pan.add(l_bz);
        l_bz.setFont(f);
        JTextField tf_bz = new JTextField(100);
         tf_bz.setBounds(350, 180, 180, 100);
        pan.add(tf_bz);


        // 添加按钮
        JButton b_register = new JButton("注册");
         b_register.setBounds(250,500,100,50);
        pan.add(b_register);
        b_register.setFont(f);
        JButton b_reset = new JButton("重置");
        b_reset.setBounds(450,500,100,50);
        pan.add(b_reset);
        b_reset.setFont(f);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(345, 89, 109, 24);
        pan.add(textArea);
        
    }

}