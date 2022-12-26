public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double rateY;
    double rateS;

    Course(String name, String code, String prefix, double rateY, double rateS) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.rateY = rateY;
        this.rateS = rateS;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }


}
