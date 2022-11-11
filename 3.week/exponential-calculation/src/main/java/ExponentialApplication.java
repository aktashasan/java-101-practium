import java.util.Scanner;

public class ExponentialApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 1;
        System.out.println("Üssü alınacak sayıyı giriniz : ");
        int a = scanner.nextInt();

        System.out.println("Üs olacak sayıyı giriniz : ");
        int b = scanner.nextInt();

        for (int i = 0; i < b; i++) {

            total*=a;
        }

        System.out.println(a + "^"+b+" = "+total);
    }
}
