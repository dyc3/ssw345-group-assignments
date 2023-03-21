package abstract_factory_hw.pizzas;

import abstract_factory_hw.ingredients.factories.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		throw new UnsupportedOperationException("Unimplemented method 'prepare'");
	}

}
