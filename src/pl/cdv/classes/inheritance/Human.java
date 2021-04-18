package pl.cdv.classes.inheritance;

public class Human {
    String name;

    public Human(String name) {

        this.name = name;
    }

    public void whoAmI() {
        System.out.println("I am: " + name);
    }

}
