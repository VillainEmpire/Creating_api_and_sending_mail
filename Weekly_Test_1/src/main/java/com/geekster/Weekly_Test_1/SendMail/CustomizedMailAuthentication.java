package com.geekster.Weekly_Test_1.SendMail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomizedMailAuthentication extends Authenticator {

    protected PasswordAuthentication getPasswordAuthentication() {

        return new PasswordAuthentication(MailConstantData.SenderEmail,MailConstantData.Password);
    }


}
