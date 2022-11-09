import java.util.Scanner;

public class CircleApplication {
    public static void main(String[] args) {

        double pi=3.14;
        int  r, corner;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz : ");
        r= scanner.nextInt();

        System.out.println("Daire diliminin açısını giriniz : ");
        corner= scanner.nextInt();

        System.out.println("Daire diliminin alanı :" + ((pi*Math.pow(r,2)*corner)/360));

    }
}
