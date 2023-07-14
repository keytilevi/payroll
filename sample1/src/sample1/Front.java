package sample1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JInternalFrame;

public class Front extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front frame = new Front();
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
	public Front() {
		setTitle("Payroll Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>PayTracker, a payroll management system, is a cutting-edge software that revolutionizes how businesses handle their payroll operations. Our intuitive platform automates payroll calculations, tax deductions, and employee benefits, taking the hassle out of manual processing. By leveraging the power of technology, we empower businesses to enhance accuracy, streamline workflows, and focus on what matters most: their core operations.");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblNewLabel.setBounds(81, 183, 764, 116);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME!");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Britannic Bold", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(81, 116, 313, 81);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Employee");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin frame = new Admin();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		btnNewButton.setBounds(101, 428, 216, 52);
		contentPane.add(btnNewButton);
		
		JButton btnEmployee = new JButton("Admin");
		btnEmployee.setBackground(SystemColor.inactiveCaption);
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Employee1 frame = new Employee1();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				
			
				dispose();
				
				
				
				
				
				
			}
		});
		btnEmployee.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		btnEmployee.setBounds(375, 428, 214, 52);
		contentPane.add(btnEmployee);
		
		JLabel lblNewLabel_3 = new JLabel("I am an...");
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 29));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(101, 324, 155, 52);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(SystemColor.desktop);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/front.jpg"));
		lblNewLabel_2.setIcon(img);
		lblNewLabel_2.setBounds(0, 0, 1264, 681);
		contentPane.add(lblNewLabel_2);
	}
}
