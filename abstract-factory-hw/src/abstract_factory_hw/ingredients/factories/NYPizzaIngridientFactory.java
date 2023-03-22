package abstract_factory_hw.ingredients.factories;

import abstract_factory_hw.ingredients.*;

public class NYPizzaIngridientFactory extends PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
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
