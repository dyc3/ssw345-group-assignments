package abstract_factory_hw.stores;

import abstract_factory_hw.pizzas.Pizza;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}