package pms;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VehicleDetails extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	JTextField txt_regNo;
	JTextField txt_vehicleModel;
	JTextField txt_color;
	JRadioButton rdbtn_fourWheeler;
	JRadioButton rdbtn_twoWheeler;
	JRadioButton rdbtn_Yes;
	JRadioButton rdbtn_No;
	
	
	DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	Date date = new Date();
	String time = df.format(date);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VehicleDetails frame = new VehicleDetails();
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
	public VehicleDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lbl_vehicleDetails = new JLabel("Vehicle Details");
		lbl_vehicleDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbl_vehicleDetails.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_vehicleType = new JLabel("Vehicle Type : ");
		lbl_vehicleType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		rdbtn_fourWheeler = new JRadioButton("Four Wheelers");
		
		rdbtn_twoWheeler = new JRadioButton("Two Wheelers");
		
		ButtonGroup vType = new ButtonGroup();
		vType.add(rdbtn_fourWheeler);
		vType.add(rdbtn_twoWheeler);
		
		JLabel lbl_regNo = new JLabel("Registration No :");
		lbl_regNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txt_regNo = new JTextField();
		txt_regNo.setColumns(10);
		
		JLabel lbl_vehicleModel = new JLabel("Vehicle Model :");
		
		txt_vehicleModel = new JTextField();
		txt_vehicleModel.setColumns(10);
		
		JLabel lbl_Color = new JLabel("Color :");
		
		txt_color = new JTextField();
		txt_color.setColumns(10);
		
		JLabel lblSelfdriven = new JLabel("Self-Driven :");
		
		JButton btn_Save = new JButton("Save");
		btn_Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Run.vd.setVisible(false);
				Run.dd.setVisible(true);
			}
		});
		
		JButton btn_Cancel = new JButton("Cancel");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Run.vd.setVisible(false);
				Run.ww.setVisible(true);
			}
		});
		
		rdbtn_Yes = new JRadioButton("Yes");
		
		rdbtn_No = new JRadioButton("No");
		
		ButtonGroup selfDriven = new ButtonGroup();
		selfDriven.add(rdbtn_Yes);
		selfDriven.add(rdbtn_No);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lbl_vehicleDetails, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSelfdriven)
						.addComponent(lbl_Color)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lbl_vehicleType)
								.addGap(18)
								.addComponent(rdbtn_fourWheeler)
								.addGap(18)
								.addComponent(rdbtn_twoWheeler))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lbl_regNo)
									.addComponent(lbl_vehicleModel))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(txt_vehicleModel, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
									.addComponent(txt_regNo)
									.addComponent(txt_color, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(rdbtn_Yes)
										.addGap(47)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(btn_Cancel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
											.addComponent(rdbtn_No)))))))
					.addContainerGap(98, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(91)
					.addComponent(btn_Save, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(248, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbl_vehicleDetails)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_vehicleType)
						.addComponent(rdbtn_fourWheeler)
						.addComponent(rdbtn_twoWheeler))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_regNo)
						.addComponent(txt_regNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_vehicleModel)
						.addComponent(txt_vehicleModel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Color)
						.addComponent(txt_color, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSelfdriven)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(rdbtn_Yes)
							.addComponent(rdbtn_No)))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn_Save, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_Cancel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
