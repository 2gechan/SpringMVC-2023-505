package com.gechan.bbs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gechan.bbs.models.UserDto;
import com.gechan.bbs.repository.UserRepository;
import com.gechan.bbs.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImplV1 implements UserService {
	
	private final UserRepository userRepository;
	public UserServiceImplV1(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDto join(UserDto userDto) {
		// TODO Auto-generated method stub
		long userCount = userRepository.count();
		log.debug("사용자 정보 {}", userCount);
		
		// 최초에 등록되는 사용자는 ADMIN 이면서 USER 이다.
		List<String> grantList = new ArrayList<>();
		if(userCount <1) grantList.add("ADMIN");
		grantList.add("USER");
		
		return null;
	}

	@Override
	public UserDto findById(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
