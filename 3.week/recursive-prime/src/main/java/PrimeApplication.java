import java.util.Scanner;

public class PrimeApplication {

    static void isPrime(Integer number, Integer i){

        if(i==number){
            System.out.println(number + " sayısı ASALDIR !");
            return;
        } else if (number%i==0) {
            System.out.println( number +" sayısı ASAL değildir !" );
            return;
        }
        isPrime(number, i+1);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı  giriniz : ");
        int number = scanner.nextInt();

        isPrime(number,2);

    }

}
