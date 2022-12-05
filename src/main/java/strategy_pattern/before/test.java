package strategy_pattern.before;

public class test {
	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.fly();
		mallard.quack();

		RedheadDuck redhead = new RedheadDuck();
		redhead.display();
		redhead.swim();
		redhead.fly();
		redhead.quack();

		RubberDuck rubber = new RubberDuck();
		rubber.display();
		rubber.swim();
		rubber.fly();
		rubber.quack();
	}
}
