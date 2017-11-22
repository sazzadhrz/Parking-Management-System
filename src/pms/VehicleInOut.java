package pms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VehicleInOut extends JFrame {

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
					VehicleInOut frame = new VehicleInOut();
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
	public VehicleInOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(7, 1, 30, 0));
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JButton btnVehicleIn = new JButton("Vehicle IN");
		btnVehicleIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.vio.setVisible(false);
				Run.vd.setVisible(true);
			}
		});
		contentPane.add(btnVehicleIn);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JButton btnVehicleOut = new JButton("Vehicle OUT");
		btnVehicleOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.vio.setVisible(false);
				Run.vo.setVisible(true);
			}
		});
		contentPane.add(btnVehicleOut);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.vio.setVisible(false);
				Run.ww.setVisible(true);
			}
		});
		contentPane.add(btnBack);
	}

}
