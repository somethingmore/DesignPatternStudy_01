package strategy_pattern.after;

import strategy_pattern.after.duck.Duck;
import strategy_pattern.after.duck.MallardDuck;
import strategy_pattern.after.duck.ModelDuck;
import strategy_pattern.after.flyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
