package strategy_pattern.after_01.duck;

import strategy_pattern.after_01.flybehavior.FlyBehavior;
import strategy_pattern.after_01.quackbehavior.QuackBehavior;

public abstract class Duck {

    // 행동 인터페이스 형식의 레퍼런스 변수 두개를 선언한다.모든 서브클래스에서 이변수를 상속 받는다.
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    //행동 클래스에 위임한다.
    public void performQuack() {
        quackBehavior.quack();
    }

    //행동 클래스에 위임한다.
    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("swim swim");
    }

    public abstract void display();
}
