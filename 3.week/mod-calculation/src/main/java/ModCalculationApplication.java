import java.util.Scanner;

public class ModCalculationApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0, counter = 0;

        System.out.println("Sayı giriniz : ");
        int sayi = scanner.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                counter++;
            }
        }

        System.out.println("Ortalama : " + total / counter);
    }
}
