/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.mail.internet.AddressException;

/**
 *
 * @author hutch
 */
public class Mailing {
    
    
    
    public Mailing(String send, String subject, File me){

        String to = "hutchings2011@hotmail.com";
        String from = "hutchings2011@hotmail.com";
 
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
 
        String msgBody = "hello";
 
        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from, "fv"));
            msg.addRecipient(Message.RecipientType.TO,
                             new InternetAddress(to, "fde"));
            msg.setSubject("hello");
            msg.setText(msgBody);
            Transport.send(msg);
            System.out.println("Email sent successfully...&quot");
 
        } catch (AddressException e) {
            throw new RuntimeException(e);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Mailing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
