public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "0536", "TRH");
        Teacher t2 = new Teacher("Kül Yutmaz", "0554", "BIO");
        Teacher t3 = new Teacher("Badi Ekrem", "0555", "BDN");

        Course tarih = new Course("Tarih", "101", "TRH", 0.8,0.2);
        tarih.addTeacher(t1);
        Course bio = new Course("Biyoloji", "102", "BIO",0.7,0.3);
        bio.addTeacher(t2);
        Course beden = new Course("Beden", "103", "BDN", 0.3,0.7);
        beden.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, bio, beden);
        s1.addBulkExamNote(40,80,90,60,40,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", " 124", "4",tarih,beden, bio);
        s2.addBulkExamNote(50,70,60, 60,50,80);
        s2.isPass();


    }
}
