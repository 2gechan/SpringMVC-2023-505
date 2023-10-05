package com.gechan.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gechan.bbs.repository.UserRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private final UserRepository userRepository;
	public HomeController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		userRepository.findAll();
		return "home";
	}
	
}
