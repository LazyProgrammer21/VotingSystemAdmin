package com.votingsystem.view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.commons.lang3.math.NumberUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class F_pp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField adminKey;


	/**
	 * Create the frame.
	 */
	public F_pp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 456);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(62, 37, 434, 316);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Admin Key");
		lblNewLabel.setBounds(13, 101, 186, 77);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		adminKey = new JTextField();
		adminKey.setBounds(209, 122, 225, 38);
		panel.add(adminKey);
		adminKey.setBackground(Color.WHITE);
		adminKey.setFont(new Font("Tahoma", Font.PLAIN, 16));
		adminKey.setColumns(10);
		
		JLabel lblOr = new JLabel("Or");
		lblOr.setBounds(196, 164, 46, 77);
		panel.add(lblOr);
		lblOr.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblGetAdminCode = new JLabel("Get Admin Key via Admin Mail.");
		lblGetAdminCode.setBounds(43, 218, 307, 77);
		panel.add(lblGetAdminCode);
		lblGetAdminCode.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
//				lblGetAdminCode.setForeground("#0000ff");
			}
		});
		lblGetAdminCode.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JButton get_admin_key_mail = new JButton("Get Key");
		get_admin_key_mail.setBounds(345, 249, 89, 23);
		panel.add(get_admin_key_mail);
		get_admin_key_mail.setBackground(Color.ORANGE);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.setBounds(190, 293, 89, 23);
		panel.add(Cancel);
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		Cancel.setBackground(Color.ORANGE);
		
		JLabel lblEnterAdminKey = new JLabel("Enter Admin Key to Change Password");
		lblEnterAdminKey.setBounds(31, 32, 371, 46);
		panel.add(lblEnterAdminKey);
		lblEnterAdminKey.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(345, 164, 89, 23);
		panel.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(NumberUtils.isParsable(adminKey.getText())) {
				String email = JOptionPane.showInputDialog("Please Enter admin Email to proceed...");
				f__pp1 obj1 = new f__pp1(email);
				obj1.setUndecorated(true);
				obj1.setVisible(true);
				obj1.setLocationRelativeTo(null);
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Please enter a valid Key");
				adminKey.setText("");
			}
			
				
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBackground(Color.ORANGE);
	}
}
