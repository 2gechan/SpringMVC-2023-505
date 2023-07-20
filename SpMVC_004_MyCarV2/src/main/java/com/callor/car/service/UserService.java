package com.callor.car.service;

import com.callor.car.models.UserDto;

public interface UserService {

	public int join(UserDto userDto);

	public UserDto login(UserDto userDto) throws Exception;

}
