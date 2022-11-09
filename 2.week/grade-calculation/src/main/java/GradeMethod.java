public class GradeMethod {

    public Double calculate(int math, int physics, int chemistry, int turkish, int music){

        int count = 0, total=0;

        if (math<100 && math>0){
            total+=math;
            count++;
        }
        if (physics<100 && physics>=0){
            total+=physics;
            count++;
        }
        if (chemistry<100 && chemistry>=0){
            total+=chemistry;
            count++;
        }
        if (turkish<100 && turkish>=0){
            total+=turkish;
            count++;
        }
        if (music<100 && music>=0){
            total+=music;
            count++;
        }

        double average = total /count;
        return average;
    }
}
