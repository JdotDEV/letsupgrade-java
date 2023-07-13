import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter five integers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Sum of the five integers: " + sum);

        scanner.close();
        //Hello wassup
    }
}
