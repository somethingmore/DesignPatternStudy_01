package strategy_pattern.after_01.quackbehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("MuteQuack MuteQuack");
    }
}
