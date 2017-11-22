package pms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowDetails extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel vType;
	JLabel vRegNo;
	JLabel vModel;
	JLabel vColor;
	JLabel dName;
	JLabel dAge;
	JLabel dDLno;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowDetails frame = new ShowDetails();
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
	public ShowDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTotalDetails = new JLabel("Total Details");
		
		JLabel lblType = new JLabel("Type :");
		
		vType = new JLabel("");
		
		JLabel lblRegistrationNo = new JLabel("Registration No :");
		
		vRegNo = new JLabel("");
		
		JLabel lblModel = new JLabel("Model :");
		
		vModel = new JLabel("");
		
		JLabel lblColor = new JLabel("Color :");
		
		vColor = new JLabel("");
		
		JLabel lblDriversName = new JLabel("Driver's Name :");
		
		dName = new JLabel("");
		
		JLabel lblAge = new JLabel("Age :");
		
		dAge = new JLabel("");
		
		JLabel lblDrivingLicenseNo = new JLabel("Driving License No :");
		
		dDLno = new JLabel("");
		
		btnNewButton = new JButton("Back To Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.sd.setVisible(false);
				Run.ww.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(178)
							.addComponent(lblTotalDetails))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(45)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblRegistrationNo)
									.addGap(18)
									.addComponent(vRegNo))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblType)
									.addGap(18)
									.addComponent(vType))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblModel)
									.addGap(18)
									.addComponent(vModel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblColor)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(vColor))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDriversName)
									.addGap(18)
									.addComponent(dName))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblAge)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(dAge))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDrivingLicenseNo)
									.addGap(6)
									.addComponent(dDLno)))))
					.addContainerGap(187, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTotalDetails)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblType)
						.addComponent(vType))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRegistrationNo)
						.addComponent(vRegNo))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModel)
						.addComponent(vModel))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblColor)
						.addComponent(vColor))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDriversName)
						.addComponent(dName))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAge)
						.addComponent(dAge))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDrivingLicenseNo)
						.addComponent(dDLno))
					.addGap(41)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
