package com.so.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarLombok2 {

	private String brand;
	private String type;
	private int doors;
	private int power;
	private int torque;
	private int gears;
	private String color;
	private String emissionClass;
	private int mileage;
}
