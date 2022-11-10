import java.util.Scanner;

public class WeatherApplication {
    public static void main(String[] args) {
        int temperature;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hava sıcaklığını giriniz: ");
        temperature = scanner.nextInt();

        if (temperature <5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temperature >= 5 && temperature < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temperature >= 15 && temperature<25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else if (temperature >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
