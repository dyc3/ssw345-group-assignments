package abstract_factory_hw.stores;

import abstract_factory_hw.pizzas.Pizza;

public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	// different franchises create different pizza
	abstract Pizza createPizza(String type);
}