public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,120,100,30,1);
        Fighter f2 = new Fighter("B",15,85,85,30,0);

        Match match = new Match(f1,f2,85,100);
        match.run();

    }
}
