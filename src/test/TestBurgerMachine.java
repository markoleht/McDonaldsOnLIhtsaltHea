package org.thoughts.on.java.burger;

public class TestBurgerMachine {

	@Test
	public void testChickenBurger() throws BurgerException {
		// create a Map of available burger meats
		Map<MeatSelection, BurgerMeat> meats = new HashMap<MeatSelection, BurgerMeat>();
		meats.put(MeatSelection.CHICKEN_BURGER, new BurgerMeat("My favorite chicken burger meat", 1000));
		meats.put(MeatSelection.BEEF_BURGER, new BurgerMeat("My favorite beef burger meat", 1000));

		// get a new Burger Kiosk object
		BurgerKiosk machine = new BurgerKiosk(meats);
		// make a fresh burger
		Burger chickenBurger = machine.makeBurger(MeatSelection.CHICKEN_BURGER);

		Assert.assertEquals(MeatSelection.CHICKEN_BURGER, chickenBurger.getSelection());
		Assert.assertEquals(28d, chickenBurger.getQuantity(), 0.01);
	}
}
