package sentmail;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class TestGmail {
//	https://myaccount.google.com/u/1/lesssecureapps?pli=1&rapt=AEjHL4OG8ZNyEv8iPQgAEnZlEFd6kMcjpMYN19aisdm6rCh4HgOGSAuOm7TQi4Pa-UCRHickrtB9fBMQTVu_P_rAyPJvIx4XPw
//	https://accounts.google.com/b/0/DisplayUnlockCaptcha
	

		 
		 public  void Send(String toEmail, String e) throws IOException {
			 
		  String to = ""; // to address. It can be any like gmail, hotmail etc.
//		  Strin
		  final String from = "tamang.subash36@gmail.com"; // from address. As this is using Gmail SMTP.
		  final String password = "abcde12345abcde"; // password for from mail address. 
		 
		  Properties prop = new Properties();
		  prop.put("mail.smtp.host", "smtp.gmail.com");
		  prop.put("mail.smtp.port", "465");
		  prop.put("mail.smtp.auth", "true");
		  prop.put("mail.smtp.socketFactory.port", "465");
		  prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		 
		  Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
		   protected PasswordAuthentication getPasswordAuthentication() {
		    return new PasswordAuthentication(from, password);
		   }
		  });
		 
		  try {
		 
		   Message message = new MimeMessage(session);
		   message.setFrom(new InternetAddress(from));
		   message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		   message.setSubject("Admin Key!!");
		    
		   String msg = "Your Admin Key is";
		    
		   MimeBodyPart mimeBodyPart = new MimeBodyPart();
		   mimeBodyPart.setContent(msg, "text/html");
		     
		   Multipart multipart = new MimeMultipart();
		   multipart.addBodyPart(mimeBodyPart);
		    
//		   MimeBodyPart attachmentBodyPart = new MimeBodyPart();
//		   attachmentBodyPart.attachFile(new File("D:/eclipse2021/VotingSystemAdmin/Resources/Images/AdminPart.jpg"));
//		   multipart.addBodyPart(attachmentBodyPart);
		   
		   
		   message.setContent(multipart);
		 
		   Transport.send(message);
		 
		JOptionPane.showMessageDialog(null, "Message sent successfully");
		 
		  } catch (MessagingException e1) {
		   e1.printStackTrace();
		  }
		 }
		 public static void main(String[] args) {
			TestGmail t = new TestGmail();
			t.gen();
			System.out.println(t.gen());
		}
		 public int gen() {
			    Random r = new Random( System.currentTimeMillis() );
			    return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
			}
		
			
}
