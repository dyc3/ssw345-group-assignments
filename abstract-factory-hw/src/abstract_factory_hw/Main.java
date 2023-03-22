package abstract_factory_hw;

import java.util.Scanner;

import abstract_factory_hw.stores.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String storestr = null;
		if (args.length > 0) {
			storestr = args[0];
		}
		String pizzastr = null;
		if (args.length > 1) {
			pizzastr = args[1];
		}

		if (storestr == null) {
			System.out.print("Enter a store: ");
			storestr = input.nextLine();
		}

		var store = PizzaStoreFactory.getPizzaStore(storestr);

		if (pizzastr == null) {
			System.out.print("Enter a pizza: ");
			pizzastr = input.nextLine();
		}

		// The driver for ordering a pizza from any franchise
		var pizza = store.orderPizza(pizzastr);

		System.out.println(pizza);
		input.close();
	}
}
