package abstract_factory_hw.pizzas;

import abstract_factory_hw.ingredients.factories.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	// To make a pizza now, we need a factory to provide the ingredients.
	PizzaIngredientFactory ingredientFactory;

	// class gets a factory
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
