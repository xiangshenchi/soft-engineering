package Hotel;

public class HotelBookingSystem {
    public void bookRoom(User user, double basePrice) {
        double finalPrice = user.calculatePrice(basePrice);
        System.out.println(user.getName() + " booked a room. Base price: " + basePrice + 
                           ", Final price: " + finalPrice);
    }
}