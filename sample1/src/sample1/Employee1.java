package sample1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class Employee1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee1 frame = new Employee1();
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
	public Employee1() {
		setTitle("Payroll Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign in your account here:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(217, 224, 296, 57);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(217, 306, 296, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBackground(SystemColor.text);
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setBounds(217, 356, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setBounds(217, 446, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(217, 397, 296, 45);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("Sign in");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
	
			Home hm = new Home();
				hm.setVisible(true);
				this.setVisible(true);
				this.setVisible(false);
				hm.setLocationRelativeTo(null);
				 dispose();
				
		
		 		
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(307, 489, 116, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/login.jpg"));
		lblNewLabel_3.setIcon(img);
		lblNewLabel_3.setBounds(0, 0, 1264, 681);
		contentPane.add(lblNewLabel_3);
	}
}
