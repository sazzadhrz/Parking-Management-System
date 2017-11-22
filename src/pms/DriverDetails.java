package pms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class DriverDetails extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	JTextField txt_name;
	JTextField txt_age;
	JTextField txt_DLNo;
	JTextField txt_address;
	JRadioButton rdbtn_Male;
	JRadioButton rdbtn_Female;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DriverDetails frame = new DriverDetails();
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
	public DriverDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDriverDetails = new JLabel("Driver Details");
		lblDriverDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDriverDetails.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_Name = new JLabel("Name :");
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		
		JLabel lblAge = new JLabel("Age :");
		
		txt_age = new JTextField();
		txt_age.setColumns(10);
		
		JLabel lbl_Gender = new JLabel("Gender :");
		
		rdbtn_Male = new JRadioButton("Male");
		
		rdbtn_Female = new JRadioButton("Female");
		
		ButtonGroup gender = new ButtonGroup();
		gender.add(rdbtn_Male);
		gender.add(rdbtn_Female);
		
		JLabel lbl_DrivingLicenceNo = new JLabel("Driving Licence No :");
		
		txt_DLNo = new JTextField();
		txt_DLNo.setColumns(10);
		
		JLabel lbl_Address = new JLabel("Address :");
		
		txt_address = new JTextField();
		txt_address.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Details tempDetails = new Details(Run.vd.time, Run.vd.rdbtn_twoWheeler.isSelected() ? "Two Wheeler" : Run.vd.rdbtn_fourWheeler.isSelected() ? "Four Wheeler" : "Others" , Run.vd.txt_regNo.getText(), Run.vd.txt_vehicleModel.getText(), Run.vd.txt_color.getText(), Run.vd.rdbtn_Yes.isSelected() ? "Self-Driven" : Run.vd.rdbtn_No.isSelected() ? "Driven by Driver" : "Unknown" ,Run.dd.txt_name.getText(), Run.dd.txt_age.getText(), Run.dd.rdbtn_Male.isSelected() ? "Male" : Run.dd.rdbtn_Female.isSelected() ? "Female" : "Other-Gender", Run.dd.txt_DLNo.getText(), Run.dd.txt_address.getText() );
				Run.detailsList.add(tempDetails);
				Run.sd.vType.setText(tempDetails.vehicleType);
				Run.sd.vRegNo.setText(tempDetails.regNumber);
				Run.sd.vModel.setText(tempDetails.model);
				Run.sd.vColor.setText(tempDetails.color);
				Run.sd.dName.setText(tempDetails.name);
				Run.sd.dAge.setText(tempDetails.age);
				Run.sd.dDLno.setText(tempDetails.DL);
				
				
				try {
					ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("detailsList.dat"));
					os.writeObject(Run.detailsList);
					os.close();		
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				
				Run.dd.setVisible(false);
				Run.sd.setVisible(true);
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Run.dd.setVisible(false);
				Run.vd.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblDriverDetails, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(85)
					.addComponent(rdbtn_Male, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtn_Female, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
					.addGap(222))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_Address)
						.addComponent(lbl_Gender)
						.addComponent(lblAge)
						.addComponent(lbl_Name)
						.addComponent(lbl_DrivingLicenceNo))
					.addContainerGap(275, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(84)
							.addComponent(txt_address, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(86)
							.addComponent(txt_DLNo, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(88)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txt_name, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(txt_age)
									.addGap(155)))))
					.addGap(95))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(104)
					.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
					.addGap(76)
					.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(122))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDriverDetails)
					.addGap(28)
					.addComponent(lbl_Name)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txt_name, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
					.addGap(13)
					.addComponent(lblAge)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txt_age, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbl_Gender)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtn_Male)
						.addComponent(rdbtn_Female))
					.addGap(18)
					.addComponent(lbl_DrivingLicenceNo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txt_DLNo, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lbl_Address)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txt_address, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(45))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
