package com.callor.todolist.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.callor.todolist.models.TodoDto;
import com.callor.todolist.service.TodoGeneric;

public interface TodoDao extends TodoGeneric<TodoDto, Long>{
	
	@Select("select * from tbl_todolist")
	public List<TodoDto> selectAll();
	
	@Select("select * from tbl_todolist where to_seq = #{id}")
	public TodoDto findById(long id);
	
	//	public int insert(TodoDto dto);
	//	public int update(TodoDto dto);
	
	@Delete("delete from tbl_todolist where to_seq = #{id}")
	public int delete(long id);

}
