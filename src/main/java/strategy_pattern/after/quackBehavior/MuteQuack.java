package strategy_pattern.after.quackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< 조용 ~ >>");
	}
}
