import java.util.Scanner;

class p05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double side = sc.nextDouble();
        double area = (Math.sqrt(3) / 4.0) * side * side;
        System.out.printf("Area of equilateral triangle = %.4f\n", area);
        sc.close();
    }
}
