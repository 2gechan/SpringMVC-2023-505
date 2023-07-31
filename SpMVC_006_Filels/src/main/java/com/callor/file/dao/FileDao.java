package com.callor.file.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.callor.file.model.FileDto;

public interface FileDao extends GenericDao<FileDto, Long> {
	
	// BBS table과 연계될 select 문
	@Select("select * from tbl_files where f_bseq = #{seq}")
	public List<FileDto> findByBSeq(Long seq);
	
	public void create_file_table(String dumy);

	public int insert(@Param("list") List<FileDto> files, @Param("b_seq") Long b_seq);

}
