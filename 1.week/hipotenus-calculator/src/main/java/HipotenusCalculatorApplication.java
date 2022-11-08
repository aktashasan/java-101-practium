import java.util.Scanner;

public class HipotenusCalculatorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. kenarı giriniz: ");
        int a = scanner.nextInt();

        System.out.println("1. kenarı giriniz: ");
        int b = scanner.nextInt();

        double c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);
    }
}
