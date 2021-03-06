package Chapter10_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingFrame extends JFrame{
	private JButton button = new JButton("按键");
	public SwingFrame() {
		setSize(300, 300);			//设置窗体大小
		setLocation(400, 400);		//设置窗体位置
		setTitle("测试一下");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//设置窗体默认关闭事件
		setLayout(new FlowLayout());						//设置布局管理器
		//添加按键事件
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "单机了按键！");
			}
		});
		add(button);
	}
	public static void main(String[] args) {
		SwingFrame frame = new SwingFrame();
		frame.setVisible(true);
	}
}
