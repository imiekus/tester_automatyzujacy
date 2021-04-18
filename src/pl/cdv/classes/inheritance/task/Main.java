package pl.cdv.classes.inheritance.task;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit pineapple = new Pineapple();
        Fruit strawberry = new Strawberry();

        Fruit[] fruits = {apple, pineapple, strawberry};
        for (Fruit fruit : fruits) {
            String name = fruit.getName();
            System.out.println(name);
        }
    }
}
