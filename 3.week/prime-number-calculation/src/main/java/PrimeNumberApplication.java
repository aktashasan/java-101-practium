import java.util.Scanner;

public class PrimeNumberApplication {

    public static void main(String[] args) {

        for (int i=2;i<=100;i++){
            boolean primeNumber = false;
            for (int j =2;j<i;j++){
                if(i%j==0){                 //asal olup olmadığı kontrol edilir.
                    primeNumber = true;     //asal olmayanlar true döndürülür.
                }
            }
            if(!primeNumber){               //asal olmayanlar yanlış ise if içine girer
                System.out.print(i + " ");
            }
        }
    }
}
