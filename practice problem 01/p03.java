import java.util.Scanner;

class p03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.printf("Area of circle = %.4f\n", area);
        sc.close();
    }
}
