import java.util.Scanner;

public class PatternApplication {

    static void pattern(int number){
        System.out.print(number + " ");  // recursive method çağrılarını bitirene kadar giden sayılar geri döner

        if (number >0){                 //girilen sayı 0 dan büyüktür ve işlem sonucu negatif olana kadar if'e girecek
            pattern((number - 5));
            System.out.print(number + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");     //N sayısıı giriniz
        int number = scanner.nextInt();

        System.out.print("Çıktısı : ");
        pattern(number);


    }
}
