import java.util.Scanner;

class p09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark (0-100): ");
        int mark = sc.nextInt();

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid mark. Please enter a value between 0 and 100.");
        } else if (mark <= 39) {
            System.out.println("Grade: F");
        } else if (mark <= 59) {
            System.out.println("Grade: C+");
        } else if (mark <= 69) {
            System.out.println("Grade: B");
        } else if (mark <= 79) {
            System.out.println("Grade: A-");
        } else if (mark <= 89) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Grade: A+");
        }

        sc.close();
    }
}
