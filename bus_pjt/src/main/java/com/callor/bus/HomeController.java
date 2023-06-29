package com.callor.bus;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home";
	}

	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {

		return "/main/join";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(Model model) {

		return "/main/login";
	}

}
