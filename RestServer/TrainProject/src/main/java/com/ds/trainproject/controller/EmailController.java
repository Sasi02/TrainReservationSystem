package com.ds.trainproject.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

@Controller
public class EmailController {
	
	public void sendEmail(@RequestBody String email, String message) {
		Email from = new Email("sazlakshitha@gmail.com");
	    String subject = "Sending with SendGrid is Fun";
	    Email to = new Email(email);
	    Content content = new Content("text/plain", message);
	    Mail mail = new Mail(from, subject, to, content);
	
	    SendGrid sg = new SendGrid(System.getenv("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"));
	    Request request = new Request();
	    try {
	      request.setMethod(Method.POST);
	      request.setEndpoint("mail/send");
	      request.setBody(mail.build());
	      Response response = sg.api(request);
	      System.out.println(response.getStatusCode());
	      System.out.println(response.getBody());
	      System.out.println(response.getHeaders());
	    } catch (IOException ex) {
	      ex.printStackTrace();
	    }
	}
}
