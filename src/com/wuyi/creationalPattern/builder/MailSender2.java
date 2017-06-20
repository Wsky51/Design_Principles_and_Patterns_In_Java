package com.wuyi.creationalPattern.builder;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created on 2017/6/12
 *
 * @author WuYi
 */
public class MailSender2 {
    private static MimeMessage message;

    public static void main(String[] args) {
        String stmpHost="smtp.qq.com";
        String from="1482675166@qq.com";
        String to="3394337119@qq.com";
        Properties props=new Properties();
        props.put("mail.smtp.host",stmpHost);
        Session session=Session.getDefaultInstance(props,null);
        try {
            InternetAddress[] addresses={new InternetAddress(to)};
            message=new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,addresses);
            message.setSubject("Hello from wuyi");
            message.setSentDate(new Date());
            message.setText("Hello ,how are you");
            Transport.send(message);
            System.out.println("结束");
        } catch (AddressException e) {
            e.printStackTrace();
        }
        catch (MessagingException e){
            e.printStackTrace();
        }

    }



}
