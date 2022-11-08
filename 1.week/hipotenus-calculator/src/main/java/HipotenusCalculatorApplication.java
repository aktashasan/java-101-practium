import java.util.Scanner;

public class HipotenusCalculatorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. kenarı giriniz: ");
        int a = scanner.nextInt();

        System.out.println("2. kenarı giriniz: ");
        int b = scanner.nextInt();

        System.out.println("3. kenarı giriniz: ");
        int c = scanner.nextInt();

        double u = (a + b + c) / 2;
        double alan;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));


        System.out.println("Üçgenin çevresi : " + (u * 2));
        System.out.println("Üçgenin alanı : " + alan);
    }
}
