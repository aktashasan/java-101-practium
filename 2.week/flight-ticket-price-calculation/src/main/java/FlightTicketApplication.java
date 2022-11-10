import java.util.Scanner;

public class FlightTicketApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        int distance = scanner.nextInt();

        System.out.println("Yaşınızı giriniz : ");
        int age = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int type = scanner.nextInt();

        if (distance <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        } else if (age < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        } else if (!(type == 1 || type == 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        CalculationMethod cm = new CalculationMethod();

        System.out.println("Toplam Tutar = " + cm.calculation(distance, age, type));


    }
}
