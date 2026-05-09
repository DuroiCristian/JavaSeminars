package exercitii;

public abstract class Vehicle {
    private String brand;
    private double speed;

    private String id;
    private int mileage;
    private boolean rented;

    public Vehicle(String brand, double speed, String id, int mileage) {
        this.brand = brand;
        this.speed = speed;
        this.id = id;
        this.mileage = mileage;
        this.rented = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getId() {
        return id;
    }

    public int getMileage() {
        return mileage;
    }

    public boolean isRented() {
        return rented;
    }

    public void rent() {
        if (rented) {
            throw new RuntimeException("Vehicle already rented");
        }

        rented = true;
    }

    public void returnVehicle(int drivenKm) {
        if (!rented) {
            throw new RuntimeException("Vehicle is not rented");
        }

        if (drivenKm <= 0) {
            throw new RuntimeException("Driven km must be greater than 0");
        }

        mileage += drivenKm;
        rented = false;
    }

    public abstract void move();

    public abstract boolean needsService();

    public abstract double rentalPrice(int days);
}