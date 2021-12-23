package com.votingsystem.view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dashboard extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public dashboard() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1354, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton logOut = new JButton("Logout");
		logOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				lp.setVisible(true);
				lp.setLocationRelativeTo(null);
				
				
				dispose();
			}
		});
		logOut.setBackground(SystemColor.textHighlight);
		logOut.setFont(new Font("Tahoma", Font.PLAIN, 27));
		logOut.setBounds(1070, 98, 168, 56);
		contentPane.add(logOut);
		
		JLabel v_result = new JLabel("");
		v_result.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Voting Result");
			}
		});
		v_result.setBounds(158, 243, 155, 143);
		contentPane.add(v_result);
		
		JLabel add_candidate = new JLabel("");
		add_candidate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Add_Candidate");
			}
		});
		add_candidate.setBounds(424, 232, 155, 143);
		contentPane.add(add_candidate);
		
		JLabel issue_notice = new JLabel("");
		issue_notice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Issue Notice");
			}
		});
		issue_notice.setBounds(691, 243, 155, 143);
		contentPane.add(issue_notice);
		
		JLabel updateAbout = new JLabel("");
		updateAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Update About Us");
			}
		});
		updateAbout.setBounds(985, 243, 155, 143);
		contentPane.add(updateAbout);
		
		JLabel Manage_voters = new JLabel("");
		Manage_voters.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Manage Voters");
			}
		});
		Manage_voters.setBounds(158, 432, 155, 143);
		contentPane.add(Manage_voters);
		
		JLabel Manage_ballot = new JLabel("");
		Manage_ballot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Manage Ballot");
			}
		});
		Manage_ballot.setBounds(424, 432, 155, 143);
		contentPane.add(Manage_ballot);
		
		JLabel update_contact = new JLabel("");
		update_contact.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Update Contact");
			}
		});
		update_contact.setBounds(691, 432, 155, 143);
		contentPane.add(update_contact);
		
		JLabel chng_pp = new JLabel("");
		chng_pp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Change password");
			}
		});
		chng_pp.setBounds(985, 432, 155, 143);
		contentPane.add(chng_pp);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\eclipse2021\\VotingSystemAdmin\\Resources\\Images\\AdminPart.jpg"));
		img.setBounds(69, 45, 1211, 641);
		contentPane.add(img);
	}

}
