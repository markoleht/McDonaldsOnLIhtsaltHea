package org.thoughts.on.java.burger;

public class Configuration {

	private double quantityMeat;
	private double quantityBun;

	public Configuration(double quantityMeat, double quantityBun) {
		this.quantityMeat = quantityMeat;
		this.quantityBun = quantityBun;
	}

	public double getQuantityBurger() {
		return quantityMeat;
	}

	public double getQuantityBuns() {
		return quantityBun;
	}

}
