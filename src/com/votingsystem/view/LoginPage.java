package com.votingsystem.view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class LoginPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user_name;
	private JPasswordField user_password;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public LoginPage() {
	
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user_name = new JTextField();
		user_name.setFont(new Font("Tahoma", Font.BOLD, 15));
		user_name.setBounds(286, 261, 238, 44);
		contentPane.add(user_name);
		user_name.setColumns(10);
		
		user_password = new JPasswordField();
		user_password.setFont(new Font("Tahoma", Font.BOLD, 15));
		user_password.setBounds(286, 326, 238, 44);
		contentPane.add(user_password);
		
		JLabel forget_pp = new JLabel("");
		forget_pp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				F_pp obj = new F_pp();
				obj.setUndecorated(true);
				obj.setVisible(true);
				obj.setLocationRelativeTo(null);
			
				
				
			}
		});
		forget_pp.setBounds(375, 372, 161, 31);
		contentPane.add(forget_pp);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(SystemColor.textHighlight);
		btnExit.setBounds(545, 11, 57, 23);
		contentPane.add(btnExit);
		
		JLabel Login_btn = new JLabel("");
		Login_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				LoginPage lp = new LoginPage();
				dashboard board = new dashboard();
				lp.setVisible(false);
				dispose();
				
		
				board.setVisible(true);
				board.setLocationRelativeTo(null);
				
			}
		});
		Login_btn.setBounds(272, 419, 137, 65);
		contentPane.add(Login_btn);
		
		
		JLabel bg_img = new JLabel("");
		bg_img.setIcon(new ImageIcon("D:\\eclipse2021\\VotingSystemAdmin\\Resources\\Images\\login.jpg"));
		bg_img.setBounds(0, 0, 612, 570);
		contentPane.add(bg_img);
	}
}
