package JxBrowser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by luzhibin on 2020/7/31 11:59
 */
public class myFrame extends JFrame{
        JLabel label = new JLabel("请输入要查找的内容");

        //创建JTextField，16表示16列，用于JTextField的宽度显示而不是限制字符个数
        JTextField textField = new JTextField(16);
        JButton button = new JButton("确定");

        //构造函数
        public  myFrame(String title)
        {
            //继承父类，
            super(title);

            //内容面板
            Container contentPane = getContentPane();
            contentPane.setLayout(new FlowLayout());

            //添加控件
            contentPane.add(label);
            contentPane.add(textField);
            contentPane.add(button);

            //按钮点击处理 lambda表达式
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    myFrame.this.onButtonOk();
                }
            });
        }

        //事件处理
        private void onButtonOk()
        {
            String str = textField.getText();//获取输入内容
            //判断是否输入了
            if(str.equals(""))
            {
                Object[] options = { "OK ", "CANCEL " };
                JOptionPane.showOptionDialog(null, "您还没有输入 ", "提示", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE,null, options, options[0]);
            }
            else {
                JOptionPane.showMessageDialog(this,"您输入了：" + str);
            }
        }
}
