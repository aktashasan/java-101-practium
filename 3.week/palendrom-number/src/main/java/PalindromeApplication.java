import java.util.Scanner;

public class PalindromeApplication {

    static boolean isPalindrome(int number){

        int temp =number, reverseNumber=0,lastNumber;
        while(temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return reverseNumber == number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        int check = scanner.nextInt();

        if (isPalindrome(check)){
            System.out.println("Palindrome sayıdır.");
        }else {
            System.out.println("Palindrome sayı değildir.");
        }


    }
}
