package org.thoughts.on.java.burger;

public class Burger {

	private MeatSelection selection;
	
	private double quantity;

	public Burger(MeatSelection selection, double quantity) {
		this.selection = selection;
		this.quantity = quantity;
	}
	
	public MeatSelection getSelection() {
		return selection;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
}
