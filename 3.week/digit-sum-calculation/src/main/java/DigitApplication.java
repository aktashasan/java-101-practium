import java.util.Scanner;

public class DigitApplication {
    public static void main(String[] args) {
        int number, value, total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz:");
        number= scanner.nextInt();


        while (number != 0) {
            value = number % 10;
            total += value;
            number /= 10;
        }
        System.out.println(total);
    }
}
