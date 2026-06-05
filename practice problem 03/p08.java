import java.util.Scanner;

class p08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if (t <= 0) {
            sc.close();
            return;
        }

        long a = 0, b = 1;
        System.out.print(a);

        for (int i = 2; i <= t; i++) {
            System.out.print(" " + b);
            long next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
        sc.close();
    }
}
