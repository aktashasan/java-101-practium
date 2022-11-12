import java.util.Scanner;

public class FibonacciApplication {
    public static void main(String[] args) {

        int total = 1, b = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci serisi için eleman sayısı giriniz : ");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            System.out.print(b + " ");
            total += b;
            b = total - b;
        }

    }
}
