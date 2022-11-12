import java.util.Scanner;

public class BaseCalculationApplication {

    static Double baseCalculate(Integer a, Integer b) {
        if (b > 0) {
            return a * baseCalculate(a, (b -1));
        } else if (b < 0) {
            return baseCalculate(a, b + 1) / a;
        }else {
            return 1.0;
        }


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz :");
        int a = scanner.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int b = scanner.nextInt();

        System.out.println("\na ^ b = " + baseCalculate(a, b));

    }
}
