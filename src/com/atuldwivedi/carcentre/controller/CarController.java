package com.atuldwivedi.carcentre.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atuldwivedi.carcentre.dao.CarDao;
import com.atuldwivedi.carcentre.dao.CarDaoImpl;
import com.atuldwivedi.carcentre.domain.HondaCity;

@Controller
@RequestMapping("/car")
public class CarController {

	@RequestMapping("/add")
	public String addCar(Model model) {

		// this should come from spring
		HondaCity hondaCity = new HondaCity();

		model.addAttribute("car", hondaCity);

		return "add-car";

	}

	@RequestMapping("/process-add-car")
	public String processAddCar(@ModelAttribute("car") HondaCity hondaCity, Model model) {
		CarDao carDao = new CarDaoImpl();
		Long carPk = carDao.addCar(hondaCity);
		List<HondaCity> cars = null;
		if (carPk != null) {
			cars = carDao.getCars();
		}
		model.addAttribute("cars", cars);
		return "list-cars";
	}
}
