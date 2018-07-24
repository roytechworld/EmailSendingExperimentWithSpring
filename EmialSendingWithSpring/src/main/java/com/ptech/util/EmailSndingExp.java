package com.ptech.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSndingExp {
	
	public void paymentCompletionToClient(String emailaddress,String invoicenumber,String url,String amountpaid,String amountdue)
	{
		
		/* sin3.hostdime.in ,465 
		   info@logicocean.com
		
		 * */
		emailaddress="pradipto.logicocean@gmail.com";
		boolean result=false;
		
		
//		loginid : ariy9.2017@gmail.com
//		pass: logicocean12345
		
		
		
//		final String username = "infact.locean@gmail.com";
//		final String password = "infact@_12345";
		
		final String username = "ariy9.2017@gmail.com";
		final String password = "locean12345";
		
		Properties props = new Properties();
		props.put("mail.smtp.user","ariy9.2017@gmail.com"); 
		props.put("mail.smtp.host", "smtp.gmail.com"); 
		props.put("mail.smtp.port", "465"); 
		props.put("mail.debug", "true"); 
		props.put("mail.smtp.auth", "true"); 
		props.put("mail.smtp.starttls.enable","true"); 
		props.put("mail.smtp.EnableSSL.enable","true");
		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
		props.setProperty("mail.smtp.socketFactory.fallback", "false");   
		props.setProperty("mail.smtp.port", "465");   
		props.setProperty("mail.smtp.socketFactory.port", "465"); 

		javax.mail.Session session = javax.mail.Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("ariy9.2017@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(emailaddress));
			message.setSubject(" Your Invoice Details of Invoice Number : " +invoicenumber);
		    message.setContent(
		  
		    "<h1>Email sending exp ...  </h1>",
		    "text/html");
		
			  Transport.send(message);
				
	        result=true;
			System.out.println("Done");

		} catch (MessagingException e) {
			System.out.println("Exception found ..."+e);
			throw new RuntimeException(e);
		}
		
	}
	
	public static void main(String[] args)
	{
		EmailSndingExp ep=new EmailSndingExp();
		ep.paymentCompletionToClient("pradipto.logicocean@gmail.com", "INV0001", "", "200","0.0");
	}

	
	
	public static void checkmail(String fromemailaddress,String tomailaddress,String msg)
	{
		
		/* sin3.hostdime.in ,465 
		   info@logicocean.com
		
		 * */
		String emailaddress=fromemailaddress;
		boolean result=false;
		
		final String username = "infact.locean@gmail.com";
		final String password = "pradipto@_1986";
		
//		final String username = "test@logicocean.com";
//		final String password = "4infacttest123";
		
		Properties props = new Properties();
		props.put("mail.smtp.user","Infact Team"); 
//		props.put("mail.smtp.host", "sin3.hostdime.in"); 
		
		props.put("mail.smtp.host", "smtp.yahoo.com"); 
		
		
		props.put("mail.smtp.port", "25"); 
		props.put("mail.debug", "true"); 
		props.put("mail.smtp.auth", "true"); 
		props.put("mail.smtp.starttls.enable","true"); 
		props.put("mail.smtp.EnableSSL.enable","true");
		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
		props.setProperty("mail.smtp.socketFactory.fallback", "false");   
		props.setProperty("mail.smtp.port", "587");   
		props.setProperty("mail.smtp.socketFactory.port", "465"); 

		javax.mail.Session session = javax.mail.Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("test@logicocean.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(tomailaddress));
			message.setSubject(" Test Mail ");
		    message.setContent(
		  
		    "<h1>Email sending exp ...  </h1>",
		    "text/html");
		
			  Transport.send(message);
				
	        result=true;
			System.out.println("Done");

		} catch (MessagingException e) {
			System.out.println("Exception found ..."+e);
			throw new RuntimeException(e);
		}
		
	}
	
	
	
	
	public static  boolean sendcontact(String emailaddress,String subject,String messages)
	{
		
		/* sin3.hostdime.in ,465 
		   info@logicocean.com
		
		 * */

		boolean result=false;
		
		
//		loginid : ariy9.2017@gmail.com
//		pass: logicocean12345
		
		
		
//		final String username = "infact.locean@gmail.com";
//		final String password = "infact@_12345";
		
		final String username = "ariy9.2017@gmail.com";
		final String password = "logicocean12345";
		
		Properties props = new Properties();
		props.put("mail.smtp.user","Infact Team"); 
		props.put("mail.smtp.host", "smtp.gmail.com"); 
		props.put("mail.smtp.port", "25"); 
		props.put("mail.debug", "true"); 
		props.put("mail.smtp.auth", "true"); 
		props.put("mail.smtp.starttls.enable","true"); 
		props.put("mail.smtp.EnableSSL.enable","true");
		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
		props.setProperty("mail.smtp.socketFactory.fallback", "false");   
		props.setProperty("mail.smtp.port", "465");   
		props.setProperty("mail.smtp.socketFactory.port", "465"); 

		javax.mail.Session session = javax.mail.Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("ariy9.2017@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(emailaddress));
			message.setSubject(subject);
		    message.setContent(
		  
		    "<h1> Your Message are as following : </h1><br/>"+messages+"<br/> ",
		    "text/html");
		
			  Transport.send(message);
				
	        result=true;
			System.out.println("Done");

		} catch (MessagingException e) {
			System.out.println("Exception found ..."+e);
			throw new RuntimeException(e);
		}
		
		return true;
		
	}
	
	
	
}
