```mermaid
classDiagram
    class PizzaIngredientFactory {
        + createSauce()
        + createDough()
        + createCheese()
        + createVeggies()
        + createPepperoni()
        + createClam()
    }

    class NYPizzaIngredientFactory{
        + createSauce()
        + createDough()
        + createCheese()
        + createVeggies()
        + createPepperoni()
        + createClam()
    }

    class ChicagoPizzaIngredientFactory{
        + createSauce()
        + createDough()
        + createCheese()
        + createVeggies()
        + createPepperoni()
        + createClam()
    }

    class Pizza{
        + String name;
	    + Dough dough;
	    + Sauce sauce;
	    + Cheese cheese;
	    + Clam clam;
        + bake()
        + cut()
        + box()
        + preapre()
        + String getName()
        + String toString()
    }

    class CheesePizza{
    + prepare()
    }
    class VeggiePizza{
    + prepare()
    }
    class ClamPizza{
    + prepare()
    }
    class PepperoniPizza{
    + prepare()
    }

    PizzaIngredientFactory <|-- NYPizzaIngredientFactory
    PizzaIngredientFactory <-- Pizza
    PizzaIngredientFactory <|-- ChicagoPizzaIngredientFactory

    ThinCrustDough --|> Dough
    ThickCrustDough --|> Dough
    PlumTomatoeSauce --|> Sauce
    MarinaraSauce --|> Sauce
    Dough <-- Pizza
    Sauce <-- Pizza
    Cheese <-- Pizza
    Clam <-- Pizza
    Pepperoni <-- Pizza
    Veggies <-- Pizza


    NYPizzaIngredientFactory ..> Cheese
    ChicagoPizzaIngredientFactory ..> Cheese
    NYPizzaIngredientFactory ..> Clam
    ChicagoPizzaIngredientFactory ..> Clam
    NYPizzaIngredientFactory ..> ThinCrustDough
    ChicagoPizzaIngredientFactory ..> ThickCrustDough
    NYPizzaIngredientFactory ..> Pepperoni
    ChicagoPizzaIngredientFactory ..> Pepperoni
    NYPizzaIngredientFactory ..> MarinaraSauce
    ChicagoPizzaIngredientFactory ..> PlumTomatoeSauce
    NYPizzaIngredientFactory ..> Veggies
    ChicagoPizzaIngredientFactory ..> Veggies
    Pizza <|-- CheesePizza
    Pizza <|-- ClamPizza
    Pizza <|-- VeggiePizza
    Pizza <|-- PepperoniPizza

```