package com.callor.bus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="")
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "home";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {

		return "/main/login";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {

		return "/main/join";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(Model model) {

		return "/main/login";
	}
	
	@RequestMapping(value = "searchBus", method = RequestMethod.GET)
	public String searchBus() {

		return "/main/searchBus";
	}
	
	@RequestMapping(value = "terminalPosition", method = RequestMethod.GET)
	public String terminalPostion() {

		return "/main/searchArea";
	}
	
	@RequestMapping(value = "usuallyBus", method = RequestMethod.GET)
	public String usuallyBus() {

		return "/main/usuallyBus";
	}

	@RequestMapping(value = "findIdPw", method = RequestMethod.GET)
	public String findIdPw() {

		return "/main/findIdPw";
	}

}
