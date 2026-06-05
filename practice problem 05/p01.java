class p01 {
    String owner;
    String brand;
    String serialNumber;
    double fuelLevel; // in liters
    boolean running;

    p01() {
        this("Unknown", "Generic", "0000", 0.0);
    }

    p01(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.running = false;
    }

    void start() {
        if (running) {
            System.out.println("Car is already running.");
            return;
        }
        if (fuelLevel <= 0) {
            System.out.println("Cannot start: no fuel.");
            return;
        }
        running = true;
        System.out.println(brand + " started.");
    }

    void stop() {
        if (!running) {
            System.out.println("Car is already stopped.");
            return;
        }
        running = false;
        System.out.println(brand + " stopped.");
    }

    void checkFuel() {
        System.out.printf("Fuel level: %.2f L\n", fuelLevel);
    }

    void drive(double km) {
        if (!running) {
            System.out.println("Start the car first.");
            return;
        }
        double consumption = km * 0.08; // simple consumption model
        if (consumption > fuelLevel) {
            System.out.println("Not enough fuel for the trip.");
            return;
        }
        fuelLevel -= consumption;
        System.out.printf("Drove %.1f km, fuel now %.2f L\n", km, fuelLevel);
    }

    public static void main(String[] args) {
        p01 c1 = new p01("Aisha", "Toyota", "T1234", 40.0);
        p01 c2 = new p01("Rahim", "Honda", "H5678", 0.0);

        c1.checkFuel();
        c1.start();
        c1.drive(50);
        c1.stop();

        c2.checkFuel();
        c2.start(); // this should warn about no fuel
    }
}
