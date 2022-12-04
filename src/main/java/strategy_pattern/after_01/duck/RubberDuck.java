package strategy_pattern.after_01.duck;

import strategy_pattern.after_01.flybehavior.FlyNoWay;
import strategy_pattern.after_01.quackbehavior.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck(FlyNoWay fnw, MuteQuack muteQuack) {
        quackBehavior = muteQuack;
        flyBehavior = fnw;
    }

    public void display() {
        System.out.println("RubberDuck display");
    }

    public void swim(){
        System.out.println("RubberDuck swim");
    }
}
