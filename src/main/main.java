

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		Map<Burger, AddExtras> Menüü = new HashMap<>();
		Burger ChickenBurger = new Burger("Chicken burger", "kana", 4.25, "valge sai");
		AddExtras extra1 = new AddExtras(new Extra("juust", 0.40), new Extra("salat", 0.40),  new Extra("tomat", 0.20), new Extra( "majonees", 0.34));

		Burger OldFashionedCheeseburger = new Burger("Old Fashioned Cheeseburger", "Looma liha", 5.99, "Valge sai");
		AddExtras extra2 = new AddExtras(new Extra("Peekon", 0.69), new Extra("sibul", 0.15), new Extra("kurk", 0.20), new Extra("vürtsikas kaste", 0.50));

		Burger NewYorkBurger = new Burger("New York Burger", "Looma liha", 8.99,"Valge sai");
		AddExtras extra3 = new AddExtras(new Extra("redis", 0.30), new Extra("hapukurk", 0.30), new Extra("Peekon", 0.60), new Extra("Seened", 0.32));

		Menüü.put(ChickenBurger, extra1);
		Menüü.put(OldFashionedCheeseburger, extra2);
		Menüü.put(NewYorkBurger, extra3);

		System.out.println("****  MENU  ****");
		System.out.println("1. " + ChickenBurger);
		System.out.println("2. " + OldFashionedCheeseburger);
		System.out.println("3. " + NewYorkBurger);

		Order order = new Order(Menu);
		Order.BurgerChoice();
		Order.AdditionChoice();
		Order.finalPrice();

	}
}