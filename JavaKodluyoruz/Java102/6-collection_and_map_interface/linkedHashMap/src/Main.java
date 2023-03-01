import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

        students.put(102, new Student(102,"Mustafa", 100));
        students.put(110, new Student(110,"Damla", 25));
        students.put(108, new Student(108,"Ahmet", 77));
        students.put(118, new Student(118,"Cemre", 40));

        for (Student stu : students.values()){
            System.out.println(stu.getName());
        }

    }
}


