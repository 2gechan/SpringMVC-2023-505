package com.callor.rent.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.callor.rent.models.BookDto;

public interface BookDao {

	@Select("select * from tbl_books order by b_code")
	public List<BookDto> selectAll();

	@Select("select * from tbl_books limit #{limit} offset #{offset}")
	public List<BookDto> selectPage(@Param("limit") int limit, @Param("offset") int offset);

	@Select("select * from tbl_books where b_code = #{id}")
	public BookDto findById(String id);

	public int insert(BookDto bookDto);

	public int update(BookDto bookDto);

//	@Select("SELECT * FROM tbl_books "
//			+ " WHERE b_name LIKE CONCAT('%',#{name},'%' )"
//			+ " ORDER BY b_name ")

	@Select("select * from tbl_books where b_name LIKE CONCAT('%', #{name}, '%') order by b_name")
	public List<BookDto> findByName(String name);

	@Select("select * from tbl_books where b_comp like concat('%', #{comp}, '%') order by b_comp")
	public List<BookDto> findByComp(String comp);

	@Select("select * from tbl_books where b_auther like concat('%', #{auther}, '%') order by b_auther")
	public List<BookDto> findByAuthor(String auther);

	public void create_book_table(String dumy);

	@Select("select count(*) from tbl_books")
	public int selectCount();

	public int selectSearchCount(List<String> searchList);

	public List<BookDto> selectSearchPage(
			@Param("limit") int limitCount,
			@Param("offset") int offsetNum,
			@Param("list") List<String> searchList);

}
