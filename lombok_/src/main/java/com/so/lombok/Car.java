package com.so.lombok;

public class Car {

	private String brand;
	private String type;
	private int doors;
	private int power;
	private int torque;
	private int gears;
	private String color;
	private String emissionClass;
	private String mileage;

	public Car() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEmissionClass() {
		return emissionClass;
	}

	public void setEmissionClass(String emissionClass) {
		this.emissionClass = emissionClass;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Car car = (Car)o;

		if (doors != car.doors)
			return false;
		if (power != car.power)
			return false;
		if (torque != car.torque)
			return false;
		if (gears != car.gears)
			return false;
		if (brand != null ? !brand.equals(car.brand) : car.brand != null)
			return false;
		if (type != null ? !type.equals(car.type) : car.type != null)
			return false;
		if (color != null ? !color.equals(car.color) : car.color != null)
			return false;
		if (emissionClass != null ? !emissionClass.equals(car.emissionClass) : car.emissionClass != null)
			return false;
		return mileage != null ? mileage.equals(car.mileage) : car.mileage == null;
	}

	@Override
	public int hashCode() {
		int result = brand != null ? brand.hashCode() : 0;
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + doors;
		result = 31 * result + power;
		result = 31 * result + torque;
		result = 31 * result + gears;
		result = 31 * result + (color != null ? color.hashCode() : 0);
		result = 31 * result + (emissionClass != null ? emissionClass.hashCode() : 0);
		result = 31 * result + (mileage != null ? mileage.hashCode() : 0);
		return result;
	}
}