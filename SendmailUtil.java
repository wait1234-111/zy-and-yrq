package aaa;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
public class SendmailUtil {    
        public static void main(String[] args) throws AddressException, MessagingException {       
  Properties properties = new Properties();
  properties.put("mail.transport.protocol", "smtp");// 连接协议        
  properties.put("mail.smtp.host", "smtp.qq.com");// 主机名        
  properties.put("mail.smtp.port", 465);// 端口号        
  properties.put("mail.smtp.auth", "true");        
  properties.put("mail.smtp.ssl.enable", "true");//设置是否使用ssl安全连接  ---一般都使用        
  properties.put("mail.debug", "true");//设置是否显示debug信息  true 会在控制台显示相关信息        
//得到回话对象        
Session session = Session.getInstance(properties);        
// 获取邮件对象        
Message message = new MimeMessage(session);        
//设置发件人邮箱地址       
 message.setFrom(new InternetAddress("2712180839@qq.com"));       
 //设置收件人地址        
 message.setRecipients( RecipientType.TO,new InternetAddress[] 
		 { new InternetAddress("1063769427@qq.com") });       
 //设置邮件标题        
message.setSubject("西北师范大学疫情填报系统");        
//设置邮件内容        
message.setText("温馨提示：您好，每日疫情填报的截止时间为十点前，目前已接近 填报截止时间，请您尽快填报提交");       
 //得到邮差对象        
Transport transport = session.getTransport();        
//连接自己的邮箱账户        
transport.connect("2712180839@qq.com", "qqsjkiwipsgidebj");//密码为刚才得到的授权码        
//发送邮件        
transport.sendMessage(message, message.getAllRecipients());    
}
 }