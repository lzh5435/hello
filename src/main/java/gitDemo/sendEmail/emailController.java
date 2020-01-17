package gitDemo.sendEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailController {

	@Autowired
	SendEmail sendEmail;
	
	@RequestMapping("send")
	public void sendContent(String to,String subject,String content) {
		to = "825805836@qq.com";
		subject = "表白开始";
		content="快来看";
		sendEmail.sendSimpleMail(to, subject, content);
	}
	
	@RequestMapping(value="findPost",method = RequestMethod.POST)
	public void test(@RequestBody String data,String body,Integer id) {
		System.out.println(data);
		System.out.println(body);
		System.out.println(id);
	}
}
