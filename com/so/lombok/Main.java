package com.so.lombok;

public class Main {

	public static void main(String[] args) {
		String brand = "AUDI";

		Car audiA1 = new Car();
		audiA1.setBrand(brand);

		Car2 audiA2 = new Car2.Builder().withBrand(brand).build();

		CarLombok audiA3 = new CarLombok();
		audiA3.setBrand(brand);
		CarLombok2 audiA4 = new CarLombok2.CarLombok2Builder().brand(brand).build();

		System.out.println(audiA1.getBrand());
		System.out.println(audiA2.getBrand());
		System.out.println(audiA3.getBrand());
		System.out.println(audiA4.getBrand());
	}

}
