package com.ds.trainproject.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MessageController {
	
	public void sendSMS(@RequestBody String no, String message) {
	
		try {
			
			String apiKey = "http://www.textit.biz/sendmsg/index.php?id=94768752332&password=3026";
			String to = "&to=" + no;
			String text = "&text=" + message;
	
			// Send data
			URL textit = new URL(apiKey + to + text);
			BufferedReader in = new BufferedReader(
			new InputStreamReader(textit.openStream()));
			 
			String inputLine;
			while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
			in.close();
			
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
		}
	}
	
}
