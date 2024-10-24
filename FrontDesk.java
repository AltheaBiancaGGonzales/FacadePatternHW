public class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        housekeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void handleValet(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void handleCleaning(int roomNumber) {
        housekeeping.cleanRoom(roomNumber);
    }

    public void handleCartRequest(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}
