import java.util.Scanner;

public class ArrayTransposeApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır Sayısı : ");    //satır sayısı girilir.
        int row = scanner.nextInt();

        System.out.print("Sütun Sayısı : ");    //sütun sayısı girilir.
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Matris : ");        //matris elemanları girilir.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((i + 1) + ". satırın " + (j + 1) + ". elemanını giriniz: ");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matris : ");        //ekrana matris basılır.
        for (int i[] : matrix) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        int[][] newMatrix = new int[column][row];   //yeni matris oluşturulur.

        System.out.println("Transpoze : ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                newMatrix[i][j] = matrix[j][i];     //ilk matristeki satır ve sütun yer değiştirilerek yeni matrise akrarılır
                System.out.print(newMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
