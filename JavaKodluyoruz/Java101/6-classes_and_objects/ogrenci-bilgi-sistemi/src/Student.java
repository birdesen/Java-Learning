public class Student {
    Course rateY;
    Course rateS;
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1y, int note1s, int note2y, int note2s, int note3y, int note3s) {

        if (note1y >= 0 && note1y <= 100 && note1s >= 0 && note1s <= 100) {
            this.c1.note = (note1y * this.c1.rateY) + (note1s * this.c1.rateS);
        }
        if (note2y >= 0 && note2y <= 100 && note2s >= 0 && note2s <= 100) {
            this.c2.note = (note2y * this.c2.rateY) + (note2s * this.c2.rateS);
        }
        if (note3y >= 0 && note3y <= 100 && note3s >= 0 && note3s <= 100) {
            this.c3.note = (note3y * this.c3.rateY) + (note3s * this.c3.rateS);
        }
    }

    void isPass() {
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;

        if (this.average > 55) {
            System.out.println("Sınıfı geçtiniz");
        } else {
            System.out.println("Sınıfta kaldınız");
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu \t: " + this.c1.note);
        System.out.println(this.c2.name + " Notu \t: " + this.c2.note);
        System.out.println(this.c3.name + " Notu \t: " + this.c3.note);
        System.out.println("Ortalamanız: " + this.average);
        System.out.println("----------------------------------");
    }


}
