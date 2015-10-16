import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MiaoShaFrame extends JFrame {

	private JButton miaoBtn = null;

	public MiaoShaFrame() {
		initFrame(800, 600);
	}

	private void initFrame(int frameWidth, int frameHeight) {
		setTitle("秒杀");
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

		// 用户名
		JLabel userIdLabel = new JLabel("用户名：");
		userIdLabel.setBounds(27, 26, 60, 30);
		getContentPane().add(userIdLabel);
		JTextField userIdField = new JTextField();
		userIdField.setBounds(91, 26, 136, 30);
		getContentPane().add(userIdField);

		// 密码
		JLabel passwordLabel = new JLabel("密码：");
		passwordLabel.setBounds(241, 26, 50, 30);
		getContentPane().add(passwordLabel);
		JPasswordField PasswordField = new JPasswordField();
		PasswordField.setBounds(286, 26, 150, 30);
		getContentPane().add(PasswordField);
		
		// 地址
		JLabel label = new JLabel("地址：");
		label.setBounds(27, 69, 60, 30);
		getContentPane().add(label);
		JTextField textField = new JTextField();
		textField.setBounds(91, 69, 345, 30);
		getContentPane().add(textField);

		JButton miaoBtn = new JButton("抢购");
		miaoBtn.setBounds(467, 69, 79, 36);
		getContentPane().add(miaoBtn);

		MyEvent();
	}

	private void MyEvent() {
		miaoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MiaoShaAction.execute();
			}
		});
	}
}
