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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Search extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField enterRegNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSearchVehicle = new JLabel("Search Vehicle");
		lblSearchVehicle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblSearchVehicle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblSearchVehicleBy = new JLabel("Search Vehicle By Registration Number");
		lblSearchVehicleBy.setHorizontalAlignment(SwingConstants.CENTER);
		
		enterRegNumber = new JTextField();
		enterRegNumber.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = enterRegNumber.getText();
				for ( int i = 0; i<Run.detailsList.size(); i++) {
					if (Run.detailsList.get(i).regNumber.equals(search)){
//						System.out.println(Run.detailsList.get(i));
						Run.dsv.vType.setText(Run.detailsList.get(i).vehicleType);
						Run.dsv.time.setText(Run.detailsList.get(i).time);
						Run.dsv.regNo.setText(Run.detailsList.get(i).regNumber);
						Run.dsv.model.setText(Run.detailsList.get(i).model);
						Run.dsv.color.setText(Run.detailsList.get(i).color);
						Run.dsv.selfDriven.setText(Run.detailsList.get(i).selfDriven);
						Run.dsv.dName.setText(Run.detailsList.get(i).name);
						Run.dsv.dAge.setText(Run.detailsList.get(i).age);;
						Run.dsv.dGender.setText(Run.detailsList.get(i).gender);
						Run.dsv.DLnumber.setText(Run.detailsList.get(i).DL);
						Run.dsv.dAddress.setText(Run.detailsList.get(i).address);
						
					} 
				}
				Run.srch.setVisible(false);
				Run.dsv.setVisible(true);
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.srch.setVisible(false);
				Run.aw.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblSearchVehicle, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addComponent(lblSearchVehicleBy, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(167)
					.addComponent(enterRegNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(171, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(133)
					.addComponent(btnSearch)
					.addGap(27)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(127, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSearchVehicle)
					.addGap(18)
					.addComponent(lblSearchVehicleBy)
					.addGap(53)
					.addComponent(enterRegNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSearch)
						.addComponent(btnBack))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
