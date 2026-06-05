import java.util.Scanner;

class p01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many values? ");
        int n = sc.nextInt();
        double[] values = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double v : values) sum += v;
        double average = n > 0 ? sum / n : 0;

        System.out.printf("Average = %.2f%n", average);
        sc.close();
    }
}
