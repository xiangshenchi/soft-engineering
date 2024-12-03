package Bird;

public abstract class Bird {
    protected FlyBehavior flyBehavior;
    
    public abstract void display();
    
    public void performFly() {
        flyBehavior.fly();
    }
}

public interface FlyBehavior {
    void fly();
}

public class AbleFly implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}