package com.callor.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.bbs.models.BBsDto;

public interface BBsDao {
	
	@Select("SELECT * FROM tbl_bbs ORDER BY b_date DESC, b_time DESC ")
	public List<BBsDto> selectAll();

	// annotation 없이 bbs-mapper.xml 파일과 연동되어 자동으로 sql 질의를 수행
	public List<BBsDto> findUserSelectLimit();
	
	public BBsDto findById(Long b_seq);
}
