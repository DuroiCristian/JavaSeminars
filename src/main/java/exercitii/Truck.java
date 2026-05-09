package exercitii;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String brand,
                 double speed,
                 String id,
                 int mileage,
                 double loadCapacity) {

        super(brand, speed, id, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " truck is moving");
    }

    @Override
    public boolean needsService() {
        return getMileage() >= 15000;
    }

    @Override
    public double rentalPrice(int days) {

        return (80 + 0.02 * loadCapacity) * days;
    }
}