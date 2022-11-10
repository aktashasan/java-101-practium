public class CalculationMethod {

    public String calculation(Integer year) {

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return year + " artık bir yıldır.";
        } else if (year % 4 == 0 && year % 100 != 0) {
            return year + " artık bir yıldır.";
        } else {
            return year + " artık bir yıl değildir.";
        }
    }
}
