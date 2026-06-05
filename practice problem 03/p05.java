import java.util.Scanner;

class p05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not prime");
            sc.close();
            return;
        }

        if (n == 2) {
            System.out.println("Prime");
            sc.close();
            return;
        }

        if (n % 2 == 0) {
            System.out.println("Not prime");
            sc.close();
            return;
        }

        boolean prime = true;
        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not prime");
        sc.close();
    }
}
