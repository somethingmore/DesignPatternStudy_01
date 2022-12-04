package strategy_pattern.after_01;

import strategy_pattern.after_01.duck.DecoyDuck;
import strategy_pattern.after_01.duck.Duck;
import strategy_pattern.after_01.duck.RubberDuck;
import strategy_pattern.after_01.flybehavior.FlyNoWay;
import strategy_pattern.after_01.flybehavior.FlyWithWings;
import strategy_pattern.after_01.quackbehavior.MuteQuack;
import strategy_pattern.after_01.quackbehavior.Quack;

public class test {
    public static void main(String[] args) {
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();

        // DecoyDuck 에서 상속받은 performQuack()이 호출 된다. 이 메소드에는 객체의 QuackBehavior에게 할 일을 위힘한다.
        // 즉 quackBehavior 레퍼런스의 quack() 이 호출 된다.
        decoyDuck.performQuack();
        decoyDuck.performFly();

        //이렇게 하면 행동 세터 메소드가 호출된다. 속성이 변하게 된다.
        decoyDuck.setFlyBehavior(new FlyWithWings());
        decoyDuck.setQuackBehavior(new Quack());

        decoyDuck.performQuack();
        decoyDuck.performFly();
        decoyDuck.swim();

        //rubberDuck 은 RubberDuck 생성 시 날 수 없게 , mute 꽥 하게 해보았다.
        Duck rubberDuck = new RubberDuck(new FlyNoWay(), new MuteQuack());

        rubberDuck.display();

        //Duck 의 swim 이 아닌 RubberDuck 의 swim 동작
        rubberDuck.swim();

        rubberDuck.performQuack();
        rubberDuck.performFly();

        //rubberDuck 속성 변경
        rubberDuck.setQuackBehavior(new Quack());
        rubberDuck.setFlyBehavior(new FlyWithWings());

        rubberDuck.performQuack();
        rubberDuck.performFly();
    }

}
