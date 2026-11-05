

public class Main {
    public static void main(String[] args) {

        // Task 1: Count up from 0 to 30
        System.out.println("Task 1:");
        for (int num = 0; num <= 30; num++) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Task 2: Count down from 30 to 0
        System.out.println("Task 2:");
        for (int num = 30; num >= 0; num--) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Task 3: Count up by 3 from 0 to 18
        System.out.println("Task 3:");
        for (int num = 0; num <= 18; num += 3) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Task 4: Count down by 2 from 10 to 0
        System.out.println("Task 4:");
        for (int num = 10; num >= 0; num -= 2) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Task 5: Print an increasing triangle
        System.out.println("Task 5:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Task 6: Print a decreasing triangle
        System.out.println("Task 6:");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Task 7: Print a square
        System.out.println("Task 7:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
