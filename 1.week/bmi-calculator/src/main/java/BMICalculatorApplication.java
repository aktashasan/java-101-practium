import java.util.Scanner;

public class BMICalculatorApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        var height = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        var weight = scanner.nextInt();

        BMIMethod bmi = new BMIMethod();
        System.out.println("Vücut Kitle İndeksiniz : " + bmi.calculate(height, weight));

    }
}
