/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projekt_JTP.com.email;

/**
 *
 * @author Bartek
 */
import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import java.awt.event.MouseEvent;

public class SendEmail {
    /**
     * initialize variables for your Gmail account like:
     * user and password
     * from this account your emails will be sent
     */
	private String user = "javaclientapp";
        /**
       initialize variables for your Gmail account like:
     * user and password
     * from this account your emails will be sent
         */
	private String pass = "qaz123WSX";
        String attachement;
        EmailMainGui EMG = new EmailMainGui();
        

        /**
         * Inside constructor we are
         * using smtp protocol for sending emails with default port 
         * The properties are set here
         * @param to
         * @param sub
         * @param msg 
         */
	SendEmail(String to, String sub, String msg){
		Properties prop = new Properties();
		prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	    prop.put("mail.smtp.auth", true);
	    prop.put("mail.smtp.starttls.enable", true);
	    prop.put("mail.smtp.host", "smtp.gmail.com");
	    prop.put("mail.smtp.port", "587");
	    
	    Session session = Session.getInstance(prop, new javax.mail.Authenticator(){
	    	@Override
	    	protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
	    	return new javax.mail.PasswordAuthentication(user, pass);
	    }
	    
	});
            /**
             * try catch block that will use java.mail.jar library
             * to get access for sending email
             * It uses Mime that defines the data type while transferring data across the internet
             * inside this block we define whole functionality of our application:
             * attaching file and sending data to another gmail account
             */
    try{
    	Message message = new MimeMessage(session);
    	message.setFrom(new InternetAddress("no-reply@gmail.com"));
    	message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
    	message.setSubject(sub);
        
    	//message.setText(msg);
     
    	MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(msg);
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        
        messageBodyPart = new MimeBodyPart();


        String attachment = "C:\\Users\\Bartek\\Documents\\test.txt";
		//JFileChooser chooser = new JFileChooser();
		//chooser.showOpenDialog(null);
		//File f = chooser.getSelectedFile();
		//attachment = f.getAbsolutePath();


		//String attachment = EMG.AttachMouseReleased();
        javax.activation.DataSource source = new FileDataSource(attachment);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(attachment);
        multipart.addBodyPart(messageBodyPart);
        message.setContent(multipart);
        
        
    	Transport.send(message);
    	
    	System.out.println("Wyslano maila");
    }
	
	catch(Exception e){
		System.out.println(e);
	}
	
	}
        
}