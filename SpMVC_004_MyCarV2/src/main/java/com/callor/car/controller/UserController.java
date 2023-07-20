package com.callor.car.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.car.models.UserDto;
import com.callor.car.service.UserService;

import lombok.extern.slf4j.Slf4j;

/*
 * class cope RequestMapping과
 * 			type scope @RequestMapping
 * method scope @RequestMapping은 분리되어 있으나
 * 실제 호출될 때는 두개가 연결 Mapping 으로 사용된다.
 */
@Controller
@Slf4j
@RequestMapping(value = "/user")
public class UserController {

	protected final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	// localhost:8080/rootPath/user/login으로 Request 되었을 때
	// 호출되는 method
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String ERROR, @ModelAttribute("USER") UserDto userDto, Model model) {
		model.addAttribute("ERROR", ERROR);
		return "user/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("USER") UserDto userDto, HttpSession httpSession) {
		try {
			userDto = userService.login(userDto);
		} catch (Exception e) {
			// new Exception(message) 라고 보낸 Exception에서
			// message에 해당하는 부분 getter하기
			String message = e.getMessage();
			return "redirect:/user/login?ERROR=" + message;
		}
		return "redirect:/";
	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(@ModelAttribute("USER") UserDto userDto) {

		return "user/join";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute("USER") UserDto userDto, Model model) {
		int result = userService.join(userDto);
		log.debug("회원가입 정보 : {}", userDto);
		return "redirect:/user/login";
	}

	@ModelAttribute("USER")
	public UserDto userDto() {
//		return UserDto.builder().build();
		return new UserDto();
	}

}
