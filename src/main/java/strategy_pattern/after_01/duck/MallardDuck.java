package strategy_pattern.after_01.duck;

import strategy_pattern.after_01.flybehavior.FlyWithWings;
import strategy_pattern.after_01.quackbehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("MallardDuck display");
    }
}
