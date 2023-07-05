package com.callor.todolist;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String date = localDateTime.format(dateFormat);
		String time = localDateTime.format(timeFormat);
		
		model.addAttribute("DATE", date);
		model.addAttribute("TIME", time);
		
		return "home";
	}
		
}
