package pms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AdminWindow extends JFrame {

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
					AdminWindow frame = new AdminWindow();
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
	public AdminWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(12, 1, 20, 0));
		
		JLabel lblAdminPanel = new JLabel("Admin Panel");
		lblAdminPanel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblAdminPanel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblAdminPanel);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JButton btnListOfParked = new JButton("List of Parked Vehicles");
		btnListOfParked.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("detailsList.dat"));
					Run.detailsList = (ArrayList<Details>) ois.readObject();
					Run.lpv.listOfParkedVehicles.setText(Run.detailsList.toString());
					ois.close();
				} catch (IOException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				Run.aw.setVisible(false);
				Run.lpv.setVisible(true);
			}
		});
		contentPane.add(btnListOfParked);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JButton btnTreasury = new JButton("Treasury");
		btnTreasury.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Run.detailsList.size();
				Run.tca.carParked.setText(Integer.toString(a));
				
				double b = a*80;
				Run.tca.totalCollected.setText(Double.toString(b) + " Taka");
				
				Run.aw.setVisible(false);
				Run.tca.setVisible(true);
			}
		});
		
		JButton btnGetDetailsBy = new JButton("Get Details By Registraion Number");
		btnGetDetailsBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.aw.setVisible(false);
				Run.srch.setVisible(true);
			}
		});
		
		JButton btnListOfExited = new JButton("List of Exited Vehicles");
		btnListOfExited.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("exitedVehicleList.dat"));
					Run.deletedList = (ArrayList<Details>) ois.readObject();
//					System.out.println(Run.deletedList);
					ois.close();
				} catch (IOException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Run.lev.exitedVehicleList.setText(Run.deletedList.toString());
				
				Run.aw.setVisible(false);
				Run.lev.setVisible(true);
			}
		});
		contentPane.add(btnListOfExited);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		contentPane.add(btnGetDetailsBy);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		contentPane.add(btnTreasury);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.aw.setVisible(false);
				Run.ww.setVisible(true);
			}
		});
		contentPane.add(btnBack);
	}

}
