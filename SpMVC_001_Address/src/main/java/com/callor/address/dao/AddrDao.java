package com.callor.address.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.address.models.AddrDto;

public interface AddrDao {
	
	@Select("select * from tbl_address order by a_id")
	public List<AddrDto> selectAll();

	/*
	 * Dto return 할 때와 List return 할 때
	 * 만약 찾는 값이 없으면
	 * 		Dto return 할 때는 null 값
	 * 		List return 할 때는 empty 값
	 * 값이 있는지 없는지 검사할 때
	 * 		Dto return -> if(dto == null)
	 * 		List return -> if(list.isEmpty())
	 */
	@Select("select * from tbl_address where a_id = #{id}")
	public AddrDto findById(String id);
	
	@Select("select * from tbl_address where a_name like '%' || #{name} || '%'")
	public List<AddrDto> findByName(String name);
}
