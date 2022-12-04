package strategy_pattern.after_01.flybehavior;

// 날 수 없는 오리들의 나는 행동을 구현한 클래스
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("can't fly");
    }
}
