package exercitii;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("BMW", 220, "C1", 9000, 4);
        vehicles[1] = new Motorcycle("Yamaha", 180, "M1", 4000, true);
        vehicles[2] = new Truck("Volvo", 140, "T1", 12000, 5000);

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }

        Car car1 = new Car("Audi", 240, "A1", 1000, 4);
        Car car2 = new Car("Audi", 240, "A1", 1000, 4);

        System.out.println(car1.equals(car2));

        Garage garage = new Garage(10);

        garage.add(new Car("BMW", 220, "C1", 9000, 4));
        garage.add(new Car("Audi", 240, "C2", 11000, 2));
        garage.add(new Motorcycle("Honda", 170, "M1", 7000, false));
        garage.add(new Motorcycle("Yamaha", 180, "M2", 3000, true));
        garage.add(new Truck("MAN", 130, "T1", 16000, 8000));

        garage.rentById("C1");
        garage.rentById("M2");

        garage.returnById("C1", 500);

        System.out.println("Available vehicles:");
        garage.printAvailable();

        System.out.println("Vehicles that need service:");
        garage.printNeedsService();

        System.out.println("Rental estimate:");
        garage.printRentalEstimate("T1", 5);
    }
}