package com.so.lombok;

public class Car2 {

	private String brand;
	private String type;
	private int doors;
	private int power;
	private int torque;
	private int gears;
	private String color;
	private String emissionClass;
	private int mileage;

	private Car2() {
	}

	public static class Builder {

		private String brand;
		private String type;
		private int doors;
		private int power;
		private int torque;
		private int gears;
		private String color;
		private String emissionClass;
		private int mileage;

		public Builder withBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public Builder withType(String type) {
			this.type = type;
			return this;
		}

		public Builder withDoors(int doors) {
			this.doors = doors;
			return this;
		}

		public Builder withPower(int power) {
			this.power = power;
			return this;
		}

		public Builder withTorque(int torque) {
			this.torque = torque;
			return this;
		}

		public Builder withGears(int gears) {
			this.gears = gears;
			return this;
		}

		public Builder withColor(String color) {
			this.color = color;
			return this;
		}

		public Builder withEmissionClass(String emissionClass) {
			this.emissionClass = emissionClass;
			return this;
		}

		public Builder withMileage(int mileage) {
			this.mileage = mileage;
			return this;
		}

		public Car2 build() {
			Car2 car = new Car2();
			car.brand = this.brand;
			car.type = this.type;
			car.doors = this.doors;
			car.power = this.power;
			car.torque = this.torque;
			car.gears = this.gears;
			car.color = this.color;
			car.emissionClass = this.emissionClass;
			car.mileage = this.mileage;
			return car;
		}
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public int getDoors() {
		return doors;
	}

	public int getPower() {
		return power;
	}

	public int getTorque() {
		return torque;
	}

	public int getGears() {
		return gears;
	}

	public String getColor() {
		return color;
	}

	public String getEmissionClass() {
		return emissionClass;
	}

	public int getMileage() {
		return mileage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Car2 car2 = (Car2)o;

		if (doors != car2.doors)
			return false;
		if (power != car2.power)
			return false;
		if (torque != car2.torque)
			return false;
		if (gears != car2.gears)
			return false;
		if (mileage != car2.mileage)
			return false;
		if (brand != null ? !brand.equals(car2.brand) : car2.brand != null)
			return false;
		if (type != null ? !type.equals(car2.type) : car2.type != null)
			return false;
		if (color != null ? !color.equals(car2.color) : car2.color != null)
			return false;
		return emissionClass != null ? emissionClass.equals(car2.emissionClass) : car2.emissionClass == null;
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
		result = 31 * result + mileage;
		return result;
	}
}
