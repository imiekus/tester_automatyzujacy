package pl.cdv.classes.engine;

public class Main {
    public static void main(String[] args) {
        Engine engineDiesel = new Engine("Diesel");
        Car car1 = new Car("Mercedes", "Black", engineDiesel);
        Car car2 = new Car("Tesla", "White", new Engine("Electric"));
        Car car3 = new Car("Ford", "Silver", new Engine("Diesel"));

        System.out.println("Car number one has engine of type: " + car1.engine.typeEngine);
        System.out.println("Car number two has engine of type: " + car2.engine.typeEngine);
        car3.engine.typeEngine = "none";
        System.out.println("Car number three has engine of type: " + car3.engine.typeEngine + ", because it's being repaired.");
    }
}
