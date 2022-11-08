import java.util.Scanner;

public class GroceryStoreApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Armut Kaç Kilo ? :");
        var pear = scanner.nextInt();

        System.out.println("Elma Kaç Kilo ? :");
        var apple = scanner.nextInt();

        System.out.println("Domates Kaç Kilo ? :");
        var tomato = scanner.nextInt();

        System.out.println("Muz Kaç Kilo ? :");
        var banana = scanner.nextInt();

        System.out.println("Patlıcan Kaç Kilo ? :");
        var aubergine = scanner.nextInt();

        GroceryCalculate groceryCalculate = new GroceryCalculate();

        System.out.println("Toplam Tutar : " + groceryCalculate.calculate(pear, apple, tomato, banana, aubergine));



    }
}
