package org.thoughts.on.java.burger;

import java.util.HashMap;
import java.util.Map;

public class BurgerApp {
	public static void main(String[] args) {
		// create a Map of available burger meats
		Map<MeatSelection, BurgerMeat> meat = new HashMap<MeatSelection, BurgerMeat>();
		meat.put(MeatSelection.CHICKEN_BURGER, new BurgerMeat(
				"My favorite chicken burger meat", 1000));
		meat.put(MeatSelection.BEEF_BURGER, new BurgerMeat(
				"My favorite beef burger meat", 1000));

		// get a new CoffeeMachine object
		BurgerKiosk machine = new BurgerKiosk(meat);

		// brew a fresh burger
		try {
			Burger chicken = machine.makeBurger(MeatSelection.CHICKEN_BURGER);
			System.out.println("Burger is ready!");
		} catch (BurgerException e) {
			e.printStackTrace();
		}
	} // end main
} // end BurgerApp
