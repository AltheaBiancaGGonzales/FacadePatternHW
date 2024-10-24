public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.handleValet("ABC123");
        frontDesk.handleCleaning(101);
        frontDesk.handleCartRequest(2);
    }
}
