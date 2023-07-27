package com.callor.rent.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.callor.rent.config.QualifierConfig;
import com.callor.rent.dao.BookDao;
import com.callor.rent.models.BookDto;
import com.callor.rent.models.PageDto;
import com.callor.rent.service.BookService;

@Service(QualifierConfig.SERVICE.BOOK_V1)
public class BookServiceImplV1 implements BookService {

	protected final BookDao bookDao;

	public BookServiceImplV1(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<BookDto> selectAll() {
		List<BookDto> books = bookDao.selectAll();
		return books;
	}

	@Override
	public int insert(BookDto bookDto) {

		return bookDao.insert(bookDto);
	}

	@Override
	public BookDto findById(String bcode) {

		return bookDao.findById(bcode);
	}

	@Override
	public int update(BookDto bookDto) {
		// TODO Auto-generated method stub
		return bookDao.update(bookDto);
	}

	@Override
	public List<BookDto> findByName(String bname) {
		// TODO Auto-generated method stub
		return bookDao.findByName(bname.trim());
	}

	@Override
	public List<BookDto> selectPage(String page) {
		try {
			int intPageNum = Integer.valueOf(page);
			// intPageNum = (intPageNum -1) * 10;
			intPageNum = --intPageNum * 10;
			int intLimit = 10;
			return bookDao.selectPage(intLimit, intPageNum);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void selectPage(String page, Model model) {
//		List<BookDto> books = bookDao.selectAll();
//		int totalCount = books.size();
//		int intPageNum = Integer.valueOf(page);
//
//		PageDto pageDto = PageDto.builder().pageNum(intPageNum).totalCount(totalCount).build();
//		
//		List<BookDto> pageBooks = new ArrayList<>();
//		for(int index = pageDto.getOffsetNum(); index < pageDto.getLimitCount() + pageDto.getOffsetNum(); index ++) {
//			pageBooks.add(books.get(index));
//		}
//		model.addAttribute("BOOKS", pageBooks);
//		model.addAttribute("PAGINATION", pageDto);
		
		int totalCount = bookDao.selectCount();
		int intPageNum = Integer.valueOf(page);
		// int offSetCount = (intPageNum - 1);

		// List<BookDto> books = bookDao.selectAll();
		PageDto pageDto = PageDto.builder().pageNum(intPageNum).totalCount(totalCount).build();

		List<BookDto> books = bookDao.selectPage(pageDto.getLimitCount(), pageDto.getOffsetNum());

		model.addAttribute("BOOKS", books);
		model.addAttribute("PAGINATION", pageDto);

	}

	@Override
	public void selectPage(String page, Model model, String search) {
		
		// 검색어를 빈칸을 기준으로 분해하기
		String[] searchs = search.split(" ");
		// 배열을 List로 만들기
		List<String> searchList = Arrays.asList(searchs);
		
		int totalCount = bookDao.selectSearchCount(searchList);
		int intPageNum = Integer.valueOf(page);
		
		PageDto pageDto = PageDto.builder().pageNum(intPageNum).totalCount(totalCount).build();
		
		List<BookDto> books = bookDao.selectSearchPage(pageDto.getLimitCount(), pageDto.getOffsetNum(), searchList);

		model.addAttribute("BOOKS", books);
		model.addAttribute("PAGINATION", pageDto);
		
	}

}
