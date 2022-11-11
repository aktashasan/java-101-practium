import java.util.Scanner;

public class CombinationApplication {
    public static void main(String[] args) {

        int total1=1,total2=1,total3=1,total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("C(n,r)\n Kombinasyon için n sayısını giriniz : ");
        int a = scanner.nextInt();
        System.out.println("C(n,r)\n Kombinasyon için r sayısını giriniz : ");
        int b = scanner.nextInt();

        for (int i=1;i<=a;i++){
            total1*=i;
        }
        for (int i=1;i<=b;i++){
            total2*=i;
        }
        for (int i=1;i<=(a-b);i++){
            total3*=i;
        }
        total= (total1)/(total2*total3);

        System.out.println("C("+a + ","+b+") = " +total);
    }
}
