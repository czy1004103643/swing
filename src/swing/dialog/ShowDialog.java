package swing.dialog;

import javax.swing.JOptionPane;

public class ShowDialog {
	public static void main(String[] args) {
		
///////////////////////////////////////////////////////////////////
		// 消息对话框（信息消息）
//        JOptionPane.showMessageDialog(
//        		null,
//                "Hello Information Message",
//                "消息标题",
//                JOptionPane.INFORMATION_MESSAGE
//        );
        
///////////////////////////////////////////////////////////////////
		
        // 消息对话框（警告消息）
//        JOptionPane.showMessageDialog(
//        		null,
//                "Hello Warning Message",
//                "消息标题",
//                JOptionPane.WARNING_MESSAGE
//        );

///////////////////////////////////////////////////////////////////
		
		//确认对话框,有“是”“否”“取消”
//		int result = JOptionPane.showConfirmDialog(
//                null,
//                "确认删除？",
//                "提示",
//                JOptionPane.YES_NO_CANCEL_OPTION
//        );
		
		
///////////////////////////////////////////////////////////////////
		//确认对话框,有“是”“否”
		int n=JOptionPane.showConfirmDialog(
				null, 
				"确定需要退出博瑞世纪微信商城的应用服务系统吗？",
				"系统提示",
				JOptionPane.OK_CANCEL_OPTION);
		
///////////////////////////////////////////////////////////////////
		
		 // 输入对话框（文本框输入）
//        String inputContent = JOptionPane.showInputDialog(
//                null,
//                "输入你的名字:",
//                "默认内容"
//        );
		
///////////////////////////////////////////////////////////////////
		
//		  Object[] selectionValues = new Object[]{"香蕉", "雪梨", "苹果"};
//
//          // 输入对话框（下拉框选择）
//          Object inputContent = JOptionPane.showInputDialog(
//                  null,
//                  "选择一项: ",
//                  "标题",
//                  JOptionPane.PLAIN_MESSAGE,
//                  null,
//                  selectionValues,
//                  selectionValues[0]
//          );
          
///////////////////////////////////////////////////////////////////
          //选项对话框
          
//          Object[] options = new Object[]{"香蕉", "雪梨", "苹果"};// 选项按钮
//
//          // 显示选项对话框, 返回选择的选项索引, 点击关闭按钮返回-1
//          int optionSelected = JOptionPane.showOptionDialog(
//                  null,
//                  "请点击一个按钮选择一项",
//                  "对话框标题",
//                  JOptionPane.YES_NO_CANCEL_OPTION,
//                  JOptionPane.ERROR_MESSAGE,
//                  null,
//                  options,    // 如果传null, 则按钮为 optionType 类型所表示的按钮（也就是确认对话框）
//                  options[0]
//          );
          
	}

}
