package strategy_pattern.after.quackBehavior;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("삑!");
	}
}
