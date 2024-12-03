package Hotel;

public class Client {
    public static void main(String[] args) {
        HotelBookingSystem bookingSystem = new HotelBookingSystem();

        User normalUser = new User("John", new NoDiscount());
        User silverUser = new User("Alice", new SilverCardDiscount());
        User goldUser = new User("Bob", new GoldCardDiscount());

        double basePrice = 100.0;

        bookingSystem.bookRoom(normalUser, basePrice);
        bookingSystem.bookRoom(silverUser, basePrice);
        bookingSystem.bookRoom(goldUser, basePrice);

        // 假设John升级到了金卡
        normalUser.setDiscountStrategy(new GoldCardDiscount());
        bookingSystem.bookRoom(normalUser, basePrice);
    }
}