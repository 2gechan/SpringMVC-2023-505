package com.callor.rent.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.rent.dao.RentBookDao;
import com.callor.rent.models.RentBookDto;
import com.callor.rent.service.RentBookService;

@Service
public class RentBookServiceImplV1 implements RentBookService {

	protected final RentBookDao rentBookDao;
	public RentBookServiceImplV1(RentBookDao rentBookDao) {
		this.rentBookDao = rentBookDao;
	}

	@Override
	public List<RentBookDto> selectAll() {
		List<RentBookDto> rentList = rentBookDao.selectAll();
		return rentList;
	}

	@Override
	public int insert(RentBookDto rentBookDto) {
		// TODO Auto-generated method stub
		return rentBookDao.insert(rentBookDto);
	}

}
