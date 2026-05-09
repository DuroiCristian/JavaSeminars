package exercitii;

public class Car extends Vehicle {

    private int doors;

    public Car(String brand,
               double speed,
               String id,
               int mileage,
               int doors) {

        super(brand, speed, id, mileage);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " car is moving");
    }

    @Override
    public boolean needsService() {
        return getMileage() >= 10000;
    }

    @Override
    public double rentalPrice(int days) {

        double price = 50 * days;

        if (doors >= 4) {
            price = price + price * 0.1;
        }

        return price;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Car)) {
            return false;
        }

        Car car = (Car) obj;

        return this.getId().equals(car.getId());
    }
}
