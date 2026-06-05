import java.util.Scanner;

class p04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("No numbers provided");
            sc.close();
            return;
        }

        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            double v = sc.nextDouble();
            if (v > max) max = v;
        }

        if (max == Double.NEGATIVE_INFINITY) {
            System.out.println("No numbers provided");
        } else {
            if (max == (long) max) {
                System.out.println((long) max);
            } else {
                System.out.println(max);
            }
        }

        sc.close();
    }
}
