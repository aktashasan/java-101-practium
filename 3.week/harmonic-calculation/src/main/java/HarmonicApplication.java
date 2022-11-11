import java.util.Scanner;

public class HarmonicApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("N sayısını giriniz : ");
       int number = scanner.nextInt();

       double total = 0;

       for (int i=1;i<=number;i++){
            total+=1.0/number;
       }
        System.out.println("Harmonik = " + total);
    }
}
