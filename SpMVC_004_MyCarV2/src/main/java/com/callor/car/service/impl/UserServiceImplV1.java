package com.callor.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.car.models.UserDto;
import com.callor.car.persistance.UserDao;
import com.callor.car.service.UserService;

@Service
public class UserServiceImplV1 implements UserService {
	
	protected final UserDao userDao;
	public UserServiceImplV1(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void create_table() {
		try {
			userDao.create_user_table();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/*
	 * 회원가입 절차
	 * 1. user table에 현재 입력된 user가 있는가?
	 * 		true : 현재 추가할 사용자의 ROLE = "user"
	 * 		false : 현재 추가할 사용자의 ROLE = "ADMIN"
	 * 2. 입력한 비밀번호를 암호화 하기
	 * 3. Dao.insert() 하기
	 */
	@Override
	public int join(UserDto userDto) {
		
		int userCount = userDao.userCount();
		if(userCount > 0) {
			userDto.setU_role("USER");
		} else {
			userDto.setU_role("ADMIN");
		}
		
		return userDao.insert(userDto);
		
	}

	/*
	 * login을 요청받았을 때
	 * username이 없는 경우,
	 * username은 있는데 password가 틀린 경우,
	 * username도 있고 password도 맞는데
	 * 		아직 로그인이 승인되지 않은 경우
	 */
	@Override
	public UserDto login(UserDto userDto) throws Exception {

		if(userDto.getUsername().isBlank()) {
			throw new Exception("USER_EMPTY");
		} else if(userDto.getPassword().isBlank()) {
			throw new Exception("PASSWORD_EMPTY");
		}
		
		UserDto resultDto = userDao.findById(userDto.getUsername());
		if(resultDto == null) {
			// username이 없는 경우
			/*
			 * throw : 나를 호출한 곳으로 Exception을 되돌린다.
			 * 		Exception 던진다.
			 * new Exception() : 새로운 Exception
			 * 		강제로 Exception을 만들어서 Controller에게 보내버리기
			 */
			throw new Exception("USERNAME");
		} else if(resultDto != null && !userDto.getPassword().equals(resultDto.getPassword())) {
			// username은 있는데 비번이 다른 경우
			throw new Exception("PASSWORD");
		}
		
		return resultDto;
	}

}
