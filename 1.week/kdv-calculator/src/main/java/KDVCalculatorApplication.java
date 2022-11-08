import java.util.Scanner;

public class KDVCalculatorApplication {
    public static void main(String[] args) {
        double total, kdv = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz: ");
        total = scanner.nextDouble();

        kdv = (total >= 0 && total < 1000.0) ? 0.18 : 0.08;

        double kdvtotal = (kdv * total) + total;
        double withkdv = total + kdvtotal;

        System.out.println("KDV'siz Fiyat:" + total);
        System.out.println("KDV'li Fiyat:" + withkdv);
        System.out.println("KDV tutarı:" + (withkdv - total));

    }
}
