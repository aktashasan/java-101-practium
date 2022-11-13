import java.util.Arrays;

public class DuplicateNumberApplication {
    public static void main(String[] args) {

        int[] list = {1, 2, 2, 3, 3, 4, 4, 6, 8, 10,12, 12, 14, 15, 17, 18};

        int[] evenNumber = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if(list[i]%2==0) {
                        if (!isFind(evenNumber,list[i])){
                            evenNumber[startIndex++]=list[i];
                        }
                        break;
                    }
                }
            }
        }
        System.out.print("Tekrar Eden Çift Sayılar: ");
        for (int value : evenNumber){
            if (value!=0){
                System.out.print(value+" ");
            }
        }
        System.out.println();

    }

    private static boolean isFind(int[] evenNumber, int value) {
        for (int i:evenNumber){
            if (i==value){
                return true;
            }
        }
        return false;
    }
}
