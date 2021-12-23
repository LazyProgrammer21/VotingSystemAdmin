package sentmail;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class printDocument extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JTextField Citizenshipnumber;
	private JTextField VoterID;
	private JTextField Phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					printDocument frame = new printDocument();
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
	public printDocument() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 676);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PaneltoPrint = new JPanel();
		PaneltoPrint.setBounds(0, 0, 851, 605);
		contentPane.add(PaneltoPrint);
		PaneltoPrint.setLayout(null);
		
		Name = new JTextField();
		Name.setBounds(336, 275, 209, 36);
		PaneltoPrint.add(Name);
		Name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Name.setColumns(10);
		
		Citizenshipnumber = new JTextField();
		Citizenshipnumber.setBounds(336, 322, 212, 36);
		PaneltoPrint.add(Citizenshipnumber);
		Citizenshipnumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Citizenshipnumber.setColumns(10);
		
		VoterID = new JTextField();
		VoterID.setBounds(336, 369, 212, 36);
		PaneltoPrint.add(VoterID);
		VoterID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		VoterID.setColumns(10);
		
		Phone = new JTextField();
		Phone.setBounds(336, 416, 212, 36);
		PaneltoPrint.add(Phone);
		Phone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Phone.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 851, 605);
		PaneltoPrint.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse2021\\VotingSystemAdmin\\Resources\\Images\\VoterCard.jpg"));
		
		JButton print_btn = new JButton("Print");
		print_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				printRecord(PaneltoPrint);
				
			}
		});
		print_btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		print_btn.setBounds(353, 616, 78, 21);
		contentPane.add(print_btn);
	}
	
	//method to print
	public void printRecord(JPanel paneltoprint) {
		

			//create printer/job here
			PrinterJob printerjob= PrinterJob.getPrinterJob();
			//set printer job name
			printerjob.setJobName("Print Record");
			//set Printable
			printerjob.setPrintable(new Printable() {

				@Override
				public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
				
					if(pageIndex>0) {
						return Printable.NO_SUCH_PAGE;
					}
					//Make 2D graphics to map content
					Graphics graphics2D =(Graphics)graphics;
					//set graphic translation
					graphics2D.translate((int) pageFormat.getImageableX()*2,(int)pageFormat.getImageableY()*2);
					//set scale
					//graphics2D.setClip(pageIndex, pageIndex, pageIndex, pageIndex));
					//paints the panel
					contentPane.paint(graphics2D);
					return Printable.PAGE_EXISTS;
				}});
			//stores print dialouge
			boolean returningResult =printerjob.printDialog();
					//dialog showing
				if(returningResult) {
					try {
						printerjob.print();
					}
					catch(PrinterException printerException) {
						JOptionPane.showMessageDialog(this, "Print error:"+printerException.getMessage());
					}
				};
		
	}
	
}
