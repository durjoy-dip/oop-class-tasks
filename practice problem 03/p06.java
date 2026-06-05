import java.util.Scanner;

class p06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextDouble();

        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) System.out.print(" ");
            double v = a[i];
            if (v == (long) v) System.out.print((long) v);
            else System.out.print(v);
        }
        System.out.println();
        sc.close();
    }
}
