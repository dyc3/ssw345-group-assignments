package abstract_factory_hw.stores;

public class PizzaStoreFactory {
	public static PizzaStore getPizzaStore(String store) {
		if (store.equals("NYPizzaStore") || store.equals("NY")) {
			return new NYPizzaStore();
		} else if (store.equals("ChicagoPizzaStore") || store.equals("Chicago")) {
			return new ChicagoPizzaStore();
		} else {
			return null;
		}
	}
}
