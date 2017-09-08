package com.atuldwivedi.carcentre.learn.spring.core.cfg;

public class CarFactory {
	
	public static Car getCar(String carType){
		Car car = null;
		
		if(carType.equalsIgnoreCase("amaze")){
//			car = new HondaAmaze();
		}
		else if (carType.equalsIgnoreCase("jazz")) {
			car = new HondaJazz();
		}
		else if (carType.equalsIgnoreCase("city")) {
			car = new HondaCity();
		}
		
		return car;
	}

}
