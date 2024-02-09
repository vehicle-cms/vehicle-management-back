package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name="vehicle")
public class Vehicle extends BaseEntity{
	@Column(name="name", length=15)
	private String name;
	@Lob
	@Column(name = "image_url", length=512)
	private String imageUrl;
	@Column(name = "model", length=15)
	private String model;
	@Column(name = "vehicle_num", length = 15)
	private String vehicleNum;
	@Enumerated(EnumType.STRING)
	@Column
	private VehicleType type;
	@Column(length=30)
	private String registration;
	private boolean status;
	private double mileage;
	@Column(name = "rate_per_day")
	private double ratePerDay;
	@Enumerated(EnumType.STRING)
	@Column(name = "fuel_type")
	private FuelType fuelType;
}
