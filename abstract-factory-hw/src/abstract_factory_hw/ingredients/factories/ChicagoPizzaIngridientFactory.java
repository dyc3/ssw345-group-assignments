package abstract_factory_hw.ingredients.factories;

import abstract_factory_hw.ingredients.*;

public class ChicagoPizzaIngridientFactory extends PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoeSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Cheese();
	}

	@Override
	public Veggies createVeggies() {
		return new Veggies();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new Pepperoni();
	}

	@Override
	public Clam createClam() {
		return new Clam();
	}

}
