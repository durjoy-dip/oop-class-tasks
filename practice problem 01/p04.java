import java.util.Scanner;

class p04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = (9.0 * c) / 5.0 + 32.0;
        System.out.printf("Temperature in Fahrenheit = %.2f\n", f);
        sc.close();
    }
}
