import java.util.Scanner;

public class PointCalculatorApplication {
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history, music;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notu: ");
        math = scanner.nextInt();

        System.out.println("Fizik notu: ");
        physics = scanner.nextInt();

        System.out.println("Kimya notu: ");
        chemistry = scanner.nextInt();

        System.out.println("Türkçe notu: ");
        turkish = scanner.nextInt();

        System.out.println("Tarih notu: ");
        history = scanner.nextInt();

        System.out.println("Müzik notu: ");
        music = scanner.nextInt();

        int total = math + physics + chemistry + turkish + history + music;
        double average = total / 6;

        String stdout = average > 60 ? "Sınıfı geçti" : "Sınıfta kaldı";

        System.out.println(stdout);

    }
}
