package org.thoughts.on.java.burger;

public class CookingUnit {

	public Burger make(MeatSelection selection, GrilledBurger grilledBurger,
					   double quantity) {
		return new Burger(selection, quantity);
	}

}
