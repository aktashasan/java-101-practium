import java.util.Scanner;

public class TaximeterApplication {

    public static void main(String[] args) {
        double total = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi KM olarak giriniz : ");
        int km = scanner.nextInt();

        total += km * 2.20; // perKM = 2.20

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam tutar : " + total);


    }
}
