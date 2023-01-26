public class Main {
    // Sınıflar arası ilişkiler: dependency, composition
    public static void main(String[] args) {
        Student st1 = new Student("Mustafa", "Çetindağ", "123", "AA", 85);
        Student st2 = new Student("Patika", "Dev", "2321", "BB", 85);
        Student st3 = new Student("Kodluyoruz", "Java102", "132", "CC", 85);



        Instructor teacher1 = new Instructor("Mahmut", "Tuncer", "CENG");
        //Composition, Aggregation: Course has a Instructor (sınıfın bir öğretmeni vardır)
        Course mat = new Course("MAT101", "MAT", teacher1);
        System.out.println(mat.getInstructor().getName());


        //Student[] stu = {st1, st2, st3};
        //System.out.println("Ortalama: " + mat.calcAverage(stu));


    }
}
