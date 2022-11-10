import java.util.Scanner;

public class LeapYearApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int year = scanner.nextInt();

        CalculationMethod calculationMethod = new CalculationMethod();

        System.out.println(calculationMethod.calculation(year));
    }
}
