public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;

    double physicsAverage, mathAverage, chemistryAverage;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkVerbalNote(int orExMath, int orExPhysics, int orExChemistry){
        if (orExMath >= 0 && orExMath <= 100) {
            this.math.orEx = orExMath;
        }

        if (orExPhysics >= 0 && orExPhysics <= 100) {
            this.physics.orEx = orExPhysics;
        }

        if (orExChemistry >= 0 && orExChemistry <= 100) {
            this.chemistry.orEx = orExChemistry;
        }
    }



    public void addBulkExamNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.physicsAverage = (this.physics.note * 0.8) +(this.physics.orEx * 0.2);
        this.mathAverage = (this.math.note * 0.8) +(this.math.orEx * 0.2);
        this.chemistryAverage = (this.chemistry.note * 0.8) +(this.chemistry.orEx * 0.2);

        this.avarage = (this.physicsAverage + this.chemistryAverage + this.mathAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.math.note);
        System.out.println("Fizik Notu : " + this.physics.note);
        System.out.println("Kimya Notu : " + this.chemistry.note);
    }

}