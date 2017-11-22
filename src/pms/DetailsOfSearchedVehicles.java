package pms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetailsOfSearchedVehicles extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel time;
	JLabel regNo;
	JLabel color;
	JLabel model;
	JLabel vType;
	JLabel selfDriven;
	JLabel dName;
	JLabel dAge;
	JLabel dGender;
	JLabel dAddress;
	JLabel DLnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetailsOfSearchedVehicles frame = new DetailsOfSearchedVehicles();
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
	public DetailsOfSearchedVehicles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDetailsOfSearched = new JLabel("Details of Searched Vehicle");
		lblDetailsOfSearched.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblDetailsOfSearched.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblCheckinTime = new JLabel("Check-In Time : ");
		
		time = new JLabel("");
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number :");
		
		regNo = new JLabel("");
		
		JLabel lblColor = new JLabel("Color :");
		
		color = new JLabel("");
		
		JLabel lblModel = new JLabel("Model :");
		
		model = new JLabel("");
		
		JLabel lblVehicleType = new JLabel("Vehicle Type : ");
		
		vType = new JLabel("");
		
		JLabel lblSelfDriven = new JLabel("Self Driven :");
		
		selfDriven = new JLabel("");
		
		JLabel lblDriversName = new JLabel("Driver's Name :");
		
		dName = new JLabel("");
		
		JLabel lblAge = new JLabel("Age :");
		
		dAge = new JLabel("");
		
		JLabel lblGender = new JLabel("Gender :");
		
		dGender = new JLabel("");
		
		JLabel lblDrivingLicenceNo = new JLabel("Driving Licence No :");
		
		JLabel lblAddress = new JLabel("Address :");
		
		dAddress = new JLabel("");
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Run.dsv.setVisible(false);
				Run.srch.setVisible(true);
			}
		});
		
		DLnumber = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblDetailsOfSearched, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblAddress)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dAddress))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDrivingLicenceNo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(DLnumber))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblGender)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dGender))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblAge)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(dAge))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDriversName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dName))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSelfDriven)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(selfDriven))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblVehicleType)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(vType))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblModel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(model))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblColor)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(color))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblRegistrationNumber)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(regNo))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCheckinTime)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(time)))
					.addContainerGap(238, Short.MAX_VALUE))
				.addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDetailsOfSearched)
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCheckinTime)
						.addComponent(time))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRegistrationNumber)
						.addComponent(regNo))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblColor)
						.addComponent(color))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModel)
						.addComponent(model))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVehicleType)
						.addComponent(vType))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSelfDriven)
						.addComponent(selfDriven))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDriversName)
						.addComponent(dName))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAge)
						.addComponent(dAge))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender)
						.addComponent(dGender))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDrivingLicenceNo)
						.addComponent(DLnumber))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(dAddress))
					.addGap(18)
					.addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
