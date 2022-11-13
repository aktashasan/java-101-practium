import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrderApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boyutu n : ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Dizinin Elemanlarını giriniz : ");

        for (int i=0 ; i< array.length;i++) {
            System.out.println((i+1) + ".Elemanı giriniz");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Sıralama : " + Arrays.toString(array));
    }
}
