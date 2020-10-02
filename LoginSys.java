package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class LoginSys {

	private JFrame frame;
	private JTextField textUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSys window = new LoginSys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLoginSys = new JLabel("Login Systems");
		lblLoginSys.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginSys.setForeground(Color.RED);
		lblLoginSys.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblLoginSys.setBounds(175, 11, 192, 36);
		frame.getContentPane().add(lblLoginSys);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setForeground(SystemColor.textHighlight);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBackground(Color.WHITE);
		lblUsername.setBounds(33, 76, 82, 21);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(SystemColor.textHighlight);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(33, 127, 82, 18);
		frame.getContentPane().add(lblPassword);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textUsername.setBounds(141, 69, 226, 36);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 120, 226, 36);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBackground(new Color(173, 255, 47));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textUsername.getText();
				String password = passwordField.getText();
				
				if(username.contains("myphuoc") && password.contains("phuoc123")){
			 textUsername.setText(null);
			 passwordField.setText(null);
		}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect username or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
					 textUsername.setText(null);
					 passwordField.setText(null);
				}
			}
		});
		btnLogin.setBounds(22, 212, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUsername.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setBackground(new Color(173, 255, 47));
		btnReset.setBounds(193, 213, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBackground(new Color(173, 255, 47));
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(372, 213, 89, 23);
		frame.getContentPane().add(btnCancel);
	}
}
