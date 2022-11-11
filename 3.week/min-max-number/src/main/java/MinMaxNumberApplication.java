import java.util.Scanner;

public class MinMaxNumberApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int count = scanner.nextInt();

        int number, min=2_147_483_647, max=-2_147_483_647;

        for (int i =1; i<=count;i++){
            System.out.print(i + ". sayıyı giriniz:");
            number= scanner.nextInt();

            if(i==0){
                min = number;
                max = number;
            }
            if(number > max){
                max = number;
            }
            if(number< min){
                min = number;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
