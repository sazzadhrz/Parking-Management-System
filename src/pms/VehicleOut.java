package pms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class VehicleOut extends JFrame {

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
					VehicleOut frame = new VehicleOut();
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
	public VehicleOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblVehicleOut = new JLabel("Vehicle Out");
		lblVehicleOut.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblVehicleOut.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblEnterRegistrationNumber = new JLabel("Enter Registration Number");
		lblEnterRegistrationNumber.setHorizontalAlignment(SwingConstants.CENTER);
		
		enterRegNumber = new JTextField();
		enterRegNumber.setColumns(10);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = enterRegNumber.getText();
				for ( int i = 0; i<Run.detailsList.size(); i++) {
					if (Run.detailsList.get(i).regNumber.equals(search)){
//						System.out.println(Run.detailsList.get(i));
						try {
							ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("exitedVehicleList.dat"));
							Run.deletedList.add(Run.detailsList.get(i));
							oos.writeObject(Run.deletedList);
							oos.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "The Vehicle May Leave Now");
						Run.vo.setVisible(false);
						Run.vio.setVisible(true);
					} 
					
				}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.vo.setVisible(false);
				Run.vio.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblVehicleOut, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addComponent(lblEnterRegistrationNumber, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(168)
					.addComponent(enterRegNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(170, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(143)
					.addComponent(btnDone)
					.addGap(27)
					.addComponent(btnBack)
					.addContainerGap(142, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblVehicleOut)
					.addGap(18)
					.addComponent(lblEnterRegistrationNumber)
					.addGap(34)
					.addComponent(enterRegNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack)
						.addComponent(btnDone))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
