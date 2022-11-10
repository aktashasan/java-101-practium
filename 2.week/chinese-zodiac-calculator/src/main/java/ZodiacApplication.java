import java.util.Scanner;

public class ZodiacApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz :");
        int date = scanner.nextInt();

        Calculation calculation = new Calculation();
        System.out.println(calculation.calculation(date));
    }
}
