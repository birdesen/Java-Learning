public class Main {
    public static void main(String[] args) {
        /*
        String str = "12312";
        Nullable n = new Nullable(str);
        n.run();
        */
        /*
        Nullable <Integer> i = new Nullable<>(10);   // <> icine sadece wrapper siniflar yazilabilir
        Nullable <String> s = new Nullable<>("10");
        i.run();
        */
        /*
        Integer a = 10;

        String b = "patika";
        Double c = 3.14;
        Test <Integer,String,Double> t = new Test<>(a,b,c);
        t.showInfo();
        */
        String[] a = {"Java", "102", "Patika", "Dev"};
        Integer[] b = {1,2,3,4};
        Character[] c = {'J','A','V','A'};
        /*
        for(String i : a){
            System.out.println(i);
        }
        for(Integer i : b){
            System.out.println(i);
        }
        for(Character i : c){
            System.out.println(i);
        }
        Dont repeat yourself ilkesine uygun degil*/
        //printArray(c);

        Student<String> stu = new Student<>();
        stu.insert("ABC");




    }

    public static <T> void printArray(T[] arr) {
        for (T i : arr) {
            System.out.println(i);
        }

    }
}
