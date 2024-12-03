package Hotel;

public class User {
    private String name;
    private DiscountStrategy discountStrategy;

    public User(String name, DiscountStrategy discountStrategy) {
        this.name = name;
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice(double basePrice) {
        return discountStrategy.calculatePrice(basePrice);
    }

    public String getName() {
        return name;
    }
}