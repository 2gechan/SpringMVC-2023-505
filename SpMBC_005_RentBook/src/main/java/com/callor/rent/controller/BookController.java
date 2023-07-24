package com.callor.rent.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.rent.models.BookDto;
import com.callor.rent.service.BookService;

/*
 * localhost:8080/rent/book/* 로 요청이 들어오면
 * 처리할 시작점
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

	protected final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String home(Model model) {

		List<BookDto> books = bookService.selectAll();
		model.addAttribute("BOOKS", books);
		return "book/home";
	}
}
