package abstract_factory_hw.pizzas;

import abstract_factory_hw.ingredients.Cheese;
import abstract_factory_hw.ingredients.Clam;
import abstract_factory_hw.ingredients.Dough;
import abstract_factory_hw.ingredients.Sauce;

public abstract class Pizza {
	// each pizza has a name and ingredients
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Clam clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return String.format("%s: %s, %s, %s, %s", this.name, this.dough, this.sauce, this.cheese, this.clam);
	}
}
