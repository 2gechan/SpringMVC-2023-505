package com.callor.address.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String home() {

		return null;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		/*
		 * Controller.method() 에서 response 결과인
		 * view 이름을 문자열로 return 하면 /WEB-INF/views/ 폴더에서
		 * 파일을 찾아 rendering 한 후 응답을 한다.
		 * 
		 * 그런데, 문자열이 아니고 null을 return 하면
		 * 이 method가 호출된 RequestMapping 주소가
		 * view 파일 이름을 대신하게 된다.
		 */
		return null;
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {

		return null;
	}
	
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() {

		return null;
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {

		return null;
	}

}
