package com.callor.bus.dao;

import java.util.List;

import com.callor.bus.dto.UserDto;

public interface UserDao {
	
	public List<UserDto> selectAll();
	public UserDto findById(String id);
	
	public int insert(UserDto dto);
	public int update(UserDto dto);
	
	public int delete(String id);

}
