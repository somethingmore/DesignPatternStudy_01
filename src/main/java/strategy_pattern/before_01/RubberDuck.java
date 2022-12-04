package strategy_pattern.before_01;

public class RubberDuck extends Duck implements Quackable {
    public void quack() {
        System.out.println("Squeak");
    }

    public void display() {
        System.out.println("Display RedheadDuck");
    }
}
