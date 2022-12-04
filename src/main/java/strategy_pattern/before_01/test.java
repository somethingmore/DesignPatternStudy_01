package strategy_pattern.before_01;

public class test {
    public static void main(String[] args) {
        Duck duck = new RedheadDuck();
        duck.display();
        duck.swim();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.fly();
        redheadDuck.swim();
        redheadDuck.display();
        redheadDuck.quack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.quack();

    }

}
