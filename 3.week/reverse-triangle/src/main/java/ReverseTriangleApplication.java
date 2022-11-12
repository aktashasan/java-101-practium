import java.util.Scanner;

public class ReverseTriangleApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayısı : ");
        int number = scanner.nextInt();

        //ters üçgen
        for (int i = number; i >= 0; i--) {             //en büyükten başlayarak yıldızları sırala
            for (int j = (number - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
