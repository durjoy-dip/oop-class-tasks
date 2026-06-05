import java.util.Scanner;

class p02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA (e.g. 3.6): ");
        double grade = sc.nextDouble();
        System.out.print("Has the student completed the semester? (true/false): ");
        boolean completed = sc.nextBoolean();

        if (completed) {
            if (grade >= 3.5) {
                System.out.println("Result: Award medal");
            } else {
                System.out.println("Result: No medal (grade below threshold)");
            }
        } else {
            System.out.println("Result: No medal (semester not completed)");
        }

        sc.close();
    }
}
