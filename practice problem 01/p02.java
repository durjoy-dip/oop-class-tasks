import java.util.Scanner;

class p02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
        System.out.printf("Volume of sphere = %.4f\n", volume);
        sc.close();
    }
}
