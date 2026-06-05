import java.util.Scanner;

class p03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales achievement percent (e.g. 95): ");
        double sales = sc.nextDouble();
        System.out.print("Enter attendance percent (e.g. 100): ");
        double attendance = sc.nextDouble();

        int bonusPercent;
        if (sales >= 95 && attendance == 100) {
            bonusPercent = 60;
        } else if (sales >= 95 && attendance >= 90) {
            bonusPercent = 40;
        } else if (sales >= 80 && attendance == 100) {
            bonusPercent = 40;
        } else if (sales >= 80 && attendance >= 90) {
            bonusPercent = 20;
        } else {
            bonusPercent = 5;
        }

        System.out.println("Bonus: " + bonusPercent + "%");
        sc.close();
    }
}
