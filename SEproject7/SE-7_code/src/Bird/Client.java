package Bird;

public class Client {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        
        eagle.display();
        eagle.performFly();
        eagle.performSwim();
        
        penguin.display();
        penguin.performFly();
        penguin.performSwim();
    }
}