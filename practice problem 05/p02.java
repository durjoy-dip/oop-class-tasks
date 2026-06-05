class p02 {
    String name;
    int age;
    String breed;

    p02() {
        this("Unknown", 0, "Mixed");
    }

    p02(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " says: Woof!");
    }

    void run(int meters) {
        System.out.println(name + " runs " + meters + " meters.");
    }

    void spin() {
        System.out.println(name + " spins happily.");
    }

    public static void main(String[] args) {
        p02 d = new p02("Bobby", 3, "Beagle");
        d.bark();
        d.run(20);
        d.spin();
    }
}
