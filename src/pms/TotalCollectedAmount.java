package pms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TotalCollectedAmount extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel carParked;
	JLabel totalCollected;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TotalCollectedAmount frame = new TotalCollectedAmount();
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
	public TotalCollectedAmount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTotalCarEntered = new JLabel("Total Car Parked :");
		
		JLabel lblTotalCollectedAmount = new JLabel("Total Collected Amount :");
		
		JLabel lblTotalAmountCollected = new JLabel("Total Amount Collected");
		lblTotalAmountCollected.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotalAmountCollected.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Run.tca.setVisible(false);
				Run.aw.setVisible(true);
			}
		});
		
		carParked = new JLabel("");
		carParked.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		totalCollected = new JLabel("");
		totalCollected.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblTotalAmountCollected, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(162)
					.addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
					.addGap(172))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTotalCollectedAmount)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(totalCollected))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTotalCarEntered)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(carParked)))
					.addContainerGap(218, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTotalAmountCollected)
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTotalCarEntered)
						.addComponent(carParked))
					.addGap(47)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTotalCollectedAmount)
						.addComponent(totalCollected))
					.addGap(58)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
