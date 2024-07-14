import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("-       ----Login-----");
		lblNewLabel.setBounds(149, 11, 131, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(10, 53, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUser = new JTextField();
		txtUser.setBounds(74, 50, 248, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(10, 105, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPwd = new JTextField();
		txtPwd.setBounds(74, 102, 248, 20);
		contentPane.add(txtPwd);
		txtPwd.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkLogin(txtUser.getText(), new String(txtPwd.getText()))) 
				{
					Menu menu = new Menu();
					menu.setVisible(true);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Senha ou usuario incorreto!", Warning_message);
					JOptionPane.WARNING_ME
				}
				
			}
		});
		btnLogin.setBounds(160, 158, 89, 23);
		contentPane.add(btnLogin);
	}
	public boolean checkLogin(String user, String pwd) 
	{
		return user.equals("Willian") && pwd.equals("123");
	}

}
