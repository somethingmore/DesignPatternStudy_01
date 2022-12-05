package strategy_pattern.after.duck;

import strategy_pattern.after.flyBehavior.FlyNoWay;
import strategy_pattern.after.quackBehavior.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println(" ** Rubber **");
	}
}
