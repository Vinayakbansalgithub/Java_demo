package SelFrDemo;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail
{
   public static void main(String [] args)
   {    

      String to = "vinayak.bansal@puresoftware.com";
      String from = "vinayak.bansal@puresoftware.com";
     
      
  	// Assuming you are sending email through Mail
		String host = "smtp.gmail.com";

		Properties props = new Properties();
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.socketFactory.port", "587");
	 //   props.put("mail.smtp.socketFactory.class",
	 //           "javax.net.ssl.SSLSocketFactory");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "587");
      
      
     
		// Get the Session object.
				Session session = Session.getInstance(props,
						new javax.mail.Authenticator() {
							protected PasswordAuthentication getPasswordAuthentication() {
								return new PasswordAuthentication("vinayak.bansal@puresoftware.com","ajaybansal");
							}
						});
      try{
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));
         message.setSubject("This is the Subject Line!");
         message.setText("This is actual message jdhhwsghlktsulhtwe;htpuw");
         
         
         String filename = "D:/hello.txt";//change accordingly  
         DataSource source = new FileDataSource(filename);  
         message.setDataHandler(new DataHandler(source));  
         message.setFileName(filename);  
         
         
        
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}