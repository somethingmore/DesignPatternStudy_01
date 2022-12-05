package strategy_pattern.after.duck;

import strategy_pattern.after.flyBehavior.FlyWithWings;
import strategy_pattern.after.quackBehavior.Squeak;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("** Mallard **");
	}
}
