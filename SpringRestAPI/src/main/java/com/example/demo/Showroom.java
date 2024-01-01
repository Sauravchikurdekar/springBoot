package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Showroom")
public class Showroom {
	@Id
	@GeneratedValue()
	
	private int ModelNo;
	private String CarName;
	private String CarType;
	private int Price;
	public Showroom(int modelNo, String carName, String carType, int price) {
		super();
		ModelNo = modelNo;
		CarName = carName;
		CarType = carType;
		Price = price;
	}
	public int getModelNo() {
		return ModelNo;
	}
	public void setModelNo(int modelNo) {
		ModelNo = modelNo;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Showroom [ModelNo=" + ModelNo + ", CarName=" + CarName + ", CarType=" + CarType + ", Price=" + Price
				+ "]";
	}
	

}
