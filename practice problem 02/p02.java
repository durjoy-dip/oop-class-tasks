import java.util.Scanner;

class p02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long sumOdd = 0;
        long sumEven = 0;

        for (int i = 1; i <= n; i += 2) {
            sumOdd += i;
            System.out.print(i + (i + 2 <= n ? " " : ""));
        }
        System.out.println();

        for (int i = 2; i <= n; i += 2) {
            sumEven += i;
            System.out.print(i + (i + 2 <= n ? " " : ""));
        }
        System.out.println();

        System.out.println(sumOdd);
        System.out.println(sumEven);

        sc.close();
    }
}
