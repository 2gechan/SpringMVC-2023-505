package com.callor.file.dao;

import com.callor.file.model.BBsDto;

/*
 * GenericDao를 상속받으면서 DTO 대신 BBsDto를 부착하고
 * PK 대신 Long을 부착하여 메서드를 모두 생성하라
 */
public interface BBsDao extends GenericDao<BBsDto, Long> {
	
	public void create_bbs_table(String dumy);

}
