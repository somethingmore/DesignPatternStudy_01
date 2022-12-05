package strategy_pattern.after.duck;

import strategy_pattern.after.flyBehavior.FlyNoWay;
import strategy_pattern.after.quackBehavior.Squeak;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다.");
	}


}
