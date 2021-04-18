package pl.cdv.classes.inheritance;

public class SuperHero extends Human {

    String superPower;

    public SuperHero(String name, String power) {
        super(name);
        superPower = power;
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.println("My power is: " + superPower);
    }
}
