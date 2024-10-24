public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Picking up vehicle with plate number: " + plateNumber);
    }

    @Override
    public void serviceMethod() {
    }
}
