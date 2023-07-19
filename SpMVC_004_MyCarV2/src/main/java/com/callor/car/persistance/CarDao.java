package com.callor.car.persistance;

import java.util.List;

import com.callor.car.models.CarDto;

public interface CarDao {
	
	public CarDto findTachoByCarNum(String carnum);

	public int insert(CarDto carDto);

	public List<CarDto> selectAll();

}
