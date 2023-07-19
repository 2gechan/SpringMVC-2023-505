package com.callor.car.service;

import java.util.List;

import com.callor.car.models.CarDto;


public interface CarService {
	public int insert(CarDto carDto);
	
	public CarDto findTachoByCarNum(String carnum);

	public List<CarDto> selectAll();
}
