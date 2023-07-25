package com.callor.rent.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.rent.models.RentBookDto;

public interface RentBookDao {
	
	@Select("select * from tbl_rent_book order by rent_seq")
	public List<RentBookDto> selectAll();
	
	public RentBookDto findById(long id);
	
	public List<RentBookDto> findByBCode(String bcode);
	public List<RentBookDto> findByMCode(String mcode);
	
	public int insert(RentBookDto dto);
	public int update(RentBookDto dto);
	
	public void create_rentbook_table(String dumy);

	

}
