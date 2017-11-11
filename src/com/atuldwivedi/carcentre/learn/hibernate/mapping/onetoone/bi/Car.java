package com.atuldwivedi.carcentre.learn.hibernate.mapping.onetoone.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3001_ONETOONE_BI.CAR")
public class Car {

	/**
	 * 1. create fields 2. create constructors 3. create getter setter 4.
	 * generate toString 5. map the table, columns, Id and mapping
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@OneToOne(mappedBy="car", cascade=CascadeType.ALL)
	private CarDetail carDetail;

	public Car() {
		super();
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CarDetail getCarDetail() {
		return carDetail;
	}

	// utility method for handshaking
	// you can also give name addCarDetail to this method
	public void setCarDetail(CarDetail carDetail) {
		carDetail.setCar(this);
		this.carDetail = carDetail;
	}
	
	// utility method for handshaking
	public void removeCarDetail() {
        if ( carDetail != null ) {
        	carDetail.setCar( null );
            this.carDetail = null;
        }
    }

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", carDetail=" + carDetail + "]";
	}

}
