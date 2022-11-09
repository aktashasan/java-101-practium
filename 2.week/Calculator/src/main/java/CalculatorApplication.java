import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        int a, b, select;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        a = scanner.nextInt();

        System.out.println("İkinci sayiyi giriniz: ");
        b = scanner.nextInt();

        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");

        System.out.println("Seçiminiz");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+ (a +b));
                break;
            case 2:
                System.out.println("Çıkarma: " + (a-b));
                break;
            case 3:
                System.out.println("Çarpma: " + (a*b));
                break;
            case 4:
                System.out.println("Bölme: " + (a/b));
                break;
        }

    }
}
