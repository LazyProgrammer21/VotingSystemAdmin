package com.votingsystem.view;



import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;

public class manageVoters extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manageVoters frame = new manageVoters();
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
	public manageVoters() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(154, 82, 204, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setBounds(368, 82, 74, 40);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(28, 161, 469, 391);
		contentPane.add(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(520, 161, 403, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Image");
		lblNewLabel.setBounds(170, 11, 99, 77);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(47, 149, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("VoterId");
		lblNewLabel_1_1.setBounds(47, 181, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("phone number");
		lblNewLabel_1_1_1.setBounds(47, 209, 99, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Citizenship number");
		lblNewLabel_1_1_1_1.setBounds(47, 249, 99, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(110, 340, 89, 23);
		panel.add(btnNewButton_1);
	}
}
