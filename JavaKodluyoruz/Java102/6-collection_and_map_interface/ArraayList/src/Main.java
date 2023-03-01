import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(4);
        liste.add(5);
        liste.add(null);
        // System.out.println(liste);
        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }
}
