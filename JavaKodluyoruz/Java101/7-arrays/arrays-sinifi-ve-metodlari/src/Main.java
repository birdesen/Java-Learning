import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4};
        int[] list2 = {6, 9, 5, 8, 4, 7};

        HelperArray helper = new HelperArray();
        helper.print(list1);

        System.out.println();
        //çağırılan metodun öünde static ibaresi varsa nesne üretmeye gerek kalmaz.

        HelperArray.print(list1);

        System.out.println();

        //Arrays.toString() metodu kullanımı
        System.out.println(Arrays.toString(list1));

        //Arrays.fill() metodu kullanımı
        Arrays.fill(list1, 10);
        System.out.println(Arrays.toString(list1));
        Arrays.fill(list1, 1, 3, 7);
        System.out.println(Arrays.toString(list1));

        HelperArray.fill(list1);
        System.out.println(Arrays.toString(list1));

        //Arrays.sort() metodu kullanımı
        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));

        //Arrays.binarySearch() metodu kullanımı
        System.out.println(HelperArray.search(list2, 7));

        System.out.println(Arrays.binarySearch(list2, 7));


        //Arrays.copyOf() ve Arrays.copyOfRange() metodları kullanımı;
        int[] list3 = {1, 2, 3, 4, 5, 6, 7};
        int[] copy1List3 = Arrays.copyOf(list3, 4);
        System.out.println(Arrays.toString(copy1List3));

        int[] copy2List3 = Arrays.copyOfRange(list3, 2, 5);
        System.out.println(Arrays.toString(copy2List3));

        //Araays.equals() metodu kullanımı
        System.out.println(Arrays.equals(list1, list2));

    }
}
