package gitDemo.sendEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class emailController {

	@Autowired
	SendEmail sendEmail;
	
	@RequestMapping("send")
	@ResponseBody
	public void sendContent(String to,String subject,String content) {
		to = "825805836@qq.com";
		subject = "表白开始";
		content="快来看";
		sendEmail.sendSimpleMail(to, subject, content);
	}
}
