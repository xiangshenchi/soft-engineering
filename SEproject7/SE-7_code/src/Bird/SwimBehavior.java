package Bird;

public interface SwimBehavior {
    void swim();
}

public class AbleSwim implements SwimBehavior {
    public void swim() {
        System.out.println("鱼翔浅底");
    }
}

public class UnableSwim implements SwimBehavior {
    public void swim() {
        System.out.println("扑腾几下就淹死了");
    }
}

// 更新Bird类
public abstract class Bird {
    protected FlyBehavior flyBehavior;
    protected SwimBehavior swimBehavior;
    
    public abstract void display();
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performSwim() {
        swimBehavior.swim();
    }
}