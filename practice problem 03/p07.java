import java.util.Scanner;

class p07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            long v = sc.nextLong();
            if (v % 2 == 0) evenCount++; else oddCount++;
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
        sc.close();
    }
}
