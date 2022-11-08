public class GroceryCalculate {

    public Double calculate(Integer pear, Integer apple,Integer tomato, Integer banana, Integer aubergine){
        Double total = 0.0;

        total = (pear * 2.14) + (apple * 3.67) + (tomato * 1.11) + (banana * 0.95)+(aubergine * 5.00);

        return total;
    }
}
