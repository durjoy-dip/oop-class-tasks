import java.util.Scanner;

class p07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Input is a positive integer.");
        } else if (n == 0) {
            System.out.println("Input is zero (not positive).");
        } else {
            System.out.println("Input is not a positive integer.");
        }

        sc.close();
    }
}
