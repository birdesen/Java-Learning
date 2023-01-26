package nested;

//statik inner metot
//outer class
public class Inner {
    public int a = 5;
    public static int b = 20;

    //inner class
    public static class In {
        public static int a = 10;

        public static void run() {
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Inner.b);
        }
    }

    public void run() {
        In.run();
    }

}
