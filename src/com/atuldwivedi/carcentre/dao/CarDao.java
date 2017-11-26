package com.atuldwivedi.carcentre.dao;

import java.util.List;

import com.atuldwivedi.carcentre.domain.HondaCity;

public interface CarDao {

	public Long addCar(HondaCity hondaCity);
	
	public List<HondaCity> getCars();
}
