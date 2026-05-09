package exercitii;

public class Garage {

    private Vehicle[] fleet;
    private int size;

    public Garage(int capacity) {
        fleet = new Vehicle[capacity];
        size = 0;
    }

    public void add(Vehicle vehicle) {

        if (size == fleet.length) {
            System.out.println("Garage is full");
            return;
        }

        if (findById(vehicle.getId()) != null) {
            System.out.println("Duplicate id");
            return;
        }

        fleet[size] = vehicle;
        size++;
    }

    public Vehicle findById(String id) {

        for (int i = 0; i < size; i++) {

            if (fleet[i].getId().equals(id)) {
                return fleet[i];
            }
        }

        return null;
    }

    public void rentById(String id) {

        Vehicle vehicle = findById(id);

        if (vehicle != null) {
            vehicle.rent();
        }
    }

    public void returnById(String id, int drivenKm) {

        Vehicle vehicle = findById(id);

        if (vehicle != null) {
            vehicle.returnVehicle(drivenKm);
        }
    }

    public void printAvailable() {

        for (int i = 0; i < size; i++) {

            if (!fleet[i].isRented()) {
                System.out.println(fleet[i].getBrand());
            }
        }
    }

    public void printNeedsService() {

        for (int i = 0; i < size; i++) {

            if (fleet[i].needsService()) {
                System.out.println(fleet[i].getBrand());
            }
        }
    }

    public void printRentalEstimate(String id, int days) {

        Vehicle vehicle = findById(id);

        if (vehicle != null) {
            System.out.println(vehicle.rentalPrice(days));
        }
    }
}
