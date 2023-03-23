package abstract_factory_hw.ingredients.factories;

import abstract_factory_hw.ingredients.*;

public abstract class PizzaIngredientFactory {
	public abstract Dough createDough();

	public abstract Sauce createSauce();

	public abstract Cheese createCheese();

	public abstract Veggies[] createVeggies();

	public abstract Pepperoni createPepperoni();

	public abstract Clam createClam();
}
