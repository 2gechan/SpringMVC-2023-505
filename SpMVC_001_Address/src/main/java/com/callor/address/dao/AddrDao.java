package com.callor.address.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.address.models.AddrDto;

public interface AddrDao {
	
	@Select("select * from tbl_address order by a_id")
	public List<AddrDto> selectAll();

}
