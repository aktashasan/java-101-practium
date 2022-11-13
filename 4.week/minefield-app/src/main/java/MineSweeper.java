import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int rowNumber;
    int colNumber;
    String[][] gameMap;
    String[][] mineMap;
    int size;


    MineSweeper(int rowNumber, int colNumber ){
        this.rowNumber = rowNumber;
        this.colNumber= colNumber;
        this.gameMap= new String [rowNumber][colNumber];
        this.mineMap = new String [rowNumber][colNumber];
        this.size =(this.rowNumber * this.colNumber)/4;
    }

    void gameMap(){
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                this.gameMap[i][j] = "-";
            }
        }
    }


    public void mine() {
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            int randomRow = rand.nextInt(rowNumber);
            int randomColumn = rand.nextInt(colNumber);

            if( this.mineMap[randomRow][randomColumn] != "*") {
                this.mineMap[randomRow][randomColumn] = "*";
            }else {
                i--;
            }
        }


        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < colNumber; j++){
                if(this.mineMap[i][j] != "*"){
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printMine(){
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < colNumber; j++){
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void run(){
        int totalMove = (rowNumber * colNumber) - size;
        Scanner input = new Scanner(System.in);

        gameMap();
        System.out.println("Mayınların Konumu");
        mine();
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz");

        while(totalMove > 0) {
            int mineCounter = 0;

            System.out.println("===========================");
            System.out.println("Kalan Hamle Hakkınız : " + totalMove);
            printMap();

            System.out.print("Satır Giriniz : ");
            int row = input.nextInt();

            System.out.print("Sütun Giriniz : ");
            int col = input.nextInt();


            if ((row < 0 || row >= rowNumber) || (col < 0 || col >= colNumber)) {
                System.out.println("Hatalı Giriş Yaptınız, Lütfen doğru index numarası giriniz !");
                continue;
            } else {
                if (this.mineMap[row][col] == "*") {
                    System.out.println("Game Over!!");
                    printMine();
                    break;
                }if( ! this.gameMap[row][col].equals("-") ){
                    System.out.println("Bu hamleyi zaten yaptınız !");
                    continue;
                }else{
                    int minusRow = (row - 1), plusRow = (row + 1);
                    int minusCol = (col - 1), plusCol = (col + 1);

                    if ( (minusRow < 0) || (minusCol < 0) ){
                        minusRow = 0;
                        minusCol = 0;
                    }
                    if( (plusRow >= rowNumber) || (plusCol >= colNumber) ){
                        plusRow = row;
                        plusCol = col;
                    }
                    for(int i = minusRow; i <= plusRow; i++){
                        for (int j = minusCol; j<= plusCol; j++){
                            if(this.mineMap[i][j] == "*"){
                                mineCounter++;
                            }
                        }
                    }
                    String convertMineCounter = String.valueOf(mineCounter);
                    this.gameMap[row][col] = convertMineCounter;
                    totalMove--;
                }
            }
        }
        if(totalMove == 0){
            System.out.println("Oyunu Kazandınız  !");
            printMap();
        }
    }

    public void printMap(){
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < colNumber; j++){
                System.out.print(this.gameMap[i][j] +  " ");
            }
            System.out.println();
        }
    }

}
