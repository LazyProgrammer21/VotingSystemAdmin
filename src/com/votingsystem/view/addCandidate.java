package com.votingsystem.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.votingsystem.service.adminService;
import com.votingsystem.service.adminServiceImpl;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addCandidate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField candidate_name;
	adminService as = new adminServiceImpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCandidate frame = new addCandidate();
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
	public addCandidate() {
		setUndecorated(true);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 384);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(116, 97, 46, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPosition.setBounds(116, 135, 65, 36);
		contentPane.add(lblPosition);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblState.setBounds(116, 182, 76, 36);
		contentPane.add(lblState);
		
		JLabel lblParty = new JLabel("Party");
		lblParty.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblParty.setBounds(116, 229, 46, 36);
		contentPane.add(lblParty);
		
		candidate_name = new JTextField();
		candidate_name.setBounds(233, 97, 182, 30);
		contentPane.add(candidate_name);
		candidate_name.setColumns(10);
		
		JComboBox<String> position = new JComboBox<String>();
		as.getPositiononly(position);
		position.setBounds(233, 140, 182, 30);
		contentPane.add(position);
		
		JComboBox<String> state = new JComboBox<String>();
		as.getState(state);
		state.setBounds(233, 182, 182, 30);
		
		contentPane.add(state);
		
		JComboBox<String> Party = new JComboBox<String>();
		as.getpartyName(Party);
		Party.setBounds(233, 234, 182, 30);
		contentPane.add(Party);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(211, 290, 65, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(283, 290, 90, 23);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("Add Candidate");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(184, 63, 140, 23);
		contentPane.add(lblNewLabel_1);
	}
}
