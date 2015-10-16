import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

	private JButton loginBtn = null;

	public LoginFrame() {
		initFrame(380, 275);
	}

	private void initFrame(int frameWidth, int frameHeight) {
		setTitle("登录");
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenDimension = tk.getScreenSize();
		int screenWidth = screenDimension.width;
		int screenHeight = screenDimension.height;
		this.setLocation((screenWidth - frameWidth) / 2,
				(screenHeight - frameHeight) / 2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(frameWidth, frameHeight);
		getContentPane().setLayout(null);
		this.setVisible(true);

		// 北部布局
		JPanel northPanel = new JPanel();
		northPanel.setLocation(0, 0);
		northPanel.setSize(380, 107);
		JLabel northLabel = new JLabel();
		northLabel.setIcon(new ImageIcon("image\\northImageIcon.png"));
		northPanel.add(northLabel);
		getContentPane().add(northPanel, BorderLayout.NORTH);

		// 用户名
		JLabel userIdLabel = new JLabel("用户名");
		userIdLabel.setBounds(56, 118, 50, 30);
		getContentPane().add(userIdLabel);
		JTextField userIdField = new JTextField();
		userIdField.setBounds(120, 118, 200, 30);
		getContentPane().add(userIdField);

		// 密码
		JLabel passwordLabel = new JLabel("密码");
		passwordLabel.setBounds(66, 155, 50, 30);
		getContentPane().add(passwordLabel);
		JPasswordField PasswordField = new JPasswordField();
		PasswordField.setBounds(120, 152, 200, 30);
		getContentPane().add(PasswordField);

		// 登录
		loginBtn = new JButton("登陆");
		loginBtn.setBounds(120, 188, 150, 40);
		getContentPane().add(loginBtn);

		MyEvent();
	}

	private void MyEvent() {
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAction.execute();
			}
		});
	}
}
