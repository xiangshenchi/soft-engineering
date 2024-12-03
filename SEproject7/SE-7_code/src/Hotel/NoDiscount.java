package Hotel;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice;
    }
}

public class GoldCardDiscount implements DiscountStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 0.8; // 8折
    }
}

public class SilverCardDiscount implements DiscountStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 0.9; // 9折
    }
}