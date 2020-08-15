package com.nghianv.model;

public class Bike {
	private String color;
	private int price;

	public Bike() {
	}

	public Bike(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike{" +
				"color:'" + color + '\'' +
				", price:" + price +
				'}';
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
