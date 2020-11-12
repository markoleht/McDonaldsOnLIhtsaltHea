package org.thoughts.on.java.burger;

import java.util.HashMap;
import java.util.Map;

public class BurgerKiosk {

	private Map<MeatSelection, Configuration> configMap;
	
	private Map<MeatSelection, BurgerMeat> meats;
	
	private BurgerMaker burgerMaker;
	
	private CookingUnit cookingUnit;

	public BurgerKiosk(Map<MeatSelection, BurgerMeat> meats) {
		this.meats = meats;
		this.burgerMaker = new BurgerMaker();
		this.cookingUnit = new CookingUnit();
		
		this.configMap = new HashMap<MeatSelection, Configuration>();
		this.configMap.put(MeatSelection.CHICKEN_BURGER, new Configuration(2, 3));
		this.configMap.put(MeatSelection.BEEF_BURGER, new Configuration(3, 5));
	}
	
	public Burger makeBurger(MeatSelection selection) throws BurgerException {
		switch (selection) {
			case BEEF_BURGER:
				return makeBeefBurger();
				
			case CHICKEN_BURGER:
				return makeChickenBurger();
							
			default:
				throw new BurgerException("BurgerSelection ["+selection+"] not supported!");
		}
	}

	private Burger makeChickenBurger() {
		Configuration config = configMap.get(MeatSelection.CHICKEN_BURGER);
		
		// grill burger meat
		GrilledBurger grilledBurger = this.burgerMaker.make(this.meats.get(MeatSelection.CHICKEN_BURGER), config.getQuantityBurger());
		
		// make chicken burger
		return this.cookingUnit.make(MeatSelection.CHICKEN_BURGER, grilledBurger, config.getQuantityBuns());
	}

	private Burger makeBeefBurger() {
		Configuration config = configMap.get(MeatSelection.BEEF_BURGER);
		
		// grill burger meat
		GrilledBurger grilledBurger = this.burgerMaker.make(this.meats.get(MeatSelection.BEEF_BURGER), config.getQuantityBurger());
		
		// make beef burger
		return this.cookingUnit.make(MeatSelection.BEEF_BURGER, grilledBurger, config.getQuantityBuns());
	}
}
