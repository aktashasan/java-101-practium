public class Calculation {

    public String calculation(int date) {

        if (date % 12 == 0) {
            return "Çin Zodyağı Burcunuz : Maymun";
        } else if (date % 12 == 1) {
            return "Çin Zodyağı Burcunuz : Horoz";
        } else if (date % 12 == 2) {
            return "Çin Zodyağı Burcunuz : Köpek";
        } else if (date % 12 == 3) {
            return "Çin Zodyağı Burcunuz : Domuz";
        } else if (date % 12 == 4) {
            return "Çin Zodyağı Burcunuz : Fare";
        } else if (date % 12 == 5) {
            return "Çin Zodiac Burcunuz : Öküz";
        } else if (date % 12 == 6) {
            return "Çin Zodyağı Burcunuz : Kaplan";
        } else if (date % 12 == 7) {
            return "Çin Zodiac Burcunuz : Tavşan";
        } else if (date % 12 == 8) {
            return "Çin Zodyağı Burcunuz : Ejderha";
        } else if (date % 12 == 9) {
            return "Çin Zodyağı Burcunuz : Yılan";
        } else if (date % 12 == 10) {
            return "Çin Zodyağı Burcunuz : At";
        } else if (date % 12 == 11) {
            return "Çin Zodyağı Burcunuz : Koyun";
        }
        return "";
    }
}
