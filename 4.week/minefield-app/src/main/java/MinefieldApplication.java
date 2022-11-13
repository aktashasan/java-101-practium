import java.util.Scanner;

public class MinefieldApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int row = scanner.nextInt();
        System.out.print("Satır sayısını giriniz: ");
        int column = scanner.nextInt();

        if(row> 1 && column > 1 ) {
            MineSweeper mine = new MineSweeper(row, column);
            mine.run();
        }
        else {
            System.out.println("Geçersiz satır sütun sayısı girdiniz.");
        }

    }
}
