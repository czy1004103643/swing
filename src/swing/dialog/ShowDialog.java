package swing.dialog;

import javax.swing.JOptionPane;

public class ShowDialog {
	public static void main(String[] args) {
		
///////////////////////////////////////////////////////////////////
		// ��Ϣ�Ի�����Ϣ��Ϣ��
//        JOptionPane.showMessageDialog(
//        		null,
//                "Hello Information Message",
//                "��Ϣ����",
//                JOptionPane.INFORMATION_MESSAGE
//        );
        
///////////////////////////////////////////////////////////////////
		
        // ��Ϣ�Ի��򣨾�����Ϣ��
//        JOptionPane.showMessageDialog(
//        		null,
//                "Hello Warning Message",
//                "��Ϣ����",
//                JOptionPane.WARNING_MESSAGE
//        );

///////////////////////////////////////////////////////////////////
		
		//ȷ�϶Ի���,�С��ǡ����񡱡�ȡ����
//		int result = JOptionPane.showConfirmDialog(
//                null,
//                "ȷ��ɾ����",
//                "��ʾ",
//                JOptionPane.YES_NO_CANCEL_OPTION
//        );
		
		
///////////////////////////////////////////////////////////////////
		//ȷ�϶Ի���,�С��ǡ�����
		int n=JOptionPane.showConfirmDialog(
				null, 
				"确定现在退出政务服务咨询投诉管理系统吗？",
				"系统提示",
				JOptionPane.OK_CANCEL_OPTION);
		
///////////////////////////////////////////////////////////////////
		
		 // ����Ի����ı������룩
//        String inputContent = JOptionPane.showInputDialog(
//                null,
//                "�����������:",
//                "Ĭ������"
//        );
		
///////////////////////////////////////////////////////////////////
		
//		  Object[] selectionValues = new Object[]{"�㽶", "ѩ��", "ƻ��"};
//
//          // ����Ի���������ѡ��
//          Object inputContent = JOptionPane.showInputDialog(
//                  null,
//                  "ѡ��һ��: ",
//                  "����",
//                  JOptionPane.PLAIN_MESSAGE,
//                  null,
//                  selectionValues,
//                  selectionValues[0]
//          );
          
///////////////////////////////////////////////////////////////////
          //ѡ��Ի���
          
//          Object[] options = new Object[]{"�㽶", "ѩ��", "ƻ��"};// ѡ�ť
//
//          // ��ʾѡ��Ի���, ����ѡ���ѡ������, ����رհ�ť����-1
//          int optionSelected = JOptionPane.showOptionDialog(
//                  null,
//                  "����һ����ťѡ��һ��",
//                  "�Ի������",
//                  JOptionPane.YES_NO_CANCEL_OPTION,
//                  JOptionPane.ERROR_MESSAGE,
//                  null,
//                  options,    // �����null, ��ťΪ optionType ��������ʾ�İ�ť��Ҳ����ȷ�϶Ի���
//                  options[0]
//          );
          
	}

}
