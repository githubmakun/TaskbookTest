package Chapter10_10;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo extends JFrame{
	JLabel label = new JLabel("");
	public MouseEventDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				label.setText("鼠标在" + event.getX() + "," + event.getY() + "进行了单机");
			}
		});
		this.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent event) {
				label.setText("鼠标移动到了" + event.getX() + "," + event.getY());
			}
		});
		setLayout(new BorderLayout());
		add(label, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		MouseEventDemo frame = new MouseEventDemo();
		frame.setVisible(true);
	}
}
