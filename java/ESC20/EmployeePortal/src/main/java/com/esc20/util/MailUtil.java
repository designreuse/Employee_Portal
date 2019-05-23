package com.esc20.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class MailUtil {

	private static final String serverHost = "smtp.163.com";

	private static final Integer serverPort = 25;

	private static final String fromAddress = "employeeaccess@txeis.net";
	
	public static void sendEmail(String to, String subject, String content) throws MessagingException{
		Properties props = new Properties();
		props.put("mail.smtp.host", serverHost);
		props.put("mail.smtp.port", serverPort);
		props.put("mail.smtp.auth", "false");
		Session session = Session.getDefaultInstance(props, null);
		MimeMessage message = new MimeMessage(session);
		message.setSubject(subject);
		message.setContent(content,"text/html;charset=UTF-8");
		message.setFrom(new InternetAddress(fromAddress));
		message.setRecipients(Message.RecipientType.TO, to);
		Transport.send(message);
	}
	
}
