import java.util.Scanner;

public class NumberApplication {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz : ");
        a = scanner.nextInt();

        System.out.println("2. sayıyı giriniz : ");
        b = scanner.nextInt();

        System.out.println("3. sayıyı giriniz : ");
        c = scanner.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("sayi sırası: " + a + "," + b + "," + c);
            }else {
                System.out.println("sayi sırası: " + a + "," + c + "," + b);
            }
        } else if (b > a && b > c) {
            if(a>c){
                System.out.println("sayi sırası: " + b + "," + a + "," + c);
            }else {
                System.out.println("sayi sırası: " + b + "," + c + "," + a);
            }
        }else {
            if (a>b){
                System.out.println("sayi sırası: " + c + "," + a + "," + b);
            }else {
                System.out.println("sayi sırası: " + c + "," + b + "," + a);
            }
        }
    }
}
