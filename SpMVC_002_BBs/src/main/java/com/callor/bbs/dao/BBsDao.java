package com.callor.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.bbs.models.BBsDto;

public interface BBsDao {
	
	@Select("select * from tbl_bbs order by b_date desc, b_time desc")
	public List<BBsDto> selectAll();

}
