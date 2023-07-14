package sample1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class EmpInfo extends JFrame {
	
	
	private JPanel contentPane;
	private static JTable data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					EmpInfo frame = new EmpInfo();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.DataTable();
		        
		       } catch(Exception e2) {
		        System.out.println(e2);
		        
		    }
				
					
			}
			
		});
	}
	


	/**
	 * Create the frame.
	 */
	public EmpInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(0, 110, 261, 70);
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
		btnNewButton_1.setBounds(0, 182, 261, 70);
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/info.jpg"));
		btnNewButton_1.setIcon(img1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					 try {
						 EmpInfo frame = new EmpInfo();
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
							frame.DataTable();
		
				          
				          
				            

				        } catch (Exception e2) {
				            System.out.println(e2);
				            
				        }
					

				
			}
		});
		
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(0, 254, 261, 70);
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
		btnNewButton_2_1.setBounds(0, 326, 261, 70);
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/calculations.jpg"));
		btnNewButton_2_1.setIcon(img5);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculation frame = new Calculation();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		JButton btnNewButton_2_1_1 = new JButton("");
		btnNewButton_2_1_1.setBounds(0, 399, 261, 70);
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
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(353, 91, 863, 528);
		contentPane.add(scrollPane);
		
		data = new JTable();
		scrollPane.setViewportView(data);
		contentPane.add(btnNewButton_2_1_1);
		contentPane.add(btnNewButton_2_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1264, 681);
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Homebackground.jpg"));
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setIcon(img3);
		contentPane.add(lblNewLabel);
	}

	protected void initComponents() {
		// TODO Auto-generated method stub
		
	}

	public void DataTable(){
        String url = "jdbc:mysql://localhost:3306/sample";
        String username = "root";
        String password = "leviackerman@321";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            java.sql.Statement stmt = con.createStatement();
            String query = "SELECT * FROM hosp";
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = new DefaultTableModel();

            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++)
                colName[i] = rsmd.getColumnName(i + 1);
            model.setColumnIdentifiers(colName);

            String hospcode, Hospname, Level, Address;
            while (rs.next()) {
                hospcode = rs.getString(1);
                Hospname = rs.getString(2);
                Level = rs.getString(3);
                Address = rs.getString(4);
                String[] row = { hospcode, Hospname, Level, Address };
                model.addRow(row);
            }

            data.setModel(model);
            stmt.close();
            con.close();

        } catch (SQLException e2) {
            System.out.println(e2);
        }
    }

		
	

	




		
	}


