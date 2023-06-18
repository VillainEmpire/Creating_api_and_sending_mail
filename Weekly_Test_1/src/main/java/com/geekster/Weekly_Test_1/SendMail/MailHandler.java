package com.geekster.Weekly_Test_1.SendMail;

import com.geekster.Weekly_Test_1.Entity.Student;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class MailHandler {

    public void sendMail(Student s1) {

        Properties sysProperties = System.getProperties();

        sysProperties.put(MailConstantData.Host, MailConstantData.HostServer);
        sysProperties.put(MailConstantData.PortName, MailConstantData.port);
        sysProperties.put(MailConstantData.sslProperty, "true");
        sysProperties.put(MailConstantData.authParam, "true");

        Authenticator mailAuthenticator = new CustomizedMailAuthentication();

        Session mailSession = Session.getInstance(sysProperties,mailAuthenticator);

        MimeMessage mailMessage = new MimeMessage(mailSession);

        try {
            mailMessage.setFrom(MailConstantData.SenderEmail);
            mailMessage.setSubject("This mail is for testing purpose");

            mailMessage.setText(s1.toString());
            Address reciever = new InternetAddress(MailConstantData.recieverEmail);

            mailMessage.setRecipient(Message.RecipientType.TO, reciever);

            Transport.send(mailMessage);
        }
        catch (Exception mailException) {
            System.out.println(mailException.toString());
        }



    }
}
