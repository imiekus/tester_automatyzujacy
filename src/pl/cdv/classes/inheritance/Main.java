package pl.cdv.classes.inheritance;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Homo Erectus");
        SuperHero superMan = new SuperHero("SuperMan", "flying");
        SuperHero batMan = new SuperHero("BatMan", "disappearing");
        System.out.println("Hero "+ superMan.name + " has power: " + superMan.superPower);
        System.out.println("Hero "+ batMan.name + " has power:  " + batMan.superPower);
        superMan.whoAmI();
        human.whoAmI();
    }
}
