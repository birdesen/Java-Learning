package nested;

public class Main {
    public static void main(String[] args) {
        // nested class (iç içe sınıflar)
        // inner class (classiç sınıflar)
        //      static
        //      non-static
        // local class (yerel sınıflar)
        // anonymus class(anonim sınıflar)

        Anonymus a = new Anonymus(){
            public int a = 20; // degisken atayabiliriz
            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Anonim olarak yazilmis run metodu");
                print();
            }
            public void print(){
                System.out.println("Print metodu");
            } // bu metodu yazak da ancak yukaridaki gibi cagirabiliriz
        };
        a.run();
        // a.print(); burda cagiramayiz

    }
}
