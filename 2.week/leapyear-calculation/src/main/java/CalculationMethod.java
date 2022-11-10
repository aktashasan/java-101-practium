public class CalculationMethod {

    public String calculation(Integer year){

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    return year+" artık bir yıldır.";
                }else{
                    return year+" artık bir yıl değildir.";
                }
            }else {
                return year+" artık bir yıldır.";
            }
        } else{
            return year+" artık bir yıl değildir.";
        }
    }
}
