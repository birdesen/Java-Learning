import java.util.HashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10); // iki kere yazildigi icin son yazilan dikkate alini
        hSet.add(30);

        System.out.println(hSet.contains(20));
        for (Integer sayi : hSet){
            System.out.println(sayi);
        }
        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
