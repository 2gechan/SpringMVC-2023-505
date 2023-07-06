package com.callor.todolist;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.todolist.models.TodoDto;
import com.callor.todolist.service.TodoService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	protected final TodoService todoService;

	public HomeController(TodoService todoService) {
		this.todoService = todoService;
	}

	@ModelAttribute
	public TodoDto todoDto() {
		/*
		 * Date date = new Date(System.currentTimeMillis());
		 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 * SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		 * todoDto.setTo_sdate(dateFormat(date));
		 * todoDto.setTo_stime(timeFormat(date));
		 */
		TodoDto todoDto = new TodoDto();

		LocalDateTime localDateTime = LocalDateTime.now();

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

		String date = localDateTime.format(dateFormat);
		String time = localDateTime.format(timeFormat);

		todoDto.setTo_sdate(date);
		todoDto.setTo_stime(time);

		return todoDto;
	}

	/*
	 * 매개변수에 Dto를 사용하고 @ModelAttribute를 부착해 두면
	 * Dto 변수가 null 값이면, 어딘가에 이 Dto를 생성하는 method가 있는지 찾는다.
	 * 이 때 method에도 @ModelAttribute가 있어야 한다.
	 * 
	 * @ModelAttribute가 있는 method를 찾으면 해당 method를 실행하여
	 * return 값을 매개변수에 setting하여 전달한다.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@ModelAttribute TodoDto todoDto, Model model) {
		
		if(todoDto.getTo_content() != null) {
			todoService.insert(todoDto);
		}
		List<TodoDto> todoList = todoService.selectAll();
		
		model.addAttribute("TODO", todoDto);
		model.addAttribute("TODOS", todoList);

		return "home";
	}

}
