package sample1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculation extends JFrame {
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculation frame = new Calculation();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	


	/**
	 * Create the frame.
	 */
	public Calculation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Homeb.jpg"));
		btnNewButton.setIcon(img);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				
				dispose();
			initComponents();	

			}
		});
		
			
		 

		JButton btnNewButton_1 = new JButton("");
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/info.jpg"));
		btnNewButton_1.setIcon(img1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmpInfo frame = new EmpInfo();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.DataTable();
				dispose();
			}
		});
		
		
		
		JButton btnNewButton_2 = new JButton("");
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/deductions.jpg"));
		btnNewButton_2.setIcon(img4);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salary frame = new Salary();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		JButton btnNewButton_2_1 = new JButton("");
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/calculations.jpg"));
		btnNewButton_2_1.setIcon(img5);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_2_1_1 = new JButton("");
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/signout.jpg"));
		btnNewButton_2_1_1.setIcon(img6);
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front frame = new Front();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_2_1_1.setBounds(0, 399, 261, 70);
		contentPane.add(btnNewButton_2_1_1);
		btnNewButton_2_1.setBounds(0, 326, 261, 70);
		contentPane.add(btnNewButton_2_1);
		btnNewButton_2.setBounds(0, 254, 261, 70);
		contentPane.add(btnNewButton_2);
		btnNewButton_1.setBounds(0, 182, 261, 70);
		contentPane.add(btnNewButton_1);
		btnNewButton.setBounds(0, 110, 261, 70);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Homebackground.jpg"));
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setIcon(img3);
		lblNewLabel.setBounds(0, 0, 1264, 681);
		contentPane.add(lblNewLabel);
	}

	protected void initComponents() {
		// TODO Auto-generated method stub
		
	}
}

