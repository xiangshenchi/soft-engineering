package Bird;

public class Eagle extends Bird {
    public Eagle() {
        flyBehavior = new AbleFly();
        swimBehavior = new UnableSwim();
    }
    
    public void display() {
        System.out.println("I'm an eagle");
    }
}

public class Penguin extends Bird {
    public Penguin() {
        flyBehavior = new UnableFly();
        swimBehavior = new AbleSwim();
    }
    
    public void display() {
        System.out.println("I'm a penguin");
    }
}