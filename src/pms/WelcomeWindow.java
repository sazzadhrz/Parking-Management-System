package pms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow frame = new WelcomeWindow();
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
	public WelcomeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 398);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblWelcomeToParking = new JLabel("Welcome To Parking Management System");
		lblWelcomeToParking.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcomeToParking.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnTakeVehicleDetails = new JButton("Take Vehicle Details");
		btnTakeVehicleDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Run.ww.setVisible(false);
				Run.vio.setVisible(true);
			}
		});
		
		JButton btnAdminSection = new JButton("Admin Section");
		btnAdminSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.ww.setVisible(false);
				Run.l.setVisible(true);
			}
		});
		
		JButton btnAboutDeveloper = new JButton("About Developer");
		btnAboutDeveloper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Developed By Sazzad Hossain\nDepartment of Computer Science And Engineering\nNorth South University");
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.ww.setVisible(false);
				Run.ew.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblWelcomeToParking, GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(101)
					.addComponent(btnTakeVehicleDetails, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addGap(105))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(125)
					.addComponent(btnAdminSection, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
					.addGap(125))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(192)
					.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(190))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(164)
					.addComponent(btnAboutDeveloper, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(156))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWelcomeToParking, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addGap(36)
					.addComponent(btnTakeVehicleDetails, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnAdminSection, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAboutDeveloper, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
