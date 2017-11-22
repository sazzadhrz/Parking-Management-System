package pms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_username;
	private JPasswordField txt_password;

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
		setBounds(100, 100, 351, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(11, 1, 50, 0));
		
		JLabel lblLogIn = new JLabel("Log In");
		lblLogIn.setVerticalAlignment(SwingConstants.TOP);
		lblLogIn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLogIn);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel lblUsername = new JLabel("Username :");
		contentPane.add(lblUsername);
		
		txt_username = new JTextField();
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JLabel lblPassword = new JLabel("Password :");
		contentPane.add(lblPassword);
		
		txt_password = new JPasswordField();
		contentPane.add(txt_password);
		txt_password.setColumns(10);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value1 = txt_username.getText();
				String value2 = txt_password.getText();
				if(value1.equals("sazzad") && value2.equals("1234")) {
					Run.l.setVisible(false);
					Run.aw.setVisible(true);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Wrong Username or Password..!!", "WARNING!", 0);
				}
			}
		});
		panel.add(btnLogin);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.l.setVisible(false);
				Run.ww.setVisible(true);
			}
		});
		panel.add(btnBack);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}

}
