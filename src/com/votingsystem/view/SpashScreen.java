package com.votingsystem.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.Color;

public class SpashScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JProgressBar progressBar;
	private static JLabel Loadingtext;
	private static JLabel loadingpercent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		SpashScreen frame = new SpashScreen();
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setUndecorated(true);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		try {
			for(int i=0; i<=100;i++) {
				Thread.sleep(3);
				frame.progressBar.setValue(i);
				SpashScreen.loadingpercent.setText(String.valueOf(i)+ "%");
				
				if(i==10) {
					Loadingtext.setText("Turning on modules......");
				}
				if(i==20) {
					Loadingtext.setText("Loading on modules......");
				}
				if(i==50) {
					Loadingtext.setText("Connecting to Database......");
				}
				if(i==70) {
					Loadingtext.setText("Connection Succesful......!!");
				}
				if(i==80) {
					Loadingtext.setText("Launching Application......");
				}
				if(i==100) {
					frame.setVisible(false);
					frame.dispose();
					
				}
			
				
				
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		LoginPage frame1 = new LoginPage();
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public SpashScreen() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1526, 783);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(47, 79, 79));
		progressBar.setBounds(10, 708, 1500, 25);
		contentPane.add(progressBar);
		
		Loadingtext = new JLabel("Loading........");
		Loadingtext.setForeground(new Color(139, 0, 139));
		Loadingtext.setFont(new Font("Tahoma", Font.PLAIN, 29));
		Loadingtext.setBounds(10, 662, 706, 35);
		contentPane.add(Loadingtext);
		
		loadingpercent = new JLabel("0 %");
		loadingpercent.setForeground(new Color(139, 0, 139));
		loadingpercent.setFont(new Font("Tahoma", Font.PLAIN, 29));
		loadingpercent.setBounds(1399, 662, 111, 35);
		contentPane.add(loadingpercent);
		
		JLabel bg_img = new JLabel("");
		bg_img.setIcon(new ImageIcon("D:\\eclipse2021\\VotingSystemAdmin\\Resources\\Images\\bg_img.gif"));
		bg_img.setBounds(0, 0, 1526, 762);
		contentPane.add(bg_img);
	}
	 
}
