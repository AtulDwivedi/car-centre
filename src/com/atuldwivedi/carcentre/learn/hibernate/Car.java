package com.atuldwivedi.carcentre.learn.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JM3001_CAR")
public class Car {

	@Id
	@Column(name = "model_number")
	private long modelNumber;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "color")
	private String color;

	public long getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(long modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(long modelNumber, String name, String color) {
		super();
		this.modelNumber = modelNumber;
		this.name = name;
		this.color = color;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", name=" + name + ", color=" + color + "]";
	}
	
	
}
