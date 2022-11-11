import java.util.Scanner;

public class OddNumbersApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, total = 0;

        do {
            System.out.println("Sayı giriniz : ");
            n = scanner.nextInt();
            if (n % 4 == 0) {
                total += n;
            }

        } while (n % 2 == 0);

        System.out.println("Toplam : " + total);

    }
}
