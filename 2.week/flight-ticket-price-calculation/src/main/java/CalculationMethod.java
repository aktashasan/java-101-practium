public class CalculationMethod {

    public Double calculation(Integer distance, Integer age, Integer type) {
        double total, ageDiscount = 0, roundTripDiscount = 0;

        total = distance * 0.10;

        if (age >= 0 && age <= 12) {
            ageDiscount = total - (total * 0.50);
            return ageDiscount;
        } else if (age > 12 && age <= 24) {
            ageDiscount = total - (total * 0.10);
            return ageDiscount;
        } else if (age >= 65) {
            ageDiscount = total - (total * 0.10);
            return ageDiscount;
        }
        if (type == 2) {
            roundTripDiscount = (ageDiscount - (ageDiscount * 0.20)) * 2;
            return roundTripDiscount;
        }

        return total;

    }
}
