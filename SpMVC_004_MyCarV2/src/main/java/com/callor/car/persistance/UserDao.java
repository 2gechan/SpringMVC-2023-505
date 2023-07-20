package com.callor.car.persistance;

import org.apache.ibatis.annotations.Select;

import com.callor.car.models.UserDto;

public interface UserDao {
	
	@Select("select count(*) from tbl_users")
	public int userCount();
	
	@Select("select * from tbl_users where username = #{username}")
	public UserDto findById(String username);
	
	public int insert(UserDto userDto);
	
	public void create_user_table();

}
