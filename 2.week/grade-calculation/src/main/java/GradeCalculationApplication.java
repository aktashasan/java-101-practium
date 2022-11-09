import java.util.Scanner;

public class GradeCalculationApplication {

    public static void main(String[] args) {
        int math, physics, chemistry, turkish, music;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        math = scanner.nextInt();

        System.out.println("Fizik notunuz: ");
        physics = scanner.nextInt();

        System.out.println("Kimya notunuz: ");
        chemistry = scanner.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkish = scanner.nextInt();

        System.out.println("Müzik notunuz: ");
        music = scanner.nextInt();

        GradeMethod gradeMethod = new GradeMethod();

        double average = gradeMethod.calculate(math, physics, chemistry, turkish, music);

        if (average>60){
            System.out.println("Sınıfı geçti.\nNot ortalaması:" + average);
        }else{
            System.out.println("Sınıfta kaldı. \nNot ortalaması:" + average);
        }
    }
}
