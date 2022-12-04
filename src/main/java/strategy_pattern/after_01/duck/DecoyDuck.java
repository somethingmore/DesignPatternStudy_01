package strategy_pattern.after_01.duck;

import strategy_pattern.after_01.flybehavior.FlyNoWay;
import strategy_pattern.after_01.quackbehavior.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("DecoyDuck display");
    }
}
