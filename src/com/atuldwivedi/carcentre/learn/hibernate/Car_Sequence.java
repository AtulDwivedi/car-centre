package com.atuldwivedi.carcentre.learn.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="JM3001_CAR_SEQUENCE")
@SequenceGenerator(name="modelNumber", sequenceName="SEQ_MODEL_NUMBER",
schema="PUBLIC", allocationSize=1)
public class Car_Sequence {

	@Id
	@GeneratedValue(generator="modelNumber", strategy=GenerationType.SEQUENCE)
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

	public Car_Sequence(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Car_Sequence() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", name=" + name + ", color=" + color + "]";
	}
	
	
}
