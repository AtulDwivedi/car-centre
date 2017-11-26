/**
 * 
 */
package com.atuldwivedi.carcentre.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class HondaCity implements Car {

	@Id
	@Column(name = "chesis_number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long chesisNumber;

	@Column(name = "model")
	private String model;

	@Column(name = "color")
	private String color;

	@Column(name = "mileage")
	private Double mileage;

	@Column(name = "max_speed")
	private Integer maxSpeed;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.atuldwivedi.carcentre.domain.Car#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.atuldwivedi.carcentre.domain.Car#drive()
	 */
	@Override
	public void drive() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.atuldwivedi.carcentre.domain.Car#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.atuldwivedi.carcentre.domain.Car#fuel()
	 */
	@Override
	public void fuel() {
		// TODO Auto-generated method stub

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getMileage() {
		return mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Long getChesisNumber() {
		return chesisNumber;
	}

}
