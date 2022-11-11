import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n1 sayısını giriniz : ");
        int n1 = scanner.nextInt();

        System.out.println("n2 sayısını giriniz : ");
        int n2 = scanner.nextInt();

        int ebob = 1, i = 1;

        if (n1 < n2) {

            while (i <= n1 && i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("EBOB(" + n1 + "," + n2 + ") = " + ebob);

            int ekok = 1, j = n1;
            while (j <= n1 * n2) {
                if (j % n1 == 0 && j % n2 == 0) {
                    ekok = j;
                    break;
                }
                j++;
            }
            System.out.println("EKOK(" + n1 + "," + n2 + ") = " + ekok);


        }
    }
}
