package strategy_pattern.after_01.duck;

import strategy_pattern.after_01.flybehavior.FlyWithWings;
import strategy_pattern.after_01.quackbehavior.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("RedheadDuck display");
    }
}
