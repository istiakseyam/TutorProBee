/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


public class Mailer {
    public static void send(String from,String password,String to,String sub,String msg){  
              //Get properties object    
              Properties props = new Properties();    
              props.put("mail.smtp.auth","true");    
              //props.put("mail.smtp.socketFactory.port", "465");    
             /* props.put("mail.smtp.socketFactory.class",    
                        "javax.net.ssl.SSLSocketFactory"); */   
              props.put("mail.smtp.starttls.enable", "true");    
              props.put("mail.smtp.host", "smtp.gmail.com");  
              props.put("mail.smtp.port", "587");
              //get Session   
              // System.out.printf("2\n");
              Session session = Session.getDefaultInstance(props,    
               new javax.mail.Authenticator() {    
               @Override
               protected PasswordAuthentication getPasswordAuthentication() {    
               return new PasswordAuthentication(from,password);  
               }    
              });    
               //System.out.printf("3\n");
              //compose message    
              try {    
               Message message = new MimeMessage(session);
               //message.addFrom();
               message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
               message.setSubject(sub);    
               message.setText(msg);    
               // System.out.printf("4\n");
               //send message  
               Transport.send(message);
                //System.out.printf("5\n");
               JOptionPane.showMessageDialog(null, "mail sent");
               System.out.println("message sent successfully");    
              } catch (MessagingException e) {throw new RuntimeException(e);}    
                 
        }  
    }  
    /*public class SendMailSSL{    
     public static void main(String[] args) {    
         //from,password,to,subject,message  
         Mailer.send("tutorprobee@gmail.com","Apple12@bee","mustansir.tanmoy@northsouth.edu","hello tanmoy \nfrom tutorprobe","you have request...");  
         //change from, password and to  
     }    
    }*/    

