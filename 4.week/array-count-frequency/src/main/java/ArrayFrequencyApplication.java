import java.util.Arrays;

public class ArrayFrequencyApplication {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];

        System.out.println("Dizi : " + Arrays.toString(list));

        int visited = -1;
        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    duplicate[j] = visited;
                }
            }
            if (duplicate[i] != visited)
                duplicate[i] = count;
        }
        System.out.println("Tekrar sayıları");
        for (int i = 0; i < duplicate.length; i++) {
            if (duplicate[i] != visited)
                System.out.println(list[i] + " sayısı " + duplicate[i] + " kere tekrar edildi.");
        }
    }
}
