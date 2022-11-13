import java.util.Arrays;
import java.util.Scanner;

public class ArrayApplication {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Arrays.sort(list);

        int min = list[0];
        int max = list[6];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Girilen sayı: ");
        int number = scanner.nextInt();

        for (int i : list) {
            if (i > min && i < number) {
                min = i;
            }

            if (i < max && i > number) {
                max = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
