package com.votingsystem.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.votingsystem.service.adminService;
import com.votingsystem.service.adminServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class f__pp1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField new_pass;
	private JPasswordField c_pass;
	
	
	
	 private String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					f__pp1 frame = new f__pp1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public f__pp1(String email) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 478, 408);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel new_pp = new JLabel("New Password");
		new_pp.setBounds(23, 204, 159, 28);
		panel.add(new_pp);
		new_pp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel c_pp = new JLabel("Confirm Password");
		c_pp.setBounds(23, 268, 159, 28);
		panel.add(c_pp);
		c_pp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel rule1 = new JLabel("Must have at least one numeric character\r\n");
		rule1.setBounds(66, 11, 306, 28);
		panel.add(rule1);
		rule1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel rule2 = new JLabel("Must have at least one lowercase character");
		rule2.setBounds(66, 35, 306, 38);
		panel.add(rule2);
		rule2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel rule3 = new JLabel("Must have at least one uppercase character");
		rule3.setBounds(66, 66, 306, 38);
		panel.add(rule3);
		rule3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel rule4 = new JLabel("Must have at least one special symbol among @#$%");
		rule4.setBounds(66, 99, 368, 38);
		panel.add(rule4);
		rule4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel rule5 = new JLabel("Password length should be between 8 and 20");
		rule5.setBounds(66, 133, 306, 38);
		panel.add(rule5);
		rule5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		new_pass = new JPasswordField();
		new_pass.setBounds(192, 204, 242, 28);
		panel.add(new_pass);
		new_pass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		c_pass = new JPasswordField();
		c_pass.setBounds(192, 271, 242, 28);
		panel.add(c_pass);
		c_pass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton chngpp = new JButton("Submit");
		chngpp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String newpass = new_pass.getText();
				String cpass = c_pass.getText();
				
				if(newpass.equals(cpass)) {
					
					if (isValidPassword(newpass,regex )) {
						adminService service = new adminServiceImpl();
						service.change_pp(email, newpass);
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Password!");
					}
				}
				
				
				
			}
		});
		chngpp.setBounds(246, 310, 89, 23);
		panel.add(chngpp);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(345, 312, 89, 23);
		panel.add(btnCancel);
	}
	
	public boolean isValidPassword(String password,String regex) {
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
		
		
	}
}
