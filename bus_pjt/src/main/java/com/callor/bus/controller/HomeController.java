package com.callor.bus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.bus.dto.UserDto;

@Controller
@RequestMapping(value="main")
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "/home";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {

		return "/login";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {

		return "/join";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(Model model, UserDto dto) {

		if(dto != null) {
			
			return "/login";
		} else {
			return "redirect:/join";
		}
		
	}
	
	@RequestMapping(value = "searchBus", method = RequestMethod.GET)
	public String searchBus() {

		return "/searchBus";
	}
	
	@RequestMapping(value = "terminalPosition", method = RequestMethod.GET)
	public String terminalPostion() {

		return "/searchArea";
	}
	
	@RequestMapping(value = "usuallyBus", method = RequestMethod.GET)
	public String usuallyBus() {

		return "/usuallyBus";
	}

	@RequestMapping(value = "findIdPw", method = RequestMethod.GET)
	public String findIdPw() {

		return "/findIdPw";
	}

}
