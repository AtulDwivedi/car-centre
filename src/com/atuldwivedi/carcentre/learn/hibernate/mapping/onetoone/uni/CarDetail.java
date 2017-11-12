package com.atuldwivedi.carcentre.learn.hibernate.mapping.onetoone.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3001_ONETOONE_UNI.CAR_DETAIL")
public class CarDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "color")
	private String color;

	@Column(name = "mileage")
	private double mileage;

	@Column(name = "abs")
	private boolean abs;
	
	public CarDetail() {
		super();
	}

	public CarDetail(String color, double mileage, boolean abs) {
		super();
		this.color = color;
		this.mileage = mileage;
		this.abs = abs;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	@Override
	public String toString() {
		return "CarDetail [id=" + id + ", color=" + color + ", mileage=" + mileage + ", abs=" + abs + "]";
	}
}
