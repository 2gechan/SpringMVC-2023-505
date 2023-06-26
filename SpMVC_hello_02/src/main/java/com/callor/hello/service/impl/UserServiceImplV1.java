package com.callor.hello.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.hello.models.UserDto;
import com.callor.hello.service.UserService;

@Service(value = "userService")
public class UserServiceImplV1 implements UserService {
	
	/*
	 * List<UserDto> userList 객체를 생성하고
	 * 임의로 생성한 3명의 User 정보를 add 하기
	 * User 리스트를 return 하기
	 */
	@Override
	public List<UserDto> selectAll() {
		List<UserDto> userList = new ArrayList<UserDto>();
		
		UserDto userDto;
		userDto = new UserDto();
		userDto.setUsername("0001");
		userDto.setPassword("1234");
		userDto.setName("홍길동");
		userDto.setTel("010-1111-1111");
		userDto.setAddr("서울특별시");
		userDto.setAge(25);
		userList.add(userDto);
		
		userDto = new UserDto();
		userDto.setUsername("0002");
		userDto.setPassword("1234");
		userDto.setName("이몽룡");
		userDto.setTel("010-2222-2222");
		userDto.setAddr("광주광역시");
		userDto.setAge(27);
		userList.add(userDto);
		
		// setter method 를 사용하여 데이터 추가
		userDto = new UserDto();
		userDto.setUsername("0003");
		userDto.setPassword("1234");
		userDto.setName("성춘향");
		userDto.setTel("010-3333-3333");
		userDto.setAddr("부산광역시");
		userDto.setAge(30);
		userList.add(userDto);
		
		// field 생성자를 사용하여 데이터 추가하기
		// field 생성자를 사용하는 경우 원하는 변수에 값이
		// 정확히 저장되는지 확인하기 어렵다.
		userDto = new UserDto("0004", "1234", "임꺽정", "010-4444-4444", "함경도", 33);
		userList.add(userDto);
		
		return userList;
	}

	@Override
	public UserDto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int input(UserDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
