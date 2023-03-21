package abstract_factory_hw.pizzas;

import abstract_factory_hw.ingredients.factories.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'prepare'");
	}

}
