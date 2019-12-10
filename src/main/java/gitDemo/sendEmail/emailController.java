package gitDemo.sendEmail;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

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
	public void test(@RequestBody String data) {
		System.err.println(JSONObject.parse(data));
		System.out.println(data);
	}
}
