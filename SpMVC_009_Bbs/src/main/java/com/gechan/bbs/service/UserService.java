package com.gechan.bbs.service;

import com.gechan.bbs.models.UserDto;

public interface UserService {

	public UserDto join(UserDto userDto);
	
	public UserDto findById(String username);
}
