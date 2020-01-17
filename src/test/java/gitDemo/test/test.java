package gitDemo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;

import gitDemo.sendEmail.SendEmail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

	@Autowired
	SendEmail sendEmail;
	
	@Test
	public void copy() {
	}
	@Test
	public void sendContent() {
		String to = "825805836@qq.com";
		String subject = "表白开始";
		String content="快来看";
		sendEmail.sendSimpleMail(to, subject, content);
	}
	
	@Test
	public void sendhtml() {
		String to = "825805836@qq.com";
		String subject = "表白开始";
		String content="<html>\n"+
                "<body>\n"+
                "<h3>hello 明天要加油哦！</h3>\n"+
            "</body>\n"+
            "</html>";;
		sendEmail.sendHtmlMail(to, subject, content);
	}
}
